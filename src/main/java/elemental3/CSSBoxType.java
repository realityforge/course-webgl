package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CSSBoxType.class
)
public @interface CSSBoxType {
  @Nonnull
  String border = "border";

  @Nonnull
  String content = "content";

  @Nonnull
  String margin = "margin";

  @Nonnull
  String padding = "padding";
}
