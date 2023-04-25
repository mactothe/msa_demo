package msademo.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msademo.DeliveryApplication;
import msademo.domain.ShipCanceled;
import msademo.domain.Shipped;

@Entity
@Table(name = "Shipping_table")
@Data
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private Integer qty;

    private Long itemId;

    private Long orderId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Shipped shipped = new Shipped(this);
        shipped.publishAfterCommit();

        ShipCanceled shipCanceled = new ShipCanceled(this);
        shipCanceled.publishAfterCommit();
    }

    public static ShippingRepository repository() {
        ShippingRepository shippingRepository = DeliveryApplication.applicationContext.getBean(
            ShippingRepository.class
        );
        return shippingRepository;
    }

    public static void ship(Orderd orderd) {
        /** Example 1:  new item 
        Shipping shipping = new Shipping();
        repository().save(shipping);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderd.get???()).ifPresent(shipping->{
            
            shipping // do something
            repository().save(shipping);


         });
        */

    }

    public static void cancle(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        Shipping shipping = new Shipping();
        repository().save(shipping);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(shipping->{
            
            shipping // do something
            repository().save(shipping);


         });
        */

    }
}
