package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ANGLE_instanced_arrays extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ANGLE_instanced_arrays">ANGLE_instanced_arrays - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/ANGLE_instanced_arrays/">ANGLE_instanced_arrays - ANGLE_instanced_arrays</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class ANGLE_instanced_arrays {
  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = 0x88FE;

  protected ANGLE_instanced_arrays() {
  }

  /**
   * The ANGLE_instanced_arrays.drawArraysInstancedANGLE() method of the WebGL API renders primitives from array data like the gl.drawArrays() method. In addition, it can execute multiple instances of the range of elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ANGLE_instanced_arrays/drawArraysInstancedANGLE">ANGLE_instanced_arrays.drawArraysInstancedANGLE - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/ANGLE_instanced_arrays/">ANGLE_instanced_arrays - ANGLE_instanced_arrays</a>
   */
  public native void drawArraysInstancedANGLE(int mode, int first, int count, int primcount);

  /**
   * The ANGLE_instanced_arrays.drawElementsInstancedANGLE() method of the WebGL API renders primitives from array data like the gl.drawElements() method. In addition, it can execute multiple instances of a set of elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ANGLE_instanced_arrays/drawElementsInstancedANGLE">ANGLE_instanced_arrays.drawElementsInstancedANGLE - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/ANGLE_instanced_arrays/">ANGLE_instanced_arrays - ANGLE_instanced_arrays</a>
   */
  public native void drawElementsInstancedANGLE(int mode, int count, int type, int offset,
      int primcount);

  /**
   * The ANGLE_instanced_arrays.vertexAttribDivisorANGLE() method of the WebGL API  modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives with ext.drawArraysInstancedANGLE() and ext.drawElementsInstancedANGLE().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ANGLE_instanced_arrays/vertexAttribDivisorANGLE">ANGLE_instanced_arrays.vertexAttribDivisorANGLE - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/ANGLE_instanced_arrays/">ANGLE_instanced_arrays - ANGLE_instanced_arrays</a>
   */
  public native void vertexAttribDivisorANGLE(int index, int divisor);
}
