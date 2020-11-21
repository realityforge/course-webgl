package elemental3;

import elemental3.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface UnderlyingSinkWriteCallback {
  @Nonnull
  Promise<Void> onInvoke(@DoNotAutobox @Nullable Object chunk,
      @Nonnull WritableStreamDefaultController controller);
}
