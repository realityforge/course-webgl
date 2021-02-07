package elemental3.xr;

import elemental3.EventInit;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRInputSourcesChangeEventInit dictionary is used to provide options to the XRInputSourcesChangeEvent() constructor in order to set the initial state of the new XRInputSourcesChangeEvent object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit">XRInputSourcesChangeEventInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrinputsourceschangeeventinit">XRInputSourcesChangeEventInit - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRInputSourcesChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static XRInputSourcesChangeEventInit create(@Nonnull final JsArray<XRInputSource> added,
      @Nonnull final JsArray<XRInputSource> removed, @Nonnull final XRSession session) {
    return Js.<XRInputSourcesChangeEventInit>uncheckedCast( JsPropertyMap.of() ).added( added ).removed( removed ).session( session );
  }

  /**
   * The XRInputSourcesChangeEventInit property added specifies a list of input sources, each identified using an XRInputSource object, which the represented inputsourceschange event is to indicate are newly available for use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/added">XRInputSourcesChangeEventInit.added - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-added">XRInputSourcesChangeEventInit.added - WebXR Device API</a>
   */
  @JsProperty(
      name = "added"
  )
  @Nonnull
  JsArray<XRInputSource> added();

  /**
   * The XRInputSourcesChangeEventInit property added specifies a list of input sources, each identified using an XRInputSource object, which the represented inputsourceschange event is to indicate are newly available for use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/added">XRInputSourcesChangeEventInit.added - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-added">XRInputSourcesChangeEventInit.added - WebXR Device API</a>
   */
  @JsProperty
  void setAdded(@Nonnull JsArray<XRInputSource> added);

  /**
   * The XRInputSourcesChangeEventInit property added specifies a list of input sources, each identified using an XRInputSource object, which the represented inputsourceschange event is to indicate are newly available for use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/added">XRInputSourcesChangeEventInit.added - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-added">XRInputSourcesChangeEventInit.added - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRInputSourcesChangeEventInit added(@Nonnull final JsArray<XRInputSource> added) {
    setAdded( added );
    return this;
  }

  /**
   * The XRInputSourcesChangeEventInit property removed is an array of zero or more XRInputSource objects, each representing one input source which has been removed from the XRSession.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/removed">XRInputSourcesChangeEventInit.removed - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-removed">XRInputSourcesChangeEventInit.removed - WebXR Device API</a>
   */
  @JsProperty(
      name = "removed"
  )
  @Nonnull
  JsArray<XRInputSource> removed();

  /**
   * The XRInputSourcesChangeEventInit property removed is an array of zero or more XRInputSource objects, each representing one input source which has been removed from the XRSession.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/removed">XRInputSourcesChangeEventInit.removed - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-removed">XRInputSourcesChangeEventInit.removed - WebXR Device API</a>
   */
  @JsProperty
  void setRemoved(@Nonnull JsArray<XRInputSource> removed);

  /**
   * The XRInputSourcesChangeEventInit property removed is an array of zero or more XRInputSource objects, each representing one input source which has been removed from the XRSession.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/removed">XRInputSourcesChangeEventInit.removed - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-removed">XRInputSourcesChangeEventInit.removed - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRInputSourcesChangeEventInit removed(@Nonnull final JsArray<XRInputSource> removed) {
    setRemoved( removed );
    return this;
  }

  /**
   * The XRInputSourcesChangeEventInit property session specifies the XRSession to which the input source list change event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/session">XRInputSourcesChangeEventInit.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-session">XRInputSourcesChangeEventInit.session - WebXR Device API</a>
   */
  @JsProperty(
      name = "session"
  )
  @Nonnull
  XRSession session();

  /**
   * The XRInputSourcesChangeEventInit property session specifies the XRSession to which the input source list change event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/session">XRInputSourcesChangeEventInit.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-session">XRInputSourcesChangeEventInit.session - WebXR Device API</a>
   */
  @JsProperty
  void setSession(@Nonnull XRSession session);

  /**
   * The XRInputSourcesChangeEventInit property session specifies the XRSession to which the input source list change event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit/session">XRInputSourcesChangeEventInit.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeeventinit-session">XRInputSourcesChangeEventInit.session - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRInputSourcesChangeEventInit session(@Nonnull final XRSession session) {
    setSession( session );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourcesChangeEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourcesChangeEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourcesChangeEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
