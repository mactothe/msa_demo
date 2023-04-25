package msademo.domain;

import java.util.*;
import lombok.*;
import msademo.domain.*;
import msademo.infra.AbstractEvent;

@Data
@ToString
public class ShipCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Long itemId;
    private Long orderId;
    private String status;
}
