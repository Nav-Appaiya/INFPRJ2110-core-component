package nl.citygis;

import nl.citygis.Entity.Connection;
import nl.citygis.Entity.Event;
import nl.citygis.Entity.Monitoring;
import nl.citygis.Entity.Position;
import nl.citygis.Tasks.AuthInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication
@EnableScheduling
public class Application {

    private static final String root = "http://149.210.236.249:8000/?format=json";
    private static final String events = "http://149.210.236.249:8000/events?format=json";
    private static final String positions = "http://149.210.236.249:8000/positions?format=json";
    private static final String connections = "http://149.210.236.249:8000/connections?format=json";
    private static final String monitoring = "http://149.210.236.249:8000/monitoring?format=json";

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final RestTemplate restTemplate = new RestTemplate();

    // By Nav Appaiya, 4 Januari 2016, Rotterdam.
    public static void main(String args[]) {

        // Run Spring boot :)
        SpringApplication.run(Application.class, args);
    }

    public void run(String... strings) throws Exception {
        Event[] e = this.getEvents();
        Connection[] c = this.getConnections();
        Monitoring[] m = this.getMonitoring();
        Position[] p = this.getPositions();

        System.out.println( e.length ); // 162
        System.out.println( c.length ); // 116
        System.out.println( m.length ); // 32
        System.out.println( p.length ); // 45

    }

    public Event[] getEvents(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors( Collections.singletonList(new AuthInterceptor()));
        ResponseEntity<Event[]> responseEntity = restTemplate.getForEntity(events, Event[].class);
        Event[] rates = responseEntity.getBody();

        return rates;
    }

    public Connection[] getConnections(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors( Collections.singletonList(new AuthInterceptor()));
        ResponseEntity<Connection[]> responseEntity = restTemplate.getForEntity(connections, Connection[].class);
        Connection[] connections = responseEntity.getBody();

        return connections;
    }

    public Monitoring[] getMonitoring() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors( Collections.singletonList(new AuthInterceptor()));
        ResponseEntity<Monitoring[]> responseEntity = restTemplate.getForEntity(monitoring, Monitoring[].class);
        Monitoring[] monitoring = responseEntity.getBody();

        return monitoring;
    }

    public Position[] getPositions() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors( Collections.singletonList(new AuthInterceptor()));
        ResponseEntity<Position[]> responseEntity = restTemplate.getForEntity(positions, Position[].class);
        Position[] position = responseEntity.getBody();

        return position;
    }
}
