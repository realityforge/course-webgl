package elemental3.indexeddb;

import elemental2.core.JsArray;
import elemental3.DOMStringList;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * This example shows a variety of different uses of object stores, from updating the data structure with IDBObjectStore.createIndex inside an onupgradeneeded function, to adding a new item to our object store with IDBObjectStore.add. For a full working example, see our To-do Notifications app (view example live.)
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore">IDBObjectStore - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBObjectStore"
)
public class IDBObjectStore {
  /**
   * A DOMString containing the object store's name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/name">IDBObjectStore.name - MDN</a>
   */
  @Nonnull
  public String name;

  protected IDBObjectStore() {
  }

  /**
   * A Boolean:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/autoIncrement">IDBObjectStore.autoIncrement - MDN</a>
   */
  @JsProperty(
      name = "autoIncrement"
  )
  public native boolean autoIncrement();

  /**
   * A DOMStringList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/indexNames">IDBObjectStore.indexNames - MDN</a>
   */
  @JsProperty(
      name = "indexNames"
  )
  @Nonnull
  public native DOMStringList indexNames();

  /**
   * If this property is null, the application must provide a key for each modification operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/keyPath">IDBObjectStore.keyPath - MDN</a>
   */
  @JsProperty(
      name = "keyPath"
  )
  @Nullable
  public native Any keyPath();

  /**
   * An IDBTransaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/transaction">IDBObjectStore.transaction - MDN</a>
   */
  @JsProperty(
      name = "transaction"
  )
  @Nonnull
  public native IDBTransaction transaction();

  /**
   * To determine if the add operation has completed successfully, listen for the transaction&rsquo;s complete event in addition to the IDBObjectStore.add request&rsquo;s success event, because the transaction may still fail after the success event fires. In other words, the success event is only triggered when the transaction has been successfully queued.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/add">IDBObjectStore.add - MDN</a>
   */
  @Nonnull
  public native IDBRequest add(@Nullable Any value, @Nullable Any key);

  /**
   * To determine if the add operation has completed successfully, listen for the transaction&rsquo;s complete event in addition to the IDBObjectStore.add request&rsquo;s success event, because the transaction may still fail after the success event fires. In other words, the success event is only triggered when the transaction has been successfully queued.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/add">IDBObjectStore.add - MDN</a>
   */
  @Nonnull
  public native IDBRequest add(@DoNotAutobox @Nullable Object value, @Nullable Any key);

  /**
   * To determine if the add operation has completed successfully, listen for the transaction&rsquo;s complete event in addition to the IDBObjectStore.add request&rsquo;s success event, because the transaction may still fail after the success event fires. In other words, the success event is only triggered when the transaction has been successfully queued.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/add">IDBObjectStore.add - MDN</a>
   */
  @Nonnull
  public native IDBRequest add(@Nullable Any value, @DoNotAutobox @Nullable Object key);

  /**
   * To determine if the add operation has completed successfully, listen for the transaction&rsquo;s complete event in addition to the IDBObjectStore.add request&rsquo;s success event, because the transaction may still fail after the success event fires. In other words, the success event is only triggered when the transaction has been successfully queued.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/add">IDBObjectStore.add - MDN</a>
   */
  @Nonnull
  public native IDBRequest add(@DoNotAutobox @Nullable Object value,
      @DoNotAutobox @Nullable Object key);

  /**
   * To determine if the add operation has completed successfully, listen for the transaction&rsquo;s complete event in addition to the IDBObjectStore.add request&rsquo;s success event, because the transaction may still fail after the success event fires. In other words, the success event is only triggered when the transaction has been successfully queued.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/add">IDBObjectStore.add - MDN</a>
   */
  @Nonnull
  public native IDBRequest add(@Nullable Any value);

  /**
   * To determine if the add operation has completed successfully, listen for the transaction&rsquo;s complete event in addition to the IDBObjectStore.add request&rsquo;s success event, because the transaction may still fail after the success event fires. In other words, the success event is only triggered when the transaction has been successfully queued.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/add">IDBObjectStore.add - MDN</a>
   */
  @Nonnull
  public native IDBRequest add(@DoNotAutobox @Nullable Object value);

  /**
   * Clearing an object store consists of removing all records from the object store and removing all records in indexes that reference the object store. To remove only some of the records in a store, use IDBObjectStore.delete passing a key or IDBKeyRange.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/clear">IDBObjectStore.clear - MDN</a>
   */
  @Nonnull
  public native IDBRequest clear();

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/count">IDBObjectStore.count - MDN</a>
   */
  @Nonnull
  public native IDBRequest count(@Nullable Any query);

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/count">IDBObjectStore.count - MDN</a>
   */
  @Nonnull
  public native IDBRequest count(@DoNotAutobox @Nullable Object query);

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/count">IDBObjectStore.count - MDN</a>
   */
  @Nonnull
  public native IDBRequest count();

  /**
   * Note that this method must be called only from a VersionChange transaction mode callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/createIndex">IDBObjectStore.createIndex - MDN</a>
   */
  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String keyPath,
      @Nonnull IDBIndexParameters options);

  /**
   * Note that this method must be called only from a VersionChange transaction mode callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/createIndex">IDBObjectStore.createIndex - MDN</a>
   */
  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull JsArray<String> keyPath,
      @Nonnull IDBIndexParameters options);

  /**
   * Note that this method must be called only from a VersionChange transaction mode callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/createIndex">IDBObjectStore.createIndex - MDN</a>
   */
  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String[] keyPath,
      @Nonnull IDBIndexParameters options);

  /**
   * Note that this method must be called only from a VersionChange transaction mode callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/createIndex">IDBObjectStore.createIndex - MDN</a>
   */
  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String keyPath);

  /**
   * Note that this method must be called only from a VersionChange transaction mode callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/createIndex">IDBObjectStore.createIndex - MDN</a>
   */
  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull JsArray<String> keyPath);

  /**
   * Note that this method must be called only from a VersionChange transaction mode callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/createIndex">IDBObjectStore.createIndex - MDN</a>
   */
  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String[] keyPath);

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired. The request.result attribute is set to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/delete">IDBObjectStore.delete - MDN</a>
   */
  @Nonnull
  public native IDBRequest delete(@Nullable Any query);

  /**
   * An IDBRequest object on which subsequent events related to this operation are fired. The request.result attribute is set to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/delete">IDBObjectStore.delete - MDN</a>
   */
  @Nonnull
  public native IDBRequest delete(@DoNotAutobox @Nullable Object query);

  /**
   * Note that this method must be called only from a VersionChange transaction mode callback. Note that this method synchronously modifies the IDBObjectStore.indexNames property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/deleteIndex">IDBObjectStore.deleteIndex - MDN</a>
   */
  public native void deleteIndex(@Nonnull String name);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/get">IDBObjectStore.get - MDN</a>
   */
  @Nonnull
  public native IDBRequest get(@Nullable Any query);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/get">IDBObjectStore.get - MDN</a>
   */
  @Nonnull
  public native IDBRequest get(@DoNotAutobox @Nullable Object query);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAll">IDBObjectStore.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll(@Nullable Any query, int count);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAll">IDBObjectStore.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll(@DoNotAutobox @Nullable Object query, int count);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAll">IDBObjectStore.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll(@Nullable Any query);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAll">IDBObjectStore.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll(@DoNotAutobox @Nullable Object query);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAll">IDBObjectStore.getAll - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAll();

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAllKeys">IDBObjectStore.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys(@Nullable Any query, int count);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAllKeys">IDBObjectStore.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys(@DoNotAutobox @Nullable Object query, int count);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAllKeys">IDBObjectStore.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys(@Nullable Any query);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAllKeys">IDBObjectStore.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys(@DoNotAutobox @Nullable Object query);

  /**
   * If a value is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getAllKeys">IDBObjectStore.getAllKeys - MDN</a>
   */
  @Nonnull
  public native IDBRequest getAllKeys();

  /**
   * If a key is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getKey">IDBObjectStore.getKey - MDN</a>
   */
  @Nonnull
  public native IDBRequest getKey(@Nullable Any query);

  /**
   * If a key is successfully found, then a structured clone of it is created and set as the result of the request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/getKey">IDBObjectStore.getKey - MDN</a>
   */
  @Nonnull
  public native IDBRequest getKey(@DoNotAutobox @Nullable Object query);

  /**
   * An IDBIndex object for accessing the index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/index">IDBObjectStore.index - MDN</a>
   */
  @Nonnull
  public native IDBIndex index(@Nonnull String name);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openCursor">IDBObjectStore.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor(@Nullable Any query,
      @IDBCursorDirection @Nonnull String direction);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openCursor">IDBObjectStore.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor(@DoNotAutobox @Nullable Object query,
      @IDBCursorDirection @Nonnull String direction);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openCursor">IDBObjectStore.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor(@Nullable Any query);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openCursor">IDBObjectStore.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor(@DoNotAutobox @Nullable Object query);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openCursor">IDBObjectStore.openCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openCursor();

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openKeyCursor">IDBObjectStore.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor(@Nullable Any query,
      @IDBCursorDirection @Nonnull String direction);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openKeyCursor">IDBObjectStore.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor(@DoNotAutobox @Nullable Object query,
      @IDBCursorDirection @Nonnull String direction);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openKeyCursor">IDBObjectStore.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor(@Nullable Any query);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openKeyCursor">IDBObjectStore.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor(@DoNotAutobox @Nullable Object query);

  /**
   * To determine if the add operation has completed successfully, listen for the results&rsquo;s success event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/openKeyCursor">IDBObjectStore.openKeyCursor - MDN</a>
   */
  @Nonnull
  public native IDBRequest openKeyCursor();

  /**
   * The put method is an update or insert method. See the IDBObjectStore.add method for an insert only method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/put">IDBObjectStore.put - MDN</a>
   */
  @Nonnull
  public native IDBRequest put(@Nullable Any value, @Nullable Any key);

  /**
   * The put method is an update or insert method. See the IDBObjectStore.add method for an insert only method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/put">IDBObjectStore.put - MDN</a>
   */
  @Nonnull
  public native IDBRequest put(@DoNotAutobox @Nullable Object value, @Nullable Any key);

  /**
   * The put method is an update or insert method. See the IDBObjectStore.add method for an insert only method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/put">IDBObjectStore.put - MDN</a>
   */
  @Nonnull
  public native IDBRequest put(@Nullable Any value, @DoNotAutobox @Nullable Object key);

  /**
   * The put method is an update or insert method. See the IDBObjectStore.add method for an insert only method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/put">IDBObjectStore.put - MDN</a>
   */
  @Nonnull
  public native IDBRequest put(@DoNotAutobox @Nullable Object value,
      @DoNotAutobox @Nullable Object key);

  /**
   * The put method is an update or insert method. See the IDBObjectStore.add method for an insert only method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/put">IDBObjectStore.put - MDN</a>
   */
  @Nonnull
  public native IDBRequest put(@Nullable Any value);

  /**
   * The put method is an update or insert method. See the IDBObjectStore.add method for an insert only method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBObjectStore/put">IDBObjectStore.put - MDN</a>
   */
  @Nonnull
  public native IDBRequest put(@DoNotAutobox @Nullable Object value);
}