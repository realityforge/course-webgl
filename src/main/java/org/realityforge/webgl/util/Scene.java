package org.realityforge.webgl.util;

import javax.annotation.Nonnull;
import org.realityforge.vecmath.Vector3f;

public final class Scene
{
  @Nonnull
  private final Vector3f _clearColor = new Vector3f( 0, 0, 0 );

  @Nonnull
  public Vector3f getClearColor()
  {
    return _clearColor;
  }

  public void setClearColor( @Nonnull final Vector3f clearColor )
  {
    _clearColor.set( clearColor );
  }
}
