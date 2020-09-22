package elemental3.indexeddb;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * IDBIndex interface of the IndexedDB API provides asynchronous access to an index in a database. An index is a kind of object store for looking up records in another object store, called the referenced object store. You use this interface to retrieve data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex">IDBIndex - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBIndex"
)
public class IDBIndex {
  /**
   * A DOMString specifying a name for the index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/name">IDBIndex.name - MDN</a>
   */
  @Nonnull
  public String name;

  protected IDBIndex() {
  }

  /**
   * Any data type that can be used as a key path.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/keyPath">IDBIndex.keyPath - MDN</a>
   */
  @JsProperty(
      name = "keyPath"
  )
  @Nullable
  public native Any keyPath();

  /**
   * A Boolean:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/multiEntry">IDBIndex.multiEntry - MDN</a>
   */
  @JsProperty(
      name = "multiEntry"
  )
  public native boolean multiEntry();

  /**
   * An IDBObjectStore.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/objectStore">IDBIndex.objectStore - MDN</a>
   */
  @JsProperty(
      name = "objectStore"
  )
  @Nonnull
  public native IDBObjectStore objectStore();

  /**
   * A Boolean:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/unique">IDBIndex.unique - MDN</a>
   */
  @JsProperty(
      name = "unique"
  )
  public native boolean unique();

  /**
   * A IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/count">IDBIndex.count - MDN</a>
   */
  @Nonnull
  public native IDBRequest count(@DoNotAutobox @Nullable Object query);

  /**
   * A IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/count">IDBIndex.count - MDN</a>
   */
  @Nonnull
  public native IDBRequest count();

  /**
   * If a value is found, then a structured clone of it is created and set as the result of the request object: this returns the record the key is associated with.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/get">IDBIndex.get - MDN</a>
   */
  @Nonnull
  public native IDBRequest get(@DoNotAutobox @Nullable Object query);

  /**
   * There is a performance cost associated with looking at the value property of a cursor, because the object is created lazily. To use a feature like getAll(), the browser has to create all the objects at once. If you are just interested in looking at each of the keys, for instance, it is more efficient to use a cursor. If you are trying to get an array of all the objects in an object store, though, you should use getAll().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/getAll">IDBIndex.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll(@DoNotAutobox @Nullable Object query, int count);

  /**
   * There is a performance cost associated with looking at the value property of a cursor, because the object is created lazily. To use a feature like getAll(), the browser has to create all the objects at once. If you are just interested in looking at each of the keys, for instance, it is more efficient to use a cursor. If you are trying to get an array of all the objects in an object store, though, you should use getAll().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/getAll">IDBIndex.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll(@DoNotAutobox @Nullable Object query);

  /**
   * There is a performance cost associated with looking at the value property of a cursor, because the object is created lazily. To use a feature like getAll(), the browser has to create all the objects at once. If you are just interested in looking at each of the keys, for instance, it is more efficient to use a cursor. If you are trying to get an array of all the objects in an object store, though, you should use getAll().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/getAll">IDBIndex.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll();

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/getAllKeys">IDBIndex.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys(@DoNotAutobox @Nullable Object query, int count);

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/getAllKeys">IDBIndex.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys(@DoNotAutobox @Nullable Object query);

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/getAllKeys">IDBIndex.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys();

  /**
   * If a primary key is found, it is set as the result of the request object. Note that this doesn't return the whole record as IDBIndex.get does.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/getKey">IDBIndex.getKey - MDN</a>
   */
  @Nonnull
  public native IDBRequest getKey(@DoNotAutobox @Nullable Object query);

  /**
   * The method sets the position of the cursor to the appropriate record, based on the specified direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/openCursor">IDBIndex.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor(@DoNotAutobox @Nullable Object query,
      @IDBCursorDirection @Nonnull String direction);

  /**
   * The method sets the position of the cursor to the appropriate record, based on the specified direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/openCursor">IDBIndex.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor(@DoNotAutobox @Nullable Object query);

  /**
   * The method sets the position of the cursor to the appropriate record, based on the specified direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/openCursor">IDBIndex.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor();

  /**
   * The method sets the position of the cursor to the appropriate key, based on the specified direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/openKeyCursor">IDBIndex.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor(@DoNotAutobox @Nullable Object query,
      @IDBCursorDirection @Nonnull String direction);

  /**
   * The method sets the position of the cursor to the appropriate key, based on the specified direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/openKeyCursor">IDBIndex.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor(@DoNotAutobox @Nullable Object query);

  /**
   * The method sets the position of the cursor to the appropriate key, based on the specified direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBIndex/openKeyCursor">IDBIndex.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor();
}
