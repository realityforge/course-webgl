package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class AppState
{
  @Nonnull
  private final WebGL2RenderingContext _context;
  @Nullable
  private WebGLVertexArrayObject _vertexArrayObject;

  AppState( @Nonnull final WebGL2RenderingContext context )
  {
    _context = context;
  }

  public interface Action
  {
    void run( @Nonnull WebGL2RenderingContext gl );
  }

  public static AppState create( @Nonnull final WebGL2RenderingContext context )
  {
    return new AppState( context );
  }

  @Nonnull
  public static AppState get()
  {
    return AppStateHolder.getAppState();
  }

  public void in( @Nonnull final Action action )
  {
    AppStateHolder.inAppState( this, action );
  }

  @Nonnull
  public WebGL2RenderingContext getContext()
  {
    return _context;
  }

  public void bindVertexArrayObject( @Nonnull final WebGLVertexArrayObject vertexArrayObject )
  {
    if ( _vertexArrayObject != vertexArrayObject )
    {
      _vertexArrayObject = vertexArrayObject;
      _context.bindVertexArray( vertexArrayObject );
    }
  }
}
