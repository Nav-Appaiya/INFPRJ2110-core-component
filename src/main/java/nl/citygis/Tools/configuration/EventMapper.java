package nl.citygis.Tools.configuration;

import nl.citygis.Entity.Event;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nav on 05-01-16.
 */
public class EventMapper implements RowMapper<Event> {
    @Override
    public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
        Event event = new Event();
        event.setPort(rs.getString("port"));
        event.setValue(rs.getString("value"));
        event.setUnitId(rs.getInt("unitId"));
        event.setDateTime(rs.getString("dateTime"));

        return event;
    }
}
