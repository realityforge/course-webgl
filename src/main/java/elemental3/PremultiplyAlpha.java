package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PremultiplyAlpha.class
)
public @interface PremultiplyAlpha {
  @Nonnull
  String default_ = "default_";

  @Nonnull
  String none = "none";

  @Nonnull
  String premultiply = "premultiply";
}
