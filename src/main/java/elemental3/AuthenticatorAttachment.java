package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AuthenticatorAttachment.class
)
public @interface AuthenticatorAttachment {
  @Nonnull
  String cross_platform = "cross-platform";

  @Nonnull
  String platform = "platform";
}
