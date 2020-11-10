package elemental3.media;

import elemental3.Blob;
import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BlobEvent interface represents events associated with a Blob. These blobs are typically, but not necessarily,  associated with media content.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BlobEvent">BlobEvent - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-record/#blobevent-section">The definition of 'BlobEvent' in the 'MediaStream Recording' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BlobEvent"
)
public class BlobEvent extends Event {
  /**
   * The BlobEvent() constructor returns a newly created BlobEvent object with an associated Blob.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BlobEvent/BlobEvent">BlobEvent.BlobEvent - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-record/#dom-blobevent-blobevent">The definition of 'BlobEvent: BlobEvent' in the 'MediaStream Recording' specification.</a>
   */
  public BlobEvent(@Nonnull final String type, @Nonnull final BlobEventInit eventInitDict) {
    super( null );
  }

  /**
   * The BlobEvent.data read-only property represents a Blob associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BlobEvent/data">BlobEvent.data - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-record/#dom-blobevent-data">The definition of 'BlobEvent.data' in the 'MediaStream Recording' specification.</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native Blob data();

  /**
   * The timecode readonlyinline property of the BlobEvent interface a DOMHighResTimeStamp indicating the difference between the timestamp of the first chunk in data, and the timestamp of the first chunk in the first BlobEvent produced by this recorder.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BlobEvent/timecode">BlobEvent.timecode - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-record/#dom-blobevent-timecode">The definition of 'timecode' in the 'MediaStream Recording' specification.</a>
   */
  @JsProperty(
      name = "timecode"
  )
  public native double timecode();
}
