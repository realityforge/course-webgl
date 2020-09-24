package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AuthenticatorTransport.class
)
public @interface AuthenticatorTransport {
  @Nonnull
  String ble = "ble";

  @Nonnull
  String internal = "internal";

  @Nonnull
  String nfc = "nfc";

  @Nonnull
  String usb = "usb";
}
