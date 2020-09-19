package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = ResponseType.class
)
public @interface ResponseType {
  @Nonnull
  String basic = "basic";

  @Nonnull
  String cors = "cors";

  @Nonnull
  String default_ = "default";

  @Nonnull
  String error = "error";

  @Nonnull
  String opaque = "opaque";

  @Nonnull
  String opaqueredirect = "opaqueredirect";
}
