package org.realityforge.webgl.cube;

import java.util.Objects;
import javax.annotation.Nonnull;

final class Mesh
{
  @Nonnull
  private final Geometry _geometry;
  @Nonnull
  private final Material _material;

  Mesh( @Nonnull final Geometry geometry, @Nonnull final Material material )
  {
    _geometry = Objects.requireNonNull( geometry );
    _material = Objects.requireNonNull( material );
  }

  @Nonnull
  Geometry getGeometry()
  {
    return _geometry;
  }

  @Nonnull
  Material getMaterial()
  {
    return _material;
  }
}
