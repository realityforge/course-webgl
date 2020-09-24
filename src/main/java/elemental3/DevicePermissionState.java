package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DevicePermissionState.class
)
public @interface DevicePermissionState {
  @Nonnull
  String denied = "denied";

  @Nonnull
  String granted = "granted";
}
