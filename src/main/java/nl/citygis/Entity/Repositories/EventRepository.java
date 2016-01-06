package nl.citygis.Entity.Repositories;

import nl.citygis.Entity.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nav on 06-01-16.
 */
public interface EventRepository extends CrudRepository<Event, Long> {

    List<Event> findByLastName(String lastName);
}
