package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebGLActiveInfo interface is part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getActiveAttrib() and WebGLRenderingContext.getActiveUniform() methods.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo">WebGLActiveInfo - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebGLActiveInfo"
)
public class WebGLActiveInfo {
  WebGLActiveInfo() {
  }

  /**
   * The read-only WebGLActiveInfo.name property represents the name of the requested data returned by calling the getActiveAttrib() or getActiveUniform() methods.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo/name">WebGLActiveInfo.name - MDN</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The read-only WebGLActiveInfo.size property is a Number representing the size of the requested data returned by calling the getActiveAttrib() or getActiveUniform() methods.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo/size">WebGLActiveInfo.size - MDN</a>
   */
  @JsProperty(
      name = "size"
  )
  public native int size();

  /**
   * The read-only WebGLActiveInfo.type property represents the type of the requested data returned by calling the getActiveAttrib() or getActiveUniform() methods.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLActiveInfo/type">WebGLActiveInfo.type - MDN</a>
   */
  @JsProperty(
      name = "type"
  )
  public native int type();
}
