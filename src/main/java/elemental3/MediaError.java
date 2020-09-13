package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaError interface represents an error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as audio or video.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaError">MediaError - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaError"
)
public class MediaError {
  @JsOverlay
  public static final int MEDIA_ERR_ABORTED = 1;

  @JsOverlay
  public static final int MEDIA_ERR_DECODE = 3;

  @JsOverlay
  public static final int MEDIA_ERR_NETWORK = 2;

  @JsOverlay
  public static final int MEDIA_ERR_SRC_NOT_SUPPORTED = 4;

  MediaError() {
  }

  /**
   * The read-only property MediaError.code returns a numeric value which represents the kind of error that occurred on a media element. To get a text string with specific diagnostic information, see MediaError.message.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaError/code">MediaError.code - MDN</a>
   */
  @JsProperty(
      name = "code"
  )
  public native int code();

  /**
   * The read-only property MediaError.message returns a DOMString which contains a human-readable string offering specific diagnostic details related to the error described by the MediaError object, or an empty string (&quot;&quot;) if no diagnostic information can be determined or provided.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaError/message">MediaError.message - MDN</a>
   */
  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
