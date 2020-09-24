package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TouchType.class
)
public @interface TouchType {
  @Nonnull
  String direct = "direct";

  @Nonnull
  String stylus = "stylus";
}
