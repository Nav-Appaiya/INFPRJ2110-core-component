package nl.citygis.Tools.configuration;

/**
 * Created by nav on 05-01-16.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.CoreConnectionPNames;
import org.cloudfoundry.client.lib.org.codehaus.jackson.map.annotate.JacksonInject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class HttpConfig {

    private static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 100;

    private static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 5;

    private static final int DEFAULT_READ_TIMEOUT_MILLISECONDS = (60 * 1000);

    @JacksonInject
    private ObjectMapper objectMapper;

    @Bean
    public ClientHttpRequestFactory httpRequestFactory() {
        return new HttpComponentsClientHttpRequestFactory(httpClient());
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate(httpRequestFactory());
        List<HttpMessageConverter<?>> converters = restTemplate
                .getMessageConverters();

        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof MappingJackson2HttpMessageConverter) {
                MappingJackson2HttpMessageConverter jsonConverter = (MappingJackson2HttpMessageConverter) converter;
                jsonConverter.setObjectMapper(objectMapper);
            }
        }

        return restTemplate;
    }

    @Bean
    public HttpClient httpClient() {

        PoolingClientConnectionManager connectionManager = new PoolingClientConnectionManager();
        HttpClient defaultHttpClient = new DefaultHttpClient(connectionManager);

        connectionManager.setMaxTotal(DEFAULT_MAX_TOTAL_CONNECTIONS);
        connectionManager
                .setDefaultMaxPerRoute(DEFAULT_MAX_CONNECTIONS_PER_ROUTE);
        connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost(
                "facebook.com")), 20);
        connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost(
                "twitter.com")), 20);
        connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost(
                "linkedin.com")), 20);
        connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost(
                "viadeo.com")), 20);

        defaultHttpClient.getParams().setIntParameter(
                CoreConnectionPNames.CONNECTION_TIMEOUT,
                DEFAULT_READ_TIMEOUT_MILLISECONDS);
        return defaultHttpClient;
    }
}

