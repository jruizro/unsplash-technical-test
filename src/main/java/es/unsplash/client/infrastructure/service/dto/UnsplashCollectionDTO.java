package es.unsplash.client.infrastructure.service.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UnsplashCollectionDTO {

  private final String id;
  private final String title;
  private final String description;
  private final UnsplashCoverPhotoDTO coverPhoto;

  public UnsplashCollectionDTO(
      @JsonProperty(value = "id", required = true) String id,
      @JsonProperty(value = "title", required = true) String title,
      @JsonProperty(value = "description", required = true) String description,
      @JsonProperty(value = "cover_photo", required = true) UnsplashCoverPhotoDTO coverPhoto) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.coverPhoto = coverPhoto;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public UnsplashCoverPhotoDTO getCoverPhoto() {
    return coverPhoto;
  }
}
