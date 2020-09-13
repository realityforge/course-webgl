package elemental3;

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

  @JsProperty(
      name = "aspectRatio"
  )
  double aspectRatio();

  @JsProperty
  void setAspectRatio(double aspectRatio);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings aspectRatio(final double aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsProperty(
      name = "autoGainControl"
  )
  boolean autoGainControl();

  @JsProperty
  void setAutoGainControl(boolean autoGainControl);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsProperty(
      name = "channelCount"
  )
  int channelCount();

  @JsProperty
  void setChannelCount(int channelCount);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsProperty(
      name = "deviceId"
  )
  String deviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty(
      name = "echoCancellation"
  )
  boolean echoCancellation();

  @JsProperty
  void setEchoCancellation(boolean echoCancellation);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsProperty(
      name = "facingMode"
  )
  String facingMode();

  @JsProperty
  void setFacingMode(@Nonnull String facingMode);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings facingMode(@Nonnull final String facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsProperty(
      name = "frameRate"
  )
  double frameRate();

  @JsProperty
  void setFrameRate(double frameRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings frameRate(final double frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsProperty(
      name = "groupId"
  )
  String groupId();

  @JsProperty
  void setGroupId(@Nonnull String groupId);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings groupId(@Nonnull final String groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsProperty(
      name = "height"
  )
  int height();

  @JsProperty
  void setHeight(int height);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings height(final int height) {
    setHeight( height );
    return this;
  }

  @JsProperty(
      name = "latency"
  )
  double latency();

  @JsProperty
  void setLatency(double latency);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings latency(final double latency) {
    setLatency( latency );
    return this;
  }

  @JsProperty(
      name = "noiseSuppression"
  )
  boolean noiseSuppression();

  @JsProperty
  void setNoiseSuppression(boolean noiseSuppression);

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

  @JsProperty(
      name = "sampleRate"
  )
  int sampleRate();

  @JsProperty
  void setSampleRate(int sampleRate);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings sampleRate(final int sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsProperty(
      name = "sampleSize"
  )
  int sampleSize();

  @JsProperty
  void setSampleSize(int sampleSize);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings sampleSize(final int sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsProperty(
      name = "width"
  )
  int width();

  @JsProperty
  void setWidth(int width);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings width(final int width) {
    setWidth( width );
    return this;
  }

  @JsProperty(
      name = "cursor"
  )
  String cursor();

  @JsProperty
  void setCursor(@Nonnull String cursor);

  @JsOverlay
  @Nonnull
  default MediaTrackSettings cursor(@Nonnull final String cursor) {
    setCursor( cursor );
    return this;
  }

  @JsProperty(
      name = "displaySurface"
  )
  String displaySurface();

  @JsProperty
  void setDisplaySurface(@Nonnull String displaySurface);

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
