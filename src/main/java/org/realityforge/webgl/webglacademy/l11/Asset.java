package org.realityforge.webgl.webglacademy.l11;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@SuppressWarnings( "unused" )
@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public class Asset
{
  private String name;
  private double[] vertices;
  private double[] indices;

  @JsOverlay
  public final String getName()
  {
    return name;
  }

  @JsOverlay
  public final double[] getVertices()
  {
    return vertices;
  }

  @JsOverlay
  public final double[] getIndices()
  {
    return indices;
  }
}
