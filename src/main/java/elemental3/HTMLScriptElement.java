package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * HTML script elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of script elements (beyond the inherited HTMLElement interface).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLScriptElement">HTMLScriptElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLScriptElement"
)
public class HTMLScriptElement extends HTMLElement {
  public boolean async;

  @Nonnull
  public String charset;

  @Nullable
  @MagicConstant(
      valuesFromClass = CrossOriginType.class
  )
  public String crossOrigin;

  public boolean defer;

  @Nonnull
  public String event;

  @Nonnull
  public String htmlFor;

  @Nonnull
  public String integrity;

  public boolean noModule;

  /**
   * The referrerPolicy property of the HTMLScriptElement interface reflects the HTML referrerpolicy of the script element and fetches made by that script, defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLScriptElement/referrerPolicy">HTMLScriptElement.referrerPolicy - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = ReferrerPolicy.class
  )
  public String referrerPolicy;

  @Nonnull
  public String src;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  public HTMLScriptElement() {
  }
}
