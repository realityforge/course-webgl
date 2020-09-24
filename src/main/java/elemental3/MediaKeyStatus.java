package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaKeyStatus.class
)
public @interface MediaKeyStatus {
  @Nonnull
  String expired = "expired";

  @Nonnull
  String internal_error = "internal_error";

  @Nonnull
  String output_downscaled = "output_downscaled";

  @Nonnull
  String output_restricted = "output_restricted";

  @Nonnull
  String released = "released";

  @Nonnull
  String status_pending = "status_pending";

  @Nonnull
  String usable = "usable";
}
