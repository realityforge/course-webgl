package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = DevicePermissionState.class
)
public @interface DevicePermissionState {
  @Nonnull
  String denied = "denied";

  @Nonnull
  String granted = "granted";
}
