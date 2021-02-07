package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A VideoPlaybackQuality object is returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoPlaybackQuality">VideoPlaybackQuality - MDN</a>
 * @see <a href="https://w3c.github.io/media-playback-quality/#idl-def-videoplaybackquality">VideoPlaybackQuality - Media Playback Quality</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoPlaybackQuality"
)
public class VideoPlaybackQuality {
  protected VideoPlaybackQuality() {
  }

  /**
   * The VideoPlaybackQuality interface's read-only corruptedVideoFrames property the number of corrupted video frames that have been received since the video element was last loaded or reloaded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoPlaybackQuality/corruptedVideoFrames">VideoPlaybackQuality.corruptedVideoFrames - MDN</a>
   * @see <a href="https://w3c.github.io/media-playback-quality/#dom-videoplaybackquality-corruptedvideoframes">VideoPlaybackQuality: corruptedVideoFrames - Media Playback Quality</a>
   */
  @JsProperty(
      name = "corruptedVideoFrames"
  )
  public native int corruptedVideoFrames();

  /**
   * The read-only creationTime property on the VideoPlaybackQuality interface reports the number of milliseconds since the browsing context was created this quality sample was recorded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoPlaybackQuality/creationTime">VideoPlaybackQuality.creationTime - MDN</a>
   * @see <a href="https://w3c.github.io/media-playback-quality/#videoplaybackquality-interface">VideoPlaybackQuality.corruptedVideoFrames - Media Playback Quality</a>
   */
  @JsProperty(
      name = "creationTime"
  )
  public native double creationTime();

  /**
   * The read-only droppedVideoFrames property of the VideoPlaybackQuality interface returns the number of video frames which have been dropped rather than being displayed since the last time the media was loaded into the HTMLVideoElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoPlaybackQuality/droppedVideoFrames">VideoPlaybackQuality.droppedVideoFrames - MDN</a>
   * @see <a href="https://w3c.github.io/media-playback-quality/#videoplaybackquality-interface">VideoPlaybackQuality.droppedVideoFrames - Media Playback Quality</a>
   */
  @JsProperty(
      name = "droppedVideoFrames"
  )
  public native int droppedVideoFrames();

  /**
   * The VideoPlaybackQuality interface's totalVideoFrames read-only property returns the total number of video frames that have been displayed or dropped since the media was loaded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoPlaybackQuality/totalVideoFrames">VideoPlaybackQuality.totalVideoFrames - MDN</a>
   * @see <a href="https://w3c.github.io/media-playback-quality/#videoplaybackquality-interface">VideoPlaybackQuality.totalVideoFrames - Media Playback Quality</a>
   */
  @JsProperty(
      name = "totalVideoFrames"
  )
  public native int totalVideoFrames();
}
