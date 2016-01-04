package nl.citygis.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by nav on 03-01-16.
 */
public class Group {

    /**
     * permissions : ["add_logentry"]
     * name : Nav
     * url : http://149.210.236.249:8000/groups/1
     */
    @JsonProperty("permissions")
    private List<String> permissions;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
