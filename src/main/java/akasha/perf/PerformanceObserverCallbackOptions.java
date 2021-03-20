package akasha.perf;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface PerformanceObserverCallbackOptions {
  @JsOverlay
  @Nonnull
  static PerformanceObserverCallbackOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "droppedEntriesCount"
  )
  int droppedEntriesCount();

  @JsProperty
  void setDroppedEntriesCount(int droppedEntriesCount);

  @JsOverlay
  @Nonnull
  default PerformanceObserverCallbackOptions droppedEntriesCount(final int droppedEntriesCount) {
    setDroppedEntriesCount( droppedEntriesCount );
    return this;
  }
}
