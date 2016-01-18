package nl.citygis.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by nav on 03-01-16.
 */

public class User {
    /**
     * joined_at : 2015-12-10T16:10:30.868926Z
     * last_login_at : null
     * is_staff : true
     * last_name : test
     * auth_token : 6df73d05e6cb3f9650d3a4e57e9d8a8997310444
     * first_name : test
     * url : http://149.210.236.249:8000/users/2
     * email : test@test.nl
     */
    private long id;

    @JsonProperty("joined_at")
    @NotNull
    private String joined_at;

    @JsonProperty("last_login_at")
    private String last_login_at;

    @JsonProperty("is_staff")
    private boolean is_staff;

    @JsonProperty("last_name")
    private String last_name;

    @JsonProperty("auth_token")
    private String auth_token;

    @JsonProperty("first_name")
    private String first_name;

    @JsonProperty("url")
    private String url;

    @JsonProperty("email")
    private String email;

    public String getJoined_at() {
        return joined_at;
    }

    public void setJoined_at(String joined_at) {
        this.joined_at = joined_at;
    }

    public String getLast_login_at() {
        return last_login_at;
    }

    public void setLast_login_at(String last_login_at) {
        this.last_login_at = last_login_at;
    }

    public boolean isIs_staff() {
        return is_staff;
    }

    public void setIs_staff(boolean is_staff) {
        this.is_staff = is_staff;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
