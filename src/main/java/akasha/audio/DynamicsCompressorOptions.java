package akasha.audio;

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
    name = "Object"
)
public interface DynamicsCompressorOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static DynamicsCompressorOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "attack"
  )
  float attack();

  @JsProperty
  void setAttack(float attack);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions attack(final float attack) {
    setAttack( attack );
    return this;
  }

  @JsProperty(
      name = "knee"
  )
  float knee();

  @JsProperty
  void setKnee(float knee);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions knee(final float knee) {
    setKnee( knee );
    return this;
  }

  @JsProperty(
      name = "ratio"
  )
  float ratio();

  @JsProperty
  void setRatio(float ratio);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions ratio(final float ratio) {
    setRatio( ratio );
    return this;
  }

  @JsProperty(
      name = "release"
  )
  float release();

  @JsProperty
  void setRelease(float release);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions release(final float release) {
    setRelease( release );
    return this;
  }

  @JsProperty(
      name = "threshold"
  )
  float threshold();

  @JsProperty
  void setThreshold(float threshold);

  @JsOverlay
  @Nonnull
  default DynamicsCompressorOptions threshold(final float threshold) {
    setThreshold( threshold );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DynamicsCompressorOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DynamicsCompressorOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DynamicsCompressorOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
