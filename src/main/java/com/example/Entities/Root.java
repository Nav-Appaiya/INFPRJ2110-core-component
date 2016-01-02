package com.example.Entities;

import com.example.Connector.XUserAgentInterceptor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;

/**
 * Created by nav on 11-12-15.
 *
 * Holds the root of the data-tree at:
 * http://navappaiya.nl:8000/?format=json
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    private String monitoring;
    private String users;
    private String positions;
    private String connections;
    private String groups;
    private String events;

    protected RestTemplate rt;
    protected String token;
    public String getMonitoring() {
        return monitoring;
    }

    public Root(){

    }

    public User[] getUsers() throws IOException, SQLException {
        ObjectMapper objectMapper = new ObjectMapper();
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors( Collections.singletonList( new XUserAgentInterceptor() ) );
        User[] forNow = restTemplate.getForObject(users, User[].class);

        return forNow;
    }

    public String getPositions() {
        return positions;
    }

    public String getConnections() {
        return connections;
    }

    public String getGroups() {
        return groups;
    }

    public String getEvents() {
        return events;
    }

    public String getApiUrl(String prefix){
        return prefix + "?format=json";
    }
    @Override
    public String toString() {
        return "Root{" +
                "monitoring='" + monitoring + '\'' +
                ", users='" + users + '\'' +
                ", positions='" + positions + '\'' +
                ", connections='" + connections + '\'' +
                ", groups='" + groups + '\'' +
                ", events='" + events + '\'' +
                '}';
    }
}
