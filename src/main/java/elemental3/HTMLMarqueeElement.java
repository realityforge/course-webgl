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
 * @see <a href="https://html.spec.whatwg.org/multipage/obsolete.html#htmlmarqueeelement">The definition of 'HTMLMarqueeElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/obsolete.html#htmlmarqueeelement">The definition of 'HTMLMarqueeElement' in the 'HTML 5.2' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/obsolete.html#htmlmarqueeelement-htmlmarqueeelement">The definition of 'HTMLMarqueeElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/obsolete.html#htmlmarqueeelement">The definition of 'HTMLMarqueeElement' in the 'HTML5' specification.</a>
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

  protected HTMLMarqueeElement() {
  }

  public native void start();

  public native void stop();
}
