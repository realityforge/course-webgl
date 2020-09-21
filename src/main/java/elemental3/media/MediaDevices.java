package elemental3.media;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import elemental3.EventHandler;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The MediaDevices interface provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices">MediaDevices - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaDevices"
)
public class MediaDevices extends EventTarget {
  /**
   * The MediaDevices.ondevicechange property is an EventHandler which specifies a function to be called when the devicechange event occurs on a MediaDevices instance. This happens whenever the set of media devices available to the user agent and, by extension, to the web site or app has changed. You can at any time use enumerateDevices() to get the updated list of available devices.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/ondevicechange">MediaDevices.ondevicechange - MDN</a>
   */
  @Nullable
  public EventHandler ondevicechange;

  protected MediaDevices() {
  }

  /**
   * The MediaDevices method enumerateDevices() requests a list of the available media input and output devices, such as microphones, cameras, headsets, and so forth.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/enumerateDevices">MediaDevices.enumerateDevices - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<MediaDeviceInfo>> enumerateDevices();

  /**
   * The getSupportedConstraints() method of the MediaDevices interface returns an object based on the MediaTrackSupportedConstraints dictionary, whose member fields each specify one of the constrainable properties the user agent understands.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getSupportedConstraints">MediaDevices.getSupportedConstraints - MDN</a>
   */
  @Nonnull
  public native MediaTrackSupportedConstraints getSupportedConstraints();

  /**
   * The MediaDevices.getUserMedia() method prompts the user for permission to use a media input which produces a MediaStream with tracks containing the requested types of media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia">MediaDevices.getUserMedia - MDN</a>
   */
  @Nonnull
  public native Promise<MediaStream> getUserMedia(@Nonnull MediaStreamConstraints constraints);

  /**
   * The MediaDevices.getUserMedia() method prompts the user for permission to use a media input which produces a MediaStream with tracks containing the requested types of media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia">MediaDevices.getUserMedia - MDN</a>
   */
  @Nonnull
  public native Promise<MediaStream> getUserMedia();

  /**
   * The MediaDevices interface's getDisplayMedia() method prompts the user to select and grant permission to capture the contents of a display or portion thereof (such as a window) as a MediaStream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getDisplayMedia">MediaDevices.getDisplayMedia - MDN</a>
   */
  @Nonnull
  public native Promise<MediaStream> getDisplayMedia(
      @Nonnull DisplayMediaStreamConstraints constraints);

  /**
   * The MediaDevices interface's getDisplayMedia() method prompts the user to select and grant permission to capture the contents of a display or portion thereof (such as a window) as a MediaStream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getDisplayMedia">MediaDevices.getDisplayMedia - MDN</a>
   */
  @Nonnull
  public native Promise<MediaStream> getDisplayMedia();
}
