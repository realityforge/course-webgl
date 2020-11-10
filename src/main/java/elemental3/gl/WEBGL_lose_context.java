package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_lose_context extension is part of the WebGL API and exposes functions to simulate losing and restoring a WebGLRenderingContext.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_lose_context">WEBGL_lose_context - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_lose_context/">The definition of 'WEBGL_lose_context' in the 'WEBGL_lose_context' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_lose_context {
  protected WEBGL_lose_context() {
  }

  /**
   * The WEBGL_lose_context.loseContext() method is part of the WebGL API and allows you to simulate losing the context of a WebGLRenderingContext context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_lose_context/loseContext">WEBGL_lose_context.loseContext - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_lose_context/">The definition of 'WEBGL_lose_context.loseContext' in the 'WEBGL_lose_context' specification.</a>
   */
  public native void loseContext();

  /**
   * The WEBGL_lose_context.restoreContext() method is part of the WebGL API and allows you to simulate restoring the context of a WebGLRenderingContext object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_lose_context/restoreContext">WEBGL_lose_context.restoreContext - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_lose_context/">The definition of 'WEBGL_lose_context.loseContext' in the 'WEBGL_lose_context' specification.</a>
   */
  public native void restoreContext();
}
