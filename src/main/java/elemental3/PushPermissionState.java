package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PushPermissionState.class
)
public @interface PushPermissionState {
  @Nonnull
  String denied = "denied";

  @Nonnull
  String granted = "granted";

  @Nonnull
  String prompt = "prompt";
}
