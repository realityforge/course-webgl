package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceTcpCandidateType.class
)
public @interface RTCIceTcpCandidateType {
  @Nonnull
  String active = "active";

  @Nonnull
  String passive = "passive";

  @Nonnull
  String so = "so";

  final class Util {
    private Util() {
    }

    @RTCIceTcpCandidateType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceTcpCandidateType.active.equals( value ) || RTCIceTcpCandidateType.passive.equals( value ) || RTCIceTcpCandidateType.so.equals( value );
    }
  }
}
