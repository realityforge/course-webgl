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

  @JsProperty(
      name = "direction"
  )
  @Nonnull
  public native String direction();

  @JsProperty(
      name = "key"
  )
  @Nullable
  public native Any key();

  @JsProperty(
      name = "primaryKey"
  )
  @Nullable
  public native Any primaryKey();

  @JsProperty(
      name = "request"
  )
  @Nonnull
  public native IDBRequest request();

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

  @Nonnull
  public native IDBRequest delete();

  @Nonnull
  public native IDBRequest update(@Nullable Any value);

  @Nonnull
  public native IDBRequest update(@DoNotAutobox @Nullable Object value);
}
