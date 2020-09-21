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
public interface DelayOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static DelayOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "delayTime"
  )
  double delayTime();

  @JsProperty
  void setDelayTime(double delayTime);

  @JsOverlay
  @Nonnull
  default DelayOptions delayTime(final double delayTime) {
    setDelayTime( delayTime );
    return this;
  }

  @JsProperty(
      name = "maxDelayTime"
  )
  double maxDelayTime();

  @JsProperty
  void setMaxDelayTime(double maxDelayTime);

  @JsOverlay
  @Nonnull
  default DelayOptions maxDelayTime(final double maxDelayTime) {
    setMaxDelayTime( maxDelayTime );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DelayOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DelayOptions channelCountMode(@ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DelayOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
