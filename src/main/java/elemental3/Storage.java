package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Storage interface of the Web Storage API provides access to a particular domain's session or local storage. It allows, for example, the addition, modification, or deletion of stored data items.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage">Storage - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#storage">The definition of 'Storage' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Storage"
)
public class Storage {
  protected Storage() {
  }

  /**
   * The length read-only property of the Storage interface returns the number of data items stored in a given Storage object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/length">Storage.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-storage-length">The definition of 'Storage.length' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The clear() method of the Storage interface clears all keys stored in a given Storage object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/clear">Storage.clear - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-storage-clear">The definition of 'Storage.clear' in the 'HTML Living Standard' specification.</a>
   */
  public native void clear();

  /**
   * The key() method of the Storage interface, when passed a number n, returns the name of the nth key in a given Storage object. The order of keys is user-agent defined, so you should not rely on it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/key">Storage.key - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-storage-key">The definition of 'Storage.key' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native String key(int index);

  /**
   * The getItem() method of the Storage interface, when passed a key name, will return that key's value, or null if the key does not exist, in the given Storage object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/getItem">Storage.getItem - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-storage-getitem">The definition of 'Storage.getItem' in the 'HTML Living Standard' specification.</a>
   */
  @Nullable
  public native String getItem(@Nonnull String key);

  /**
   * The setItem() method of the Storage interface, when passed a key name and value, will add that key to the given Storage object, or update that key's value if it already exists.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/setItem">Storage.setItem - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-storage-setitem">The definition of 'Storage.setItem' in the 'HTML Living Standard' specification.</a>
   */
  public native void setItem(@Nonnull String key, @Nonnull String value);

  /**
   * The removeItem() method of the Storage interface, when passed a key name, will remove that key from the given Storage object if it exists. The Storage interface of the Web Storage API provides access to a particular domain's session or local storage.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/removeItem">Storage.removeItem - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#dom-storage-removeitem">The definition of 'Storage.removeItem' in the 'HTML Living Standard' specification.</a>
   */
  public native void removeItem(@Nonnull String key);
}
