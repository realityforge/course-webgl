package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PushEncryptionKeyName.class
)
public @interface PushEncryptionKeyName {
  @Nonnull
  String auth = "auth";

  @Nonnull
  String p256dh = "p256dh";
}
