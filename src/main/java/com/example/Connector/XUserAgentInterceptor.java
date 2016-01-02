package com.example.Connector;

import java.io.IOException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by nav on 28-12-15.
 */
public class XUserAgentInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(
            HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {

        HttpHeaders headers = request.getHeaders();
        headers.add("X-User-Agent", "My App v2.1");
        headers.add("authorization", "Token 90f44a24a6bd93a8ca9c21d0b9e0d81d5ab20da2");
        return execution.execute(request, body);
    }
}

