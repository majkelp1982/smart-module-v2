package pl.smarthouse.smartmodule.model.actors;

import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Actor {
  @NonNull protected String name;
  @NonNull protected ActorType type;
}
