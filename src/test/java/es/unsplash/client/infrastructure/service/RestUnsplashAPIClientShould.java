package es.unsplash.client.infrastructure.service;

import com.google.gson.JsonArray;
import es.unsplash.client.domain.model.CollectionFiltered;
import es.unsplash.client.infrastructure.service.dto.UnsplashCollectionDTO;
import es.unsplash.client.mother.UnsplashCollectionsResponseMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class RestUnsplashAPIClientShould {

  private static final String API_ENDPOINT = "http://localhost:8080";
  private static final String API_CLIENT_ID = "testclientid";

  private MockRestServiceServer mockServer;

  private RestUnsplashAPIClient restUnsplashAPIClient;

  @BeforeEach
  public void init() {
    RestTemplate mockRestTemplate = new RestTemplateBuilder().rootUri(API_ENDPOINT).build();
    mockServer = MockRestServiceServer.createServer(mockRestTemplate);
    restUnsplashAPIClient = new RestUnsplashAPIClient(mockRestTemplate, API_CLIENT_ID);
  }

  @Test
  public void returnEmptyListWhenNoResponse() {
    // given
    JsonArray expectedResponse = new JsonArray();

    mockServer.expect(requestTo(API_ENDPOINT + "/collections?client_id=" + API_CLIENT_ID + "&page=1"))
        .andExpect(method(HttpMethod.GET))
        .andRespond(withSuccess(expectedResponse.toString(), MediaType.APPLICATION_JSON));

    // when
    List<CollectionFiltered> result = restUnsplashAPIClient.getCollectionsByPage(Optional.empty());

    // then
    mockServer.verify();
    assertEquals(result, new ArrayList<>());
  }

  @Test
  public void returnCollectionsWhenResponse() {
    // given
    String okResponse = UnsplashCollectionsResponseMother.generateOKResponse();
    UnsplashCollectionDTO okResponseObject = UnsplashCollectionsResponseMother.generateOKResponseObject();

    mockServer.expect(requestTo(API_ENDPOINT + "/collections?client_id=" + API_CLIENT_ID + "&page=2"))
        .andExpect(method(HttpMethod.GET))
        .andRespond(withSuccess(okResponse, MediaType.APPLICATION_JSON));

    // when
    List<CollectionFiltered> result = restUnsplashAPIClient.getCollectionsByPage(Optional.of(2));

    // then
    mockServer.verify();
    assertEquals(result.size(), 1);
    assertEquals(result.get(0), CollectionFiltered.of(okResponseObject.getId(),
        okResponseObject.getTitle(),
        okResponseObject.getDescription(),
        okResponseObject.getCoverPhoto().getId()));

  }

}
