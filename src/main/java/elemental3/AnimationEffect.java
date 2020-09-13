package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The AnimationEffect interface of the Web Animations API defines current and future animation effects like KeyframeEffect, which can be passed to Animation objects for playing, and KeyframeEffectReadOnly (which is used by CSS Animations and Transitions).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEffect">AnimationEffect - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationEffect"
)
public class AnimationEffect {
  AnimationEffect() {
  }

  @Nonnull
  public native ComputedEffectTiming getComputedTiming();

  @Nonnull
  public native EffectTiming getTiming();

  public native void updateTiming(@Nonnull OptionalEffectTiming timing);

  public native void updateTiming();
}
