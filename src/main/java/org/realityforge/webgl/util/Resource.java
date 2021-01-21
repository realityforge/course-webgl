package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class Resource<T>
{
  /**
   * GL context to which this resource belongs.
   * Most applications will use a single context and thus this field may be
   * eliminated in the future and the value retrieved from the singleton.
   */
  @Nonnull
  private final WebGL2RenderingContext _gl;
  @Nullable
  private T _handle;

  protected Resource( @Nonnull final WebGL2RenderingContext gl )
  {
    _gl = Objects.requireNonNull( gl );
  }

  @Nonnull
  protected WebGL2RenderingContext gl()
  {
    return _gl;
  }

  public boolean isResourceCreated()
  {
    return null != _handle;
  }

  @Nonnull
  protected T getHandle()
  {
    assert null != _handle;
    return _handle;
  }

  protected void setHandle( @Nullable final T handle )
  {
    _handle = handle;
  }
}
