package msademo.domain;

import java.util.*;
import lombok.*;
import msademo.domain.*;
import msademo.infra.AbstractEvent;

@Data
@ToString
public class Orderd extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemId;
    private Integer qty;
    private String status;
    private Long customerId;

    public Orderd(Ordering aggregate) {
        super(aggregate);
    }

    public Orderd() {
        super();
    }
}
