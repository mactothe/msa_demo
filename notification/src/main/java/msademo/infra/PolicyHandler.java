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

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Orderd'"
    )
    public void wheneverOrderd_SendMessage(@Payload Orderd orderd) {
        Orderd event = orderd;
        System.out.println(
            "\n\n##### listener SendMessage : " + orderd + "\n\n"
        );
        // Comments //
        //문자 메세지를 발송

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCanceled'"
    )
    public void wheneverOrderCanceled_SendMessage(
        @Payload OrderCanceled orderCanceled
    ) {
        OrderCanceled event = orderCanceled;
        System.out.println(
            "\n\n##### listener SendMessage : " + orderCanceled + "\n\n"
        );
        // Comments //
        //문자 메세지를 발송

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ShipCanceled'"
    )
    public void wheneverShipCanceled_SendMessage(
        @Payload ShipCanceled shipCanceled
    ) {
        ShipCanceled event = shipCanceled;
        System.out.println(
            "\n\n##### listener SendMessage : " + shipCanceled + "\n\n"
        );
        // Comments //
        //문자 메세지를 발송

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Shipped'"
    )
    public void wheneverShipped_SendMessage(@Payload Shipped shipped) {
        Shipped event = shipped;
        System.out.println(
            "\n\n##### listener SendMessage : " + shipped + "\n\n"
        );
        // Comments //
        //문자 메세지를 발송

        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StockIncreased'"
    )
    public void wheneverStockIncreased_SendMessage(
        @Payload StockIncreased stockIncreased
    ) {
        StockIncreased event = stockIncreased;
        System.out.println(
            "\n\n##### listener SendMessage : " + stockIncreased + "\n\n"
        );
        // Comments //
        //문자 메세지를 발송

        // Sample Logic //

    }
}
