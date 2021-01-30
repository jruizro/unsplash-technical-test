package es.unsplash.client.application.getcollectionsfiltered;

import java.util.Objects;

public class GetCollectionsFilteredResponse {

  private final String id;
  private final String title;
  private final String description;
  private final String cover_photo_id;

  public GetCollectionsFilteredResponse(String id, String title, String description, String coverPhotoId) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.cover_photo_id = coverPhotoId;
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

  public String getCoverPhotoId() {
    return cover_photo_id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    GetCollectionsFilteredResponse that = (GetCollectionsFilteredResponse) o;

    if (!Objects.equals(id, that.id)) {
      return false;
    }
    if (!Objects.equals(title, that.title)) {
      return false;
    }
    if (!Objects.equals(description, that.description)) {
      return false;
    }
    return Objects.equals(cover_photo_id, that.cover_photo_id);
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (cover_photo_id != null ? cover_photo_id.hashCode() : 0);
    return result;
  }
}
