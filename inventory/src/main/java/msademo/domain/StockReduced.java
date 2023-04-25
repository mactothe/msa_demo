package msademo.domain;

import java.util.*;
import lombok.*;
import msademo.domain.*;
import msademo.infra.AbstractEvent;

@Data
@ToString
public class StockReduced extends AbstractEvent {

    private Long id;
    private Integer qty;

    public StockReduced(Stock aggregate) {
        super(aggregate);
    }

    public StockReduced() {
        super();
    }
}
