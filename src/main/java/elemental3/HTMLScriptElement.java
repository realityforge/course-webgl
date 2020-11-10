package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * HTML script elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of script elements (beyond the inherited HTMLElement interface).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLScriptElement">HTMLScriptElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlscriptelement">The definition of 'HTMLScriptElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/scripting-1.html#the-script-element">The definition of 'HTMLScriptElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/scripting-1.html#the-script-element">The definition of 'HTMLScriptElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-81598695">The definition of 'HTMLScriptElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-81598695">The definition of 'HTMLScriptElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
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
  @CrossOriginType
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
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">The definition of 'referrerpolicy attribute' in the 'Referrer Policy' specification.</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-script-referrerpolicy">The definition of 'HTMLScriptElement: referrerPolicy' in the 'HTML Living Standard' specification.</a>
   */
  @Nonnull
  @ReferrerPolicy
  public String referrerPolicy;

  @Nonnull
  public String src;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  protected HTMLScriptElement() {
  }
}
