package nl.citygis.Tasks;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * Created by nav on 04-01-16.
 * Intercepts the auth for navappaiya.nl:8000
 * and adds the legit headers for authentication with collector
 * http://149.210.236.249:8000/auth-token/
 * Auth Header needed:
 * Authorization: Token 90f44a24a6bd93a8ca9c21d0b9e0d81d5ab20da2
 */
public class AuthInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(
            HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {

        HttpHeaders headers = request.getHeaders();
        headers.add("X-User-Agent", "Nav Appaiya Agent v2.1");
        headers.add("authorization", "Token 90f44a24a6bd93a8ca9c21d0b9e0d81d5ab20da2");
        return execution.execute(request, body);
    }
}

