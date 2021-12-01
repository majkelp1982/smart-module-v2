package pl.smarthouse.smartmodule.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import pl.smarthouse.smartmodule.model.actors.ActorResponse;

import java.util.List;

@AllArgsConstructor
public class ModuleResponse {

  @JsonProperty("type")
  private String type;

  @JsonProperty("version")
  private String version;

  @JsonProperty("actors")
  private List<ActorResponse> actors;
}
