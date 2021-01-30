package es.unsplash.client.infrastructure.configuration;

import es.unsplash.client.domain.service.CollectionsProviderService;
import es.unsplash.client.infrastructure.service.RestUnsplashAPIClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class InfrastructureServiceConfiguration {

  @Bean
  public CollectionsProviderService collectionsProviderService(
      final RestTemplate unsplashRestTemplate,
      final @Value("${unsplash.api.clientid}") String apiClientId) {
    return new RestUnsplashAPIClient(unsplashRestTemplate, apiClientId);
  }

}
