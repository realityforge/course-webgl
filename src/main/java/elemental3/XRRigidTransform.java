package elemental3;

import elemental2.core.Float32Array;
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
  public XRRigidTransform(@Nonnull final DOMPointInit position,
      @Nonnull final DOMPointInit orientation) {
  }

  public XRRigidTransform(@Nonnull final DOMPointInit position) {
  }

  public XRRigidTransform() {
  }

  @JsProperty(
      name = "inverse"
  )
  @Nonnull
  public native XRRigidTransform inverse();

  @JsProperty(
      name = "matrix"
  )
  @Nonnull
  public native Float32Array matrix();

  @JsProperty(
      name = "orientation"
  )
  @Nonnull
  public native DOMPointReadOnly orientation();

  @JsProperty(
      name = "position"
  )
  @Nonnull
  public native DOMPointReadOnly position();
}
