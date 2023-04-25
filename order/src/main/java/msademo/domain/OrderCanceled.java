package msademo.domain;

import java.util.*;
import lombok.*;
import msademo.domain.*;
import msademo.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemId;
    private Integer qty;
    private String status;
    private Long customerId;

    public OrderCanceled(Ordering aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
