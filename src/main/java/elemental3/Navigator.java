package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import elemental3.bluetooth.Bluetooth;
import elemental3.media.MediaDevices;
import elemental3.xr.XRSystem;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Navigator interface represents the state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator">Navigator - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Navigator"
)
public class Navigator {
  protected Navigator() {
  }

  /**
   * The value of the NavigatorID.appCodeName property is always &quot;Mozilla&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/appCodeName">Navigator.appCodeName - MDN</a>
   */
  @JsProperty(
      name = "appCodeName"
  )
  @Nonnull
  public native String appCodeName();

  /**
   * The value of the NavigatorID.appName property is always &quot;Netscape&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/appName">Navigator.appName - MDN</a>
   */
  @JsProperty(
      name = "appName"
  )
  @Nonnull
  public native String appName();

  /**
   * Returns either &quot;4.0&quot; or a string representing version information about the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/appVersion">Navigator.appVersion - MDN</a>
   */
  @JsProperty(
      name = "appVersion"
  )
  @Nonnull
  public native String appVersion();

  @JsProperty(
      name = "bluetooth"
  )
  @Nonnull
  public native Bluetooth bluetooth();

  /**
   * The Clipboard API adds to the Navigator interface the read-only clipboard property, which returns the Clipboard object used to read and write the clipboard's contents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/clipboard">Navigator.clipboard - MDN</a>
   */
  @JsProperty(
      name = "clipboard"
  )
  @Nonnull
  public native Clipboard clipboard();

  /**
   * navigator.cookieEnabled returns a Boolean value that indicates whether cookies are enabled or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/cookieEnabled">Navigator.cookieEnabled - MDN</a>
   */
  @JsProperty(
      name = "cookieEnabled"
  )
  public native boolean cookieEnabled();

  /**
   * The credentials property of the Navigator interface returns the CredentialsContainer interface, which exposes methods to request credentials. The CredentialsContainer interface also notifies the user agent when an interesting event occurs, such as a successful sign-in or sign-out. This interface can be used for feature detection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/credentials">Navigator.credentials - MDN</a>
   */
  @JsProperty(
      name = "credentials"
  )
  @Nonnull
  public native CredentialsContainer credentials();

  /**
   * The Navigator.geolocation read-only property returns a Geolocation object that gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/geolocation">Navigator.geolocation - MDN</a>
   */
  @JsProperty(
      name = "geolocation"
  )
  @Nonnull
  public native Geolocation geolocation();

  /**
   * The navigator.hardwareConcurrency read-only property returns the number of logical processors available to run threads on the user's computer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorConcurrentHardware/hardwareConcurrency">NavigatorConcurrentHardware.hardwareConcurrency - MDN</a>
   */
  @JsProperty(
      name = "hardwareConcurrency"
  )
  public native int hardwareConcurrency();

  /**
   * The NavigatorLanguage.language read-only property returns a string representing the preferred language of the user, usually the language of the browser UI.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/language">Navigator.language - MDN</a>
   */
  @JsProperty(
      name = "language"
  )
  @Nonnull
  public native String language();

  /**
   * The NavigatorLanguage.languages read-only property returns an array of DOMStrings representing the user's preferred languages. The language is described using BCP 47 language tags. In the returned array they are ordered by preference with the most preferred language first.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/languages">Navigator.languages - MDN</a>
   */
  @JsProperty(
      name = "languages"
  )
  @Nonnull
  public native JsArray<String> languages();

  /**
   * The maxTouchPoints read-only property of the Navigator interface returns the maximum number of simultaneous touch contact points are supported by the current device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/maxTouchPoints">Navigator.maxTouchPoints - MDN</a>
   */
  @JsProperty(
      name = "maxTouchPoints"
  )
  public native int maxTouchPoints();

  /**
   * The Navigator.mediaDevices read-only property returns a MediaDevices object, which provides access to connected media input devices like cameras and microphones, as well as screen sharing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/mediaDevices">Navigator.mediaDevices - MDN</a>
   */
  @JsProperty(
      name = "mediaDevices"
  )
  @Nonnull
  public native MediaDevices mediaDevices();

  /**
   * Returns a MimeTypeArray object, which contains a list of MimeType objects representing the MIME types recognized by the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorPlugins/mimeTypes">NavigatorPlugins.mimeTypes - MDN</a>
   */
  @JsProperty(
      name = "mimeTypes"
  )
  @Nonnull
  public native MimeTypeArray mimeTypes();

  /**
   * Returns the online status of the browser. The property returns a boolean value, with true meaning online and false meaning offline. The property sends updates whenever the browser's ability to connect to the network changes. The update occurs when the user follows links or when a script requests a remote page. For example, the property should return false when users click links soon after they lose internet connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/onLine">Navigator.onLine - MDN</a>
   */
  @JsProperty(
      name = "onLine"
  )
  public native boolean onLine();

  /**
   * The Navigator.oscpu property returns a string that identifies the current operating system.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/oscpu">Navigator.oscpu - MDN</a>
   */
  @JsProperty(
      name = "oscpu"
  )
  @Nonnull
  public native String oscpu();

  /**
   * The Navigator.permissions read-only property returns a Permissions object that can be used to query and update permission status of APIs covered by the Permissions API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/permissions">Navigator.permissions - MDN</a>
   */
  @JsProperty(
      name = "permissions"
  )
  @Nonnull
  public native Permissions permissions();

  /**
   * Returns a string representing the platform of the browser. The specification allows browsers to always return the empty string, so don't rely on this property to get a reliable answer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/platform">Navigator.platform - MDN</a>
   */
  @JsProperty(
      name = "platform"
  )
  @Nonnull
  public native String platform();

  /**
   * Returns a PluginArray object, listing the Plugin objects describing the plugins installed in the application.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorPlugins/plugins">NavigatorPlugins.plugins - MDN</a>
   */
  @JsProperty(
      name = "plugins"
  )
  @Nonnull
  public native PluginArray plugins();

  /**
   * The value of the NavigatorID.product property is always &quot;Gecko&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/product">Navigator.product - MDN</a>
   */
  @JsProperty(
      name = "product"
  )
  @Nonnull
  public native String product();

  /**
   * The Navigator.productSub read-only property returns the build number of the current browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/productSub">Navigator.productSub - MDN</a>
   */
  @JsProperty(
      name = "productSub"
  )
  @Nonnull
  public native String productSub();

  /**
   * The Navigator.serviceWorker read-only property returns the ServiceWorkerContainer object for the associated document, which provides access to registration, removal, upgrade, and communication with the ServiceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/serviceWorker">Navigator.serviceWorker - MDN</a>
   */
  @JsProperty(
      name = "serviceWorker"
  )
  @Nonnull
  public native ServiceWorkerContainer serviceWorker();

  /**
   * The NavigatorStorage.storage read-only property returns the singleton StorageManager object used to access the overall storage capabilities of the browser for the current site or app.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorStorage/storage">NavigatorStorage.storage - MDN</a>
   */
  @JsProperty(
      name = "storage"
  )
  @Nonnull
  public native StorageManager storage();

  /**
   * The NavigatorID.userAgent read-only property returns the user agent string for the current browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/userAgent">Navigator.userAgent - MDN</a>
   */
  @JsProperty(
      name = "userAgent"
  )
  @Nonnull
  public native String userAgent();

  /**
   * The value of the Navigator vendor property is always either &quot;Google Inc.&quot;, &quot;Apple Computer, Inc.&quot;, or (in Firefox) the empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vendor">Navigator.vendor - MDN</a>
   */
  @JsProperty(
      name = "vendor"
  )
  @Nonnull
  public native String vendor();

  /**
   * The value of the Navigator.vendorSub property is always the empty string, in any browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vendorSub">Navigator.vendorSub - MDN</a>
   */
  @JsProperty(
      name = "vendorSub"
  )
  @Nonnull
  public native String vendorSub();

  /**
   * The wakeLock read-only property returns a WakeLock interface which allows a document to acquire a screen wake lock. While a screen wake lock is active, the user agent will try to prevent the device from dimming the screen, turning it off completely, or showing a screensaver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/wakeLock">Navigator.wakeLock - MDN</a>
   */
  @JsProperty(
      name = "wakeLock"
  )
  @Nonnull
  public native WakeLock wakeLock();

  /**
   * The webdriver read-only property of the navigator interface indicates whether the user agent is controlled by automation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/webdriver">Navigator.webdriver - MDN</a>
   */
  @JsProperty(
      name = "webdriver"
  )
  public native boolean webdriver();

  /**
   * The read-only xr property provided by the Navigator or WorkerNavigator interface returns an XR object which can be used to access the WebXR Device API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/xr">Navigator.xr - MDN</a>
   */
  @JsProperty(
      name = "xr"
  )
  @Nonnull
  public native XRSystem xr();

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nullable BodyInit data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull ReadableStream data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull XMLHttpRequestBodyInit data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Blob data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull BufferSource data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull ArrayBufferView data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Int8Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Int16Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Int32Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint8Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint16Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint32Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Uint8ClampedArray data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Float32Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Float64Array data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull DataView data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull ArrayBuffer data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull FormData data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull URLSearchParams data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull String data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   */
  public native boolean sendBeacon(@Nonnull String url);

  /**
   * The Navigator.requestMediaKeySystemAccess() method returns a Promise which delivers a MediaKeySystemAccess object that can be used to access a particular media key system, which can in turn be used to create keys for decrypting a media stream. This method is part of the Encrypted Media Extensions API, which brings support for encrypted media and DRM-protected video to the web.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/requestMediaKeySystemAccess">Navigator.requestMediaKeySystemAccess - MDN</a>
   */
  @Nonnull
  public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(@Nonnull String keySystem,
      @Nonnull JsArray<MediaKeySystemConfiguration> supportedConfigurations);

  /**
   * The Navigator.requestMediaKeySystemAccess() method returns a Promise which delivers a MediaKeySystemAccess object that can be used to access a particular media key system, which can in turn be used to create keys for decrypting a media stream. This method is part of the Encrypted Media Extensions API, which brings support for encrypted media and DRM-protected video to the web.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/requestMediaKeySystemAccess">Navigator.requestMediaKeySystemAccess - MDN</a>
   */
  @Nonnull
  public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(@Nonnull String keySystem,
      @Nonnull MediaKeySystemConfiguration[] supportedConfigurations);

  /**
   * The Navigator.getGamepads() method returns an array of Gamepad objects, one for each gamepad connected to the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/getGamepads">Navigator.getGamepads - MDN</a>
   */
  @Nonnull
  public native JsArray<Gamepad> getGamepads();

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   */
  public native boolean vibrate(@Nonnull VibratePattern pattern);

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   */
  public native boolean vibrate(int pattern);

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   */
  public native boolean vibrate(@Nonnull JsArray<Double> pattern);

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   */
  public native boolean vibrate(@Nonnull Double[] pattern);

  /**
   * The navigator.share() method of the Web Share API invokes the native sharing mechanism of the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/share">Navigator.share - MDN</a>
   */
  @Nonnull
  public native Promise<Void> share(@Nonnull ShareData data);

  /**
   * The navigator.share() method of the Web Share API invokes the native sharing mechanism of the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/share">Navigator.share - MDN</a>
   */
  @Nonnull
  public native Promise<Void> share();

  /**
   * The Navigator method registerProtocolHandler() lets web sites register their ability to open or handle particular URL schemes (aka protocols).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/registerProtocolHandler">Navigator.registerProtocolHandler - MDN</a>
   */
  public native void registerProtocolHandler(@Nonnull String scheme, @Nonnull String url);

  public native void unregisterProtocolHandler(@Nonnull String scheme, @Nonnull String url);

  /**
   * The NavigatorID.taintEnabled() method always returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/taintEnabled">Navigator.taintEnabled - MDN</a>
   */
  public native boolean taintEnabled();

  /**
   * This method indicates whether the current browser is Java-enabled or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorPlugins/javaEnabled">NavigatorPlugins.javaEnabled - MDN</a>
   */
  public native boolean javaEnabled();
}
