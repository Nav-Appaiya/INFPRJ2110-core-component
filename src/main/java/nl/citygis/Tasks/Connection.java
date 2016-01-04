package nl.citygis.Tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

/**
 * Created by nav on 04-01-16.
 * Collector Connection for:
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
    private int runs = 0;

    public Connection() {
        REST_TEMPLATE.setInterceptors(Collections.singletonList(new AuthInterceptor()));
    }

    @Scheduled(fixedRate = 3000)
    public void connectThisToCollector() {
        System.out.println("Connection.connectThisToCollector");
        System.out.println("======================"+dateFormat.format(new Date())+"======================");
    }
}
