package msademo.domain;

import java.util.*;
import lombok.Data;
import msademo.infra.AbstractEvent;

@Data
public class Shipped extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Long itemId;
    private Long orderId;
    private String status;
}
