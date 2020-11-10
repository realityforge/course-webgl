package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The VisualViewport interface of the Visual Viewport API represents the visual viewport for a given window. For a page containing iframes, each iframe, as well as the containing page, will have a unique window object. Each window on a page will have a unique VisualViewport representing the properties associated with that window.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport">VisualViewport - MDN</a>
 * @see <a href="https://wicg.github.io/visual-viewport/#the-visualviewport-interface">The definition of 'VisualViewport' in the 'Visual Viewport API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VisualViewport"
)
public class VisualViewport extends EventTarget {
  /**
   * The onresize event handler of the VisualViewport interface is called when a viewport is resized, i.e. when the resize event is fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/onresize">VisualViewport.onresize - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-onresize">The definition of 'onresize' in the 'Visual Viewport API' specification.</a>
   */
  @Nullable
  public EventHandler onresize;

  /**
   * The onscroll event handler of the VisualViewport interface is called when a viewport is scrolled, i.e. when the scroll event is fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/onscroll">VisualViewport.onscroll - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-onscroll">The definition of 'onscroll' in the 'Visual Viewport API' specification.</a>
   */
  @Nullable
  public EventHandler onscroll;

  protected VisualViewport() {
  }

  /**
   * The height read-only property of the VisualViewport interface returns the height of the visual viewport, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/height">VisualViewport.height - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-height">The definition of 'height' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "height"
  )
  public native double height();

  /**
   * The offsetLeft read-only property of the VisualViewport interface returns the offset of the left edge of the visual viewport from the left edge of the layout viewport in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/offsetLeft">VisualViewport.offsetLeft - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-offsetleft">The definition of 'offsetLeft' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "offsetLeft"
  )
  public native double offsetLeft();

  /**
   * The offsetTop read-only property of the VisualViewport interface returns the offset of the top edge of the visual viewport from the top edge of the layout viewport in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/offsetTop">VisualViewport.offsetTop - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-offsettop">The definition of 'offsetTop' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "offsetTop"
  )
  public native double offsetTop();

  /**
   * The pageLeft read-only property of the VisualViewport interface returns the x coordinate of the left edge of the visual viewport relative to the initial containing block origin, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/pageLeft">VisualViewport.pageLeft - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-pageleft">The definition of 'pageLeft' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "pageLeft"
  )
  public native double pageLeft();

  /**
   * The pageTop read-only property of the VisualViewport interface returns the y coordinate of the top edge of the visual viewport relative to the initial containing block origin, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/pageTop">VisualViewport.pageTop - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-pagetop">The definition of 'pageTop' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "pageTop"
  )
  public native double pageTop();

  /**
   * The scale read-only property of the VisualViewport interface returns the pinch-zoom scaling factor applied to the visual viewport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/scale">VisualViewport.scale - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-scale">The definition of 'scale' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "scale"
  )
  public native double scale();

  /**
   * The width read-only property of the VisualViewport interface returns the width of the visual viewport, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VisualViewport/width">VisualViewport.width - MDN</a>
   * @see <a href="https://wicg.github.io/visual-viewport/#dom-visualviewport-width">The definition of 'width' in the 'Visual Viewport API' specification.</a>
   */
  @JsProperty(
      name = "width"
  )
  public native double width();

  @JsOverlay
  public final void addResizeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "resize", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final EventListener callback) {
    addEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "resize", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final EventListener callback) {
    removeEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "scroll", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback) {
    addEventListener( "scroll", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "scroll", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback) {
    removeEventListener( "scroll", Js.cast( callback ) );
  }
}
