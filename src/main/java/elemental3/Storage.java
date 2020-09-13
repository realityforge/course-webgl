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
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Storage"
)
public class Storage {
  Storage() {
  }

  /**
   * The length read-only property of the Storage interface returns the number of data items stored in a given Storage object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/length">Storage.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  public native void clear();

  /**
   * The key() method of the Storage interface, when passed a number n, returns the name of the nth key in a given Storage object. The order of keys is user-agent defined, so you should not rely on it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Storage/key">Storage.key - MDN</a>
   */
  @Nullable
  public native String key(int index);

  @Nullable
  public native String getItem(@Nonnull String key);

  public native void setItem(@Nonnull String key, @Nonnull String value);

  public native void removeItem(@Nonnull String key);
}
