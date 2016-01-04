package nl.citygis.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by nav on 03-01-16.
 */
public class Connection {

    /**
     * dateTime : 2015-01-01
     * port : 10
     * permissions : ["add_connection","change_connection"]
     * value : 1
     */
    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("port")
    private String port;
    @JsonProperty("permissions")
    private List<String> permissions;
    @JsonProperty("value")
    private String value;

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
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

    public List<String> getPermissions() {
        return permissions;
    }

    public String getValue() {
        return value;
    }
}
