package nl.citygis.Entity.JsonTemplates;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by IntelliJ IDEA
 * User: Nav Appaiya
 * Date: 05-01-16
 * Time: 22:44
 */
@JsonIgnoreProperties
public class ConnectionTemplate implements java.io.Serializable {
    private static final long serialVersionUID = -7525443779269429001L;
    private String dateTime;
    private String port;
    private String[] permissions;
    private String value;

    public String getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String[] getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
