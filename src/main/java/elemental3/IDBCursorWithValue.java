package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The IDBCursorWithValue interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records in a database. It is the same as the IDBCursor, except that it includes the value property.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursorWithValue">IDBCursorWithValue - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBCursorWithValue"
)
public class IDBCursorWithValue extends IDBCursor {
  protected IDBCursorWithValue() {
  }

  /**
   * The value of the current cursor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBCursorWithValue/value">IDBCursorWithValue.value - MDN</a>
   */
  @JsProperty(
      name = "value"
  )
  @Nullable
  public native Any value();
}
