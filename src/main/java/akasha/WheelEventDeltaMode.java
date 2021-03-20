package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WheelEvent.DOM_DELTA_PIXEL,
        WheelEvent.DOM_DELTA_LINE,
        WheelEvent.DOM_DELTA_PAGE
    }
)
public @interface WheelEventDeltaMode {
  final class Util {
    private Util() {
    }

    @WheelEventDeltaMode
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@WheelEventDeltaMode annotated value must be one of [WheelEvent.DOM_DELTA_PIXEL, WheelEvent.DOM_DELTA_LINE, WheelEvent.DOM_DELTA_PAGE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WheelEvent.DOM_DELTA_PIXEL == value || WheelEvent.DOM_DELTA_LINE == value || WheelEvent.DOM_DELTA_PAGE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WheelEvent.DOM_DELTA_PIXEL == value ? "DOM_DELTA_PIXEL" : WheelEvent.DOM_DELTA_LINE == value ? "DOM_DELTA_LINE" : WheelEvent.DOM_DELTA_PAGE == value ? "DOM_DELTA_PAGE" : "Unknown value " + value;
    }
  }
}
