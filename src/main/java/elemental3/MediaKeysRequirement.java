package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaKeysRequirement.class
)
public @interface MediaKeysRequirement {
  @Nonnull
  String not_allowed = "not_allowed";

  @Nonnull
  String optional = "optional";

  @Nonnull
  String required = "required";
}
