package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The StorageEstimate dictionary is used by the StorageManager to provide estimates of the size of a site's or application's data store and how much of it is in use. The estimate() method returns an object that conforms to this dictionary when its Promise resolves.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate">StorageEstimate - MDN</a>
 * @see <a href="https://storage.spec.whatwg.org/#dictdef-storageestimate">StorageEstimate - Storage</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface StorageEstimate {
  @JsOverlay
  @Nonnull
  static StorageEstimate create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The StorageEstimate dictionary's quota property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. This value is an estimate to help prevent its use for fingerprinting&mdash;that is, identifying a device using an amalgamation of the values of seemingly innocuous properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/quota">StorageEstimate.quota - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-quota">quota - Storage</a>
   */
  @JsProperty(
      name = "quota"
  )
  int quota();

  /**
   * The StorageEstimate dictionary's quota property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. This value is an estimate to help prevent its use for fingerprinting&mdash;that is, identifying a device using an amalgamation of the values of seemingly innocuous properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/quota">StorageEstimate.quota - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-quota">quota - Storage</a>
   */
  @JsProperty
  void setQuota(int quota);

  /**
   * The StorageEstimate dictionary's quota property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. This value is an estimate to help prevent its use for fingerprinting&mdash;that is, identifying a device using an amalgamation of the values of seemingly innocuous properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/quota">StorageEstimate.quota - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-quota">quota - Storage</a>
   */
  @JsOverlay
  @Nonnull
  default StorageEstimate quota(final int quota) {
    setQuota( quota );
    return this;
  }

  /**
   * The StorageEstimate dictionary's usage property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. The value is an estimate because the user agent may use compression, duplication prevention techniques, and other methods to improve storage efficiency.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/usage">StorageEstimate.usage - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-usage">usage - Storage</a>
   */
  @JsProperty(
      name = "usage"
  )
  int usage();

  /**
   * The StorageEstimate dictionary's usage property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. The value is an estimate because the user agent may use compression, duplication prevention techniques, and other methods to improve storage efficiency.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/usage">StorageEstimate.usage - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-usage">usage - Storage</a>
   */
  @JsProperty
  void setUsage(int usage);

  /**
   * The StorageEstimate dictionary's usage property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. The value is an estimate because the user agent may use compression, duplication prevention techniques, and other methods to improve storage efficiency.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/usage">StorageEstimate.usage - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-usage">usage - Storage</a>
   */
  @JsOverlay
  @Nonnull
  default StorageEstimate usage(final int usage) {
    setUsage( usage );
    return this;
  }
}
