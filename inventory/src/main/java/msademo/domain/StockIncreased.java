package msademo.domain;

import java.util.*;
import lombok.*;
import msademo.domain.*;
import msademo.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;

    public StockIncreased(Stock aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
