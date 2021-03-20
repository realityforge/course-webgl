package akasha.perf;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface PerformanceObserverCallback {
  void onInvoke(@Nonnull PerformanceObserverEntryList entries,
      @Nonnull PerformanceObserver observer, @Nonnull PerformanceObserverCallbackOptions options);
}
