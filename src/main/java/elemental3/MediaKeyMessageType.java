package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = MediaKeyMessageType.class
)
public @interface MediaKeyMessageType {
  @Nonnull
  String individualization_request = "individualization-request";

  @Nonnull
  String license_release = "license-release";

  @Nonnull
  String license_renewal = "license-renewal";

  @Nonnull
  String license_request = "license-request";
}
