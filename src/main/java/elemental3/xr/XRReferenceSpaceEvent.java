package elemental3.xr;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API interface XRReferenceSpaceEvent represents an event sent to an XRReferenceSpace. Currently, the only event  that uses this type is the reset event.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEvent">XRReferenceSpaceEvent - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrreferencespaceevent">The definition of 'XRReferenceSpaceEvent' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRReferenceSpaceEvent"
)
public class XRReferenceSpaceEvent extends Event {
  /**
   * The XRReferenceSpaceEvent() constructor is used to create a new XRReferenceSpaceEvent object, which represents an event regarding the state of a WebXR reference space object, XRReferenceSpace.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEvent/XRReferenceSpaceEvent">XRReferenceSpaceEvent.XRReferenceSpaceEvent - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-xrreferencespaceevent">The definition of 'XRReferenceSpaceEvent()' in the 'WebXR Device API' specification.</a>
   */
  public XRReferenceSpaceEvent(@Nonnull final String type,
      @Nonnull final XRReferenceSpaceEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only XRReferenceSpaceEvent property referenceSpace specifies the reference space which is the originator of the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEvent/referenceSpace">XRReferenceSpaceEvent.referenceSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-referencespace">The definition of 'XRReferenceSpaceEvent.referenceSpace' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "referenceSpace"
  )
  @Nonnull
  public native XRReferenceSpace referenceSpace();

  /**
   * The read-only XRReferenceSpaceEvent property transform indicates the position and orientation of the affected referenceSpace's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEvent/transform">XRReferenceSpaceEvent.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-transform">The definition of 'XRReferenceSpaceEvent.transform' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "transform"
  )
  @Nullable
  public native XRRigidTransform transform();
}
