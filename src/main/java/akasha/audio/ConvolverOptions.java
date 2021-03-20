package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface ConvolverOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static ConvolverOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "buffer"
  )
  @Nullable
  AudioBuffer buffer();

  @JsProperty
  void setBuffer(@Nullable AudioBuffer buffer);

  @JsOverlay
  @Nonnull
  default ConvolverOptions buffer(@Nullable final AudioBuffer buffer) {
    setBuffer( buffer );
    return this;
  }

  @JsProperty(
      name = "disableNormalization"
  )
  boolean disableNormalization();

  @JsProperty
  void setDisableNormalization(boolean disableNormalization);

  @JsOverlay
  @Nonnull
  default ConvolverOptions disableNormalization(final boolean disableNormalization) {
    setDisableNormalization( disableNormalization );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ConvolverOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ConvolverOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ConvolverOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
