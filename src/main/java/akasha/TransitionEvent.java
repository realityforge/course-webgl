package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TransitionEvent interface represents events providing information related to transitions.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TransitionEvent">TransitionEvent - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-transitions/#interface-transitionevent">TransitionEvent - CSS Transitions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TransitionEvent"
)
public class TransitionEvent extends Event {
  /**
   * The TransitionEvent() constructor returns a newly created TransitionEvent, representing an event in relation with an transition.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TransitionEvent/TransitionEvent">TransitionEvent.TransitionEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-transitions/#dom-transitionevent-transitionevent">TransitionEvent() - CSS Transitions</a>
   */
  public TransitionEvent(@Nonnull final String type,
      @Nonnull final TransitionEventInit transitionEventInitDict) {
    super( null );
  }

  /**
   * The TransitionEvent() constructor returns a newly created TransitionEvent, representing an event in relation with an transition.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TransitionEvent/TransitionEvent">TransitionEvent.TransitionEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-transitions/#dom-transitionevent-transitionevent">TransitionEvent() - CSS Transitions</a>
   */
  public TransitionEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The TransitionEvent.elapsedTime read-only property is a float giving the amount of time the animation has been running, in seconds, when this event fired. This value is not affected by the transition-delay property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TransitionEvent/elapsedTime">TransitionEvent.elapsedTime - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-transitions/#Events-TransitionEvent-elapsedTime">TransitionEvent.elapsedTime - CSS Transitions</a>
   */
  @JsProperty(
      name = "elapsedTime"
  )
  public native double elapsedTime();

  @JsProperty(
      name = "propertyName"
  )
  @Nonnull
  public native String propertyName();

  /**
   * The TransitionEvent.pseudoElement read-only property is a DOMString, starting with '::', containing the name of the pseudo-element the animation runs on. If the transition doesn't run on a pseudo-element but on the element, an empty string: ''.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TransitionEvent/pseudoElement">TransitionEvent.pseudoElement - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-transitions/#Events-TransitionEvent-pseudoElement">TransitionEvent.pseudoElement - CSS Transitions</a>
   */
  @JsProperty(
      name = "pseudoElement"
  )
  @Nonnull
  public native String pseudoElement();
}
