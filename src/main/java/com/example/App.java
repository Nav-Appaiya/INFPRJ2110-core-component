package com.example;

import com.example.Entities.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;



/**
 * Created by nav on 07-12-15.
 */
@SpringBootApplication
public class App implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    @Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
        System.out.println(quote.toString());
    }
}
