package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLVideoElement interface provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement">HTMLVideoElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLVideoElement"
)
public class HTMLVideoElement extends HTMLMediaElement {
  public int height;

  public boolean playsInline;

  @Nonnull
  public String poster;

  public int width;

  protected HTMLVideoElement() {
  }

  /**
   * The HTMLVideoElement interface's read-only videoHeight property indicates the intrinsic height of the video, expressed in CSS pixels. In simple terms, this is the height of the media in its natural size.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement/videoHeight">HTMLVideoElement.videoHeight - MDN</a>
   */
  @JsProperty(
      name = "videoHeight"
  )
  public native int videoHeight();

  /**
   * The HTMLVideoElement interface's read-only videoWidth property indicates the intrinsic width of the video, expressed in CSS pixels. In simple terms, this is the width of the media in its natural size.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement/videoWidth">HTMLVideoElement.videoWidth - MDN</a>
   */
  @JsProperty(
      name = "videoWidth"
  )
  public native int videoWidth();

  /**
   * The HTMLVideoElement method getVideoPlaybackQuality() creates and returns a VideoPlaybackQuality object containing metrics including how many frames have been lost.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement/getVideoPlaybackQuality">HTMLVideoElement.getVideoPlaybackQuality - MDN</a>
   */
  @Nonnull
  public native VideoPlaybackQuality getVideoPlaybackQuality();
}
