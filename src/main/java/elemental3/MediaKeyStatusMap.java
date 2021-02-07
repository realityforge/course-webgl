package elemental3;

import elemental3.core.BufferSource;
import elemental3.core.JsArray;
import elemental3.core.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The MediaKeyStatusMap interface of the EncryptedMediaExtensions API is a read-only map of media key statuses by key IDs.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap">MediaKeyStatusMap - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#mediakeystatusmap-interface">MediaKeyStatusMap - Encrypted Media Extensions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeyStatusMap"
)
public class MediaKeyStatusMap {
  protected MediaKeyStatusMap() {
  }

  /**
   * The size read-only property of the MediaKeyStatusMap interface returns the number of key/value paIrs in the status map.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/size">MediaKeyStatusMap.size - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeystatusmap-size">size - Encrypted Media Extensions</a>
   */
  @JsProperty(
      name = "size"
  )
  public native int size();

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull BufferSource keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull BufferSource keyId);

  /**
   * The keys property of the MediaKeyStatusMap interface returns a new Iterator object, containing keys for each element in the status map, in insertion order
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/keys">MediaKeyStatusMap.keys - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nonnull
  public native JsIterator<BufferSource> keys();

  /**
   * The values property of the MediaKeyStatusMap interface returns a new Iterator object, containing values for each element in the status map, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/values">MediaKeyStatusMap.values - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nonnull
  public native JsIterator<String> values();

  /**
   * The entries() read-only property of the MediaKeyStatusMap interface returns a new Iterator object, containing an array of [key, value] pairs for each element in the status map, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/entries">MediaKeyStatusMap.entries - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nonnull
  public native JsIterator<Entry> entries();

  /**
   * The forEach property of the MediaKeyStatusMap interface calls callback once for each key-value pair in the status map, in insertion order. If an argument is present it will be passed to the callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/forEach">MediaKeyStatusMap.forEach - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native void forEach(@Nonnull ForEachCallback callback);

  /**
   * The forEach property of the MediaKeyStatusMap interface calls callback once for each key-value pair in the status map, in insertion order. If an argument is present it will be passed to the callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/forEach">MediaKeyStatusMap.forEach - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native void forEach(@Nonnull ForEachCallback2 callback);

  /**
   * The forEach property of the MediaKeyStatusMap interface calls callback once for each key-value pair in the status map, in insertion order. If an argument is present it will be passed to the callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/forEach">MediaKeyStatusMap.forEach - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
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
    public final BufferSource key() {
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
    void item(@Nonnull String value, BufferSource key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull String value, BufferSource key, @Nonnull MediaKeyStatusMap iterable);
  }
}
