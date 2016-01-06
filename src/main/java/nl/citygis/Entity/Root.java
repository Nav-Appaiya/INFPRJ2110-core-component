package nl.citygis.Entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.citygis.Tools.AuthInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Created by nav on 04-01-16.
 * <p>
 * Een entity die de root van de API vastlegd.
 * Voor elk 4 van data streams:
 * - ConnectionTemplate
 * - Position
 * - Event
 * - Monitoring
 * - Users (optioneel toegevoegd)
 * - Groups (optioneel toegevoegd)
 */
public class Root {
    protected RestTemplate rt;
    protected String token;
    private String monitoring;
    private String users;
    private String positions;
    private String connections;
    private String groups;
    private String events;

    public String getMonitoring() {
        return monitoring;
    }

    public User[] getUsers() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Collections.singletonList(new AuthInterceptor()));
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

    public String getApiUrl(String prefix) {
        return prefix + "?format=json";
    }

    @Override
    public String toString() {
        return "Root{" +
                "Monitoring='" + monitoring + '\'' +
                ", users='" + users + '\'' +
                ", positions='" + positions + '\'' +
                ", connections='" + connections + '\'' +
                ", groups='" + groups + '\'' +
                ", events='" + events + '\'' +
                '}';
    }
}
