package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
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
