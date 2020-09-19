package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = XRVisibilityState.class
)
public @interface XRVisibilityState {
  @Nonnull
  String hidden = "hidden";

  @Nonnull
  String visible = "visible";

  @Nonnull
  String visible_blurred = "visible-blurred";
}
