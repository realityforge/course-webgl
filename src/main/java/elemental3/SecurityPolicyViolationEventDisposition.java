package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = SecurityPolicyViolationEventDisposition.class
)
public @interface SecurityPolicyViolationEventDisposition {
  @Nonnull
  String enforce = "enforce";

  @Nonnull
  String report = "report";
}
