package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanPlayTypeResult.class
)
public @interface CanPlayTypeResult {
  @Nonnull
  String negative = "";

  @Nonnull
  String maybe = "maybe";

  @Nonnull
  String probably = "probably";
}
