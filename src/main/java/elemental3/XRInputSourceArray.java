package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The interface XRInputSourceArray represents a live list of WebXR input sources, and is used as the return value of the XRSession property inputSources.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray">XRInputSourceArray - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSourceArray"
)
public class XRInputSourceArray {
  XRInputSourceArray() {
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
}
