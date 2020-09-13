package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaRecorderErrorEvent interface represents errors returned by the MediaStream Recording API. It is an Event object that encapsulates a reference to a DOMException describing the error that occurred.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorderErrorEvent">MediaRecorderErrorEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaRecorderErrorEvent"
)
public class MediaRecorderErrorEvent extends Event {
  public MediaRecorderErrorEvent(@Nonnull final String type,
      @Nonnull final MediaRecorderErrorEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only error property in the MediaRecorderErrorEvent interface is a DOMException object providing details about the exception that was thrown by a MediaRecorder instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorderErrorEvent/error">MediaRecorderErrorEvent.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nonnull
  public native DOMException error();
}
