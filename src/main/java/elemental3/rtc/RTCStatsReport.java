package elemental3.rtc;

import elemental3.core.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The RTCStatsReport interface provides a statistics report obtained by calling one of the RTCPeerConnection.getStats(), RTCRtpReceiver.getStats(), and RTCRtpSender.getStats() methods.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStatsReport">RTCStatsReport - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcstatsreport-object">The definition of 'RTCStatsReport' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCStatsReport"
)
public class RTCStatsReport {
  protected RTCStatsReport() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  public native boolean has(@Nonnull String key);

  @Nullable
  public native Object get(@Nonnull String key);

  @Nonnull
  public native JsIterator<String> keys();

  @Nonnull
  public native JsIterator<Object> values();

  @Nonnull
  public native JsIterator<Entry> entries();

  public native void forEach(@Nonnull ForEachCallback callback);

  public native void forEach(@Nonnull ForEachCallback2 callback);

  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      name = "?",
      namespace = JsPackage.GLOBAL
  )
  public interface Entry {
    @JsOverlay
    default String key() {
      return Js.asArray( this )[ 0 ].cast();
    }

    @JsOverlay
    default Object value() {
      return Js.asArray( this )[ 1 ].cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull Object value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull Object value, @Nonnull String key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull Object value, @Nonnull String key, @Nonnull RTCStatsReport map);
  }
}
