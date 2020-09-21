package elemental3.audio;

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
public interface StereoPannerOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static StereoPannerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "pan"
  )
  float pan();

  @JsProperty
  void setPan(float pan);

  @JsOverlay
  @Nonnull
  default StereoPannerOptions pan(final float pan) {
    setPan( pan );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default StereoPannerOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default StereoPannerOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default StereoPannerOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
