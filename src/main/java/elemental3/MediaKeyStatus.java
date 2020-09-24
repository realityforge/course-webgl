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
  String internal_error = "internal-error";

  @Nonnull
  String output_downscaled = "output-downscaled";

  @Nonnull
  String output_restricted = "output-restricted";

  @Nonnull
  String released = "released";

  @Nonnull
  String status_pending = "status-pending";

  @Nonnull
  String usable = "usable";
}
