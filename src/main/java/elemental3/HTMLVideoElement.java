package elemental3;

import elemental3.gl.TexImageSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLVideoElement interface provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement">HTMLVideoElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlvideoelement">HTMLVideoElement - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLVideoElement"
)
public class HTMLVideoElement extends HTMLMediaElement implements TexImageSource {
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-video-videoheight">HTMLVideoElement.videoHeight - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/semantics-embedded-content.html#dom-htmlvideoelement-videoheight">HTMLVideoElement.videoHeight - HTML5</a>
   */
  @JsProperty(
      name = "videoHeight"
  )
  public native int videoHeight();

  /**
   * The HTMLVideoElement interface's read-only videoWidth property indicates the intrinsic width of the video, expressed in CSS pixels. In simple terms, this is the width of the media in its natural size.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement/videoWidth">HTMLVideoElement.videoWidth - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-video-videowidth">HTMLVideoElement.videoWidth - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/semantics-embedded-content.html#dom-htmlvideoelement-videowidth">HTMLVideoElement.videoWidth - HTML5</a>
   */
  @JsProperty(
      name = "videoWidth"
  )
  public native int videoWidth();

  /**
   * The HTMLVideoElement method getVideoPlaybackQuality() creates and returns a VideoPlaybackQuality object containing metrics including how many frames have been lost.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement/getVideoPlaybackQuality">HTMLVideoElement.getVideoPlaybackQuality - MDN</a>
   * @see <a href="https://w3c.github.io/media-playback-quality/#dom-htmlvideoelement-getvideoplaybackquality">HTMLVideoElement.getVideoPlaybackQuality() - Media Playback Quality</a>
   */
  @Nonnull
  public native VideoPlaybackQuality getVideoPlaybackQuality();
}
