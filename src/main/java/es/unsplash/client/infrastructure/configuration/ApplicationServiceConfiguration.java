package es.unsplash.client.infrastructure.configuration;

import es.unsplash.client.application.getcollectionsfiltered.GetCollectionsFilteredService;
import es.unsplash.client.domain.service.CollectionsProviderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationServiceConfiguration {

  @Bean
  public GetCollectionsFilteredService getCollectionsFilteredService(CollectionsProviderService collectionsProviderService) {
    return new GetCollectionsFilteredService(collectionsProviderService);
  }

}
