package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RequestRedirect.class
)
public @interface RequestRedirect {
  @Nonnull
  String error = "error";

  @Nonnull
  String follow = "follow";

  @Nonnull
  String manual = "manual";
}
