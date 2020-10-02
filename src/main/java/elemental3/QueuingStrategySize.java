package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface QueuingStrategySize {
  double onInvoke(@DoNotAutobox @Nullable Object chunk);
}
