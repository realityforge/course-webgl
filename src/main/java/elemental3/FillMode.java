package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FillMode.class
)
public @interface FillMode {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String backwards = "backwards";

  @Nonnull
  String both = "both";

  @Nonnull
  String forwards = "forwards";

  @Nonnull
  String none = "none";
}
