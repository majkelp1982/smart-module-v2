package pl.smarthouse.smartmodule.model.actors.digitalWrite;

import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.smartmodule.model.actors.Actor;

@SuperBuilder
@Getter
public class DigitalWrite extends Actor {
  @NonNull private Integer pin;
  @NonNull private Integer latchTimeMs;
  private DigitalWriteActions action;
  private DigitalWriteResponse response;
}
