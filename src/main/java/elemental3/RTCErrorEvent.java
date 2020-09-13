package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCErrorEvent"
)
public class RTCErrorEvent extends Event {
  public RTCErrorEvent(@Nonnull final String type, @Nonnull final RTCErrorEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  public native RTCError error();
}
