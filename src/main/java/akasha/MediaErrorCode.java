package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        MediaError.MEDIA_ERR_ABORTED,
        MediaError.MEDIA_ERR_NETWORK,
        MediaError.MEDIA_ERR_DECODE,
        MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED
    }
)
public @interface MediaErrorCode {
  final class Util {
    private Util() {
    }

    @MediaErrorCode
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@MediaErrorCode annotated value must be one of [MediaError.MEDIA_ERR_ABORTED, MediaError.MEDIA_ERR_NETWORK, MediaError.MEDIA_ERR_DECODE, MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED] but is " + value;
    }

    public static boolean isValid(final int value) {
      return MediaError.MEDIA_ERR_ABORTED == value || MediaError.MEDIA_ERR_NETWORK == value || MediaError.MEDIA_ERR_DECODE == value || MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return MediaError.MEDIA_ERR_ABORTED == value ? "MEDIA_ERR_ABORTED" : MediaError.MEDIA_ERR_NETWORK == value ? "MEDIA_ERR_NETWORK" : MediaError.MEDIA_ERR_DECODE == value ? "MEDIA_ERR_DECODE" : MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED == value ? "MEDIA_ERR_SRC_NOT_SUPPORTED" : "Unknown value " + value;
    }
  }
}
