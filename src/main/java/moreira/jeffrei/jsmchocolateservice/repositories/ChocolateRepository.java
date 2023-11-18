package moreira.jeffrei.jsmchocolateservice.repositories;

import moreira.jeffrei.jsmchocolateservice.domain.Chocolate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by jeffr on 2023-11-17
 */
public interface ChocolateRepository extends PagingAndSortingRepository<Chocolate, UUID> {

}
