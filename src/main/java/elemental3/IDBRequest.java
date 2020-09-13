package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * The request object does not initially contain any information about the result of the operation, but once information becomes available, an event is fired on the request, and the information becomes available through the properties of the IDBRequest instance.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest">IDBRequest - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBRequest"
)
public class IDBRequest extends EventTarget {
  /**
   * The following example requests a given record title, onsuccess gets the associated record from the IDBObjectStore (made available as objectStoreTitleRequest.result), updates one property of the record, and then puts the updated record back into the object store. Also included at the bottom is an onerror function that reports what the error was if the request fails. For a full working example, see our To-do Notifications app (view example live.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/onerror">IDBRequest.onerror - MDN</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The following example requests a given record title, onsuccess gets the associated record from the IDBObjectStore (made available as objectStoreTitleRequest.result), updates one property of the record, and then puts the updated record back into the object store. For a full working example, see our To-do Notifications app (view example live.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/onsuccess">IDBRequest.onsuccess - MDN</a>
   */
  @Nullable
  public EventHandler onsuccess;

  IDBRequest() {
  }

  /**
   * A DOMError containing the relevant error. In Chrome 48+/Firefox 58+ this property returns a DOMException because DOMError has been removed from the DOM standard. The following error codes are returned under certain conditions:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/error">IDBRequest.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  /**
   * The IDBRequestReadyState of the request, which takes one of the following two values:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/readyState">IDBRequest.readyState - MDN</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  /**
   * any
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/result">IDBRequest.result - MDN</a>
   */
  @JsProperty(
      name = "result"
  )
  @Nullable
  public native Any result();

  /**
   * An object representing the source of the request, such as an IDBIndex, IDBObjectStore or IDBCursor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/source">IDBRequest.source - MDN</a>
   */
  @JsProperty(
      name = "source"
  )
  @Nullable
  public native IDBObjectStoreOrIDBIndexOrIDBCursorUnion source();

  /**
   * An IDBTransaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/transaction">IDBRequest.transaction - MDN</a>
   */
  @JsProperty(
      name = "transaction"
  )
  @Nullable
  public native IDBTransaction transaction();

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSuccessListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "success", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSuccessListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "success", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSuccessListener(@Nonnull final EventListener callback) {
    addEventListener( "success", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSuccessListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "success", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSuccessListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "success", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSuccessListener(@Nonnull final EventListener callback) {
    removeEventListener( "success", Js.cast( callback ) );
  }
}
