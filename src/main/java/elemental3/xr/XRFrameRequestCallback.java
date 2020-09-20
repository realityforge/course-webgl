package elemental3.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface XRFrameRequestCallback {
  void onInvoke(double time, @Nonnull XRFrame frame);
}
