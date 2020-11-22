package elemental3.xr;

import elemental3.Event;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API interface XRInputSourcesChangeEvent is used to represent the inputsourceschange event sent to an XRSession when the set of available WebXR input controllers changes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEvent">XRInputSourcesChangeEvent - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourceschangeevent">The definition of 'XRInputSourcesChangeEvent' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSourcesChangeEvent"
)
public class XRInputSourcesChangeEvent extends Event {
  /**
   * The XRInputSourcesChangeEvent() constructor creates and returns a new XRInputSourcesChangeEvent object, representing an update to the list of available WebXR input devices.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEvent/XRInputSourcesChangeEvent">XRInputSourcesChangeEvent.XRInputSourcesChangeEvent - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeevent-xrinputsourceschangeevent">The definition of 'XRInputSourcesChangeEvent()' in the 'WebXR Device API' specification.</a>
   */
  public XRInputSourcesChangeEvent(@Nonnull final String type,
      @Nonnull final XRInputSourcesChangeEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only XRInputSourcesChangeEvent property added is a list of zero or more input sources, each identified using an XRInputSource object, which have been newly made available for use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEvent/added">XRInputSourcesChangeEvent.added - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeevent-added">The definition of 'XRInputSourcesChangeEvent.added' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "added"
  )
  @Nonnull
  public native JsArray<XRInputSource> added();

  /**
   * The read-only XRInputSourcesChangeEvent property removed is an array of zero or more XRInputSource objects representing the input sources which have been removed from the XRSession.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEvent/removed">XRInputSourcesChangeEvent.removed - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeevent-removed">The definition of 'XRInputSourcesChangeEvent.removed' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "removed"
  )
  @Nonnull
  public native JsArray<XRInputSource> removed();

  /**
   * The XRInputSourcesChangeEvent property session specifies the XRSession to which the input source list change event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEvent/session">XRInputSourcesChangeEvent.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceschangeevent-session">The definition of 'XRInputSourcesChangeEvent.session' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "session"
  )
  @Nonnull
  public native XRSession session();
}
