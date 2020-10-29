package org.realityforge.webgl.webglacademy.l8;

import javax.annotation.Nonnull;
import org.realityforge.vecmath.Vector3f;

public final class Scene
{
  @Nonnull
  private final Vector3f _backgroundColor = new Vector3f( 0, 0, 0 );

  @Nonnull
  public Vector3f getBackgroundColor()
  {
    return _backgroundColor;
  }

  public void setBackgroundColor( @Nonnull final Vector3f backgroundColor )
  {
    _backgroundColor.set( backgroundColor );
  }
}
