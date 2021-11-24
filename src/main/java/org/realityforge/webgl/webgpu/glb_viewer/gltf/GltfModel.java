package org.realityforge.webgl.webgpu.glb_viewer.gltf;

import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public class GltfModel
{
  @JsProperty
  @Nullable
  public native GltfBufferView[] getBufferViews();

  @JsProperty
  @Nullable
  public native GltfImage[] getImages();
}
