package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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

    @ApplicationCacheStatus
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@ApplicationCacheStatus annotated value must be one of [ApplicationCache.UNCACHED, ApplicationCache.IDLE, ApplicationCache.CHECKING, ApplicationCache.DOWNLOADING, ApplicationCache.UPDATEREADY, ApplicationCache.OBSOLETE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return ApplicationCache.UNCACHED == value || ApplicationCache.IDLE == value || ApplicationCache.CHECKING == value || ApplicationCache.DOWNLOADING == value || ApplicationCache.UPDATEREADY == value || ApplicationCache.OBSOLETE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return ApplicationCache.UNCACHED == value ? "UNCACHED" : ApplicationCache.IDLE == value ? "IDLE" : ApplicationCache.CHECKING == value ? "CHECKING" : ApplicationCache.DOWNLOADING == value ? "DOWNLOADING" : ApplicationCache.UPDATEREADY == value ? "UPDATEREADY" : ApplicationCache.OBSOLETE == value ? "OBSOLETE" : "Unknown value " + value;
    }
  }
}
