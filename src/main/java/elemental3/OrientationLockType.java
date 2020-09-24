package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = OrientationLockType.class
)
public @interface OrientationLockType {
  @Nonnull
  String any = "any";

  @Nonnull
  String landscape = "landscape";

  @Nonnull
  String landscape_primary = "landscape_primary";

  @Nonnull
  String landscape_secondary = "landscape_secondary";

  @Nonnull
  String natural = "natural";

  @Nonnull
  String portrait = "portrait";

  @Nonnull
  String portrait_primary = "portrait_primary";

  @Nonnull
  String portrait_secondary = "portrait_secondary";
}
