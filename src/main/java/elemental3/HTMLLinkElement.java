package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLLinkElement interface represents reference information for external resources and the relationship of those resources to a document and vice-versa (corresponds to link element; not to be confused with a, which is represented by HTMLAnchorElement). This object inherits all of the properties and methods of the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement">HTMLLinkElement - MDN</a>
 * @see <a href="https://w3c.github.io/preload/">Preload</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmllinkelement">The definition of 'HTMLLinkElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/document-metadata.html#the-link-element">The definition of 'HTMLLinkElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-link-element">The definition of 'HTMLLinkElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-35143001">The definition of 'HTMLLinkElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-35143001">The definition of 'HTMLLinkElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLLinkElement"
)
public class HTMLLinkElement extends HTMLElement {
  /**
   * The as property of the HTMLLinkElement interface returns a DOMString representing the type of content being loaded by the HTML link, one of &quot;script&quot;, &quot;style&quot;, &quot;image&quot;, &quot;video&quot;, &quot;audio&quot;, &quot;track&quot;, &quot;font&quot;, &quot;fetch&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement/as">HTMLLinkElement.as - MDN</a>
   * @see <a href="https://w3c.github.io/preload/#as-attribute">The definition of 'as' in the 'Preload' specification.</a>
   */
  @Nonnull
  public String as;

  @Nonnull
  public String charset;

  @Nullable
  @CrossOriginType
  public String crossOrigin;

  public boolean disabled;

  @Nonnull
  public String href;

  @Nonnull
  public String hreflang;

  @Nonnull
  public String imageSizes;

  @Nonnull
  public String imageSrcset;

  @Nonnull
  public String integrity;

  @Nonnull
  public String media;

  /**
   * The HTMLLinkElement.referrerPolicy property reflect the HTML referrerpolicy attribute of the link element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement/referrerPolicy">HTMLLinkElement.referrerPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">The definition of 'referrerPolicy attribute' in the 'Referrer Policy' specification.</a>
   */
  @Nonnull
  @ReferrerPolicy
  public String referrerPolicy;

  /**
   * The HTMLLinkElement.rel property reflects the rel attribute. It is a DOMString containing a space-separated list of link types indicating the relationship between the resource represented by the link element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement/rel">HTMLLinkElement.rel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#attr-link-rel">The definition of 'rel' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-41369587">The definition of 'rel' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-41369587">The definition of 'rel' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public String rel;

  @Nonnull
  public String rev;

  @Nonnull
  public String target;

  @Nonnull
  public String type;

  protected HTMLLinkElement() {
  }

  /**
   * The HTMLLinkElement.relList read-only property reflects the rel attribute. It is a live DOMTokenList containing the set of link types indicating the relationship between the resource represented by the link element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement/relList">HTMLLinkElement.relList - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#dom-link-rellist">The definition of 'relList' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();

  @JsProperty(
      name = "sizes"
  )
  @Nonnull
  public native DOMTokenList sizes();
}
