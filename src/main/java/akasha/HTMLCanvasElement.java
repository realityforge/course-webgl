package akasha;

import akasha.gl.TexImageSource;
import akasha.gl.WebGLContextAttributes;
import akasha.gl.WebGLContextEventListener;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The HTMLCanvasElement interface provides properties and methods for manipulating the layout and presentation of &lt;canvas&gt; elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement">HTMLCanvasElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlcanvaselement">HTMLCanvasElement - HTML Living Standard</a>
 * @see <a href="https://w3c.github.io/mediacapture-fromelement/#html-canvas-element-media-capture-extensions">HTMLCanvasElement - Media Capture from DOM Elements</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLCanvasElement"
)
public class HTMLCanvasElement extends HTMLElement implements TexImageSource {
  /**
   * The HTMLCanvasElement.height property is a positive integer reflecting the height HTML attribute of the canvas element interpreted in CSS pixels. When the attribute is not specified, or if it is set to an invalid value, like a negative, the default value of 150 is used.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/height">HTMLCanvasElement.height - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#attr-canvas-height">HTMLCanvasElement.height - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#attr-canvas-height">HTMLCanvasElement.height - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#attr-canvas-height">HTMLCanvasElement.height - HTML5</a>
   */
  public int height;

  /**
   * The HTMLCanvasElement.width property is a positive integer reflecting the width HTML attribute of the canvas element interpreted in CSS pixels. When the attribute is not specified, or if it is set to an invalid value, like a negative, the default value of 300 is used.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/width">HTMLCanvasElement.width - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#attr-canvas-width">HTMLCanvasElement.width - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#attr-canvas-width">HTMLCanvasElement.width - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#attr-canvas-width">HTMLCanvasElement.width - HTML5</a>
   */
  public int width;

  protected HTMLCanvasElement() {
  }

  /**
   * The HTMLCanvasElement.getContext() method returns a drawing context on the canvas, or null if the context identifier is not supported, or the canvas has already been set to a different context mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">HTMLCanvasElement.getContext - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/semantics-scripting.html#dom-htmlcanvaselement-getcontext">HTMLCanvasElement.getContext - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML5</a>
   */
  @Nullable
  public native RenderingContext getContext(@RenderContextType @Nonnull String contextId,
      @Nonnull CanvasRenderingContext2DSettings options);

  /**
   * The HTMLCanvasElement.getContext() method returns a drawing context on the canvas, or null if the context identifier is not supported, or the canvas has already been set to a different context mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">HTMLCanvasElement.getContext - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/semantics-scripting.html#dom-htmlcanvaselement-getcontext">HTMLCanvasElement.getContext - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML5</a>
   */
  @Nullable
  public native RenderingContext getContext(@RenderContextType @Nonnull String contextId,
      @Nonnull ImageBitmapRenderingContextSettings options);

  /**
   * The HTMLCanvasElement.getContext() method returns a drawing context on the canvas, or null if the context identifier is not supported, or the canvas has already been set to a different context mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">HTMLCanvasElement.getContext - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/semantics-scripting.html#dom-htmlcanvaselement-getcontext">HTMLCanvasElement.getContext - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML5</a>
   */
  @Nullable
  public native RenderingContext getContext(@RenderContextType @Nonnull String contextId,
      @Nonnull WebGLContextAttributes options);

  /**
   * The HTMLCanvasElement.getContext() method returns a drawing context on the canvas, or null if the context identifier is not supported, or the canvas has already been set to a different context mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext">HTMLCanvasElement.getContext - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/semantics-scripting.html#dom-htmlcanvaselement-getcontext">HTMLCanvasElement.getContext - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-getcontext">HTMLCanvasElement.getContext - HTML5</a>
   */
  @Nullable
  public native RenderingContext getContext(@RenderContextType @Nonnull String contextId);

  /**
   * The HTMLCanvasElement.toBlob() method creates a Blob object representing the image contained in the canvas; this file may be cached on the disk or stored in memory at the discretion of the user agent. If type is not specified, the image type is image/png. The created image is in a resolution of 96dpi.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toBlob">HTMLCanvasElement.toBlob - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML5</a>
   */
  public native void toBlob(@Nonnull BlobCallback _callback, @Nonnull String type,
      @DoNotAutobox @Nullable Object quality);

  /**
   * The HTMLCanvasElement.toBlob() method creates a Blob object representing the image contained in the canvas; this file may be cached on the disk or stored in memory at the discretion of the user agent. If type is not specified, the image type is image/png. The created image is in a resolution of 96dpi.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toBlob">HTMLCanvasElement.toBlob - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML5</a>
   */
  public native void toBlob(@Nonnull BlobCallback _callback, @Nonnull String type);

  /**
   * The HTMLCanvasElement.toBlob() method creates a Blob object representing the image contained in the canvas; this file may be cached on the disk or stored in memory at the discretion of the user agent. If type is not specified, the image type is image/png. The created image is in a resolution of 96dpi.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toBlob">HTMLCanvasElement.toBlob - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-toblob">HTMLCanvasElement.toBlob - HTML5</a>
   */
  public native void toBlob(@Nonnull BlobCallback _callback);

  /**
   * The HTMLCanvasElement.toDataURL() method returns a data URI containing a representation of the image in the format specified by the type parameter (defaults to PNG). The returned image is in a resolution of 96 dpi.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL">HTMLCanvasElement.toDataURL - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML5</a>
   */
  @Nonnull
  public native String toDataURL(@Nonnull String type, @DoNotAutobox @Nullable Object quality);

  /**
   * The HTMLCanvasElement.toDataURL() method returns a data URI containing a representation of the image in the format specified by the type parameter (defaults to PNG). The returned image is in a resolution of 96 dpi.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL">HTMLCanvasElement.toDataURL - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML5</a>
   */
  @Nonnull
  public native String toDataURL(@Nonnull String type);

  /**
   * The HTMLCanvasElement.toDataURL() method returns a data URI containing a representation of the image in the format specified by the type parameter (defaults to PNG). The returned image is in a resolution of 96 dpi.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toDataURL">HTMLCanvasElement.toDataURL - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#dom-canvas-todataurl">HTMLCanvasElement.toDataURL - HTML5</a>
   */
  @Nonnull
  public native String toDataURL();

  /**
   * The HTMLCanvasElement.transferControlToOffscreen() method transfers control to an OffscreenCanvas object, either on the main thread or on a worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen">HTMLCanvasElement.transferControlToOffscreen - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/canvas.html#dom-canvas-transfercontroltooffscreen">HTMLCanvasElement.transferControlToOffscreen() - HTML Living Standard</a>
   */
  @Nonnull
  public native OffscreenCanvas transferControlToOffscreen();

  @JsOverlay
  public final void addWebglcontextcreationerrorListener(
      @Nonnull final WebGLContextEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "webglcontextcreationerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWebglcontextcreationerrorListener(
      @Nonnull final WebGLContextEventListener callback, final boolean useCapture) {
    addEventListener( "webglcontextcreationerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWebglcontextcreationerrorListener(
      @Nonnull final WebGLContextEventListener callback) {
    addEventListener( "webglcontextcreationerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWebglcontextcreationerrorListener(
      @Nonnull final WebGLContextEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "webglcontextcreationerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWebglcontextcreationerrorListener(
      @Nonnull final WebGLContextEventListener callback, final boolean useCapture) {
    removeEventListener( "webglcontextcreationerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWebglcontextcreationerrorListener(
      @Nonnull final WebGLContextEventListener callback) {
    removeEventListener( "webglcontextcreationerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWebglcontextlostListener(@Nonnull final WebGLContextEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "webglcontextlost", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWebglcontextlostListener(@Nonnull final WebGLContextEventListener callback,
      final boolean useCapture) {
    addEventListener( "webglcontextlost", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWebglcontextlostListener(@Nonnull final WebGLContextEventListener callback) {
    addEventListener( "webglcontextlost", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWebglcontextlostListener(
      @Nonnull final WebGLContextEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "webglcontextlost", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWebglcontextlostListener(
      @Nonnull final WebGLContextEventListener callback, final boolean useCapture) {
    removeEventListener( "webglcontextlost", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWebglcontextlostListener(
      @Nonnull final WebGLContextEventListener callback) {
    removeEventListener( "webglcontextlost", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWebglcontextrestoredListener(
      @Nonnull final WebGLContextEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "webglcontextrestored", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWebglcontextrestoredListener(
      @Nonnull final WebGLContextEventListener callback, final boolean useCapture) {
    addEventListener( "webglcontextrestored", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWebglcontextrestoredListener(
      @Nonnull final WebGLContextEventListener callback) {
    addEventListener( "webglcontextrestored", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWebglcontextrestoredListener(
      @Nonnull final WebGLContextEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "webglcontextrestored", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWebglcontextrestoredListener(
      @Nonnull final WebGLContextEventListener callback, final boolean useCapture) {
    removeEventListener( "webglcontextrestored", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWebglcontextrestoredListener(
      @Nonnull final WebGLContextEventListener callback) {
    removeEventListener( "webglcontextrestored", Js.cast( callback ) );
  }
}
