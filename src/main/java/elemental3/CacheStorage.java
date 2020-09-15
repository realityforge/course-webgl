package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The CacheStorage interface represents the storage for Cache objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage">CacheStorage - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CacheStorage"
)
public class CacheStorage {
  CacheStorage() {
  }

  /**
   * The delete() method of the CacheStorage interface finds the Cache object matching the cacheName, and if found, deletes the Cache object and returns a Promise that resolves to true. If no Cache object is found, it resolves to false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/delete">CacheStorage.delete - MDN</a>
   */
  @Nonnull
  public native Promise<Boolean> delete(@Nonnull String cacheName);

  /**
   * The has() method of the CacheStorage interface returns a Promise that resolves to true if a Cache object matches the cacheName.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/has">CacheStorage.has - MDN</a>
   */
  @Nonnull
  public native Promise<Boolean> has(@Nonnull String cacheName);

  /**
   * The keys() method of the CacheStorage interface returns a Promise that will resolve with an array containing strings corresponding to all of the named Cache objects tracked by the CacheStorage object in the order they were created. Use this method to iterate over a list of all Cache objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/keys">CacheStorage.keys - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<String>> keys();

  /**
   * The match() method of the CacheStorage interface checks if a given Request or url string is a key for a stored Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/match">CacheStorage.match - MDN</a>
   */
  @Nonnull
  public native Promise<Any> match(@Nonnull RequestInfo request,
      @Nonnull MultiCacheQueryOptions options);

  /**
   * The match() method of the CacheStorage interface checks if a given Request or url string is a key for a stored Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/match">CacheStorage.match - MDN</a>
   */
  @Nonnull
  public native Promise<Any> match(@Nonnull Request request,
      @Nonnull MultiCacheQueryOptions options);

  /**
   * The match() method of the CacheStorage interface checks if a given Request or url string is a key for a stored Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/match">CacheStorage.match - MDN</a>
   */
  @Nonnull
  public native Promise<Any> match(@Nonnull String request,
      @Nonnull MultiCacheQueryOptions options);

  /**
   * The match() method of the CacheStorage interface checks if a given Request or url string is a key for a stored Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/match">CacheStorage.match - MDN</a>
   */
  @Nonnull
  public native Promise<Any> match(@Nonnull RequestInfo request);

  /**
   * The match() method of the CacheStorage interface checks if a given Request or url string is a key for a stored Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/match">CacheStorage.match - MDN</a>
   */
  @Nonnull
  public native Promise<Any> match(@Nonnull Request request);

  /**
   * The match() method of the CacheStorage interface checks if a given Request or url string is a key for a stored Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/match">CacheStorage.match - MDN</a>
   */
  @Nonnull
  public native Promise<Any> match(@Nonnull String request);

  /**
   * The open() method of the CacheStorage interface returns a Promise that resolves to the Cache object matching the cacheName.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CacheStorage/open">CacheStorage.open - MDN</a>
   */
  @Nonnull
  public native Promise<Cache> open(@Nonnull String cacheName);
}