package nl.citygis.Entity.Doa;

import nl.citygis.Entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by nav on 06-01-16.
 */
@Transactional
public interface EventDoa extends CrudRepository<Event, Long> {

    Event findByUnitId(Integer unitId);

}
