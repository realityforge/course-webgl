package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface UnderlyingSourcePullCallback {
  @Nonnull
  Promise<Void> onInvoke(@Nonnull ReadableStreamController controller);
}
