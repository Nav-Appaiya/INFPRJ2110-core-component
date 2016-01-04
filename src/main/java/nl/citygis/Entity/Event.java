package nl.citygis.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nav on 03-01-16.
 */
public class Event {

    /**
     * dateTime : 2012-12-02
     * port : Ignition
     * unitId : 57
     * value : 1
     */
    @JsonProperty("dateTime")
    protected String dateTime;
    @JsonProperty("port")
    protected String port;
    @JsonProperty("unitId")
    protected int    unitId;
    @JsonProperty("value")
    protected String value;

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getPort() {
        return port;
    }

    public int getUnitId() {
        return unitId;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Event{" + "dateTime='" + dateTime + '\'' + ", port='" + port + '\'' + ", unitId=" + unitId
               + ", value='" + value + '\'' + '}';
    }
}