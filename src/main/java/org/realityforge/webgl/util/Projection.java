package org.realityforge.webgl.util;

import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;

/**
 * This is separated from the camera to handle the scenario where it is sometimes shared by multiple cameras.
 */
public final class Projection
{
  /**
   * The camera to clip space transform.
   */
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();

  @Nonnull
  public Matrix4d getProjectionMatrix()
  {
    return _projectionMatrix;
  }
}
