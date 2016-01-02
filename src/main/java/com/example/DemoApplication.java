package com.example;

import com.example.Connector.XUserAgentInterceptor;
import com.example.Entities.Root;
import com.example.Entities.User;
import com.oracle.tools.packager.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        try {
            DemoApplication.run();
        } catch (IOException e) {
            e.printStackTrace( );
        } catch (SQLException e) {
            e.printStackTrace( );
        }
        System.out.println("Final station ----- ");
        System.exit(0);
        SpringApplication.run(DemoApplication.class, args);
    }

    public static void run() throws IOException, SQLException {
//        Root root = new Root();
        System.out.println( "Test" );
        RestTemplate rt = new RestTemplate();
        System.out.println( "Test" );
//        rt.setInterceptors(Collections.singletonList(new XUserAgentInterceptor()));
        Root root = rt.getForObject("http://149.210.236.249:8000/?format=json", Root.class);
        User[] user = root.getUsers();
        System.out.println(user);
    }


}
