package elemental3;

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
public interface AnimationEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static AnimationEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "animationName"
  )
  String animationName();

  @JsProperty
  void setAnimationName(@Nonnull String animationName);

  @JsOverlay
  @Nonnull
  default AnimationEventInit animationName(@Nonnull final String animationName) {
    setAnimationName( animationName );
    return this;
  }

  @JsProperty(
      name = "elapsedTime"
  )
  double elapsedTime();

  @JsProperty
  void setElapsedTime(double elapsedTime);

  @JsOverlay
  @Nonnull
  default AnimationEventInit elapsedTime(final double elapsedTime) {
    setElapsedTime( elapsedTime );
    return this;
  }

  @JsProperty(
      name = "pseudoElement"
  )
  String pseudoElement();

  @JsProperty
  void setPseudoElement(@Nonnull String pseudoElement);

  @JsOverlay
  @Nonnull
  default AnimationEventInit pseudoElement(@Nonnull final String pseudoElement) {
    setPseudoElement( pseudoElement );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnimationEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnimationEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnimationEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
