package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ServiceWorkerState.class
)
public @interface ServiceWorkerState {
  @Nonnull
  String activated = "activated";

  @Nonnull
  String activating = "activating";

  @Nonnull
  String installed = "installed";

  @Nonnull
  String installing = "installing";

  @Nonnull
  String parsed = "parsed";

  @Nonnull
  String redundant = "redundant";
}
