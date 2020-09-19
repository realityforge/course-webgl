package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaDeviceInfo interface contains information that describes a single media input or output device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDeviceInfo">MediaDeviceInfo - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaDeviceInfo"
)
public class MediaDeviceInfo {
  MediaDeviceInfo() {
  }

  /**
   * The deviceId readonly property of the MediaDeviceInfo interface returns a DOMString that is an identifier for the represented device and is persisted across sessions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDeviceInfo/deviceId">MediaDeviceInfo.deviceId - MDN</a>
   */
  @JsProperty(
      name = "deviceId"
  )
  @Nonnull
  public native String deviceId();

  /**
   * The groupId readonly property of the MediaDeviceInfo interface returns a DOMString that is a group identifier.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDeviceInfo/groupId">MediaDeviceInfo.groupId - MDN</a>
   */
  @JsProperty(
      name = "groupId"
  )
  @Nonnull
  public native String groupId();

  /**
   * The kind readonly property of the MediaDeviceInfo interface returns an enumerated value, that is either &quot;videoinput&quot;, &quot;audioinput&quot; or &quot;audiooutput&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDeviceInfo/kind">MediaDeviceInfo.kind - MDN</a>
   */
  @JsProperty(
      name = "kind"
  )
  @Nonnull
  @MediaDeviceKind
  public native String kind();

  /**
   * The label readonlyinline property of the MediaDeviceInfo interface returns a DOMString, that is a label describing this device (for example &quot;External USB Webcam&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDeviceInfo/label">MediaDeviceInfo.label - MDN</a>
   */
  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  @Nonnull
  public native Object toJSON();
}
