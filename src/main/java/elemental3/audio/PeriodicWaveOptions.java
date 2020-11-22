package elemental3.audio;

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
public interface PeriodicWaveOptions extends PeriodicWaveConstraints {
  @JsOverlay
  @Nonnull
  static PeriodicWaveOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "imag"
  )
  JsArray<Double> imag();

  @JsProperty
  void setImag(@Nonnull JsArray<Double> imag);

  @JsOverlay
  @Nonnull
  default PeriodicWaveOptions imag(@Nonnull final JsArray<Double> imag) {
    setImag( imag );
    return this;
  }

  @JsOverlay
  default void setImag(@Nonnull final double... imag) {
    setImag( Js.<JsArray<Double>>uncheckedCast( imag ) );
  }

  @JsOverlay
  @Nonnull
  default PeriodicWaveOptions imag(@Nonnull final double... imag) {
    setImag( imag );
    return this;
  }

  @JsProperty(
      name = "real"
  )
  JsArray<Double> real();

  @JsProperty
  void setReal(@Nonnull JsArray<Double> real);

  @JsOverlay
  @Nonnull
  default PeriodicWaveOptions real(@Nonnull final JsArray<Double> real) {
    setReal( real );
    return this;
  }

  @JsOverlay
  default void setReal(@Nonnull final double... real) {
    setReal( Js.<JsArray<Double>>uncheckedCast( real ) );
  }

  @JsOverlay
  @Nonnull
  default PeriodicWaveOptions real(@Nonnull final double... real) {
    setReal( real );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PeriodicWaveOptions disableNormalization(final boolean disableNormalization) {
    setDisableNormalization( disableNormalization );
    return this;
  }
}
