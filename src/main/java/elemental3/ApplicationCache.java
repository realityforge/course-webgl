package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ApplicationCache"
)
public class ApplicationCache extends EventTarget {
  @JsOverlay
  public static final int CHECKING = 2;

  @JsOverlay
  public static final int DOWNLOADING = 3;

  @JsOverlay
  public static final int IDLE = 1;

  @JsOverlay
  public static final int OBSOLETE = 5;

  @JsOverlay
  public static final int UNCACHED = 0;

  @JsOverlay
  public static final int UPDATEREADY = 4;

  @Nullable
  public EventHandler oncached;

  @Nullable
  public EventHandler onchecking;

  @Nullable
  public EventHandler ondownloading;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onnoupdate;

  @Nullable
  public EventHandler onobsolete;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onupdateready;

  protected ApplicationCache() {
  }

  @JsProperty(
      name = "status"
  )
  @ApplicationCacheStatus
  public native int status();

  public native void abort();

  public native void swapCache();

  public native void update();
}
