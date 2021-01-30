package es.unsplash.client.infrastructure.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnsplashCoverPhotoDTO {

  private final String id;

  public UnsplashCoverPhotoDTO(@JsonProperty(value = "id", required = true) String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
