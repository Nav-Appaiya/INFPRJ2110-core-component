package nl.citygis;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by nav on 04-01-16.
 *
 * Taken inplannen om data binnen te halen.
 * Fetcher: Haal data binnen
 * Saver: Save data
 * Log: Log de gefetchte data stream
 *
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
    }
}

