package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Screen interface represents a screen, usually the one on which the current window is being rendered, and is obtained using window.screen.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Screen">Screen - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Screen"
)
public class Screen {
  Screen() {
  }

  @JsProperty(
      name = "availHeight"
  )
  public native int availHeight();

  @JsProperty(
      name = "availWidth"
  )
  public native int availWidth();

  @JsProperty(
      name = "colorDepth"
  )
  public native int colorDepth();

  @JsProperty(
      name = "height"
  )
  public native int height();

  @JsProperty(
      name = "orientation"
  )
  @Nonnull
  public native ScreenOrientation orientation();

  @JsProperty(
      name = "pixelDepth"
  )
  public native int pixelDepth();

  @JsProperty(
      name = "width"
  )
  public native int width();
}
