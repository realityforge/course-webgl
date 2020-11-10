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
 * The XRInputSourceEventInit dictionary is used when calling the XRInputSourceEvent() constructor to provide configuration options for the newly-created XRInputSourceEvent object to take on.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit">XRInputSourceEventInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrinputsourceeventinit">The definition of 'XRInputSourceEventInit' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRInputSourceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static XRInputSourceEventInit create(@Nonnull final XRFrame frame,
      @Nonnull final XRInputSource inputSource) {
    return Js.<XRInputSourceEventInit>uncheckedCast( JsPropertyMap.of() ).frame( frame ).inputSource( inputSource );
  }

  /**
   * The XRInputSourceEventInit dictionary's property frame specifies an XRFrame providing information about the timestamp at which the new input source event took place, as well as access to the XRFrame method getPose() which can be used to map the coordinates of any XRReferenceSpace to the space in which the event took place.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/frame">XRInputSourceEventInit.frame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-frame">The definition of 'XRInputSourceEventInit.frame' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "frame"
  )
  @Nonnull
  XRFrame frame();

  /**
   * The XRInputSourceEventInit dictionary's property frame specifies an XRFrame providing information about the timestamp at which the new input source event took place, as well as access to the XRFrame method getPose() which can be used to map the coordinates of any XRReferenceSpace to the space in which the event took place.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/frame">XRInputSourceEventInit.frame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-frame">The definition of 'XRInputSourceEventInit.frame' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty
  void setFrame(@Nonnull XRFrame frame);

  /**
   * The XRInputSourceEventInit dictionary's property frame specifies an XRFrame providing information about the timestamp at which the new input source event took place, as well as access to the XRFrame method getPose() which can be used to map the coordinates of any XRReferenceSpace to the space in which the event took place.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/frame">XRInputSourceEventInit.frame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-frame">The definition of 'XRInputSourceEventInit.frame' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default XRInputSourceEventInit frame(@Nonnull final XRFrame frame) {
    setFrame( frame );
    return this;
  }

  /**
   * The XRInputSourceEventInit dictionary's inputSource property is used when calling the XRInputSourceEvent() constructor to specify the XRInputSource from which the newly-created event is being sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/inputSource">XRInputSourceEventInit.inputSource - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-inputsource">The definition of 'XRInputSourceEventInit.inputSource' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "inputSource"
  )
  @Nonnull
  XRInputSource inputSource();

  /**
   * The XRInputSourceEventInit dictionary's inputSource property is used when calling the XRInputSourceEvent() constructor to specify the XRInputSource from which the newly-created event is being sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/inputSource">XRInputSourceEventInit.inputSource - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-inputsource">The definition of 'XRInputSourceEventInit.inputSource' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty
  void setInputSource(@Nonnull XRInputSource inputSource);

  /**
   * The XRInputSourceEventInit dictionary's inputSource property is used when calling the XRInputSourceEvent() constructor to specify the XRInputSource from which the newly-created event is being sent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit/inputSource">XRInputSourceEventInit.inputSource - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceeventinit-inputsource">The definition of 'XRInputSourceEventInit.inputSource' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default XRInputSourceEventInit inputSource(@Nonnull final XRInputSource inputSource) {
    setInputSource( inputSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourceEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourceEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourceEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
