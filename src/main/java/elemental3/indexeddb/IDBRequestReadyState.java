package elemental3.indexeddb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IDBRequestReadyState.class
)
public @interface IDBRequestReadyState {
  @Nonnull
  String done = "done";

  @Nonnull
  String pending = "pending";
}
