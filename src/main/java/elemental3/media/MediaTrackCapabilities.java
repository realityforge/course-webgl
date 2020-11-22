package elemental3.media;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface MediaTrackCapabilities {
  @JsOverlay
  @Nonnull
  static MediaTrackCapabilities create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "aspectRatio"
  )
  DoubleRange aspectRatio();

  @JsProperty
  void setAspectRatio(@Nonnull DoubleRange aspectRatio);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities aspectRatio(@Nonnull final DoubleRange aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsProperty(
      name = "autoGainControl"
  )
  JsArray<Boolean> autoGainControl();

  @JsProperty
  void setAutoGainControl(@Nonnull JsArray<Boolean> autoGainControl);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities autoGainControl(@Nonnull final JsArray<Boolean> autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsOverlay
  default void setAutoGainControl(@Nonnull final Boolean... autoGainControl) {
    setAutoGainControl( Js.<JsArray<Boolean>>uncheckedCast( autoGainControl ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities autoGainControl(@Nonnull final Boolean... autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsProperty(
      name = "channelCount"
  )
  ULongRange channelCount();

  @JsProperty
  void setChannelCount(@Nonnull ULongRange channelCount);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities channelCount(@Nonnull final ULongRange channelCount) {
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
  default MediaTrackCapabilities deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty(
      name = "echoCancellation"
  )
  JsArray<Boolean> echoCancellation();

  @JsProperty
  void setEchoCancellation(@Nonnull JsArray<Boolean> echoCancellation);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities echoCancellation(
      @Nonnull final JsArray<Boolean> echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsOverlay
  default void setEchoCancellation(@Nonnull final Boolean... echoCancellation) {
    setEchoCancellation( Js.<JsArray<Boolean>>uncheckedCast( echoCancellation ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities echoCancellation(@Nonnull final Boolean... echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsProperty(
      name = "facingMode"
  )
  JsArray<String> facingMode();

  @JsProperty
  void setFacingMode(@Nonnull JsArray<String> facingMode);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities facingMode(@Nonnull final JsArray<String> facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final String... facingMode) {
    setFacingMode( Js.<JsArray<String>>uncheckedCast( facingMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities facingMode(@Nonnull final String... facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsProperty(
      name = "frameRate"
  )
  DoubleRange frameRate();

  @JsProperty
  void setFrameRate(@Nonnull DoubleRange frameRate);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities frameRate(@Nonnull final DoubleRange frameRate) {
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
  default MediaTrackCapabilities groupId(@Nonnull final String groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsProperty(
      name = "height"
  )
  ULongRange height();

  @JsProperty
  void setHeight(@Nonnull ULongRange height);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities height(@Nonnull final ULongRange height) {
    setHeight( height );
    return this;
  }

  @JsProperty(
      name = "latency"
  )
  DoubleRange latency();

  @JsProperty
  void setLatency(@Nonnull DoubleRange latency);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities latency(@Nonnull final DoubleRange latency) {
    setLatency( latency );
    return this;
  }

  @JsProperty(
      name = "noiseSuppression"
  )
  JsArray<Boolean> noiseSuppression();

  @JsProperty
  void setNoiseSuppression(@Nonnull JsArray<Boolean> noiseSuppression);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities noiseSuppression(
      @Nonnull final JsArray<Boolean> noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsOverlay
  default void setNoiseSuppression(@Nonnull final Boolean... noiseSuppression) {
    setNoiseSuppression( Js.<JsArray<Boolean>>uncheckedCast( noiseSuppression ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities noiseSuppression(@Nonnull final Boolean... noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsProperty(
      name = "resizeMode"
  )
  JsArray<String> resizeMode();

  @JsProperty
  void setResizeMode(@Nonnull JsArray<String> resizeMode);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities resizeMode(@Nonnull final JsArray<String> resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final String... resizeMode) {
    setResizeMode( Js.<JsArray<String>>uncheckedCast( resizeMode ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities resizeMode(@Nonnull final String... resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsProperty(
      name = "sampleRate"
  )
  ULongRange sampleRate();

  @JsProperty
  void setSampleRate(@Nonnull ULongRange sampleRate);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities sampleRate(@Nonnull final ULongRange sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsProperty(
      name = "sampleSize"
  )
  ULongRange sampleSize();

  @JsProperty
  void setSampleSize(@Nonnull ULongRange sampleSize);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities sampleSize(@Nonnull final ULongRange sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsProperty(
      name = "width"
  )
  ULongRange width();

  @JsProperty
  void setWidth(@Nonnull ULongRange width);

  @JsOverlay
  @Nonnull
  default MediaTrackCapabilities width(@Nonnull final ULongRange width) {
    setWidth( width );
    return this;
  }
}
