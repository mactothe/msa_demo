package msademo.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msademo.InventoryApplication;
import msademo.domain.StockIncreased;
import msademo.domain.StockReduced;

@Entity
@Table(name = "Stock_table")
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer qty;

    @PostPersist
    public void onPostPersist() {
        StockReduced stockReduced = new StockReduced(this);
        stockReduced.publishAfterCommit();

        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();
    }

    public static StockRepository repository() {
        StockRepository stockRepository = InventoryApplication.applicationContext.getBean(
            StockRepository.class
        );
        return stockRepository;
    }

    public static void updateStock(Shipped shipped) {
        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        */

        /** Example 2:  finding and process
        
        repository().findById(shipped.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);


         });
        */

    }
}
