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

/**
 * The MediaTrackConstraints dictionary is used to describe a set of capabilities and the value or values each can take on. A constraints dictionary is passed into applyConstraints() to allow a script to establish a set of exact (required) values or ranges and/or preferred values or ranges of values for the track, and the most recently-requested set of custom constraints can be retrieved by calling getConstraints().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackConstraints">MediaTrackConstraints - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatrackconstraints">Media Capture and Streams</a>
 * @see <a href="https://w3c.github.io/mediacapture-image/#mediatrackconstraintset-section">MediaStream Image Capture</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface MediaTrackConstraints extends MediaTrackConstraintSet {
  @JsOverlay
  @Nonnull
  static MediaTrackConstraints create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "advanced"
  )
  JsArray<MediaTrackConstraintSet> advanced();

  @JsProperty
  void setAdvanced(@Nonnull JsArray<MediaTrackConstraintSet> advanced);

  @JsOverlay
  @Nonnull
  default MediaTrackConstraints advanced(@Nonnull final JsArray<MediaTrackConstraintSet> advanced) {
    setAdvanced( advanced );
    return this;
  }

  @JsOverlay
  default void setAdvanced(@Nonnull final MediaTrackConstraintSet... advanced) {
    setAdvanced( Js.<JsArray<MediaTrackConstraintSet>>uncheckedCast( advanced ) );
  }

  @JsOverlay
  @Nonnull
  default MediaTrackConstraints advanced(@Nonnull final MediaTrackConstraintSet... advanced) {
    setAdvanced( advanced );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints aspectRatio(@Nonnull final ConstrainDouble aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints aspectRatio(final double aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints aspectRatio(@Nonnull final ConstrainDoubleRange aspectRatio) {
    setAspectRatio( aspectRatio );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints autoGainControl(@Nonnull final ConstrainBoolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints autoGainControl(final boolean autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints autoGainControl(
      @Nonnull final ConstrainBooleanParameters autoGainControl) {
    setAutoGainControl( autoGainControl );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints channelCount(@Nonnull final ConstrainULong channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints channelCount(@Nonnull final ConstrainULongRange channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints deviceId(@Nonnull final ConstrainDOMString deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints deviceId(@Nonnull final JsArray<String> deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints deviceId(@Nonnull final String... deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints deviceId(@Nonnull final ConstrainDOMStringParameters deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints echoCancellation(@Nonnull final ConstrainBoolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints echoCancellation(final boolean echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints echoCancellation(
      @Nonnull final ConstrainBooleanParameters echoCancellation) {
    setEchoCancellation( echoCancellation );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints facingMode(@Nonnull final ConstrainDOMString facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints facingMode(@Nonnull final String facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints facingMode(@Nonnull final JsArray<String> facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints facingMode(@Nonnull final String... facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints facingMode(@Nonnull final ConstrainDOMStringParameters facingMode) {
    setFacingMode( facingMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints frameRate(@Nonnull final ConstrainDouble frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints frameRate(final double frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints frameRate(@Nonnull final ConstrainDoubleRange frameRate) {
    setFrameRate( frameRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints groupId(@Nonnull final ConstrainDOMString groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints groupId(@Nonnull final String groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints groupId(@Nonnull final JsArray<String> groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints groupId(@Nonnull final String... groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints groupId(@Nonnull final ConstrainDOMStringParameters groupId) {
    setGroupId( groupId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints height(@Nonnull final ConstrainULong height) {
    setHeight( height );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints height(final int height) {
    setHeight( height );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints height(@Nonnull final ConstrainULongRange height) {
    setHeight( height );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints latency(@Nonnull final ConstrainDouble latency) {
    setLatency( latency );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints latency(final double latency) {
    setLatency( latency );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints latency(@Nonnull final ConstrainDoubleRange latency) {
    setLatency( latency );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints noiseSuppression(@Nonnull final ConstrainBoolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints noiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints noiseSuppression(
      @Nonnull final ConstrainBooleanParameters noiseSuppression) {
    setNoiseSuppression( noiseSuppression );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints resizeMode(@Nonnull final ConstrainDOMString resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints resizeMode(@Nonnull final String resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints resizeMode(@Nonnull final JsArray<String> resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints resizeMode(@Nonnull final String... resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints resizeMode(@Nonnull final ConstrainDOMStringParameters resizeMode) {
    setResizeMode( resizeMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints sampleRate(@Nonnull final ConstrainULong sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints sampleRate(final int sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints sampleRate(@Nonnull final ConstrainULongRange sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints sampleSize(@Nonnull final ConstrainULong sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints sampleSize(final int sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints sampleSize(@Nonnull final ConstrainULongRange sampleSize) {
    setSampleSize( sampleSize );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints width(@Nonnull final ConstrainULong width) {
    setWidth( width );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints width(final int width) {
    setWidth( width );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints width(@Nonnull final ConstrainULongRange width) {
    setWidth( width );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints cursor(@Nonnull final ConstrainDOMString cursor) {
    setCursor( cursor );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints cursor(@Nonnull final String cursor) {
    setCursor( cursor );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints cursor(@Nonnull final JsArray<String> cursor) {
    setCursor( cursor );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints cursor(@Nonnull final String... cursor) {
    setCursor( cursor );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints cursor(@Nonnull final ConstrainDOMStringParameters cursor) {
    setCursor( cursor );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints displaySurface(@Nonnull final ConstrainDOMString displaySurface) {
    setDisplaySurface( displaySurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints displaySurface(@Nonnull final String displaySurface) {
    setDisplaySurface( displaySurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints displaySurface(@Nonnull final JsArray<String> displaySurface) {
    setDisplaySurface( displaySurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints displaySurface(@Nonnull final String... displaySurface) {
    setDisplaySurface( displaySurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints displaySurface(
      @Nonnull final ConstrainDOMStringParameters displaySurface) {
    setDisplaySurface( displaySurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints logicalSurface(@Nonnull final ConstrainBoolean logicalSurface) {
    setLogicalSurface( logicalSurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints logicalSurface(final boolean logicalSurface) {
    setLogicalSurface( logicalSurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints logicalSurface(
      @Nonnull final ConstrainBooleanParameters logicalSurface) {
    setLogicalSurface( logicalSurface );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints restrictOwnAudio(@Nonnull final ConstrainBoolean restrictOwnAudio) {
    setRestrictOwnAudio( restrictOwnAudio );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints restrictOwnAudio(final boolean restrictOwnAudio) {
    setRestrictOwnAudio( restrictOwnAudio );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaTrackConstraints restrictOwnAudio(
      @Nonnull final ConstrainBooleanParameters restrictOwnAudio) {
    setRestrictOwnAudio( restrictOwnAudio );
    return this;
  }
}
