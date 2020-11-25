package elemental3.gl;

import elemental3.core.Int32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WEBGL_multi_draw"
)
public class WEBGL_multi_draw {
  protected WEBGL_multi_draw() {
  }

  public native void multiDrawArraysInstancedWEBGL(@DrawPrimitiveType int mode,
      @Nonnull Int32Array firstsList, int firstsOffset, @Nonnull Int32Array countsList,
      int countsOffset, @Nonnull Int32Array instanceCountsList, int instanceCountsOffset,
      int drawcount);

  public native void multiDrawArraysWEBGL(@DrawPrimitiveType int mode,
      @Nonnull Int32Array firstsList, int firstsOffset, @Nonnull Int32Array countsList,
      int countsOffset, int drawcount);

  public native void multiDrawElementsInstancedWEBGL(@DrawPrimitiveType int mode,
      @Nonnull Int32Array countsList, int countsOffset, int type, @Nonnull Int32Array offsetsList,
      int offsetsOffset, @Nonnull Int32Array instanceCountsList, int instanceCountsOffset,
      int drawcount);

  public native void multiDrawElementsWEBGL(@DrawPrimitiveType int mode,
      @Nonnull Int32Array countsList, int countsOffset, int type, @Nonnull Int32Array offsetsList,
      int offsetsOffset, int drawcount);
}
