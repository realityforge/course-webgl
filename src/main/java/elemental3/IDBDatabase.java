package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The IDBDatabase interface of the IndexedDB API provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase">IDBDatabase - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBDatabase"
)
public class IDBDatabase extends EventTarget {
  /**
   * The onabort event handler of the IDBDatabase interface handles the abort event, fired when a transaction is aborted and bubbles up to the connection object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/onabort">IDBDatabase.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * A function which is called when the close event is fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/onclose">IDBDatabase.onclose - MDN</a>
   */
  @Nullable
  public EventHandler onclose;

  /**
   * The onerror event handler of the IDBDatabase interface handles the error event, fired when a request returns an error and bubbles up to the connection object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/onerror">IDBDatabase.onerror - MDN</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * This example shows an IDBOpenDBRequest.onupgradeneeded block that creates a new object store; it also includes onerror and onabort functions to handle non-success cases, and an onversionchange function to notify when a database structure change has occurred.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/onversionchange">IDBDatabase.onversionchange - MDN</a>
   */
  @Nullable
  public EventHandler onversionchange;

  IDBDatabase() {
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsProperty(
      name = "objectStoreNames"
  )
  @Nonnull
  public native DOMStringList objectStoreNames();

  @JsProperty(
      name = "version"
  )
  public native int version();

  /**
   * The connection is not actually closed until all transactions created using this connection are complete. No new transactions can be created for this connection once this method is called. Methods that create transactions throw an exception if a closing operation is pending.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/close">IDBDatabase.close - MDN</a>
   */
  public native void close();

  /**
   * The method takes the name of the store as well as a parameter object that lets you define important optional properties. You can use the property to uniquely identify individual objects in the store. As the property is an identifier, it should be unique to every object, and every object should have that property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/createObjectStore">IDBDatabase.createObjectStore - MDN</a>
   */
  @Nonnull
  public native IDBObjectStore createObjectStore(@Nonnull String name,
      @Nonnull IDBObjectStoreParameters options);

  /**
   * The method takes the name of the store as well as a parameter object that lets you define important optional properties. You can use the property to uniquely identify individual objects in the store. As the property is an identifier, it should be unique to every object, and every object should have that property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/createObjectStore">IDBDatabase.createObjectStore - MDN</a>
   */
  @Nonnull
  public native IDBObjectStore createObjectStore(@Nonnull String name);

  /**
   * As with IDBDatabase.createObjectStore, this method can be called only within a versionchange transaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/deleteObjectStore">IDBDatabase.deleteObjectStore - MDN</a>
   */
  public native void deleteObjectStore(@Nonnull String name);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull String storeNames,
      @MagicConstant(valuesFromClass = IDBTransactionMode.class) @Nonnull String mode,
      @Nonnull IDBTransactionOptions options);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull JsArray<String> storeNames,
      @MagicConstant(valuesFromClass = IDBTransactionMode.class) @Nonnull String mode,
      @Nonnull IDBTransactionOptions options);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull String[] storeNames,
      @MagicConstant(valuesFromClass = IDBTransactionMode.class) @Nonnull String mode,
      @Nonnull IDBTransactionOptions options);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull String storeNames,
      @MagicConstant(valuesFromClass = IDBTransactionMode.class) @Nonnull String mode);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull JsArray<String> storeNames,
      @MagicConstant(valuesFromClass = IDBTransactionMode.class) @Nonnull String mode);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull String[] storeNames,
      @MagicConstant(valuesFromClass = IDBTransactionMode.class) @Nonnull String mode);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull String storeNames);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull JsArray<String> storeNames);

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase/transaction">IDBDatabase.transaction - MDN</a>
   */
  @Nonnull
  public native IDBTransaction transaction(@Nonnull String[] storeNames);

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "abort", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCloseListener(@Nonnull final EventListener callback) {
    addEventListener( "close", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "close", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCloseListener(@Nonnull final EventListener callback) {
    removeEventListener( "close", Js.cast( callback ) );
  }

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
  public final void addVersionchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "versionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addVersionchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "versionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addVersionchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "versionchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeVersionchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "versionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeVersionchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "versionchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeVersionchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "versionchange", Js.cast( callback ) );
  }
}