package elemental3;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ReportingObserverCallback {
  void onInvoke(@Nonnull JsArray<Report> reports, @Nonnull ReportingObserver observer);
}
