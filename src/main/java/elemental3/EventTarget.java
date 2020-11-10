package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * EventTarget is a DOM interface implemented by objects that can receive events and may have listeners for them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget">EventTarget - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-eventtarget">The definition of 'EventTarget' in the 'DOM' specification.</a>
 * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/DOM3-Events.html#interface-EventTarget">The definition of 'EventTarget' in the 'Document Object Model (DOM) Level 3 Events Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.htmlevents.html#Events-EventTarget">The definition of 'EventTarget' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EventTarget"
)
public class EventTarget {
  /**
   * The EventTarget() constructor creates a new EventTarget object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/EventTarget">EventTarget.EventTarget - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-eventtarget">The definition of 'EventTarget() constructor' in the 'DOM' specification.</a>
   */
  public EventTarget() {
  }

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">The definition of 'EventTarget.addEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public native void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      @Nonnull AddEventListenerOptions options);

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">The definition of 'EventTarget.addEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public native void addEventListener(@Nonnull String type, @Nullable EventListener callback,
      boolean options);

  /**
   * The EventTarget method addEventListener() sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener">EventTarget.addEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-addeventlistener">The definition of 'EventTarget.addEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-addEventListener">The definition of 'EventTarget.addEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public native void addEventListener(@Nonnull String type, @Nullable EventListener callback);

  /**
   * Dispatches an Event at the specified EventTarget, (synchronously) invoking the affected EventListeners in the appropriate order. The normal event processing rules (including the capturing and optional bubbling phase) also apply to events dispatched manually with dispatchEvent().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/dispatchEvent">EventTarget.dispatchEvent - MDN</a>
   */
  public native boolean dispatchEvent(@Nonnull Event event);

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">The definition of 'EventTarget.removeEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public native void removeEventListener(@Nonnull String type, @Nullable EventListener callback,
      @Nonnull EventListenerOptions options);

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">The definition of 'EventTarget.removeEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public native void removeEventListener(@Nonnull String type, @Nullable EventListener callback,
      boolean options);

  /**
   * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously registered with EventTarget.addEventListener(). The event listener to be removed is identified using a combination of the event type, the event listener function itself, and various optional options that may affect the matching process; see Matching event listeners for removal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/removeEventListener">EventTarget.removeEventListener - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-eventtarget-removeeventlistener">The definition of 'EventTarget.removeEventListener()' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-EventTarget-removeEventListener">The definition of 'EventTarget.removeEventListener()' in the 'Document Object Model (DOM) Level 2 Events Specification' specification.</a>
   */
  public native void removeEventListener(@Nonnull String type, @Nullable EventListener callback);
}
