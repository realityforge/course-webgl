package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = KeyFormat.class
)
public @interface KeyFormat {
  @Nonnull
  String jwk = "jwk";

  @Nonnull
  String pkcs8 = "pkcs8";

  @Nonnull
  String raw = "raw";

  @Nonnull
  String spki = "spki";
}
