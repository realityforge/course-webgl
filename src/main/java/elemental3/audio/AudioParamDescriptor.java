package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AudioParamDescriptor dictionary of the Web Audio API specifies properties for an AudioParam objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParamDescriptor">AudioParamDescriptor - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dictdef-audioparamdescriptor">The definition of 'AudioParamDescriptor' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AudioParamDescriptor {
  @JsOverlay
  @Nonnull
  static AudioParamDescriptor create(@Nonnull final String name) {
    return Js.<AudioParamDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "automationRate"
  )
  @AutomationRate
  String automationRate();

  @JsProperty
  void setAutomationRate(@AutomationRate @Nonnull String automationRate);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor automationRate(
      @AutomationRate @Nonnull final String automationRate) {
    setAutomationRate( automationRate );
    return this;
  }

  @JsProperty(
      name = "defaultValue"
  )
  float defaultValue();

  @JsProperty
  void setDefaultValue(float defaultValue);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor defaultValue(final float defaultValue) {
    setDefaultValue( defaultValue );
    return this;
  }

  @JsProperty(
      name = "maxValue"
  )
  float maxValue();

  @JsProperty
  void setMaxValue(float maxValue);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor maxValue(final float maxValue) {
    setMaxValue( maxValue );
    return this;
  }

  @JsProperty(
      name = "minValue"
  )
  float minValue();

  @JsProperty
  void setMinValue(float minValue);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor minValue(final float minValue) {
    setMinValue( minValue );
    return this;
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default AudioParamDescriptor name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
