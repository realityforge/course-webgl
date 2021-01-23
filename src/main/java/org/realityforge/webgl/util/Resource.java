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
  protected final WebGL2RenderingContext gl()
  {
    return _gl;
  }

  public final boolean isAllocated()
  {
    return null != _handle;
  }

  @Nonnull
  protected final T getHandle()
  {
    assert null != _handle;
    return _handle;
  }

  protected final void setHandle( @Nullable final T handle )
  {
    _handle = handle;
  }

  /**
   * Allocate the underlying resource on the GPU and transfer data required to
   * initialize the resource. If a resource is already allocated then the existing
   * resource is {@link #release() released} and a new resource is allocated.
   */
  public void allocate()
  {
    release();
    setHandle( allocateResource() );
  }

  /**
   * If a resource has been allocated then deallocate the resource.
   */
  public final void release()
  {
    if ( isAllocated() )
    {
      final T handle = getHandle();
      setHandle( null );
      releaseResource( handle );
    }
  }

  /**
   * Allocate the underlying resource.
   *
   * @return the resource handle.
   */
  @Nonnull
  protected abstract T allocateResource();

  /**
   * Actually perform the release of the underlying resource.
   *
   * @param handle the resource handle.
   */
  protected abstract void releaseResource( @Nonnull T handle );
}
