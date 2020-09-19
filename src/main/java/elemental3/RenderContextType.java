package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to indicate how the control wraps text.
 */
@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RenderContextType.class
)
public @interface RenderContextType {
  /**
   * The context type designates a {@link CanvasRenderingContext2D}, a two-dimensional rendering context.
   */
  @Nonnull
  String _2d = "2d";

  /**
   * The context type designates a {@link ImageBitmapRenderingContext}.
   * The context provides functionality to replace the content of the canvas with a given ImageBitmap.
   */
  @Nonnull
  String bitmaprenderer = "bitmaprenderer";

  /**
   * The context type designates a {@link WebGLRenderingContext}, a three-dimensional rendering context.
   * This context is only available on browsers that implement WebGL version 1 (OpenGL ES 2.0).
   */
  @Nonnull
  String webgl = "webgl";

  /**
   * The context type designates a {@link WebGL2RenderingContext}, a three-dimensional rendering context.
   * This context is only available on browsers that implement WebGL version 2 (OpenGL ES 3.0).
   */
  @Nonnull
  String webgl2 = "webgl2";
}
