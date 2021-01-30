package es.unsplash.client.infrastructure.configuration;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
@EnableEncryptableProperties
public class RestTemplateConfiguration {

  @Bean
  public RestTemplate restTemplate(final RestTemplateBuilder restTemplateBuilder,
                                   final @Value("${unsplash.api.uri}") String rootUri) {
    return restTemplateBuilder.rootUri(rootUri)
        .setConnectTimeout(Duration.ofSeconds(2))
        .setReadTimeout(Duration.ofSeconds(2))
        .build();
  }

}
