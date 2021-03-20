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
public interface ChannelSplitterOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static ChannelSplitterOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "numberOfOutputs"
  )
  int numberOfOutputs();

  @JsProperty
  void setNumberOfOutputs(int numberOfOutputs);

  @JsOverlay
  @Nonnull
  default ChannelSplitterOptions numberOfOutputs(final int numberOfOutputs) {
    setNumberOfOutputs( numberOfOutputs );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ChannelSplitterOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ChannelSplitterOptions channelCountMode(
      @ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ChannelSplitterOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
