package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCPeerConnectionIceErrorEvent"
)
public class RTCPeerConnectionIceErrorEvent extends Event {
  public RTCPeerConnectionIceErrorEvent(@Nonnull final String type,
      @Nonnull final RTCPeerConnectionIceErrorEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "address"
  )
  @Nullable
  public native String address();

  @JsProperty(
      name = "errorCode"
  )
  public native int errorCode();

  @JsProperty(
      name = "errorText"
  )
  @Nonnull
  public native String errorText();

  @JsProperty(
      name = "port"
  )
  @Nullable
  public native Double port();

  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();
}
