package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface UnderlyingSourceStartCallback {
  @Nullable
  Any onInvoke(@Nonnull ReadableStreamController controller);
}
