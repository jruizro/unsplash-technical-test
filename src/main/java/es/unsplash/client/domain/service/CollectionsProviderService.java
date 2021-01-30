package es.unsplash.client.domain.service;

import es.unsplash.client.domain.model.CollectionFiltered;

import java.util.List;
import java.util.Optional;

public interface CollectionsProviderService {

  List<CollectionFiltered> getCollectionsByPage(Optional<Integer> page);

}
