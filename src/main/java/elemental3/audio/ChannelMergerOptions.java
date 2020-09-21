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
public interface ChannelMergerOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static ChannelMergerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "numberOfInputs"
  )
  int numberOfInputs();

  @JsProperty
  void setNumberOfInputs(int numberOfInputs);

  @JsOverlay
  @Nonnull
  default ChannelMergerOptions numberOfInputs(final int numberOfInputs) {
    setNumberOfInputs( numberOfInputs );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ChannelMergerOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ChannelMergerOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ChannelMergerOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
