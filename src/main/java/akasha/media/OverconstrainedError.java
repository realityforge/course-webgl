package akasha.media;

import akasha.DOMException;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The OverconstrainedError interface of the Media Capture and Streams API indicates that the set of desired capabilities for the current MediaStreamTrack cannot currently be met. When this event is thrown on a MediaStreamTrack, it is muted until either the current constraints can be established or until satisfiable constraints are applied.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OverconstrainedError">OverconstrainedError - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#overconstrainederror-interface">OverconstrainedError - Media Capture and Streams</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OverconstrainedError"
)
public class OverconstrainedError extends DOMException {
  public OverconstrainedError(@Nonnull final String constraint, @Nonnull final String message) {
  }

  public OverconstrainedError(@Nonnull final String constraint) {
  }

  @JsProperty(
      name = "constraint"
  )
  @Nonnull
  public native String constraint();
}
