package elemental3.xr;

import elemental3.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRReferenceSpaceEventInit dictionary is used when calling the XRReferenceSpaceEvent() constructor to provide the values for its properties. Since the properties are read-only, this is the only opportunity available to set their values.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit">XRReferenceSpaceEventInit - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRReferenceSpaceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static XRReferenceSpaceEventInit create(@Nonnull final XRReferenceSpace referenceSpace) {
    return Js.<XRReferenceSpaceEventInit>uncheckedCast( JsPropertyMap.of() ).referenceSpace( referenceSpace );
  }

  /**
   * The XRReferenceSpaceEventInit property referenceSpace is used to establish the value of a newly-constructed XRReferenceSpaceEvent object when calling the XRReferenceSpaceEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/referenceSpace">XRReferenceSpaceEventInit.referenceSpace - MDN</a>
   */
  @JsProperty(
      name = "referenceSpace"
  )
  @Nonnull
  XRReferenceSpace referenceSpace();

  /**
   * The XRReferenceSpaceEventInit property referenceSpace is used to establish the value of a newly-constructed XRReferenceSpaceEvent object when calling the XRReferenceSpaceEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/referenceSpace">XRReferenceSpaceEventInit.referenceSpace - MDN</a>
   */
  @JsProperty
  void setReferenceSpace(@Nonnull XRReferenceSpace referenceSpace);

  /**
   * The XRReferenceSpaceEventInit property referenceSpace is used to establish the value of a newly-constructed XRReferenceSpaceEvent object when calling the XRReferenceSpaceEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/referenceSpace">XRReferenceSpaceEventInit.referenceSpace - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default XRReferenceSpaceEventInit referenceSpace(@Nonnull final XRReferenceSpace referenceSpace) {
    setReferenceSpace( referenceSpace );
    return this;
  }

  /**
   * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
   */
  @JsProperty(
      name = "transform"
  )
  XRRigidTransform transform();

  /**
   * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
   */
  @JsProperty
  void setTransform(@Nonnull XRRigidTransform transform);

  /**
   * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default XRReferenceSpaceEventInit transform(@Nonnull final XRRigidTransform transform) {
    setTransform( transform );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRReferenceSpaceEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRReferenceSpaceEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRReferenceSpaceEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}