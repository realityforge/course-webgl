package elemental3.xr;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRInputSource interface describes a single source of control input which is part of the user's WebXR-compatible virtual or augmented reality system.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource">XRInputSource - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrinputsource-interface">The definition of 'XRInputSource' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSource"
)
public class XRInputSource {
  protected XRInputSource() {
  }

  /**
   * The read-only XRInputSource property gripSpace returns an XRSpace whose native origin tracks the pose used to render virtual objects so they appear to be held in (or part of) the user's hand.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/gripSpace">XRInputSource.gripSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-gripspace">The definition of 'XRInputSource.gripSpace' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "gripSpace"
  )
  @Nullable
  public native XRSpace gripSpace();

  /**
   * The read-only XRInputSource property handedness indicates which of the user's hands the WebXR input source is associated with, or if it's not associated with a hand at all.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/handedness">XRInputSource.handedness - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-handedness">The definition of 'XRInputSource.handedness' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "handedness"
  )
  @Nonnull
  @XRHandedness
  public native String handedness();

  /**
   * The read-only XRInputSource property profiles returns an array of strings, each describing a configuration profile for the input source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/profiles">XRInputSource.profiles - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-profiles">The definition of 'XRInputSource.profiles' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "profiles"
  )
  @Nonnull
  public native JsArray<String> profiles();

  /**
   * The read-only XRInputSource property targetRayMode indicates the method by which the target ray for the input source should be generated and how it should be presented to the user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/targetRayMode">XRInputSource.targetRayMode - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-targetraymode">The definition of 'XRInputSource.handedness' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "targetRayMode"
  )
  @Nonnull
  @XRTargetRayMode
  public native String targetRayMode();

  /**
   * The read-only XRInputSource property targetRaySpace returns an XRSpace (typically an XRReferenceSpace) representing the position and orientation of the target ray in the virtual space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/targetRaySpace">XRInputSource.targetRaySpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsource-targetrayspace">The definition of 'XRInputSource.targetRaySpace' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "targetRaySpace"
  )
  @Nonnull
  public native XRSpace targetRaySpace();
}
