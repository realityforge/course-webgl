package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCCodecType.class
)
public @interface RTCCodecType {
  @Nonnull
  String decode = "decode";

  @Nonnull
  String encode = "encode";

  final class Util {
    private Util() {
    }

    @RTCCodecType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCCodecType.decode.equals( value ) || RTCCodecType.encode.equals( value );
    }
  }
}
