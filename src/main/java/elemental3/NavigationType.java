package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = NavigationType.class
)
public @interface NavigationType {
  @Nonnull
  String back_forward = "back_forward";

  @Nonnull
  String navigate = "navigate";

  @Nonnull
  String prerender = "prerender";

  @Nonnull
  String reload = "reload";
}
