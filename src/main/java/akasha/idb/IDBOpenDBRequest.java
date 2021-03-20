package akasha.idb;

import akasha.AddEventListenerOptions;
import akasha.EventListenerOptions;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The IDBOpenDBRequest interface of the IndexedDB API provides access to the results of requests to open or delete databases (performed using IDBFactory.open and IDBFactory.deleteDatabase), using specific event handler attributes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBOpenDBRequest">IDBOpenDBRequest - MDN</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#idbopendbrequest">IDBOpenDBRequest - Indexed Database API 2.0</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#idbopendbrequest">IDBOpenDBRequest - Indexed Database API 2.0</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBOpenDBRequest"
)
public class IDBOpenDBRequest extends IDBRequest {
  /**
   * The onblocked event handler of the IDBOpenDBRequest interface is the event handler for the blocked event. This event is triggered when the upgradeneeded should be triggered because of a version change but the database is still in use (that is, not closed) somewhere, even after the versionchange event was sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBOpenDBRequest/onblocked">IDBOpenDBRequest.onblocked - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbopendbrequest-onblocked">onblocked - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbopendbrequest-onblocked">onblocked - Indexed Database API Draft</a>
   */
  @Nullable
  public IDBVersionChangeEventHandler onblocked;

  /**
   * In the following example you can see the onupgradeneeded handler being used to update the database structure if a database with a higher version number is loaded. For a full working example, see our To-do Notifications app (view example live.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBOpenDBRequest/onupgradeneeded">IDBOpenDBRequest.onupgradeneeded - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbopendbrequest-onupgradeneeded">onupgradeneeded - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbopendbrequest-onupgradeneeded">onupgradeneeded - Indexed Database API Draft</a>
   */
  @Nullable
  public IDBVersionChangeEventHandler onupgradeneeded;

  protected IDBOpenDBRequest() {
  }

  @JsOverlay
  public final void addBlockedListener(@Nonnull final IDBVersionChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "blocked", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBlockedListener(@Nonnull final IDBVersionChangeEventListener callback,
      final boolean useCapture) {
    addEventListener( "blocked", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addBlockedListener(@Nonnull final IDBVersionChangeEventListener callback) {
    addEventListener( "blocked", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBlockedListener(@Nonnull final IDBVersionChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "blocked", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBlockedListener(@Nonnull final IDBVersionChangeEventListener callback,
      final boolean useCapture) {
    removeEventListener( "blocked", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeBlockedListener(@Nonnull final IDBVersionChangeEventListener callback) {
    removeEventListener( "blocked", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUpgradeneededListener(@Nonnull final IDBVersionChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "upgradeneeded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUpgradeneededListener(@Nonnull final IDBVersionChangeEventListener callback,
      final boolean useCapture) {
    addEventListener( "upgradeneeded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUpgradeneededListener(
      @Nonnull final IDBVersionChangeEventListener callback) {
    addEventListener( "upgradeneeded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUpgradeneededListener(
      @Nonnull final IDBVersionChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "upgradeneeded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUpgradeneededListener(
      @Nonnull final IDBVersionChangeEventListener callback, final boolean useCapture) {
    removeEventListener( "upgradeneeded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUpgradeneededListener(
      @Nonnull final IDBVersionChangeEventListener callback) {
    removeEventListener( "upgradeneeded", Js.cast( callback ) );
  }
}
