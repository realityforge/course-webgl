package akasha.rtc;

import akasha.DOMException;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface RTCPeerConnectionErrorCallback {
  void onInvoke(@Nonnull DOMException error);
}
