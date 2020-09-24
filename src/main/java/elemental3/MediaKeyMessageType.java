package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaKeyMessageType.class
)
public @interface MediaKeyMessageType {
  @Nonnull
  String individualization_request = "individualization_request";

  @Nonnull
  String license_release = "license_release";

  @Nonnull
  String license_renewal = "license_renewal";

  @Nonnull
  String license_request = "license_request";
}
