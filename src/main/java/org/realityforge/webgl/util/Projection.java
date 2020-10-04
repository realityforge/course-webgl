package org.realityforge.webgl.util;

import javax.annotation.Nonnull;
import org.joml.Math;
import org.joml.Matrix4d;

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

  /**
   * Update the matrix to be a perspective projection frustum transformation for a right-handed coordinate system.
   *
   * @param fovY        the vertical field of view in radians.
   * @param aspectRatio the aspect ratio (i.e. width / height; must be greater than zero)
   * @param zNear       this near clipping plane distance.
   * @param zFar        this far clipping plane distance.
   */
  public void setPerspective( final double fovY, final double aspectRatio, final double zNear, final double zFar )
  {
    assert fovY > 0 && fovY < Math.PI;
    assert aspectRatio > 0;
    getProjectionMatrix().perspective( fovY, aspectRatio, zNear, zFar );
  }
}
