package elemental3.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The interface XRInputSourceArray represents a live list of WebXR input sources, and is used as the return value of the XRSession property inputSources.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray">XRInputSourceArray - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray-interface">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSourceArray"
)
public class XRInputSourceArray {
  protected XRInputSourceArray() {
  }

  /**
   * The read-only length property returns an integer value indicating the number of items in the input source list represented by the XRInputSourceArray object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/length">XRInputSourceArray.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsOverlay
  @Nonnull
  public final XRInputSource getAt(final int index) {
    return Js.<JsArrayLike<XRInputSource>>cast( this ).getAt( index );
  }
}
