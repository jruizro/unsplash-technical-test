package es.unsplash.client.infrastructure.controller;

import es.unsplash.client.application.getcollectionsfiltered.GetCollectionsFilteredResponse;
import es.unsplash.client.application.getcollectionsfiltered.GetCollectionsFilteredService;
import es.unsplash.client.infrastructure.controller.apidoc.UnSplashFilteredAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/collection")
@SuppressWarnings("unchecked")
public class CollectionsController implements UnSplashFilteredAPI {

  private static final Logger LOGGER = LoggerFactory.getLogger(CollectionsController.class);

  @Autowired
  private GetCollectionsFilteredService getCollectionsFilteredService;

  @Override
  @GetMapping(value = "/all",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity getCollectionsFiltered(
      @RequestParam(required = false) final String filter) {

    LOGGER.info("GET /collection/all by filter: {}", filter);

    try {

      List<GetCollectionsFilteredResponse> collectionsFiltered = getCollectionsFilteredService.execute(filter);
      return ResponseEntity.status(HttpStatus.OK).body(collectionsFiltered);

    } catch (RuntimeException e) {
      LOGGER.error("GET /collection/all by filter {} fails -> Exception: {}", filter, e.getMessage(), e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
  }
}
