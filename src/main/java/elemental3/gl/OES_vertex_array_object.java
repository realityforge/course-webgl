package elemental3.gl;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OES_vertex_array_object extension is part of the WebGL API and provides vertex array objects (VAOs) which encapsulate vertex array states. These objects keep pointers to vertex data and provide names for different sets of vertex data.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_vertex_array_object">OES_vertex_array_object - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/">The definition of 'OES_vertex_array_object' in the 'OES_vertex_array_object' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class OES_vertex_array_object {
  @JsOverlay
  public static final int VERTEX_ARRAY_BINDING_OES = 0x85B5;

  protected OES_vertex_array_object() {
  }

  /**
   * The OES_vertex_array_object.bindVertexArrayOES() method of the WebGL API binds a passed WebGLVertexArrayObject object to the buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_vertex_array_object/bindVertexArrayOES">OES_vertex_array_object.bindVertexArrayOES - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/">The definition of 'OES_vertex_array_object' in the 'OES_vertex_array_object' specification.</a>
   */
  public native void bindVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);

  /**
   * The OES_vertex_array_object.createVertexArrayOES() method of the WebGL API creates and initializes a WebGLVertexArrayObject object that represents a vertex array object (VAO) pointing to vertex array data and which provides names for different sets of vertex data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_vertex_array_object/createVertexArrayOES">OES_vertex_array_object.createVertexArrayOES - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/">The definition of 'OES_vertex_array_object' in the 'OES_vertex_array_object' specification.</a>
   */
  @Nullable
  public native WebGLVertexArrayObjectOES createVertexArrayOES();

  /**
   * The OES_vertex_array_object.deleteVertexArrayOES() method of the WebGL API deletes a given WebGLVertexArrayObject object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_vertex_array_object/deleteVertexArrayOES">OES_vertex_array_object.deleteVertexArrayOES - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/">The definition of 'OES_vertex_array_object' in the 'OES_vertex_array_object' specification.</a>
   */
  public native void deleteVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);

  /**
   * The OES_vertex_array_object.isVertexArrayOES() method of the WebGL API returns true if the passed object is a WebGLVertexArrayObject object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_vertex_array_object/isVertexArrayOES">OES_vertex_array_object.isVertexArrayOES - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_vertex_array_object/">The definition of 'OES_vertex_array_object' in the 'OES_vertex_array_object' specification.</a>
   */
  public native boolean isVertexArrayOES(@Nullable WebGLVertexArrayObjectOES arrayObject);
}
