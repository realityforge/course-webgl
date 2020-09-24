package elemental3.notifications;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = NotificationDirection.class
)
public @interface NotificationDirection {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String ltr = "ltr";

  @Nonnull
  String rtl = "rtl";
}
