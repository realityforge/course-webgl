package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CredentialMediationRequirement.class
)
public @interface CredentialMediationRequirement {
  @Nonnull
  String optional = "optional";

  @Nonnull
  String required = "required";

  @Nonnull
  String silent = "silent";
}
