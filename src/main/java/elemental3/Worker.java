package elemental3;

import elemental3.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The Worker interface of the Web Workers API represents a background task that can be created via script, which can send messages back to its creator.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker">Worker - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#worker">Worker - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Worker"
)
public class Worker extends EventTarget {
  /**
   * The AbstractWorker.onerror property of the AbstractWorker interface represents an EventHandler, that is a function to be called when the error event occurs and bubbles through the Worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/onerror">Worker.onerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-abstractworker-onerror">AbstractWorker.onerror - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The onmessage property of the Worker interface represents an EventHandler, that is a function to be called when the message event occurs. These events are of type MessageEvent and will be called when the worker's parent receives a message (i.e. from the DedicatedWorkerGlobalScope.postMessage method).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/onmessage">Worker.onmessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-worker-onmessage">Worker.onmessage - HTML Living Standard</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the Worker interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on the Worker instance &mdash; that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/onmessageerror">Worker.onmessageerror - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-worker-onmessageerror">onmessageerror - HTML Living Standard</a>
   */
  @Nullable
  public MessageEventHandler onmessageerror;

  /**
   * The Worker() constructor creates a Worker object that executes the script at the specified URL. This script must obey the same-origin policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/Worker">Worker.Worker - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker">Worker() - HTML Living Standard</a>
   */
  public Worker(@Nonnull final String scriptURL, @Nonnull final WorkerOptions options) {
  }

  /**
   * The Worker() constructor creates a Worker object that executes the script at the specified URL. This script must obey the same-origin policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/Worker">Worker.Worker - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker">Worker() - HTML Living Standard</a>
   */
  public Worker(@Nonnull final String scriptURL) {
  }

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker-postmessage">Worker.postMessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull JsArray<Transferable> transfer);

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker-postmessage">Worker.postMessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull Transferable[] transfer);

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker-postmessage">Worker.postMessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull PostMessageOptions options);

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker-postmessage">Worker.postMessage() - HTML Living Standard</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message);

  /**
   * The terminate() method of the Worker interface immediately terminates the Worker. This does not offer the worker an opportunity to finish its operations; it is simply stopped at once.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/terminate">Worker.terminate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-worker-terminate">Worker.terminate() - HTML Living Standard</a>
   */
  public native void terminate();

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "messageerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "messageerror", Js.cast( callback ) );
  }
}
