package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
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
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WheelEvent.DOM_DELTA_PIXEL == value || WheelEvent.DOM_DELTA_LINE == value || WheelEvent.DOM_DELTA_PAGE == value;
    }
  }
}
