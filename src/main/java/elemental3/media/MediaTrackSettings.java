package elemental3.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The MediaTrackSettings dictionary is used to return the current values configured for each of a MediaStreamTrack's settings. These values will adhere as closely as possible to any constraints previously described using a MediaTrackConstraints object and set using applyConstraints(), and will adhere to the default constraints for any properties whose constraints haven't been changed, or whose customized constraints couldn't be matched.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings">MediaTrackSettings - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediatracksettings">The definition of 'MediaTrackSettings' in the 'Screen Capture' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface MediaTrackSettings {
  @JsOverlay
  @Nonnull
  static MediaTrackSettings create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The MediaTrackSettings dictionary's aspectRatio property is a double-precision floating-point number indicating the aspect ratio of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.aspectRatio property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/aspectRatio">MediaTrackSettings.aspectRatio - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-aspectratio">The definition of 'aspectRatio' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "aspectRatio"
  )
  double aspectRatio();

  /**
   * The MediaTrackSettings dictionary's aspectRatio property is a double-precision floating-point number indicating the aspect ratio of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.aspectRatio property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/aspectRatio">MediaTrackSettings.aspectRatio - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-aspectratio">The definition of 'aspectRatio' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setAspectRatio(double aspectRatio);

  /**
   * The MediaTrackSettings dictionary's aspectRatio property is a double-precision floating-point number indicating the aspect ratio of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.aspectRatio property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/aspectRatio">MediaTrackSettings.aspectRatio - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-aspectratio">The definition of 'aspectRatio' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings aspectRatio(final double aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's autoGainControl property is a Boolean value whose value indicates whether or not automatic gain control (AGC) is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.autoGainControl property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/autoGainControl">MediaTrackSettings.autoGainControl - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-autogaincontrol">The definition of 'autoGainControl' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "autoGainControl"
  )
  boolean autoGainControl();

  /**
   * The MediaTrackSettings dictionary's autoGainControl property is a Boolean value whose value indicates whether or not automatic gain control (AGC) is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.autoGainControl property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/autoGainControl">MediaTrackSettings.autoGainControl - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-autogaincontrol">The definition of 'autoGainControl' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setAutoGainControl(boolean autoGainControl);

  /**
   * The MediaTrackSettings dictionary's autoGainControl property is a Boolean value whose value indicates whether or not automatic gain control (AGC) is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.autoGainControl property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/autoGainControl">MediaTrackSettings.autoGainControl - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-autogaincontrol">The definition of 'autoGainControl' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's channelCount property is an integer indicating how many audio channel the MediaStreamTrack is currently configured to have. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.channelCount property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/channelCount">MediaTrackSettings.channelCount - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-channelcount">The definition of 'channelCount' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "channelCount"
  )
  int channelCount();

  /**
   * The MediaTrackSettings dictionary's channelCount property is an integer indicating how many audio channel the MediaStreamTrack is currently configured to have. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.channelCount property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/channelCount">MediaTrackSettings.channelCount - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-channelcount">The definition of 'channelCount' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setChannelCount(int channelCount);

  /**
   * The MediaTrackSettings dictionary's channelCount property is an integer indicating how many audio channel the MediaStreamTrack is currently configured to have. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.channelCount property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/channelCount">MediaTrackSettings.channelCount - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-channelcount">The definition of 'channelCount' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's deviceId property is a DOMString which uniquely identifies the source for the corresponding MediaStreamTrack for the origin corresponding to the browsing session. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.deviceId property you provided when calling either getUserMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/deviceId">MediaTrackSettings.deviceId - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-deviceid">The definition of 'deviceId' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "deviceId"
  )
  String deviceId();

  /**
   * The MediaTrackSettings dictionary's deviceId property is a DOMString which uniquely identifies the source for the corresponding MediaStreamTrack for the origin corresponding to the browsing session. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.deviceId property you provided when calling either getUserMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/deviceId">MediaTrackSettings.deviceId - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-deviceid">The definition of 'deviceId' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  /**
   * The MediaTrackSettings dictionary's deviceId property is a DOMString which uniquely identifies the source for the corresponding MediaStreamTrack for the origin corresponding to the browsing session. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.deviceId property you provided when calling either getUserMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/deviceId">MediaTrackSettings.deviceId - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-deviceid">The definition of 'deviceId' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's echoCancellation property is a Boolean value whose value indicates whether or not echo cancellation is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.echoCancellation property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/echoCancellation">MediaTrackSettings.echoCancellation - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-echocancellation">The definition of 'echoCancellation' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "echoCancellation"
  )
  boolean echoCancellation();

  /**
   * The MediaTrackSettings dictionary's echoCancellation property is a Boolean value whose value indicates whether or not echo cancellation is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.echoCancellation property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/echoCancellation">MediaTrackSettings.echoCancellation - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-echocancellation">The definition of 'echoCancellation' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setEchoCancellation(boolean echoCancellation);

  /**
   * The MediaTrackSettings dictionary's echoCancellation property is a Boolean value whose value indicates whether or not echo cancellation is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.echoCancellation property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/echoCancellation">MediaTrackSettings.echoCancellation - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-echocancellation">The definition of 'echoCancellation' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's facingMode property is a DOMString indicating the direction in which the camera producing the video track represented by the MediaStreamTrack is currently facing. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.facingMode property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/facingMode">MediaTrackSettings.facingMode - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-facingmode">The definition of 'facingMode' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "facingMode"
  )
  String facingMode();

  /**
   * The MediaTrackSettings dictionary's facingMode property is a DOMString indicating the direction in which the camera producing the video track represented by the MediaStreamTrack is currently facing. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.facingMode property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/facingMode">MediaTrackSettings.facingMode - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-facingmode">The definition of 'facingMode' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setFacingMode(@Nonnull String facingMode);

  /**
   * The MediaTrackSettings dictionary's facingMode property is a DOMString indicating the direction in which the camera producing the video track represented by the MediaStreamTrack is currently facing. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.facingMode property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/facingMode">MediaTrackSettings.facingMode - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-facingmode">The definition of 'facingMode' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings facingMode(@Nonnull final String facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's frameRate property is a double-precision floating-point number indicating the frame rate, in frames per second, of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.frameRate property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/frameRate">MediaTrackSettings.frameRate - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-framerate">The definition of 'frameRate' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "frameRate"
  )
  double frameRate();

  /**
   * The MediaTrackSettings dictionary's frameRate property is a double-precision floating-point number indicating the frame rate, in frames per second, of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.frameRate property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/frameRate">MediaTrackSettings.frameRate - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-framerate">The definition of 'frameRate' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setFrameRate(double frameRate);

  /**
   * The MediaTrackSettings dictionary's frameRate property is a double-precision floating-point number indicating the frame rate, in frames per second, of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.frameRate property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/frameRate">MediaTrackSettings.frameRate - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-framerate">The definition of 'frameRate' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings frameRate(final double frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's groupId property is a browsing-session unique DOMString which identifies the group of devices which includes the source for the MediaStreamTrack. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.groupId property you provided when calling either getUserMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/groupId">MediaTrackSettings.groupId - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-groupid">The definition of 'groupId' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "groupId"
  )
  String groupId();

  /**
   * The MediaTrackSettings dictionary's groupId property is a browsing-session unique DOMString which identifies the group of devices which includes the source for the MediaStreamTrack. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.groupId property you provided when calling either getUserMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/groupId">MediaTrackSettings.groupId - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-groupid">The definition of 'groupId' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setGroupId(@Nonnull String groupId);

  /**
   * The MediaTrackSettings dictionary's groupId property is a browsing-session unique DOMString which identifies the group of devices which includes the source for the MediaStreamTrack. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.groupId property you provided when calling either getUserMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/groupId">MediaTrackSettings.groupId - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-groupid">The definition of 'groupId' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings groupId(@Nonnull final String groupId) {
    setGroupId( groupId );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's height property is an integer indicating the number of pixels tall MediaStreamTrack is currently configured to be. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.height property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/height">MediaTrackSettings.height - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-height">The definition of 'height' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "height"
  )
  int height();

  /**
   * The MediaTrackSettings dictionary's height property is an integer indicating the number of pixels tall MediaStreamTrack is currently configured to be. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.height property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/height">MediaTrackSettings.height - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-height">The definition of 'height' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setHeight(int height);

  /**
   * The MediaTrackSettings dictionary's height property is an integer indicating the number of pixels tall MediaStreamTrack is currently configured to be. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.height property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/height">MediaTrackSettings.height - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-height">The definition of 'height' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings height(final int height) {
    setHeight( height );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's latency property is a double-precision floating-point number indicating the estimated latency (specified in seconds) of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.latency property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/latency">MediaTrackSettings.latency - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-latency">The definition of 'latency' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "latency"
  )
  double latency();

  /**
   * The MediaTrackSettings dictionary's latency property is a double-precision floating-point number indicating the estimated latency (specified in seconds) of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.latency property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/latency">MediaTrackSettings.latency - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-latency">The definition of 'latency' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setLatency(double latency);

  /**
   * The MediaTrackSettings dictionary's latency property is a double-precision floating-point number indicating the estimated latency (specified in seconds) of the MediaStreamTrack as currently configured. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.latency property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/latency">MediaTrackSettings.latency - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-latency">The definition of 'latency' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings latency(final double latency) {
    setLatency( latency );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's noiseSuppression property is a Boolean value whose value indicates whether or not noise suppression technology is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.noiseSuppression property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/noiseSuppression">MediaTrackSettings.noiseSuppression - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-noisesuppression">The definition of 'noiseSuppression' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "noiseSuppression"
  )
  boolean noiseSuppression();

  /**
   * The MediaTrackSettings dictionary's noiseSuppression property is a Boolean value whose value indicates whether or not noise suppression technology is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.noiseSuppression property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/noiseSuppression">MediaTrackSettings.noiseSuppression - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-noisesuppression">The definition of 'noiseSuppression' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setNoiseSuppression(boolean noiseSuppression);

  /**
   * The MediaTrackSettings dictionary's noiseSuppression property is a Boolean value whose value indicates whether or not noise suppression technology is enabled on an audio track. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.noiseSuppression property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/noiseSuppression">MediaTrackSettings.noiseSuppression - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-noisesuppression">The definition of 'noiseSuppression' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings noiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsProperty(
      name = "resizeMode"
  )
  String resizeMode();

  @JsProperty
  void setResizeMode(@Nonnull String resizeMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings resizeMode(@Nonnull final String resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's sampleRate property is an integer indicating how many audio samples per second the MediaStreamTrack is currently configured for. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.sampleRate property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/sampleRate">MediaTrackSettings.sampleRate - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-samplerate">The definition of 'sampleRate' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "sampleRate"
  )
  int sampleRate();

  /**
   * The MediaTrackSettings dictionary's sampleRate property is an integer indicating how many audio samples per second the MediaStreamTrack is currently configured for. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.sampleRate property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/sampleRate">MediaTrackSettings.sampleRate - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-samplerate">The definition of 'sampleRate' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setSampleRate(int sampleRate);

  /**
   * The MediaTrackSettings dictionary's sampleRate property is an integer indicating how many audio samples per second the MediaStreamTrack is currently configured for. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.sampleRate property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/sampleRate">MediaTrackSettings.sampleRate - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-samplerate">The definition of 'sampleRate' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings sampleRate(final int sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's sampleSize property is an integer indicating the linear sample size (in bits per sample) the MediaStreamTrack is currently configured for. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.sampleSize property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/sampleSize">MediaTrackSettings.sampleSize - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-samplesize">The definition of 'sampleSize' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "sampleSize"
  )
  int sampleSize();

  /**
   * The MediaTrackSettings dictionary's sampleSize property is an integer indicating the linear sample size (in bits per sample) the MediaStreamTrack is currently configured for. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.sampleSize property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/sampleSize">MediaTrackSettings.sampleSize - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-samplesize">The definition of 'sampleSize' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setSampleSize(int sampleSize);

  /**
   * The MediaTrackSettings dictionary's sampleSize property is an integer indicating the linear sample size (in bits per sample) the MediaStreamTrack is currently configured for. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.sampleSize property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/sampleSize">MediaTrackSettings.sampleSize - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-samplesize">The definition of 'sampleSize' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings sampleSize(final int sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's width property is an integer indicating the number of pixels wide MediaStreamTrack is currently configured to be. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.width property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/width">MediaTrackSettings.width - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-width">The definition of 'width' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "width"
  )
  int width();

  /**
   * The MediaTrackSettings dictionary's width property is an integer indicating the number of pixels wide MediaStreamTrack is currently configured to be. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.width property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/width">MediaTrackSettings.width - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-width">The definition of 'width' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty
  void setWidth(int width);

  /**
   * The MediaTrackSettings dictionary's width property is an integer indicating the number of pixels wide MediaStreamTrack is currently configured to be. This lets you determine what value was selected to comply with your specified constraints for this property's value as described in the MediaTrackConstraints.width property you provided when calling either getUserMedia() or MediaStreamTrack.applyConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/width">MediaTrackSettings.width - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatracksettings-width">The definition of 'width' in the 'Media Capture and Streams' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings width(final int width) {
    setWidth( width );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's cursor property indicates whether or not the cursor should be captured as part of the video track included in the MediaStream returned by getDisplayMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/cursor">MediaTrackSettings.cursor - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediatracksettings-cursor">The definition of 'MediaTrackSettings.cursor' in the 'Screen Capture' specification.</a>
   */
  @JsProperty(
      name = "cursor"
  )
  String cursor();

  /**
   * The MediaTrackSettings dictionary's cursor property indicates whether or not the cursor should be captured as part of the video track included in the MediaStream returned by getDisplayMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/cursor">MediaTrackSettings.cursor - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediatracksettings-cursor">The definition of 'MediaTrackSettings.cursor' in the 'Screen Capture' specification.</a>
   */
  @JsProperty
  void setCursor(@Nonnull String cursor);

  /**
   * The MediaTrackSettings dictionary's cursor property indicates whether or not the cursor should be captured as part of the video track included in the MediaStream returned by getDisplayMedia().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/cursor">MediaTrackSettings.cursor - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediatracksettings-cursor">The definition of 'MediaTrackSettings.cursor' in the 'Screen Capture' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings cursor(@Nonnull final String cursor) {
    setCursor( cursor );
    return this;
  }

  /**
   * The MediaTrackSettings dictionary's displaySurface property indicates the type of display surface being captured.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/displaySurface">MediaTrackSettings.displaySurface - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediatrackconstraintset-displaysurface">The definition of 'MediaTrackSettings.displaySurface' in the 'Screen Capture' specification.</a>
   */
  @JsProperty(
      name = "displaySurface"
  )
  String displaySurface();

  /**
   * The MediaTrackSettings dictionary's displaySurface property indicates the type of display surface being captured.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/displaySurface">MediaTrackSettings.displaySurface - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediatrackconstraintset-displaysurface">The definition of 'MediaTrackSettings.displaySurface' in the 'Screen Capture' specification.</a>
   */
  @JsProperty
  void setDisplaySurface(@Nonnull String displaySurface);

  /**
   * The MediaTrackSettings dictionary's displaySurface property indicates the type of display surface being captured.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackSettings/displaySurface">MediaTrackSettings.displaySurface - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-screen-share/#dom-mediatrackconstraintset-displaysurface">The definition of 'MediaTrackSettings.displaySurface' in the 'Screen Capture' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default MediaTrackSettings displaySurface(@Nonnull final String displaySurface) {
    setDisplaySurface( displaySurface );
    return this;
  }

  @JsProperty(
      name = "logicalSurface"
  )
  boolean logicalSurface();

  @JsProperty
  void setLogicalSurface(boolean logicalSurface);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings logicalSurface(final boolean logicalSurface) {
    setLogicalSurface( logicalSurface );
    return this;
  }
}
