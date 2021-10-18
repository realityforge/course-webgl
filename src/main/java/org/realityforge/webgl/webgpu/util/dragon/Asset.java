package org.realityforge.webgl.webgpu.util.dragon;

import akasha.Response;
import akasha.WindowGlobal;
import akasha.core.Float32Array;
import akasha.core.Uint32Array;
import akasha.gpu.GPUIndexFormat;
import akasha.promise.Promise;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@SuppressWarnings( { "unused", "UnstableApiUsage" } )
@JsType( isNative = true, name = "Object", namespace = JsPackage.GLOBAL )
public class Asset
{
  private String name;
  //Vertices are laid out as:
  // - 3 floats for position vertex,
  // - 3 floats for vertex normal,
  // - 2 floats for uv coordinates
  private double[] vertices;
  private double[] indices;

  @JsOverlay
  public static Promise<Asset> loadStanfordDragon()
  {
    return WindowGlobal
      .fetch( "assets/dragon.json" )
      .then( Response::json )
      .then( data -> Promise.resolve( data.<Asset>cast() ) );
  }

  @JsOverlay
  public final String getName()
  {
    return name;
  }

  @JsOverlay
  public final int components()
  {
    return 3 + 3 + 2;
  }

  @JsOverlay
  public final int vertexSize()
  {
    return Float.BYTES * components();
  }

  @JsOverlay
  public final int vertexCount()
  {
    return vertices.length / components();
  }

  @JsOverlay
  public final int vertexByteCount()
  {
    return vertices.length * Float32Array.BYTES_PER_ELEMENT;
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

  @JsOverlay
  @GPUIndexFormat
  @Nonnull
  public final String indexFormat()
  {
    return GPUIndexFormat.uint32;
  }

  @JsOverlay
  public final int indexCount()
  {
    return indices.length;
  }

  @JsOverlay
  public final int indexByteCount()
  {
    return indexCount() * Uint32Array.BYTES_PER_ELEMENT;
  }
}
