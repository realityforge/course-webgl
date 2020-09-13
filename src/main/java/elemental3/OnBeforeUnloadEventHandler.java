package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface OnBeforeUnloadEventHandler {
  @Nullable
  String onInvoke(@Nonnull Event event);
}
