package es.unsplash.client.application.getcollectionsfiltered;


import es.unsplash.client.domain.service.CollectionsProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetCollectionsFilteredService {

  private static final Logger LOGGER = LoggerFactory.getLogger(GetCollectionsFilteredService.class);

  private final CollectionsProviderService collectionsProviderService;

  public GetCollectionsFilteredService(CollectionsProviderService collectionsProviderService) {
    this.collectionsProviderService = collectionsProviderService;
  }

  public List<GetCollectionsFilteredResponse> execute(final String filter) {

    try {

      LOGGER.info("Filter Collections by pattern: {}", filter);

      return collectionsProviderService.getCollectionsByPage(Optional.empty())
          .stream()
          .filter(c -> c.isFilteredBy(filter))
          .map(c -> new GetCollectionsFilteredResponse(c.getId(),
              c.getTitle(),
              c.getDescription(),
              c.getCoverPhotoId()))
          .collect(Collectors.toList());

    } catch (RuntimeException e) {
      LOGGER.error("Error when Filter Collections by pattern: {} -> {}", filter, e.getMessage(), e);
      throw e;
    }

  }


}
