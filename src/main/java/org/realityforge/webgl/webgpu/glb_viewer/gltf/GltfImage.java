package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Image data used to create a texture. Image MAY be referenced by an URI (or IRI) or a buffer view index.
 *
 * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#reference-image">Image</a>
 */
@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public final class GltfImage
  extends GltfElement
{
  /**
   * The URI (or IRI) of the image.
   *
   * @return the URI (or IRI) of the image.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_image_uri">image.uri</a>
   */
  @JsProperty
  @Nullable
  public native String getUri();

  /**
   * The image’s media type. This field MUST be defined when bufferView is defined.
   *
   * @return the image’s media type. This field MUST be defined when bufferView is defined.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_image_mimetype">image.mimeType</a>
   */
  @JsProperty
  @GltfImageMimeType
  @Nullable
  public native String getMimeType();

  /**
   * The index of the bufferView that contains the image. This field MUST NOT be defined when uri is defined.
   *
   * @return the index of the bufferView that contains the image. This field MUST NOT be defined when uri is defined.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_bufferview_bufferview">image.bufferView</a>
   */
  @JsProperty
  public native int getBufferView();

  @JsOverlay
  public boolean isBufferViewPresent()
  {
    return Js.asPropertyMap( this ).has( "bufferView" );
  }
}
