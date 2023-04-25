package msademo.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import msademo.config.kafka.KafkaProcessor;
import msademo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderingRepository orderingRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StockIncreased'"
    )
    public void wheneverStockIncreased_Alert(
        @Payload StockIncreased stockIncreased
    ) {
        StockIncreased event = stockIncreased;
        System.out.println(
            "\n\n##### listener Alert : " + stockIncreased + "\n\n"
        );

        // Comments //
        //대기 고객에게 알림 메일을 발송

        // Sample Logic //
        Ordering.alert(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Shipped'"
    )
    public void wheneverShipped_RefreshStatus(@Payload Shipped shipped) {
        Shipped event = shipped;
        System.out.println(
            "\n\n##### listener RefreshStatus : " + shipped + "\n\n"
        );

        // Comments //
        //주문상태 갱신

        // Sample Logic //
        Ordering.refreshStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ShipCanceled'"
    )
    public void wheneverShipCanceled_RefreshStatus(
        @Payload ShipCanceled shipCanceled
    ) {
        ShipCanceled event = shipCanceled;
        System.out.println(
            "\n\n##### listener RefreshStatus : " + shipCanceled + "\n\n"
        );

        // Comments //
        //주문상태 갱신

        // Sample Logic //
        Ordering.refreshStatus(event);
    }
}
