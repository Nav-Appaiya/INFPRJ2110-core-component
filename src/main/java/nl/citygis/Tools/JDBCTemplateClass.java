package nl.citygis.Tools;

import nl.citygis.Entity.Event;
import nl.citygis.Tools.configuration.EventMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by nav on 05-01-16.
 */
public class JDBCTemplateClass {

    private JdbcTemplate jdbcTemplate;


    public final void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void addEvent(String id, String name) throws SQLException {
        this.jdbcTemplate.update("INSERT INTO  VALUES (?, ?)", id, name);
    }

    public void deleteEvent(String name) {
        this.jdbcTemplate.update("DELETE FROM events WHERE name LIKE '" + name + "'");
    }

    public List<Map<String, Object>> getEventsAsList() throws SQLException {
        return this.jdbcTemplate.queryForList("SELECT * FROM events;");
    }

    public void printEvents() {
        List<Event> events = this.jdbcTemplate.query("SELECT * FROM hero", new EventMapper());
        for (Event h : events) {
            System.out.println(h.getDateTime() + " " + h.getUnitId());
        }
    }
}

