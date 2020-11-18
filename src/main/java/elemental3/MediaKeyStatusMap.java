package elemental3;

import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The MediaKeyStatusMap interface of the EncryptedMediaExtensions API is a read-only map of media key statuses by key IDs.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap">MediaKeyStatusMap - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#mediakeystatusmap-interface">The definition of 'MediaKeyStatusMap' in the 'Encrypted Media Extensions' specification.</a>
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
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeystatusmap-size">The definition of 'size' in the 'Encrypted Media Extensions' specification.</a>
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
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull ArrayBufferView keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Int8Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Int16Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Int32Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Uint8Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Uint16Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Uint32Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Uint8ClampedArray keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Float32Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull Float64Array keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull DataView keyId);

  /**
   * The get property of the MediaKeyStatusMap interface returns the value associated with the given key, or undefined if there is none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/get">MediaKeyStatusMap.get - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  @Nullable
  public native Any get(@Nonnull ArrayBuffer keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull BufferSource keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull ArrayBufferView keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Int8Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Int16Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Int32Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Uint8Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Uint16Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Uint32Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Uint8ClampedArray keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Float32Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull Float64Array keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull DataView keyId);

  /**
   * The has property of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyStatusMap/has">MediaKeyStatusMap.has - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/">Encrypted Media Extensions</a>
   */
  public native boolean has(@Nonnull ArrayBuffer keyId);
}
