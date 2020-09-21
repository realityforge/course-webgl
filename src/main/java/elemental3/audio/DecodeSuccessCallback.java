package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface DecodeSuccessCallback {
  void onInvoke(@Nonnull AudioBuffer decodedData);
}
