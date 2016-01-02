
/**
 * Nav 28 December
 */
package com.example.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * User entity
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    /** Property url */
    String url;

    /** Property email */
    String email;

    /** Property auth_token */
    String auth_token;

    /** Property first_name */
    String first_name;

    /** Property last_name */
    String last_name;

    /** Property is_staff */
    String is_staff;

    /** Property last_login_at */
    String last_login_at;

    /** Property joined_at */
    String joined_at;

    /**
     * Constructor
     */
    public User() {}

    /**
     * Gets the url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Sets the url
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Sets the email
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the auth_token
     */
    public String getAuth_token() {
        return this.auth_token;
    }

    /**
     * Sets the auth_token
     */
    public void setAuth_token(String value) {
        this.auth_token = value;
    }

    /**
     * Gets the first_name
     */
    public String getFirst_name() {
        return this.first_name;
    }

    /**
     * Sets the first_name
     */
    public void setFirst_name(String value) {
        this.first_name = value;
    }

    /**
     * Gets the last_name
     */
    public String getLast_name() {
        return this.last_name;
    }

    /**
     * Sets the last_name
     */
    public void setLast_name(String value) {
        this.last_name = value;
    }

    /**
     * Gets the is_staff
     */
    public String getIs_staff() {
        return this.is_staff;
    }

    /**
     * Sets the is_staff
     */
    public void setIs_staff(String value) {
        this.is_staff = value;
    }

    /**
     * Gets the last_login_at
     */
    public String getLast_login_at() {
        return this.last_login_at;
    }

    /**
     * Sets the last_login_at
     */
    public void setLast_login_at(String value) {
        this.last_login_at = value;
    }

    /**
     * Gets the joined_at
     */
    public String getJoined_at() {
        return this.joined_at;
    }

    /**
     * Sets the joined_at
     */
    public void setJoined_at(String value) {
        this.joined_at = value;
    }
}