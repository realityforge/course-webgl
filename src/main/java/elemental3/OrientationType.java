package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = OrientationType.class
)
public @interface OrientationType {
  @Nonnull
  String landscape_primary = "landscape-primary";

  @Nonnull
  String landscape_secondary = "landscape-secondary";

  @Nonnull
  String portrait_primary = "portrait-primary";

  @Nonnull
  String portrait_secondary = "portrait-secondary";
}
