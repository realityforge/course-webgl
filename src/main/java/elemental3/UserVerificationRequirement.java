package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = UserVerificationRequirement.class
)
public @interface UserVerificationRequirement {
  @Nonnull
  String discouraged = "discouraged";

  @Nonnull
  String preferred = "preferred";

  @Nonnull
  String required = "required";
}
