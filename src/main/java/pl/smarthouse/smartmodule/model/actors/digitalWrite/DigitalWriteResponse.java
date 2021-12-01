package pl.smarthouse.smartmodule.model.actors.digitalWrite;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import pl.smarthouse.smartmodule.model.actors.ActorResponse;

public class DigitalWriteResponse extends ActorResponse {
  @NonNull DigitalWriteResponseEnum state;

  public DigitalWriteResponse(
      @JsonProperty("state") final DigitalWriteResponseEnum state,
      @JsonProperty("actorName") final String actorName) {
    this.actorName = actorName;
    this.state = state;
  }
}
