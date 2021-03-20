package akasha.gl;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * Attributes that control the characteristics of the {@link akasha.gl.WebGLRenderingContext} or {@link akasha.gl.WebGL2RenderingContext} created.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface WebGLContextAttributes {
  @JsOverlay
  @Nonnull
  static WebGLContextAttributes create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * A flag that that hints that the user agent to reduce the latency by desynchronizing the canvas paint cycle from the event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.desynchronized - MDN</a>
   */
  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  /**
   * A flag that that hints that the user agent to reduce the latency by desynchronizing the canvas paint cycle from the event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.desynchronized - MDN</a>
   */
  @JsProperty
  void setAlpha(boolean alpha);

  /**
   * A flag that that hints that the user agent to reduce the latency by desynchronizing the canvas paint cycle from the event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.desynchronized - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes alpha(final boolean alpha) {
    setAlpha( alpha );
    return this;
  }

  /**
   * A flag that indicates whether or not to perform anti-aliasing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.antialias - MDN</a>
   */
  @JsProperty(
      name = "antialias"
  )
  boolean antialias();

  /**
   * A flag that indicates whether or not to perform anti-aliasing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.antialias - MDN</a>
   */
  @JsProperty
  void setAntialias(boolean antialias);

  /**
   * A flag that indicates whether or not to perform anti-aliasing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.antialias - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes antialias(final boolean antialias) {
    setAntialias( antialias );
    return this;
  }

  /**
   * A flag that indicates that the drawing buffer has a depth buffer of at least 16 bits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.depth - MDN</a>
   */
  @JsProperty(
      name = "depth"
  )
  boolean depth();

  /**
   * A flag that indicates that the drawing buffer has a depth buffer of at least 16 bits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.depth - MDN</a>
   */
  @JsProperty
  void setDepth(boolean depth);

  /**
   * A flag that indicates that the drawing buffer has a depth buffer of at least 16 bits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.depth - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes depth(final boolean depth) {
    setDepth( depth );
    return this;
  }

  /**
   * A flag that indicates if the canvas contains an alpha buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.desynchronized - MDN</a>
   */
  @JsProperty(
      name = "desynchronized"
  )
  boolean desynchronized();

  /**
   * A flag that indicates if the canvas contains an alpha buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.desynchronized - MDN</a>
   */
  @JsProperty
  void setDesynchronized(boolean desynchronized);

  /**
   * A flag that indicates if the canvas contains an alpha buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.desynchronized - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes desynchronized(final boolean desynchronized) {
    setDesynchronized( desynchronized );
    return this;
  }

  /**
   * A flag that indicates if a context will be created if the system performance is low or if no hardware GPU is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.failIfMajorPerformanceCaveat - MDN</a>
   */
  @JsProperty(
      name = "failIfMajorPerformanceCaveat"
  )
  boolean failIfMajorPerformanceCaveat();

  /**
   * A flag that indicates if a context will be created if the system performance is low or if no hardware GPU is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.failIfMajorPerformanceCaveat - MDN</a>
   */
  @JsProperty
  void setFailIfMajorPerformanceCaveat(boolean failIfMajorPerformanceCaveat);

  /**
   * A flag that indicates if a context will be created if the system performance is low or if no hardware GPU is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.failIfMajorPerformanceCaveat - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes failIfMajorPerformanceCaveat(
      final boolean failIfMajorPerformanceCaveat) {
    setFailIfMajorPerformanceCaveat( failIfMajorPerformanceCaveat );
    return this;
  }

  /**
   * A hint to the user agent indicating what configuration of GPU is suitable for the WebGL context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.powerPreference - MDN</a>
   */
  @JsProperty(
      name = "powerPreference"
  )
  @WebGLPowerPreference
  String powerPreference();

  /**
   * A hint to the user agent indicating what configuration of GPU is suitable for the WebGL context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.powerPreference - MDN</a>
   */
  @JsProperty
  void setPowerPreference(@WebGLPowerPreference @Nonnull String powerPreference);

  /**
   * A hint to the user agent indicating what configuration of GPU is suitable for the WebGL context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.powerPreference - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes powerPreference(
      @WebGLPowerPreference @Nonnull final String powerPreference) {
    setPowerPreference( powerPreference );
    return this;
  }

  /**
   * A flag that indicates that the page compositor will assume the drawing buffer contains colors with pre-multiplied alpha.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.premultipliedAlpha - MDN</a>
   */
  @JsProperty(
      name = "premultipliedAlpha"
  )
  boolean premultipliedAlpha();

  /**
   * A flag that indicates that the page compositor will assume the drawing buffer contains colors with pre-multiplied alpha.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.premultipliedAlpha - MDN</a>
   */
  @JsProperty
  void setPremultipliedAlpha(boolean premultipliedAlpha);

  /**
   * A flag that indicates that the page compositor will assume the drawing buffer contains colors with pre-multiplied alpha.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.premultipliedAlpha - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes premultipliedAlpha(final boolean premultipliedAlpha) {
    setPremultipliedAlpha( premultipliedAlpha );
    return this;
  }

  /**
   * A flag that controls whether the buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.preserveDrawingBuffer - MDN</a>
   */
  @JsProperty(
      name = "preserveDrawingBuffer"
  )
  boolean preserveDrawingBuffer();

  /**
   * A flag that controls whether the buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.preserveDrawingBuffer - MDN</a>
   */
  @JsProperty
  void setPreserveDrawingBuffer(boolean preserveDrawingBuffer);

  /**
   * A flag that controls whether the buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.preserveDrawingBuffer - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes preserveDrawingBuffer(final boolean preserveDrawingBuffer) {
    setPreserveDrawingBuffer( preserveDrawingBuffer );
    return this;
  }

  /**
   * A flag that indicates that the drawing buffer has a stencil buffer of at least 8 bits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.stencil - MDN</a>
   */
  @JsProperty(
      name = "stencil"
  )
  boolean stencil();

  /**
   * A flag that indicates that the drawing buffer has a stencil buffer of at least 8 bits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.stencil - MDN</a>
   */
  @JsProperty
  void setStencil(boolean stencil);

  /**
   * A flag that indicates that the drawing buffer has a stencil buffer of at least 8 bits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">WebGLContextAttributes.stencil - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default WebGLContextAttributes stencil(final boolean stencil) {
    setStencil( stencil );
    return this;
  }

  @JsProperty(
      name = "xrCompatible"
  )
  boolean xrCompatible();

  @JsProperty
  void setXrCompatible(boolean xrCompatible);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes xrCompatible(final boolean xrCompatible) {
    setXrCompatible( xrCompatible );
    return this;
  }
}
