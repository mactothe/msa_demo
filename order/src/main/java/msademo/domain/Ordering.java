package msademo.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msademo.OrderApplication;
import msademo.domain.OrderCanceled;
import msademo.domain.Orderd;

@Entity
@Table(name = "Ordering_table")
@Data
public class Ordering {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private Long itemId;

    private Integer qty;

    private String status;

    private Long customerId;

    @PostPersist
    public void onPostPersist() {
        Orderd orderd = new Orderd(this);
        orderd.publishAfterCommit();

        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
    }

    public static OrderingRepository repository() {
        OrderingRepository orderingRepository = OrderApplication.applicationContext.getBean(
            OrderingRepository.class
        );
        return orderingRepository;
    }

    public static void alert(StockIncreased stockIncreased) {
        /** Example 1:  new item 
        Ordering ordering = new Ordering();
        repository().save(ordering);

        */

        /** Example 2:  finding and process
        
        repository().findById(stockIncreased.get???()).ifPresent(ordering->{
            
            ordering // do something
            repository().save(ordering);


         });
        */

    }

    public static void refreshStatus(Shipped shipped) {
        /** Example 1:  new item 
        Ordering ordering = new Ordering();
        repository().save(ordering);

        */

        /** Example 2:  finding and process
        
        repository().findById(shipped.get???()).ifPresent(ordering->{
            
            ordering // do something
            repository().save(ordering);


         });
        */

    }

    public static void refreshStatus(ShipCanceled shipCanceled) {
        /** Example 1:  new item 
        Ordering ordering = new Ordering();
        repository().save(ordering);

        */

        /** Example 2:  finding and process
        
        repository().findById(shipCanceled.get???()).ifPresent(ordering->{
            
            ordering // do something
            repository().save(ordering);


         });
        */

    }
}
