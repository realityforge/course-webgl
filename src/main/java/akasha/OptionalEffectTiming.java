package akasha;

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
public interface OptionalEffectTiming {
  @JsOverlay
  @Nonnull
  static OptionalEffectTiming create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "delay"
  )
  double delay();

  @JsProperty
  void setDelay(double delay);

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming delay(final double delay) {
    setDelay( delay );
    return this;
  }

  @JsProperty(
      name = "direction"
  )
  @PlaybackDirection
  String direction();

  @JsProperty
  void setDirection(@PlaybackDirection @Nonnull String direction);

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming direction(@PlaybackDirection @Nonnull final String direction) {
    setDirection( direction );
    return this;
  }

  @JsProperty(
      name = "duration"
  )
  UnrestrictedDoubleOrStringUnion duration();

  @JsProperty
  void setDuration(@Nonnull UnrestrictedDoubleOrStringUnion duration);

  @JsOverlay
  default void setDuration(final double duration) {
    setDuration( UnrestrictedDoubleOrStringUnion.of( duration ) );
  }

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming duration(final double duration) {
    setDuration( duration );
    return this;
  }

  @JsOverlay
  default void setDuration(@Nonnull final String duration) {
    setDuration( UnrestrictedDoubleOrStringUnion.of( duration ) );
  }

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming duration(@Nonnull final String duration) {
    setDuration( duration );
    return this;
  }

  @JsProperty(
      name = "easing"
  )
  String easing();

  @JsProperty
  void setEasing(@Nonnull String easing);

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsProperty(
      name = "endDelay"
  )
  double endDelay();

  @JsProperty
  void setEndDelay(double endDelay);

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming endDelay(final double endDelay) {
    setEndDelay( endDelay );
    return this;
  }

  @JsProperty(
      name = "fill"
  )
  @FillMode
  String fill();

  @JsProperty
  void setFill(@FillMode @Nonnull String fill);

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming fill(@FillMode @Nonnull final String fill) {
    setFill( fill );
    return this;
  }

  @JsProperty(
      name = "iterationStart"
  )
  double iterationStart();

  @JsProperty
  void setIterationStart(double iterationStart);

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming iterationStart(final double iterationStart) {
    setIterationStart( iterationStart );
    return this;
  }

  @JsProperty(
      name = "iterations"
  )
  double iterations();

  @JsProperty
  void setIterations(double iterations);

  @JsOverlay
  @Nonnull
  default OptionalEffectTiming iterations(final double iterations) {
    setIterations( iterations );
    return this;
  }
}
