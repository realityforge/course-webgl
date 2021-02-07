package elemental3;

import elemental3.core.JsArray;
import elemental3.core.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * The Headers interface of the Fetch API allows you to perform various actions on HTTP request and response headers. These actions include retrieving, setting, adding to, and removing headers from the list of the request's headers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers">Headers - MDN</a>
 * @see <a href="https://fetch.spec.whatwg.org/#headers-class">Headers - Fetch</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Headers"
)
public class Headers {
  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">Headers() - Fetch</a>
   */
  public Headers(@Nonnull final HeadersInit init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">Headers() - Fetch</a>
   */
  public Headers(@Nonnull final JsArray<JsArray<String>> init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">Headers() - Fetch</a>
   */
  public Headers(@Nonnull final JsArray<String>[] init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">Headers() - Fetch</a>
   */
  public Headers(@Nonnull final JsPropertyMap<String> init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">Headers() - Fetch</a>
   */
  public Headers() {
  }

  /**
   * The append() method of the Headers interface appends a new value onto an existing header inside a Headers object, or adds the header if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/append">Headers.append - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-append">append() - Fetch</a>
   */
  public native void append(@Nonnull String name, @Nonnull String value);

  /**
   * The delete() method of the Headers interface deletes a header from the current Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/delete">Headers.delete - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-delete">delete() - Fetch</a>
   */
  public native void delete(@Nonnull String name);

  /**
   * The get() method of the Headers interface returns a byte string of all the values of a header within a Headers object with a given name. If the requested header doesn't exist in the Headers object, it returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/get">Headers.get - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-get">get() - Fetch</a>
   */
  @Nullable
  public native String get(@Nonnull String name);

  /**
   * The has() method of the Headers interface returns a boolean stating whether a Headers object contains a certain header.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/has">Headers.has - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-has">has() - Fetch</a>
   */
  public native boolean has(@Nonnull String name);

  /**
   * The set() method of the Headers interface sets a new value for an existing header inside a Headers object, or adds the header if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/set">Headers.set - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-set">set() - Fetch</a>
   */
  public native void set(@Nonnull String name, @Nonnull String value);

  /**
   * The Headers.keys() method returns an iterator allowing to go through all keys contained in this object. The keys are ByteString objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/keys">Headers.keys - MDN</a>
   */
  @Nonnull
  public native JsIterator<String> keys();

  /**
   * The Headers.values() method returns an iterator allowing to go through all values contained in this object. The values are ByteString objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/values">Headers.values - MDN</a>
   */
  @Nonnull
  public native JsIterator<String> values();

  /**
   * The Headers.entries() method returns an iterator allowing to go through all key/value pairs contained in this object. The both the key and value of each pairs are ByteString objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/entries">Headers.entries - MDN</a>
   */
  @Nonnull
  public native JsIterator<Entry> entries();

  public native void forEach(@Nonnull ForEachCallback callback);

  public native void forEach(@Nonnull ForEachCallback2 callback);

  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    @Nonnull
    public final String key() {
      return getAtAsAny( 0 ).cast();
    }

    @JsOverlay
    @Nonnull
    public final String value() {
      return getAtAsAny( 0 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull String value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull String value, String key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull String value, String key, @Nonnull Headers iterable);
  }
}
