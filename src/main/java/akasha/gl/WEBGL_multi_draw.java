package akasha.gl;

import akasha.core.Int32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_multi_draw extension is part of the WebGL API and allows to render more than one primitive with a single function call. This can improve a WebGL application's performance as it reduces binding costs in the renderer and speeds up GPU thread time with uniform data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_multi_draw">WEBGL_multi_draw - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_multi_draw/">WEBGL_multi_draw - WEBGL_multi_draw</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WEBGL_multi_draw"
)
public class WEBGL_multi_draw implements WebGLCommonExtension {
  @JsOverlay
  public static final String NAME = "WEBGL_multi_draw";

  protected WEBGL_multi_draw() {
  }

  public native void multiDrawArraysInstancedWEBGL(@DrawMode int mode,
      @Nonnull Int32Array firstsList, int firstsOffset, @Nonnull Int32Array countsList,
      int countsOffset, @Nonnull Int32Array instanceCountsList, int instanceCountsOffset,
      int drawcount);

  public native void multiDrawArraysWEBGL(@DrawMode int mode, @Nonnull Int32Array firstsList,
      int firstsOffset, @Nonnull Int32Array countsList, int countsOffset, int drawcount);

  public native void multiDrawElementsInstancedWEBGL(@DrawMode int mode,
      @Nonnull Int32Array countsList, int countsOffset, int type, @Nonnull Int32Array offsetsList,
      int offsetsOffset, @Nonnull Int32Array instanceCountsList, int instanceCountsOffset,
      int drawcount);

  public native void multiDrawElementsWEBGL(@DrawMode int mode, @Nonnull Int32Array countsList,
      int countsOffset, int type, @Nonnull Int32Array offsetsList, int offsetsOffset,
      int drawcount);
}
