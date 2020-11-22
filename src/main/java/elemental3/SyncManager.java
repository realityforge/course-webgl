package elemental3;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SyncManager interface of the the ServiceWorker API provides an interface for registering and listing sync registrations.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SyncManager">SyncManager - MDN</a>
 * @see <a href="https://wicg.github.io/background-sync/spec/#sync-manager-interface">The definition of 'SyncManager' in the 'Web Background Synchronization' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SyncManager"
)
public class SyncManager {
  protected SyncManager() {
  }

  /**
   * The SyncManager.getTags method of the SyncManager interface returns a list of developer-defined identifiers for SyncManager registrations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SyncManager/getTags">SyncManager.getTags - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<String>> getTags();

  /**
   * The SyncManager.register method of the SyncManager interface returns a Promise that resolves to a SyncRegistration instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SyncManager/register">SyncManager.register - MDN</a>
   */
  @Nonnull
  public native Promise<Void> register(@Nonnull String tag);
}
