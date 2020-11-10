package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AnimationEvent interface represents events providing information related to animations.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent">AnimationEvent - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-animations/#interface-animationevent">The definition of 'AnimationEvent' in the 'CSS Animations' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationEvent"
)
public class AnimationEvent extends Event {
  /**
   * The AnimationEvent() constructor returns a newly created AnimationEvent, representing an event in relation with an animation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent/AnimationEvent">AnimationEvent.AnimationEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#dom-animationevent-animationevent">The definition of 'AnimationEvent()' in the 'CSS Animations' specification.</a>
   */
  public AnimationEvent(@Nonnull final String type,
      @Nonnull final AnimationEventInit animationEventInitDict) {
    super( null );
  }

  /**
   * The AnimationEvent() constructor returns a newly created AnimationEvent, representing an event in relation with an animation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent/AnimationEvent">AnimationEvent.AnimationEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#dom-animationevent-animationevent">The definition of 'AnimationEvent()' in the 'CSS Animations' specification.</a>
   */
  public AnimationEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The AnimationEvent.animationName read-only property is a DOMString containing the value of the animation-name CSS property associated with the transition.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent/animationName">AnimationEvent.animationName - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#dom-animationevent-animationname">The definition of 'AnimationEvent.animationName' in the 'CSS Animations' specification.</a>
   */
  @JsProperty(
      name = "animationName"
  )
  @Nonnull
  public native String animationName();

  /**
   * The AnimationEvent.elapsedTime read-only property is a float giving the amount of time the animation has been running, in seconds, when this event fired, excluding any time the animation was paused. For an animationstart event, elapsedTime is 0.0 unless there was a negative value for animation-delay, in which case the event will be fired with elapsedTime containing (-1 * delay).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent/elapsedTime">AnimationEvent.elapsedTime - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#dom-animationevent-elapsedtime">The definition of 'AnimationEvent.elapsedTime' in the 'CSS Animations' specification.</a>
   */
  @JsProperty(
      name = "elapsedTime"
  )
  public native double elapsedTime();

  /**
   * The AnimationEvent.pseudoElement read-only property is a DOMString, starting with '::', containing the name of the pseudo-element the animation runs on. If the animation doesn't run on a pseudo-element but on the element, an empty string: ''.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationEvent/pseudoElement">AnimationEvent.pseudoElement - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-animations/#dom-animationevent-pseudoelement">The definition of 'AnimationEvent.pseudoElement' in the 'CSS Animations' specification.</a>
   */
  @JsProperty(
      name = "pseudoElement"
  )
  @Nonnull
  public native String pseudoElement();
}
