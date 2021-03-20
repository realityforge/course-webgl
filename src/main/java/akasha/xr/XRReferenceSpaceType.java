package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRReferenceSpaceType.class
)
public @interface XRReferenceSpaceType {
  @Nonnull
  String bounded_floor = "bounded-floor";

  @Nonnull
  String local = "local";

  @Nonnull
  String local_floor = "local-floor";

  @Nonnull
  String unbounded = "unbounded";

  @Nonnull
  String viewer = "viewer";

  final class Util {
    private Util() {
    }

    @XRReferenceSpaceType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRReferenceSpaceType.bounded_floor.equals( value ) || XRReferenceSpaceType.local.equals( value ) || XRReferenceSpaceType.local_floor.equals( value ) || XRReferenceSpaceType.unbounded.equals( value ) || XRReferenceSpaceType.viewer.equals( value );
    }
  }
}
