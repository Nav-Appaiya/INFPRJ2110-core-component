package nl.citygis.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nav on 03-01-16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Event {

    @JsonProperty("dateTime")
    protected String dateTime;
    @JsonProperty("port")
    protected String port;
    @JsonProperty("unitId")
    protected int unitId;
    @JsonProperty("value")
    protected String value;
    @Id
    private long id;


    public Event(int unitId) {
        this.unitId = unitId;
    }

    public Event() {
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Event{" + "dateTime='" + dateTime + '\'' + ", port='" + port + '\'' + ", unitId=" + unitId
                + ", value='" + value + '\'' + '}';
    }
}