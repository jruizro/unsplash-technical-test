package es.unsplash.client.application.getcollectionsfiltered;

import es.unsplash.client.domain.model.CollectionFiltered;
import es.unsplash.client.domain.service.CollectionsProviderService;
import es.unsplash.client.mother.CollectionFilteredMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SuppressWarnings("unchecked")
public class GetCollectionsFilteredServiceShould {

  private GetCollectionsFilteredService getCollectionsFilteredService;

  @Mock
  private CollectionsProviderService collectionsProviderServiceMock;

  @BeforeEach
  public void setUp() {
    getCollectionsFilteredService = new GetCollectionsFilteredService(collectionsProviderServiceMock);
  }

  @Test
  public void returnAllCollectionsIfNoInputFilter() {
    // given
    List<CollectionFiltered> input = CollectionFilteredMother.generateList();
    List<GetCollectionsFilteredResponse> expectedResponse = CollectionFilteredMother.generateList()
        .stream()
        .map(c -> new GetCollectionsFilteredResponse(c.getId(),
            c.getTitle(),
            c.getDescription(),
            c.getCoverPhotoId()))
        .collect(Collectors.toList());
    when(collectionsProviderServiceMock.getCollectionsByPage(any(Optional.class)))
        .thenReturn(input);

    // when
    List<GetCollectionsFilteredResponse> result = getCollectionsFilteredService.execute(null);

    // then
    assertEquals(result, expectedResponse);

  }

  @Test
  public void returnCollectionsFiltered() {
    // given
    List<CollectionFiltered> input = CollectionFilteredMother.generateList();
    List<GetCollectionsFilteredResponse> expectedResponse = Arrays.asList(CollectionFilteredMother.generate())
        .stream()
        .map(c -> new GetCollectionsFilteredResponse(c.getId(),
            c.getTitle(),
            c.getDescription(),
            c.getCoverPhotoId()))
        .collect(Collectors.toList());
    when(collectionsProviderServiceMock.getCollectionsByPage(Optional.empty()))
        .thenReturn(input);

    // when
    List<GetCollectionsFilteredResponse> result = getCollectionsFilteredService.execute("FOOTBALL");

    // then
    assertEquals(result, expectedResponse);

  }


}
