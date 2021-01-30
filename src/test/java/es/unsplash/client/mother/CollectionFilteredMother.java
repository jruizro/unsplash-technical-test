package es.unsplash.client.mother;

import es.unsplash.client.domain.model.CollectionFiltered;

import java.util.Arrays;
import java.util.List;

public class CollectionFilteredMother {

  public static List<CollectionFiltered> generateList() {

    return Arrays.asList(CollectionFiltered.of("9454911", "BASKETBALL", null, "8hW2ZB4OHZ0"),
        generate());

  }

  public static CollectionFiltered generate() {

    return CollectionFiltered.of("3452356", "FOOTBALL", "Good Play", "ySNkCkdKyTY");

  }

}
