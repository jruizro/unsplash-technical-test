package es.unsplash.client.infrastructure.controller.dto;

import es.unsplash.client.domain.model.CollectionFiltered;

import java.util.List;

public class CollectionsFilteredDTO {

  private List<CollectionFiltered> collectionsFilteredList;

  public CollectionsFilteredDTO(List<CollectionFiltered> collectionsFilteredList) {
    this.collectionsFilteredList = collectionsFilteredList;
  }

  public List<CollectionFiltered> getCollectionsFilteredList() {
    return collectionsFilteredList;
  }

}
