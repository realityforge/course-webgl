package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Texture sampler properties for filtering and wrapping modes.
 *
 * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#reference-sampler">Sampler</a>
 */
@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public final class GltfSampler
  extends GltfElement
{
  /**
   * The magnification filter.
   *
   * @return the magnification filter.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_sampler_magfilter">sampler.magFilter</a>
   */
  @JsOverlay
  @GltfSamplerMagnificationFilter
  public int getMagFilter()
  {
    assert isMagFilterPresent();
    @GltfSamplerMagnificationFilter
    final int value = _getMagFilter();
    GltfSamplerMagnificationFilter.Util.assertValid( value );
    return value;
  }

  @JsProperty( name = "magFilter" )
  private native int _getMagFilter();

  @JsOverlay
  public boolean isMagFilterPresent()
  {
    return Js.asPropertyMap( this ).has( "magFilter" );
  }

  /**
   * The minification filter.
   *
   * @return the minification filter.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_sampler_minfilter">sampler.minFilter</a>
   */
  @JsOverlay
  @GltfSamplerMinificationFilter
  public int getMinFilter()
  {
    assert isMinFilterPresent();
    @GltfSamplerMinificationFilter
    final int value = _getMinFilter();
    GltfSamplerMinificationFilter.Util.assertValid( value );
    return value;
  }

  @JsProperty( name = "minFilter" )
  private native int _getMinFilter();

  @JsOverlay
  public boolean isMinFilterPresent()
  {
    return Js.asPropertyMap( this ).has( "minFilter" );
  }

  /**
   * The S (U) wrapping mode.
   *
   * @return the S (U) wrapping mode.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_sampler_wraps">sampler.wrapS</a>
   */
  @JsOverlay
  @GltfSamplerWrapMode
  public int getWrapS()
  {
    assert isWrapSPresent();
    @GltfSamplerWrapMode
    final int value = _getWrapS();
    GltfSamplerWrapMode.Util.assertValid( value );
    return value;
  }

  @JsProperty( name = "wrapS" )
  private native int _getWrapS();

  @JsOverlay
  public boolean isWrapSPresent()
  {
    return Js.asPropertyMap( this ).has( "wrapS" );
  }

  /**
   * The T (V) wrapping mode.
   *
   * @return the T (V) wrapping mode.
   * @see <a href="https://www.khronos.org/registry/glTF/specs/2.0/glTF-2.0.html#_sampler_wrapt">sampler.wrapT</a>
   */
  @JsOverlay
  @GltfSamplerWrapMode
  public int getWrapT()
  {
    assert isWrapTPresent();
    @GltfSamplerWrapMode
    final int value = _getWrapT();
    GltfSamplerWrapMode.Util.assertValid( value );
    return value;
  }

  @JsProperty( name = "wrapT" )
  private native int _getWrapT();

  @JsOverlay
  public boolean isWrapTPresent()
  {
    return Js.asPropertyMap( this ).has( "wrapT" );
  }
}
