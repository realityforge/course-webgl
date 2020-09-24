package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ScrollLogicalPosition.class
)
public @interface ScrollLogicalPosition {
  @Nonnull
  String center = "center";

  @Nonnull
  String end = "end";

  @Nonnull
  String nearest = "nearest";

  @Nonnull
  String start = "start";
}
