package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        ApplicationCache.UNCACHED,
        ApplicationCache.IDLE,
        ApplicationCache.CHECKING,
        ApplicationCache.DOWNLOADING,
        ApplicationCache.UPDATEREADY,
        ApplicationCache.OBSOLETE
    }
)
public @interface ApplicationCacheStatus {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return ApplicationCache.UNCACHED == value || ApplicationCache.IDLE == value || ApplicationCache.CHECKING == value || ApplicationCache.DOWNLOADING == value || ApplicationCache.UPDATEREADY == value || ApplicationCache.OBSOLETE == value;
    }
  }
}
