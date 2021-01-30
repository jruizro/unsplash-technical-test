package es.unsplash.client.domain.model;

import es.unsplash.client.mother.CollectionFilteredMother;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionFilteredShould {

  @Test
  public void returnTrueIfFilterIsNull() {
    // given
    CollectionFiltered collectionFiltered = CollectionFilteredMother.generate();

    // when
    boolean result = collectionFiltered.isFilteredBy(null);

    // then
    assertTrue(result);

  }

  @Test
  public void returnTrueIfFilterMatchesWithId() {
    // given
    CollectionFiltered collectionFiltered = CollectionFilteredMother.generate();

    // when
    boolean result = collectionFiltered.isFilteredBy("235");

    // then
    assertTrue(result);
  }

  @Test
  public void returnTrueIfFilterMatchesWithTitle() {
    // given
    CollectionFiltered collectionFiltered = CollectionFilteredMother.generate();

    // when
    boolean result = collectionFiltered.isFilteredBy("BALL");

    // then
    assertTrue(result);
  }

  @Test
  public void returnTrueIfFilterMatchesWithDescription() {
    // given
    CollectionFiltered collectionFiltered = CollectionFilteredMother.generate();

    // when
    boolean result = collectionFiltered.isFilteredBy("Play");

    // then
    assertTrue(result);
  }

  @Test
  public void returnTrueIfFilterMatchesWithPhotoCoverId() {
    // given
    CollectionFiltered collectionFiltered = CollectionFilteredMother.generate();

    // when
    boolean result = collectionFiltered.isFilteredBy("Ckd");

    // then
    assertTrue(result);
  }

  @Test
  public void returnFalseIfFilterNoMatchesAnyField() {
    // given
    CollectionFiltered collectionFiltered = CollectionFilteredMother.generate();

    // when
    boolean result = collectionFiltered.isFilteredBy("****");

    // then
    assertFalse(result);
  }
}
