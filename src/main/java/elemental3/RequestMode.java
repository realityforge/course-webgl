package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RequestMode.class
)
public @interface RequestMode {
  @Nonnull
  String cors = "cors";

  @Nonnull
  String navigate = "navigate";

  @Nonnull
  String no_cors = "no-cors";

  @Nonnull
  String same_origin = "same-origin";
}
