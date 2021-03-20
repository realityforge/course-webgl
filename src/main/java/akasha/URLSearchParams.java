package akasha;

import akasha.lang.JsArray;
import akasha.lang.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * The URLSearchParams interface defines utility methods to work with the query string of a URL.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams">URLSearchParams - MDN</a>
 * @see <a href="https://url.spec.whatwg.org/#urlsearchparams">URLSearchParams - URL</a>
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
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">URLSearchParams() - URL</a>
   */
  public URLSearchParams(@Nonnull final JsArray<JsArray<String>> init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">URLSearchParams() - URL</a>
   */
  public URLSearchParams(@Nonnull final JsArray<String>[] init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">URLSearchParams() - URL</a>
   */
  public URLSearchParams(@Nonnull final JsPropertyMap<String> init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">URLSearchParams() - URL</a>
   */
  public URLSearchParams(@Nonnull final String init) {
  }

  /**
   * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams">URLSearchParams.URLSearchParams - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-urlsearchparams">URLSearchParams() - URL</a>
   */
  public URLSearchParams() {
  }

  /**
   * The append() method of the URLSearchParams interface appends a specified key/value pair as a new search parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/append">URLSearchParams.append - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-append">append() - URL</a>
   */
  public native void append(@Nonnull String name, @Nonnull String value);

  /**
   * The delete() method of the URLSearchParams interface deletes the given search parameter and all its associated values, from the list of all search parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/delete">URLSearchParams.delete - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-delete">delete() - URL</a>
   */
  public native void delete(@Nonnull String name);

  /**
   * The get() method of the URLSearchParams interface returns the first value associated to the given search parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/get">URLSearchParams.get - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-get">get() - URL</a>
   */
  @Nullable
  public native String get(@Nonnull String name);

  /**
   * The getAll() method of the URLSearchParams interface returns all the values associated with a given search parameter as an array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/getAll">URLSearchParams.getAll - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-getall">getAll() - URL</a>
   */
  @Nonnull
  public native JsArray<String> getAll(@Nonnull String name);

  /**
   * The has() method of the URLSearchParams interface returns a Boolean that indicates whether a parameter with the specified name exists.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/has">URLSearchParams.has - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-has">has() - URL</a>
   */
  public native boolean has(@Nonnull String name);

  /**
   * The set() method of the URLSearchParams interface sets the value associated with a given search parameter to the given value. If there were several matching values, this method deletes the others. If the search parameter doesn't exist, this method creates it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/set">URLSearchParams.set - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-set">set() - URL</a>
   */
  public native void set(@Nonnull String name, @Nonnull String value);

  /**
   * The URLSearchParams.sort() method sorts all key/value pairs contained in this object in place and returns undefined. The sort order is according to unicode code points of the keys. This method uses a stable sorting algorithm (i.e. the relative order between key/value pairs with equal keys will be preserved).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/sort">URLSearchParams.sort - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#dom-urlsearchparams-sort">sort() - URL</a>
   */
  public native void sort();

  /**
   * The keys() method of the URLSearchParams interface returns an iterator allowing iteration through all keys contained in this object. The keys are USVString objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/keys">URLSearchParams.keys - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#interface-urlsearchparams">keys() (see &quot;iterable&quot;) - URL</a>
   */
  @Nonnull
  public native JsIterator<String> keys();

  /**
   * The values() method of the URLsearchParams interface returns an iterator allowing iteration through all values contained in this object. The values are USVString objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/values">URLSearchParams.values - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#interface-urlsearchparams">values() (see &quot;iterable&quot;) - URL</a>
   */
  @Nonnull
  public native JsIterator<String> values();

  /**
   * The entries() method of the URLSearchParams interface returns an iterator allowing iteration through all key/value pairs contained in this object. The key and value of each pair are USVString objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/entries">URLSearchParams.entries - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#interface-urlsearchparams">entries() (see &quot;iterable&quot;) - URL</a>
   */
  @Nonnull
  public native JsIterator<Entry> entries();

  /**
   * The forEach() method of the URLSearchParams interface allows iteration through all values contained in this object via a callback function.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/forEach">URLSearchParams.forEach - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#interface-urlsearchparams">forEach() (see &quot;iterable&quot;) - URL</a>
   */
  public native void forEach(@Nonnull ForEachCallback callback);

  /**
   * The forEach() method of the URLSearchParams interface allows iteration through all values contained in this object via a callback function.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/forEach">URLSearchParams.forEach - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#interface-urlsearchparams">forEach() (see &quot;iterable&quot;) - URL</a>
   */
  public native void forEach(@Nonnull ForEachCallback2 callback);

  /**
   * The forEach() method of the URLSearchParams interface allows iteration through all values contained in this object via a callback function.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/forEach">URLSearchParams.forEach - MDN</a>
   * @see <a href="https://url.spec.whatwg.org/#interface-urlsearchparams">forEach() (see &quot;iterable&quot;) - URL</a>
   */
  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    @Nonnull
    public String key() {
      return getAtAsAny( 0 ).asString();
    }

    @JsOverlay
    @Nonnull
    public String value() {
      return getAtAsAny( 1 ).asString();
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
    void item(@Nonnull String value, String key, @Nonnull URLSearchParams iterable);
  }
}
