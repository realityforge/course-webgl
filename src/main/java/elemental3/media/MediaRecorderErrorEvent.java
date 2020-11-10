package elemental3.media;

import elemental3.DOMException;
import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaRecorderErrorEvent interface represents errors returned by the MediaStream Recording API. It is an Event object that encapsulates a reference to a DOMException describing the error that occurred.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorderErrorEvent">MediaRecorderErrorEvent - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-record/#errorevent-section">The definition of 'MediaRecorderErrorEvent' in the 'MediaStream Recording' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaRecorderErrorEvent"
)
public class MediaRecorderErrorEvent extends Event {
  /**
   * The MediaRecorderErrorEvent() constructor creates a new MediaRecorderErrorEvent object that represents an error that occurred during the recording of media by the MediaStream Recording API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorderErrorEvent/MediaRecorderErrorEvent">MediaRecorderErrorEvent.MediaRecorderErrorEvent - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-record/#dom-mediarecordererrorevent-mediarecordererrorevent">The definition of 'MediaRecorderErrorEvent()' in the 'MediaStream Recording' specification.</a>
   */
  public MediaRecorderErrorEvent(@Nonnull final String type,
      @Nonnull final MediaRecorderErrorEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only error property in the MediaRecorderErrorEvent interface is a DOMException object providing details about the exception that was thrown by a MediaRecorder instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorderErrorEvent/error">MediaRecorderErrorEvent.error - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-record/#errorevent-section">The definition of 'MediaRecorderErrorEvent.error' in the 'MediaStream Recording' specification.</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nonnull
  public native DOMException error();
}
