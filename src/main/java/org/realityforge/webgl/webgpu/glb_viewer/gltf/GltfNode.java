package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import akasha.core.JsObject;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

/**
 * Abstract type that contains properties common to top-level elements as well as the container element.
 */
@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public abstract class GltfNode
  extends JsObject
{
  /**
   * Return a JSON object with extension-specific objects.
   *
   * @return a JSON object with extension-specific objects.
   */
  @JsProperty
  @Nullable
  public native JsPropertyMap<Any> getExtensions();

  /**
   * Return application-specific data.
   *
   * @return  application-specific data.
   */
  @JsProperty
  @Nullable
  public native JsPropertyMap<Any> getExtras();
}
