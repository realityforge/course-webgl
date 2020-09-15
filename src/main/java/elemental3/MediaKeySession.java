package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaKeySession interface of the EncryptedMediaExtensions API represents a context for message exchange with a content decryption module (CDM).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession">MediaKeySession - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeySession"
)
public class MediaKeySession extends EventTarget {
  @Nullable
  public EventHandler onkeystatuseschange;

  @Nullable
  public EventHandler onmessage;

  MediaKeySession() {
  }

  /**
   * The MediaKeySession.closed read-only property returns a Promise signaling when a MediaKeySession closes. This promise can only be fulfilled and is never rejected. Closing a session means that licenses and keys associated with it are no longer valid for decrypting media data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/closed">MediaKeySession.closed - MDN</a>
   */
  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  /**
   * The MediaKeySession.expiration read-only property returns the time after which the keys in the current session can no longer be used to decrypt media data, or NaN if no such time exists. This value is determined by the CDM and measured in milliseconds since January 1, 1970, UTC. This value may change during a session lifetime, such as when an action triggers the start of a window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/expiration">MediaKeySession.expiration - MDN</a>
   */
  @JsProperty(
      name = "expiration"
  )
  public native double expiration();

  /**
   * The MediaKeySession.keyStatuses read-only property returns a reference to a read-only MediaKeyStatusMap of the current session's keys and their statuses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/keyStatuses">MediaKeySession.keyStatuses - MDN</a>
   */
  @JsProperty(
      name = "keyStatuses"
  )
  @Nonnull
  public native MediaKeyStatusMap keyStatuses();

  /**
   * The MediaKeySession.sessionId is a read-only property that contains a unique string generated by the content decryption module (CDM) for the current media object and its associated keys or licenses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/sessionId">MediaKeySession.sessionId - MDN</a>
   */
  @JsProperty(
      name = "sessionId"
  )
  @Nonnull
  public native String sessionId();

  /**
   * The MediaKeySession.close() method notifies that the current media session is no longer needed, and that the content decryption module should release any resources associated with this object and close it. Then, it returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/close">MediaKeySession.close - MDN</a>
   */
  @Nonnull
  public native Promise<Void> close();

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull BufferSource initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull ArrayBufferView initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Int8Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Int16Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Int32Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint8Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint16Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint32Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Uint8ClampedArray initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Float32Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull Float64Array initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull DataView initData);

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   */
  @Nonnull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull ArrayBuffer initData);

  /**
   * The MediaKeySession.load() method returns a Promise that resolves to a boolean value after loading data for a specified session object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/load">MediaKeySession.load - MDN</a>
   */
  @Nonnull
  public native Promise<Boolean> load(@Nonnull String sessionId);

  /**
   * The MediaKeySession.remove() method returns a Promise after removing any session data associated with the current object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/remove">MediaKeySession.remove - MDN</a>
   */
  @Nonnull
  public native Promise<Void> remove();

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull BufferSource response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull ArrayBufferView response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Int8Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Int16Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Int32Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Uint8Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Uint16Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Uint32Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Uint8ClampedArray response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Float32Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull Float64Array response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull DataView response);

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   */
  @Nonnull
  public native Promise<Void> update(@Nonnull ArrayBuffer response);
}