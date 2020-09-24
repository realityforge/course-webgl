package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VisibilityState.class
)
public @interface VisibilityState {
  @Nonnull
  String hidden = "hidden";

  @Nonnull
  String visible = "visible";
}
