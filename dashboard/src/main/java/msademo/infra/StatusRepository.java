package msademo.infra;

import java.util.List;
import msademo.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "statuses", path = "statuses")
public interface StatusRepository
    extends PagingAndSortingRepository<Status, Long> {}
