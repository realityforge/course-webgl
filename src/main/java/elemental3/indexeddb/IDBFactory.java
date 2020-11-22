package elemental3.indexeddb;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * In the following code snippet, we make a request to open a database, and include handlers for the success and error cases. For a full working example, see our To-do Notifications app (view example live.)
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory">IDBFactory - MDN</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#idbfactory">The definition of 'IDBFactory' in the 'Indexed Database API 2.0' specification.</a>
 * @see <a href="https://w3c.github.io/IndexedDB/#factory-interface">The definition of 'IDBFactory' in the 'Indexed Database API Draft' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBFactory"
)
public class IDBFactory {
  protected IDBFactory() {
  }

  /**
   * An integer that indicates the result of the comparison; the table below lists the possible values and their meanings:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory/cmp">IDBFactory.cmp - MDN</a>
   */
  public native short cmp(@DoNotAutobox @Nullable Object first,
      @DoNotAutobox @Nullable Object second);

  /**
   * The databases method of the IDBFactory interface returns a list represening all the available databases, including their names and versions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory/databases">IDBFactory.databases - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<IDBDatabaseInfo>> databases();

  /**
   * The deleteDatabase() method of the IDBFactory interface requests the deletion of a database. The method returns an IDBOpenDBRequest object immediately, and performs the deletion operation asynchronously.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory/deleteDatabase">IDBFactory.deleteDatabase - MDN</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbfactory-deletedatabase">The definition of 'deleteDatabase()' in the 'Indexed Database API Draft' specification.</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbfactory-deletedatabase">The definition of 'deleteDatabase()' in the 'Indexed Database API 2.0' specification.</a>
   */
  @Nonnull
  public native IDBOpenDBRequest deleteDatabase(@Nonnull String name);

  /**
   * If an error occurs while the database connection is being opened, then an error event is fired on the request object returned from this method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory/open">IDBFactory.open - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbfactory-open">The definition of 'open()' in the 'Indexed Database API 2.0' specification.</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbfactory-open">The definition of 'open()' in the 'Indexed Database API Draft' specification.</a>
   */
  @Nonnull
  public native IDBOpenDBRequest open(@Nonnull String name, int version);

  /**
   * If an error occurs while the database connection is being opened, then an error event is fired on the request object returned from this method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBFactory/open">IDBFactory.open - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbfactory-open">The definition of 'open()' in the 'Indexed Database API 2.0' specification.</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbfactory-open">The definition of 'open()' in the 'Indexed Database API Draft' specification.</a>
   */
  @Nonnull
  public native IDBOpenDBRequest open(@Nonnull String name);
}
