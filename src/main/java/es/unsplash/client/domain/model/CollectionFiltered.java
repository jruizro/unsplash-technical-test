package es.unsplash.client.domain.model;

import java.util.Objects;

public final class CollectionFiltered {

  private final String id;
  private final String title;
  private final String description;
  private final String coverPhotoId;

  private CollectionFiltered(String id, String title, String description, String coverPhotoId) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.coverPhotoId = coverPhotoId;
  }

  public static CollectionFiltered of(String id, String title, String description, String coverPhotoId) {
    return new CollectionFiltered(id, title, description, coverPhotoId);
  }

  public boolean isFilteredBy(String filter) {
    return filter == null
        || id != null && id.contains(filter)
        || title != null && title.contains(filter)
        || description != null && description.contains(filter)
        || coverPhotoId != null && coverPhotoId.contains(filter);
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
    return coverPhotoId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    CollectionFiltered that = (CollectionFiltered) o;

    if (!id.equals(that.id)) {
      return false;
    }
    if (!Objects.equals(title, that.title)) {
      return false;
    }
    if (!Objects.equals(description, that.description)) {
      return false;
    }
    return Objects.equals(coverPhotoId, that.coverPhotoId);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (coverPhotoId != null ? coverPhotoId.hashCode() : 0);
    return result;
  }
}
