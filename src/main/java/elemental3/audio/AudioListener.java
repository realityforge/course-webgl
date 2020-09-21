package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioListener interface represents the position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener">AudioListener - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioListener"
)
public class AudioListener {
  protected AudioListener() {
  }

  /**
   * The forwardX read-only property of the AudioListener interface is an AudioParam representing the x value of the direction vector defining the forward direction the listener is pointing in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/forwardX">AudioListener.forwardX - MDN</a>
   */
  @JsProperty(
      name = "forwardX"
  )
  @Nonnull
  public native AudioParam forwardX();

  /**
   * The forwardY read-only property of the AudioListener interface is an AudioParam representing the y value of the direction vector defining the forward direction the listener is pointing in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/forwardY">AudioListener.forwardY - MDN</a>
   */
  @JsProperty(
      name = "forwardY"
  )
  @Nonnull
  public native AudioParam forwardY();

  /**
   * The forwardZ read-only property of the AudioListener interface is an AudioParam representing the z value of the direction vector defining the forward direction the listener is pointing in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/forwardZ">AudioListener.forwardZ - MDN</a>
   */
  @JsProperty(
      name = "forwardZ"
  )
  @Nonnull
  public native AudioParam forwardZ();

  /**
   * The positionX read-only property of the AudioListener interface is an AudioParam representing the x position of the listener in 3D cartesian space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/positionX">AudioListener.positionX - MDN</a>
   */
  @JsProperty(
      name = "positionX"
  )
  @Nonnull
  public native AudioParam positionX();

  /**
   * The positionY read-only property of the AudioListener interface is an AudioParam representing the y position of the listener in 3D cartesian space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/positionY">AudioListener.positionY - MDN</a>
   */
  @JsProperty(
      name = "positionY"
  )
  @Nonnull
  public native AudioParam positionY();

  /**
   * The positionZ read-only property of the AudioListener interface is an AudioParam representing the z position of the listener in 3D cartesian space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/positionZ">AudioListener.positionZ - MDN</a>
   */
  @JsProperty(
      name = "positionZ"
  )
  @Nonnull
  public native AudioParam positionZ();

  /**
   * The upX read-only property of the AudioListener interface is an AudioParam representing the x value of the direction vector defining the up direction the listener is pointing in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/upX">AudioListener.upX - MDN</a>
   */
  @JsProperty(
      name = "upX"
  )
  @Nonnull
  public native AudioParam upX();

  /**
   * The upY read-only property of the AudioListener interface is an AudioParam representing the y value of the direction vector defining the up direction the listener is pointing in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/upY">AudioListener.upY - MDN</a>
   */
  @JsProperty(
      name = "upY"
  )
  @Nonnull
  public native AudioParam upY();

  /**
   * The upZ read-only property of the AudioListener interface is an AudioParam representing the z value of the direction vector defining the up direction the listener is pointing in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/upZ">AudioListener.upZ - MDN</a>
   */
  @JsProperty(
      name = "upZ"
  )
  @Nonnull
  public native AudioParam upZ();

  /**
   * Void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/setOrientation">AudioListener.setOrientation - MDN</a>
   */
  public native void setOrientation(float x, float y, float z, float xUp, float yUp, float zUp);

  /**
   * Void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioListener/setPosition">AudioListener.setPosition - MDN</a>
   */
  public native void setPosition(float x, float y, float z);
}
