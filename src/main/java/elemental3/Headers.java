package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * The Headers interface of the Fetch API allows you to perform various actions on HTTP request and response headers. These actions include retrieving, setting, adding to, and removing headers from the list of the request's headers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers">Headers - MDN</a>
 * @see <a href="https://fetch.spec.whatwg.org/#headers-class">The definition of 'Headers' in Fetch.</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">The definition of 'Headers()' in Fetch.</a>
   */
  public Headers(@Nonnull final HeadersInit init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">The definition of 'Headers()' in Fetch.</a>
   */
  public Headers(@Nonnull final JsArray<JsArray<String>> init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">The definition of 'Headers()' in Fetch.</a>
   */
  public Headers(@Nonnull final JsArray<String>[] init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">The definition of 'Headers()' in Fetch.</a>
   */
  public Headers(@Nonnull final JsPropertyMap<String> init) {
  }

  /**
   * The Headers() constructor creates a new Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers">Headers.Headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers">The definition of 'Headers()' in Fetch.</a>
   */
  public Headers() {
  }

  /**
   * The append() method of the Headers interface appends a new value onto an existing header inside a Headers object, or adds the header if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/append">Headers.append - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-append">The definition of 'append()' in Fetch.</a>
   */
  public native void append(@Nonnull String name, @Nonnull String value);

  /**
   * The delete() method of the Headers interface deletes a header from the current Headers object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/delete">Headers.delete - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-delete">The definition of 'delete()' in Fetch.</a>
   */
  public native void delete(@Nonnull String name);

  /**
   * The get() method of the Headers interface returns a byte string of all the values of a header within a Headers object with a given name. If the requested header doesn't exist in the Headers object, it returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/get">Headers.get - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-get">The definition of 'get()' in Fetch.</a>
   */
  @Nullable
  public native String get(@Nonnull String name);

  /**
   * The has() method of the Headers interface returns a boolean stating whether a Headers object contains a certain header.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/has">Headers.has - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-has">The definition of 'has()' in Fetch.</a>
   */
  public native boolean has(@Nonnull String name);

  /**
   * The set() method of the Headers interface sets a new value for an existing header inside a Headers object, or adds the header if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Headers/set">Headers.set - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-headers-set">The definition of 'set()' in Fetch.</a>
   */
  public native void set(@Nonnull String name, @Nonnull String value);
}
