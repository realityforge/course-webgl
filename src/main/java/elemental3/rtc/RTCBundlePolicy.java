package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCBundlePolicy.class
)
public @interface RTCBundlePolicy {
  @Nonnull
  String balanced = "balanced";

  @Nonnull
  String max_bundle = "max-bundle";

  @Nonnull
  String max_compat = "max-compat";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCBundlePolicy.balanced.equals( value ) || RTCBundlePolicy.max_bundle.equals( value ) || RTCBundlePolicy.max_compat.equals( value );
    }
  }
}
