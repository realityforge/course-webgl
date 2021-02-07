package elemental3.indexeddb;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The IDBVersionChangeEvent interface of the IndexedDB API indicates that the version of the database has changed, as the result of an IDBOpenDBRequest.onupgradeneeded event handler function.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBVersionChangeEvent">IDBVersionChangeEvent - MDN</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#idbversionchangeevent">IDBVersionChangeEvent - Indexed Database API 2.0</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#idbversionchangeevent">IDBVersionChangeEvent - Indexed Database API 2.0</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBVersionChangeEvent"
)
public class IDBVersionChangeEvent extends Event {
  public IDBVersionChangeEvent(@Nonnull final String type,
      @Nonnull final IDBVersionChangeEventInit eventInitDict) {
    super( null );
  }

  public IDBVersionChangeEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * A 64-bit integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBVersionChangeEvent/newVersion">IDBVersionChangeEvent.newVersion - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbversionchangeevent-newversion">newVersion - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbversionchangeevent-newversion">newVersion - Indexed Database API Draft</a>
   */
  @JsProperty(
      name = "newVersion"
  )
  @Nullable
  public native Double newVersion();

  /**
   * The oldVersion read-only property of the IDBVersionChangeEvent interface returns the old version number of the database.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBVersionChangeEvent/oldVersion">IDBVersionChangeEvent.oldVersion - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbversionchangeevent-oldversion">oldVersion - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbversionchangeevent-oldversion">oldVersion - Indexed Database API Draft</a>
   */
  @JsProperty(
      name = "oldVersion"
  )
  public native int oldVersion();
}
