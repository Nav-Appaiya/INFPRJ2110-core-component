package nl.citygis.Tasks;

import com.fasterxml.jackson.annotation.JacksonInject;
import nl.citygis.Entity.Doa.EventDoa;
import nl.citygis.Entity.Event;
import nl.citygis.Tools.AuthInterceptor;
import org.cloudfoundry.client.lib.org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

/**
 * Created by nav on 04-01-16.
 * Collector ConnectionTemplate for:
 * <p>
 * http://149.210.236.249:8000/
 * or
 * http://navappaiya.nl:8000/
 * <p>
 * Taak om te controleren of root
 * connection & auth goed verlopen
 * [en testen van verbindingen/commands]
 */
@Component
public class Connection {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private static final RestTemplate REST_TEMPLATE = new RestTemplate();
    @Autowired
    private EventDoa eventDao;
    @JacksonInject
    private RestTemplate restTemplate;
    @JacksonInject
    private ObjectMapper objectMapper;

    /**
     * Constructor, sets Authentication
     * for Api protected resource Calls
     */
    public Connection() {
        REST_TEMPLATE.setInterceptors(Collections.singletonList(new AuthInterceptor()));
    }

    public static void main(String[] args) {
        /**
         *
         * EVENTS HANDLING!
         * Nav Appaiya - 5 Jan 23:37
         * {
         "port": "Ignition",
         "value": "1",
         "unitId": 14100064,
         "dateTime": "2015-03-10"
         * }
         **/
        String gistEvents = "https://gist.githubusercontent.com/Nav-Appaiya/8f1a5f96ba40d3af47a5/raw/fc31699308e7d5831f0f95a267a2c6aa9f41bfbb/gistfile1.txt";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> response;
        response = REST_TEMPLATE.exchange(gistEvents, HttpMethod.GET, request, String.class);
        String responseBody = response.getBody();
        System.out.println("=====================================");
        Event e = new Event(232323);

    }

    @Scheduled(fixedRate = 5000)
    public void connectThisToCollector() {
        System.out.println("RUNNING CONNECTION TASK");
        final String uri = "http://149.210.236.249:8000/events";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Token 90f44a24a6bd93a8ca9c21d0b9e0d81d5ab20da2");
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<List<Event>> rateResponse =
                restTemplate.exchange(uri,
                        HttpMethod.GET, request, new ParameterizedTypeReference<List<Event>>() {
                        });
        List<Event> rates = rateResponse.getBody();

        for (Event e : rates) {
            System.out.println(e.getUnitId());
        }





    }
}
