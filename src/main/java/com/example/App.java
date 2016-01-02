package com.example;

import com.example.Entities.Root;
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
        System.out.println("APP");
    }

    public App(){
        RestTemplate restTemplate = new RestTemplate();
        Root root = restTemplate.getForObject("http://149.210.236.249:8000/?format=json", Root.class);
        log.info(root.toString());


        System.out.println(root.toString());

    }

}
