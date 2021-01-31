package es.unsplash.client.infrastructure.controller;

import es.unsplash.client.application.getcollectionsfiltered.GetCollectionsFilteredResponse;
import es.unsplash.client.application.getcollectionsfiltered.GetCollectionsFilteredService;
import es.unsplash.client.mother.CollectionFilteredMother;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {CollectionsController.class, GetCollectionsFilteredService.class})
@WebMvcTest
public class CollectionsControllerShould {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private GetCollectionsFilteredService getCollectionsFilteredService;

  @BeforeEach
  public void setUp() {

  }

  @Test
  public void returnOKWithAllCollectionWithoutFilter() throws Exception {
    List<GetCollectionsFilteredResponse> collectionFiltered = CollectionFilteredMother.generateList()
        .stream()
        .map(c -> new GetCollectionsFilteredResponse(c.getId(),
            c.getTitle(),
            c.getDescription(),
            c.getCoverPhotoId()))
        .collect(Collectors.toList());
    when(getCollectionsFilteredService.execute(null))
        .thenReturn(collectionFiltered);

    MvcResult response = mockMvc.perform(MockMvcRequestBuilders.get("/collection/all")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andReturn();

    String result = response.getResponse().getContentAsString();
    assertTrue(result.contains("FOOTBALL"));
    assertTrue(result.contains("BASKETBALL"));
  }

  @Test
  public void returnOKWithCollectionFiltered() throws Exception {
    List<GetCollectionsFilteredResponse> collectionFiltered = Lists.newArrayList(CollectionFilteredMother.generate())
        .stream()
        .map(c -> new GetCollectionsFilteredResponse(c.getId(),
            c.getTitle(),
            c.getDescription(),
            c.getCoverPhotoId()))
        .collect(Collectors.toList());
    when(getCollectionsFilteredService.execute("BASKET"))
        .thenReturn(collectionFiltered);

    MvcResult response = mockMvc.perform(MockMvcRequestBuilders.get("/collection/all")
        .param("filter", "BASKET")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andReturn();

    String result = response.getResponse().getContentAsString();
    assertTrue(result.contains("FOOTBALL"));
    assertFalse(result.contains("BASKETBALL"));

  }

  @Test
  public void return500WhenFails() throws Exception {
    List<GetCollectionsFilteredResponse> collectionFiltered = CollectionFilteredMother.generateList()
        .stream()
        .map(c -> new GetCollectionsFilteredResponse(c.getId(),
            c.getTitle(),
            c.getDescription(),
            c.getCoverPhotoId()))
        .collect(Collectors.toList());
    when(getCollectionsFilteredService.execute(null))
        .thenThrow(new RuntimeException("Something Fails"));

    MvcResult response = mockMvc.perform(MockMvcRequestBuilders.get("/collection/all")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is5xxServerError())
        .andReturn();

    String result = response.getResponse().getContentAsString();
    assertEquals(result, "Something Fails");

  }

}
