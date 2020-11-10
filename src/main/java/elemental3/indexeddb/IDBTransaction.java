package elemental3.indexeddb;

import elemental3.AddEventListenerOptions;
import elemental3.DOMException;
import elemental3.DOMStringList;
import elemental3.EventHandler;
import elemental3.EventListener;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The IDBTransaction interface of the IndexedDB API provides a static, asynchronous transaction on a database using event handler attributes. All reading and writing of data is done within transactions. You use IDBDatabase to start transactions, IDBTransaction to set the mode of the transaction (e.g. is it readonly or readwrite), and you access an IDBObjectStore to make a request. You can also use an IDBTransaction object to abort transactions.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction">IDBTransaction - MDN</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#transaction">The definition of 'IDBTransaction' in the 'Indexed Database API 2.0' specification.</a>
 * @see <a href="https://w3c.github.io/IndexedDB/#transaction">The definition of 'IDBTransaction' in the 'Indexed Database API Draft' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBTransaction"
)
public class IDBTransaction extends EventTarget {
  /**
   * In the following code snippet, we open a read/write transaction on our database and add some data to an object store. Note also the functions attached to transaction event handlers to report on the outcome of the transaction opening in the event of success or failure. Note the transaction.onabort = function(event) { }; block, reporting when the transaction has been aborted. For a full working example, see our To-do Notifications app (view example live.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/onabort">IDBTransaction.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The oncomplete event handler of the IDBTransaction interface handles the complete event, fired when the transaction successfully completes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/oncomplete">IDBTransaction.oncomplete - MDN</a>
   */
  @Nullable
  public EventHandler oncomplete;

  /**
   * The onerror event handler of the IDBTransaction interface handles the error event, fired when a request returns an error and bubbles up to the transaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/onerror">IDBTransaction.onerror - MDN</a>
   */
  @Nullable
  public EventHandler onerror;

  protected IDBTransaction() {
  }

  /**
   * An IDBDatabase object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/db">IDBTransaction.db - MDN</a>
   */
  @JsProperty(
      name = "db"
  )
  @Nonnull
  public native IDBDatabase db();

  @JsProperty(
      name = "durability"
  )
  @Nonnull
  @IDBTransactionDurability
  public native String durability();

  /**
   * A DOMError containing the relevant error. In Chrome 48+/Firefox 58+ this property returns a DOMException because DOMError has been removed from the DOM standard. The exact error is one of serveral possibilities. It can be a reference to the same error as the request object that raised it, or a transaction failure (for example QuotaExceededError or UnknownError).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/error">IDBTransaction.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  /**
   * An IDBTransactionMode object defining the mode for isolating access to data in the current object stores:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/mode">IDBTransaction.mode - MDN</a>
   */
  @JsProperty(
      name = "mode"
  )
  @Nonnull
  @IDBTransactionMode
  public native String mode();

  /**
   * The objectStoreNames read-only property of the IDBTransaction interface returns a DOMStringList of names of IDBObjectStore objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/objectStoreNames">IDBTransaction.objectStoreNames - MDN</a>
   */
  @JsProperty(
      name = "objectStoreNames"
  )
  @Nonnull
  public native DOMStringList objectStoreNames();

  /**
   * The abort() method of the IDBTransaction interface rolls back all the changes to objects in the database associated with this transaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/abort">IDBTransaction.abort - MDN</a>
   */
  public native void abort();

  /**
   * The commit() method of the IDBTransaction interface commits the transaction if it is called on an active transaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/commit">IDBTransaction.commit - MDN</a>
   */
  public native void commit();

  /**
   * The objectStore() method of the IDBTransaction interface returns an object store that has already been added to the scope of this transaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/objectStore">IDBTransaction.objectStore - MDN</a>
   */
  @Nonnull
  public native IDBObjectStore objectStore(@Nonnull String name);

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback) {
    addEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCompleteListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "complete", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCompleteListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "complete", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCompleteListener(@Nonnull final EventListener callback) {
    addEventListener( "complete", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCompleteListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "complete", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCompleteListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "complete", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCompleteListener(@Nonnull final EventListener callback) {
    removeEventListener( "complete", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }
}
