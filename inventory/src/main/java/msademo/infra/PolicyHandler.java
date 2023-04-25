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
    StockRepository stockRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Shipped'"
    )
    public void wheneverShipped_UpdateStock(@Payload Shipped shipped) {
        Shipped event = shipped;
        System.out.println(
            "\n\n##### listener UpdateStock : " + shipped + "\n\n"
        );

        // Sample Logic //
        Stock.updateStock(event);
    }
}
