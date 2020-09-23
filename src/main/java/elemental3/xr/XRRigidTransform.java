package elemental3.xr;

import elemental2.core.Float32Array;
import elemental3.DOMPointInit;
import elemental3.DOMPointReadOnly;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRRigidTransform is a WebXR API interface that represents the 3D geometric transform described by a position and orientation.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform">XRRigidTransform - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRRigidTransform"
)
public class XRRigidTransform {
  /**
   * The XRRigidTransform() constructor creates and returns a new XRRigidTransform object, representing the position and orientation of a point or object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform/XRRigidTransform">XRRigidTransform.XRRigidTransform - MDN</a>
   */
  public XRRigidTransform(@Nonnull final DOMPointInit position,
      @Nonnull final DOMPointInit orientation) {
  }

  /**
   * The XRRigidTransform() constructor creates and returns a new XRRigidTransform object, representing the position and orientation of a point or object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform/XRRigidTransform">XRRigidTransform.XRRigidTransform - MDN</a>
   */
  public XRRigidTransform(@Nonnull final DOMPointInit position) {
  }

  /**
   * The XRRigidTransform() constructor creates and returns a new XRRigidTransform object, representing the position and orientation of a point or object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform/XRRigidTransform">XRRigidTransform.XRRigidTransform - MDN</a>
   */
  public XRRigidTransform() {
  }

  /**
   * The read-only inverse property of the XRRigidTransform interface returns another XRRigidTransform object which is the inverse of its owning transform.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform/inverse">XRRigidTransform.inverse - MDN</a>
   */
  @JsProperty(
      name = "inverse"
  )
  @Nonnull
  public native XRRigidTransform inverse();

  /**
   * The read-only XRRigidTransform property matrix returns the transform matrix represented by the object. The returned matrix can then be premultiplied with a column vector to rotate the vector by the 3D rotation specified by the orientation, then translate it by the position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform/matrix">XRRigidTransform.matrix - MDN</a>
   */
  @JsProperty(
      name = "matrix"
  )
  @Nonnull
  public native Float32Array matrix();

  /**
   * The read-only XRRigidTransform property orientation is a DOMPointReadOnly containing a normalized quaternion (also called a unit quaternion or versor) specifying the rotational component of the transform represented by the object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform/orientation">XRRigidTransform.orientation - MDN</a>
   */
  @JsProperty(
      name = "orientation"
  )
  @Nonnull
  public native DOMPointReadOnly orientation();

  /**
   * The read-only XRRigidTransform property position is a DOMPointReadOnly object which provides the 3D point, specified in meters, describing the translation component of the transform.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRigidTransform/position">XRRigidTransform.position - MDN</a>
   */
  @JsProperty(
      name = "position"
  )
  @Nonnull
  public native DOMPointReadOnly position();
}