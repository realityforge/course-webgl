package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaStreamTrackState.class
)
public @interface MediaStreamTrackState {
  @Nonnull
  String ended = "ended";

  @Nonnull
  String live = "live";

  final class Validator {
    private Validator() {
    }

    @MediaStreamTrackState
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MediaStreamTrackState.ended.equals( value ) || MediaStreamTrackState.live.equals( value );
    }
  }
}
