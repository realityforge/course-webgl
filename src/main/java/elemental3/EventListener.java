package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EventListener interface represents an object that can handle an event dispatched by an EventTarget object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventListener">EventListener - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#callbackdef-eventlistener">EventListener - DOM</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventListener">EventListener - Document Object Model (DOM) Level 2 Events Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface EventListener {
  /**
   * The EventListener method handleEvent() method is called by the user agent when an event is sent to the EventListener, in order to handle events that occur on an observed EventTarget.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventListener/handleEvent">EventListener.handleEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventlistener-handleevent">EventListener.handleEvent() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventListener-handleEvent">EventListener.handleEvent() - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  void handleEvent(@Nonnull Event event);
}
