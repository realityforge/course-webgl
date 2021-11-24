package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * A view into a buffer generally representing a subset of the buffer.
 *
 * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#reference-bufferview">Buffer View</a>
 */
@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public final class GltfBufferView
  extends GltfElement
{
  /**
   * The index of the buffer.
   *
   * @return the index of the buffer.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_bufferview_buffer">bufferView.buffer</a>
   */
  @JsProperty
  public native int getBuffer();

  @JsOverlay
  public boolean isByteOffsetPresent()
  {
    return Js.asPropertyMap( this ).has( "byteOffset" );
  }

  /**
   * The offset into the buffer in bytes. Defaults to 0
   *
   * @return the offset into the buffer in bytes. Defaults to 0
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_bufferview_byteoffset">bufferView.byteOffset</a>
   */
  @JsOverlay
  public int getByteOffset()
  {
    return isByteOffsetPresent() ? _getByteOffset() : 0;
  }

  @JsProperty( name = "byteOffset" )
  public native int _getByteOffset();

  /**
   * The length of the bufferView in bytes.
   *
   * @return the length of the bufferView in bytes.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_bufferview_bytelength">bufferView.byteLength</a>
   */
  @JsProperty
  public native int getByteLength();

  @JsOverlay
  public boolean isByteStridePresent()
  {
    return Js.asPropertyMap( this ).has( "byteStride" );
  }

  /**
   * The stride, in bytes. Optional.
   *
   * @return the stride, in bytes. Optional.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_bufferview_bytestride">bufferView.byteStride</a>
   */
  @JsProperty
  public native int getByteStride();

  @JsOverlay
  public boolean isTargetPresent()
  {
    return Js.asPropertyMap( this ).has( "target" );
  }

  /**
   * The hint representing the intended GPU buffer type to use with this buffer view.
   *
   * @return the hint representing the intended GPU buffer type to use with this buffer view.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_bufferview_target">bufferView.target</a>
   */
  @JsProperty
  @GltfBufferTargetType
  public native int getTarget();
}
