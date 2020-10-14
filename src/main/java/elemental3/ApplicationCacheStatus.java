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
}
