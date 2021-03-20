package akasha.rtc;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ValidateAssertionCallback {
  @Nonnull
  Promise<RTCIdentityValidationResult> onInvoke(@Nonnull String assertion, @Nonnull String origin);
}
