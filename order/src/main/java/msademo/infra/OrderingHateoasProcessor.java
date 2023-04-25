package msademo.infra;

import msademo.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class OrderingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ordering>> {

    @Override
    public EntityModel<Ordering> process(EntityModel<Ordering> model) {
        return model;
    }
}
