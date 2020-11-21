package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The StorageManager interface of the the Storage API provides an interface for managing persistance permissions and estimating available storage. You can get a reference to this interface using either navigator.storage or WorkerNavigator.storage.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageManager">StorageManager - MDN</a>
 * @see <a href="https://storage.spec.whatwg.org/#storagemanager">The definition of 'StorageManger' in the 'Storage' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StorageManager"
)
public class StorageManager {
  protected StorageManager() {
  }

  /**
   * The estimate() method of the StorageManager interface asks the Storage Manager for how much storage the current origin takes up (usage), and how much space is available (quota).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageManager/estimate">StorageManager.estimate - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storagemanager-estimate">The definition of 'estimate()' in the 'Storage' specification.</a>
   */
  @Nonnull
  public native Promise<StorageEstimate> estimate();

  /**
   * The persist() method of the StorageManager interface requests permission to use persistent storage, and returns a Promise that resolves to true if permission is granted and box mode is persistent, and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageManager/persist">StorageManager.persist - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storagemanager-persist">The definition of 'persist' in the 'Storage' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> persist();

  /**
   * The persisted() method of the StorageManager interface returns a Promise that resolves to true if box mode is persistent for your site's storage.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageManager/persisted">StorageManager.persisted - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storagemanager-persisted">The definition of 'persisted' in the 'Storage' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> persisted();
}
