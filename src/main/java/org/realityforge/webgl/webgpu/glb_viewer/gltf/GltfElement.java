package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Abstract type that contains properties common to top-level elements.
 */
@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public abstract class GltfElement
  extends GltfNode
{
  /**
   * Return the user-defined name of this object.
   *
   * @return the user-defined name of this object.
   */
  @JsProperty
  @Nullable
  public native String getName();
}
