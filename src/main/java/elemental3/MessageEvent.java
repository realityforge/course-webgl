package elemental3;

import elemental3.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The MessageEvent interface represents a message received by a target object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent">MessageEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#messageevent">The definition of 'MessageEvent' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MessageEvent"
)
public class MessageEvent extends Event {
  /**
   * The MessageEvent() constructor creates a new MessageEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent/MessageEvent">MessageEvent.MessageEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-event-constructor">The definition of 'MessageEvent()' in the 'HTML Living Standard' specification.</a>
   */
  public MessageEvent(@Nonnull final String type, @Nonnull final MessageEventInit eventInitDict) {
    super( null );
  }

  /**
   * The MessageEvent() constructor creates a new MessageEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent/MessageEvent">MessageEvent.MessageEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-event-constructor">The definition of 'MessageEvent()' in the 'HTML Living Standard' specification.</a>
   */
  public MessageEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The data read-only property of the MessageEvent interface represents the data sent by the message emitter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent/data">MessageEvent.data - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-messageevent-data">The definition of 'MessageEvent: data' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nullable
  public native Any data();

  /**
   * The lastEventId read-only property of the MessageEvent interface is a DOMString representing a unique ID for the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent/lastEventId">MessageEvent.lastEventId - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-messageevent-lasteventid">The definition of 'MessageEvent: lastEventId' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "lastEventId"
  )
  @Nonnull
  public native String lastEventId();

  /**
   * The origin read-only property of the MessageEvent interface is a USVString representing the origin of the message emitter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent/origin">MessageEvent.origin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-messageevent-origin">The definition of 'MessageEvent: origin' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  /**
   * The ports read-only property of the MessageEvent interface is an array of MessagePort objects representing the ports associated with the channel the message is being sent through (where appropriate, e.g. in channel messaging or when sending a message to a shared worker).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent/ports">MessageEvent.ports - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-messageevent-ports">The definition of 'ports' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "ports"
  )
  @Nonnull
  public native JsArray<MessagePort> ports();

  /**
   * The source read-only property of the MessageEvent interface is a MessageEventSource (which can be a WindowProxy, MessagePort, or ServiceWorker object) representing the message emitter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MessageEvent/source">MessageEvent.source - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-messageevent-source">The definition of ' MessageEvent: source' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "source"
  )
  @Nullable
  public native MessageEventSource source();

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nullable MessageEventSource source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull Window source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessagePort source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull ServiceWorker source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nullable MessageEventSource source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull Window source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessagePort source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull ServiceWorker source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nullable MessageEventSource source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull Window source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessagePort source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull ServiceWorker source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin, @Nonnull String lastEventId);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data, @Nonnull String origin);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object data);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles);

  public native void initMessageEvent(@Nonnull String type);
}
