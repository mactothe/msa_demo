package msademo.domain;

import java.util.*;
import lombok.Data;
import msademo.infra.AbstractEvent;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemId;
    private Integer qty;
    private String status;
    private Long customerId;
}
