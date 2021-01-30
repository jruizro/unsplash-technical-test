package es.unsplash.client.infrastructure.controller.apidoc;

import es.unsplash.client.application.getcollectionsfiltered.GetCollectionsFilteredResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api("Unsplash Filtered API")
public interface UnSplashFilteredAPI {

  @ApiOperation(
      value = "Get Unplash Collection Filtered",
      notes = "Endpoint for getting Unsplash Collections Filtered",
      httpMethod = "GET",
      responseContainer = "List",
      response = GetCollectionsFilteredResponse.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Collections successfully returned"),
      @ApiResponse(code = 400, message = "Not valid request data"),
      @ApiResponse(code = 500, message = "Unexpected error")})
  ResponseEntity<List<GetCollectionsFilteredResponse>> getCollectionsFiltered(
      @ApiParam("filter") String filter
  );


}
