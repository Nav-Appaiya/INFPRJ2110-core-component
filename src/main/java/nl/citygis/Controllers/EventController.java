package nl.citygis.Controllers;

import nl.citygis.Entity.Doa.EventDoa;
import nl.citygis.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nav on 06-01-16.
 */
public class EventController {

    @Autowired
    private EventDoa eventDao;

    /**
     * GET /create  --> Create a new event and save it in the database.
     */
    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, Integer unitId) {
        String eventId = "";
        try {
            Event event = new Event(unitId);
            eventDao.save(event);
            eventId = String.valueOf(event.getUnitId());
        } catch (Exception ex) {
            return "Error creating the event: " + ex.toString();
        }
        return "Event succesfully created event with id = " + eventId;
    }

    /**
     * GET /delete  --> Delete the event having the passed event id.
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Integer unitId) {
        try {
            Event event = new Event(unitId);
            eventDao.delete(event);
        } catch (Exception ex) {
            return "Error deleting the event:" + ex.toString();
        }
        return "Event succesfully deleted!";
    }

    /**
     * GET /get-by-id
     * Return the event id for the event
     * having the passed id.
     */
    @RequestMapping("/get-by-id")
    @ResponseBody
    public String getByEmail(Integer unitId) {
        String eventId = "";
        try {
            Event event = eventDao.findByUnitId(unitId);
            eventId = String.valueOf(event.getUnitId());
        } catch (Exception ex) {
            return "Event not found";
        }
        return "The event id is: " + eventId;
    }

    /**
     * GET /update  --> Update the email and the name for the event in the
     * database having the passed id.
     */
    @RequestMapping("/update")
    @ResponseBody
    public String updateEvent(long id, String email, String name) {
        try {
            Event event = eventDao.findOne(id);
            event.setUnitId(112);
            event.setPort("#33");
            eventDao.save(event);
        } catch (Exception ex) {
            return "Error updating the event: " + ex.toString();
        }
        return "Event succesfully updated!";
    }

}
