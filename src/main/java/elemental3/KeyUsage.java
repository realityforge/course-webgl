package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = KeyUsage.class
)
public @interface KeyUsage {
  @Nonnull
  String decrypt = "decrypt";

  @Nonnull
  String deriveBits = "deriveBits";

  @Nonnull
  String deriveKey = "deriveKey";

  @Nonnull
  String encrypt = "encrypt";

  @Nonnull
  String sign = "sign";

  @Nonnull
  String unwrapKey = "unwrapKey";

  @Nonnull
  String verify = "verify";

  @Nonnull
  String wrapKey = "wrapKey";
}
