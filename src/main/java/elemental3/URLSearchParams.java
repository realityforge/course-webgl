package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * The URLSearchParams interface defines utility methods to work with the query string of a URL.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams">URLSearchParams - MDN</a>
 * @see <a href="https://url.spec.whatwg.org/#urlsearchparams">The definition of 'URLSearchParams' in URL.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "URLSearchParams"
)
public class URLSearchParams {
  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">The definition of 'URLSearchParams()' in URL.</a>
   */
  public URLSearchParams(@Nonnull final JsArray<JsArray<String>> init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">The definition of 'URLSearchParams()' in URL.</a>
   */
  public URLSearchParams(@Nonnull final JsArray<String>[] init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">The definition of 'URLSearchParams()' in URL.</a>
   */
  public URLSearchParams(@Nonnull final JsPropertyMap<String> init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">The definition of 'URLSearchParams()' in URL.</a>
   */
  public URLSearchParams(@Nonnull final String init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">The definition of 'URLSearchParams()' in URL.</a>
   */
  public URLSearchParams() {
  }

  /**
   * The append() method of the URLSearchParams interface appends a specified key/value pair as a new search parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/append">URLSearchParams.append - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-append">The definition of 'append()' in URL.</a>
   */
  public native void append(@Nonnull String name, @Nonnull String value);

  /**
   * The delete() method of the URLSearchParams interface deletes the given search parameter and all its associated values, from the list of all search parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/delete">URLSearchParams.delete - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-delete">The definition of 'delete()' in URL.</a>
   */
  public native void delete(@Nonnull String name);

  /**
   * The get() method of the URLSearchParams interface returns the first value associated to the given search parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/get">URLSearchParams.get - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-get">The definition of 'get()' in URL.</a>
   */
  @Nullable
  public native String get(@Nonnull String name);

  /**
   * The getAll() method of the URLSearchParams interface returns all the values associated with a given search parameter as an array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/getAll">URLSearchParams.getAll - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-getall">The definition of 'getAll()' in URL.</a>
   */
  @Nonnull
  public native JsArray<String> getAll(@Nonnull String name);

  /**
   * The has() method of the URLSearchParams interface returns a Boolean that indicates whether a parameter with the specified name exists.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/has">URLSearchParams.has - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-has">The definition of 'has()' in URL.</a>
   */
  public native boolean has(@Nonnull String name);

  /**
   * The set() method of the URLSearchParams interface sets the value associated with a given search parameter to the given value. If there were several matching values, this method deletes the others. If the search parameter doesn't exist, this method creates it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/set">URLSearchParams.set - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-set">The definition of 'set()' in URL.</a>
   */
  public native void set(@Nonnull String name, @Nonnull String value);

  /**
   * The URLSearchParams.sort() method sorts all key/value pairs contained in this object in place and returns undefined. The sort order is according to unicode code points of the keys. This method uses a stable sorting algorithm (i.e. the relative order between key/value pairs with equal keys will be preserved).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/sort">URLSearchParams.sort - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-sort">The definition of 'sort()' in URL.</a>
   */
  public native void sort();
}
