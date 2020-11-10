package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The AnimationEffect interface of the Web Animations API defines current and future animation effects like KeyframeEffect, which can be passed to Animation objects for playing, and KeyframeEffectReadOnly (which is used by CSS Animations and Transitions).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEffect">AnimationEffect - MDN</a>
 * @see <a href="https://drafts.csswg.org/web-animations-1/#the-animationeffect-interface">The definition of 'AnimationEffect' in the 'Web Animations' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationEffect"
)
public class AnimationEffect {
  protected AnimationEffect() {
  }

  /**
   * The getComputedTiming() method of the AnimationEffect interface returns the calculated timing properties for this animation effect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEffect/getComputedTiming">AnimationEffect.getComputedTiming - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationeffect-getcomputedtiming">The definition of 'AnimationEffect.getComputedTiming()' in the 'Web Animations' specification.</a>
   */
  @Nonnull
  public native ComputedEffectTiming getComputedTiming();

  /**
   * The AnimationEffect.getTiming() method of the AnimationEffect interface returns an EffectTiming object containing the timing properties for the Animation Effect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEffect/getTiming">AnimationEffect.getTiming - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationeffect-gettiming">The definition of 'AnimationEffect.getTiming()' in the 'Web Animations' specification.</a>
   */
  @Nonnull
  public native EffectTiming getTiming();

  /**
   * The updateTiming() method of the AnimationEffect interface updates the specified timing properties for an animation effect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEffect/updateTiming">AnimationEffect.updateTiming - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationeffect-updatetiming">The definition of 'AnimationEffect.updateTiming()' in the 'Web Animations' specification.</a>
   */
  public native void updateTiming(@Nonnull OptionalEffectTiming timing);

  /**
   * The updateTiming() method of the AnimationEffect interface updates the specified timing properties for an animation effect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEffect/updateTiming">AnimationEffect.updateTiming - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationeffect-updatetiming">The definition of 'AnimationEffect.updateTiming()' in the 'Web Animations' specification.</a>
   */
  public native void updateTiming();
}
