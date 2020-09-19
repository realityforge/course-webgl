package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = SelectionMode.class
)
public @interface SelectionMode {
  @Nonnull
  String end = "end";

  @Nonnull
  String preserve = "preserve";

  @Nonnull
  String select = "select";

  @Nonnull
  String start = "start";
}
