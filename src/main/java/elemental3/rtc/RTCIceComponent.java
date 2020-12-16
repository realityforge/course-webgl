package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceComponent.class
)
public @interface RTCIceComponent {
  @Nonnull
  String rtcp = "rtcp";

  @Nonnull
  String rtp = "rtp";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceComponent.rtcp.equals( value ) || RTCIceComponent.rtp.equals( value );
    }
  }
}
