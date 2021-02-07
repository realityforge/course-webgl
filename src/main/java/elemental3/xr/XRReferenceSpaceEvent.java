package elemental3.xr;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API interface XRReferenceSpaceEvent represents an event sent to an XRReferenceSpace. Currently, the only event that uses this type is the reset event.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEvent">XRReferenceSpaceEvent - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrreferencespaceevent">XRReferenceSpaceEvent - WebXR Device API</a>
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
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-xrreferencespaceevent">XRReferenceSpaceEvent() - WebXR Device API</a>
   */
  public XRReferenceSpaceEvent(@Nonnull final String type,
      @Nonnull final XRReferenceSpaceEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only XRReferenceSpaceEvent property referenceSpace specifies the reference space which is the originator of the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEvent/referenceSpace">XRReferenceSpaceEvent.referenceSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-referencespace">XRReferenceSpaceEvent.referenceSpace - WebXR Device API</a>
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
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-transform">XRReferenceSpaceEvent.transform - WebXR Device API</a>
   */
  @JsProperty(
      name = "transform"
  )
  @Nullable
  public native XRRigidTransform transform();
}
