package es.unsplash.client.infrastructure.service;

import es.unsplash.client.domain.model.CollectionFiltered;
import es.unsplash.client.domain.service.CollectionsProviderService;
import es.unsplash.client.infrastructure.service.dto.UnsplashCollectionDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RestUnsplashAPIClient implements CollectionsProviderService {

  private static final String CLIENT_ID_TOKEN_PARAM = "client_id";
  private static final String PAGE_TOKEN_PARAM = "page";

  private static final String UNSPLASH_API_GET_COLLECTIONS_ENDPOINT = "/collections";

  private final RestTemplate restTemplate;
  private final String apiClientId;

  private HttpHeaders httpHeaders = new HttpHeaders();

  public RestUnsplashAPIClient(RestTemplate restTemplate, String apiClientId) {
    this.restTemplate = restTemplate;
    this.apiClientId = apiClientId;

    httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

  }

  @Override
  public List<CollectionFiltered> getCollectionsByPage(Optional<Integer> page) {
    return restTemplate.exchange(
        new StringBuffer()
            .append(UNSPLASH_API_GET_COLLECTIONS_ENDPOINT)
            .append("?").append(CLIENT_ID_TOKEN_PARAM + "=" + apiClientId)
            .append("&").append(PAGE_TOKEN_PARAM + "=" + (page.orElse(1)))
            .toString(),
        HttpMethod.GET,
        new HttpEntity<>(httpHeaders),
        new ParameterizedTypeReference<List<UnsplashCollectionDTO>>() {
        })
        .getBody()
        .stream()
        .map(c -> CollectionFiltered.of(c.getId(),
            c.getTitle(),
            c.getDescription(),
            c.getCoverPhoto().getId()))
        .collect(Collectors.toList());

  }
}
