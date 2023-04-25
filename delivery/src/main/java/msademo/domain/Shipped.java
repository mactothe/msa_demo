package msademo.domain;

import java.util.*;
import lombok.*;
import msademo.domain.*;
import msademo.infra.AbstractEvent;

@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Long itemId;
    private Long orderId;
    private String status;

    public Shipped(Shipping aggregate) {
        super(aggregate);
    }

    public Shipped() {
        super();
    }
}
