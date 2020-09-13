package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The AudioNodeOptions dictionary of the Web Audio API specifies options that can be used when creating new AudioNode objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioNodeOptions">AudioNodeOptions - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static AudioNodeOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "channelCount"
  )
  int channelCount();

  @JsProperty
  void setChannelCount(int channelCount);

  @JsOverlay
  @Nonnull
  default AudioNodeOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsProperty(
      name = "channelCountMode"
  )
  @MagicConstant(
      valuesFromClass = ChannelCountMode.class
  )
  String channelCountMode();

  @JsProperty
  void setChannelCountMode(
      @MagicConstant(valuesFromClass = ChannelCountMode.class) @Nonnull String channelCountMode);

  @JsOverlay
  @Nonnull
  default AudioNodeOptions channelCountMode(
      @MagicConstant(valuesFromClass = ChannelCountMode.class) @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsProperty(
      name = "channelInterpretation"
  )
  @MagicConstant(
      valuesFromClass = ChannelInterpretation.class
  )
  String channelInterpretation();

  @JsProperty
  void setChannelInterpretation(
      @MagicConstant(valuesFromClass = ChannelInterpretation.class) @Nonnull String channelInterpretation);

  @JsOverlay
  @Nonnull
  default AudioNodeOptions channelInterpretation(
      @MagicConstant(valuesFromClass = ChannelInterpretation.class) @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
