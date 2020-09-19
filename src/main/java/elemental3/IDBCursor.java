package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The IDBCursor interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records in a database.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor">IDBCursor - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBCursor"
)
public class IDBCursor {
  IDBCursor() {
  }

  /**
   * A string (defined by the IDBCursorDirection enum) indicating the direction in which the cursor is traversing the data. Possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/direction">IDBCursor.direction - MDN</a>
   */
  @JsProperty(
      name = "direction"
  )
  @Nonnull
  @IDBCursorDirection
  public native String direction();

  /**
   * A value of any type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/key">IDBCursor.key - MDN</a>
   */
  @JsProperty(
      name = "key"
  )
  @Nullable
  public native Any key();

  /**
   * A value of any data type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/primaryKey">IDBCursor.primaryKey - MDN</a>
   */
  @JsProperty(
      name = "primaryKey"
  )
  @Nullable
  public native Any primaryKey();

  /**
   * The request read-only property of the IDBCursor interface returns the IDBRequest used to obtain the cursor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/request">IDBCursor.request - MDN</a>
   */
  @JsProperty(
      name = "request"
  )
  @Nonnull
  public native IDBRequest request();

  /**
   * The IDBObjectStore or IDBIndex that the cursor is iterating over.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/source">IDBCursor.source - MDN</a>
   */
  @JsProperty(
      name = "source"
  )
  @Nonnull
  public native IDBObjectStoreOrIDBIndexUnion source();

  /**
   * The advance() method of the IDBCursor interface sets the number of times a cursor should move its position forward.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/advance">IDBCursor.advance - MDN</a>
   */
  public native void advance(int count);

  @JsMethod(
      name = "continue"
  )
  public native void continue_(@Nullable Any key);

  @JsMethod(
      name = "continue"
  )
  public native void continue_(@DoNotAutobox @Nullable Object key);

  @JsMethod(
      name = "continue"
  )
  public native void continue_();

  /**
   * The continuePrimaryKey() method of the IDBCursor interface advances the cursor to the to the item whose key matches the key parameter as well as whose primary key matches the primary key parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/continuePrimaryKey">IDBCursor.continuePrimaryKey - MDN</a>
   */
  public native void continuePrimaryKey(@Nullable Any key, @Nullable Any primaryKey);

  /**
   * The continuePrimaryKey() method of the IDBCursor interface advances the cursor to the to the item whose key matches the key parameter as well as whose primary key matches the primary key parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/continuePrimaryKey">IDBCursor.continuePrimaryKey - MDN</a>
   */
  public native void continuePrimaryKey(@DoNotAutobox @Nullable Object key,
      @Nullable Any primaryKey);

  /**
   * The continuePrimaryKey() method of the IDBCursor interface advances the cursor to the to the item whose key matches the key parameter as well as whose primary key matches the primary key parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/continuePrimaryKey">IDBCursor.continuePrimaryKey - MDN</a>
   */
  public native void continuePrimaryKey(@Nullable Any key,
      @DoNotAutobox @Nullable Object primaryKey);

  /**
   * The continuePrimaryKey() method of the IDBCursor interface advances the cursor to the to the item whose key matches the key parameter as well as whose primary key matches the primary key parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/continuePrimaryKey">IDBCursor.continuePrimaryKey - MDN</a>
   */
  public native void continuePrimaryKey(@DoNotAutobox @Nullable Object key,
      @DoNotAutobox @Nullable Object primaryKey);

  /**
   * The delete() method of the IDBCursor interface returns an IDBRequest object, and, in a separate thread, deletes the record at the cursor's position, without changing the cursor's position. Once the record is deleted, the cursor's value is set to null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/delete">IDBCursor.delete - MDN</a>
   */
  @Nonnull
  public native IDBRequest delete();

  /**
   * The update() method of the IDBCursor interface returns an IDBRequest object, and, in a separate thread, updates the value at the current position of the cursor in the object store. If the cursor points to a record that has just been deleted, a new record is created.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/update">IDBCursor.update - MDN</a>
   */
  @Nonnull
  public native IDBRequest update(@Nullable Any value);

  /**
   * The update() method of the IDBCursor interface returns an IDBRequest object, and, in a separate thread, updates the value at the current position of the cursor in the object store. If the cursor points to a record that has just been deleted, a new record is created.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursor/update">IDBCursor.update - MDN</a>
   */
  @Nonnull
  public native IDBRequest update(@DoNotAutobox @Nullable Object value);
}
