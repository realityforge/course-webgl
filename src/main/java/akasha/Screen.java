package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Screen interface represents a screen, usually the one on which the current window is being rendered, and is obtained using window.screen.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen">Screen - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#the-screen-interface">Screen - CSS Object Model (CSSOM) View Module</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Screen"
)
public class Screen {
  protected Screen() {
  }

  /**
   * The read-only Screen interface's availHeight property returns the height, in CSS pixels, of the space available for Web content on the screen. Since Screen is exposed on the Window interface's window.screen property, you access availHeight using window.screen.availHeight.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen/availHeight">Screen.availHeight - MDN</a>
   */
  @JsProperty(
      name = "availHeight"
  )
  public native int availHeight();

  /**
   * The Screen.availWidth property returns the amount of horizontal space (in pixels) available to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen/availWidth">Screen.availWidth - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-screen-availwidth">Screen.availWidth - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "availWidth"
  )
  public native int availWidth();

  /**
   * The Screen.colorDepth read-only property returns the color depth of the screen. Per the CSSOM, some implementations return 24 for compatibility reasons. See the browser compatibility section for those that don't.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen/colorDepth">Screen.colorDepth - MDN</a>
   */
  @JsProperty(
      name = "colorDepth"
  )
  public native int colorDepth();

  /**
   * The Screen.height read-only property returns the height of the screen in pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen/height">Screen.height - MDN</a>
   */
  @JsProperty(
      name = "height"
  )
  public native int height();

  /**
   * The orientation read-only property of the Screen interface returns the current orientation of the screen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen/orientation">Screen.orientation - MDN</a>
   * @see <a href="https://w3c.github.io/screen-orientation/#dom-screen-orientation">orientation - Screen Orientation API</a>
   */
  @JsProperty(
      name = "orientation"
  )
  @Nonnull
  public native ScreenOrientation orientation();

  /**
   * Returns the bit depth of the screen. Per the CSSOM, some implementations return 24 for compatibility reasons. See the browser compatibility section for those that don't.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen/pixelDepth">Screen.pixelDepth - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-screen-pixeldepth">Screen.pixelDepth - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "pixelDepth"
  )
  public native int pixelDepth();

  /**
   * The Screen.width read-only property returns the width of the screen in pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen/width">Screen.width - MDN</a>
   */
  @JsProperty(
      name = "width"
  )
  public native int width();
}
