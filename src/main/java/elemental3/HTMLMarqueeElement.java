package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLMarqueeElement interface provides methods to manipulate marquee elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMarqueeElement">HTMLMarqueeElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMarqueeElement"
)
public class HTMLMarqueeElement extends HTMLElement {
  @Nonnull
  public String behavior;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String direction;

  @Nonnull
  public String height;

  public int hspace;

  public int loop;

  @Nullable
  public EventHandler onbounce;

  @Nullable
  public EventHandler onfinish;

  @Nullable
  public EventHandler onstart;

  public int scrollAmount;

  public int scrollDelay;

  public boolean trueSpeed;

  public int vspace;

  @Nonnull
  public String width;

  public HTMLMarqueeElement() {
  }

  public native void start();

  public native void stop();
}
