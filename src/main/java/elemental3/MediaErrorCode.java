package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
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
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return MediaError.MEDIA_ERR_ABORTED == value || MediaError.MEDIA_ERR_NETWORK == value || MediaError.MEDIA_ERR_DECODE == value || MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED == value;
    }
  }
}
