package elemental3.indexeddb;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = IDBRequestReadyState.class
)
public @interface IDBRequestReadyState {
  @Nonnull
  String done = "done";

  @Nonnull
  String pending = "pending";
}
