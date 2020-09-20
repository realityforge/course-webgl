package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface RTCSessionDescriptionCallback {
  void onInvoke(@Nonnull RTCSessionDescriptionInit description);
}
