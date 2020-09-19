package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = NotificationPermission.class
)
public @interface NotificationPermission {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String denied = "denied";

  @Nonnull
  String granted = "granted";
}
