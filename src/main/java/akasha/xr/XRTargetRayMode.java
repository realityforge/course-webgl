package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRTargetRayMode.class
)
public @interface XRTargetRayMode {
  @Nonnull
  String gaze = "gaze";

  @Nonnull
  String screen = "screen";

  @Nonnull
  String tracked_pointer = "tracked-pointer";

  final class Util {
    private Util() {
    }

    @XRTargetRayMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRTargetRayMode.gaze.equals( value ) || XRTargetRayMode.screen.equals( value ) || XRTargetRayMode.tracked_pointer.equals( value );
    }
  }
}
