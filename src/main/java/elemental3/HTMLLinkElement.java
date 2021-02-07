package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLLinkElement interface represents reference information for external resources and the relationship of those resources to a document and vice-versa (corresponds to &lt;link&gt; element; not to be confused with &lt;a&gt;, which is represented by HTMLAnchorElement). This object inherits all of the properties and methods of the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement">HTMLLinkElement - MDN</a>
 * @see <a href="https://w3c.github.io/preload/">Preload</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmllinkelement">HTMLLinkElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/document-metadata.html#the-link-element">HTMLLinkElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-link-element">HTMLLinkElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-35143001">HTMLLinkElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-35143001">HTMLLinkElement - Document Object Model (DOM) Level 1 Specification</a>
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
   * @see <a href="https://w3c.github.io/preload/#as-attribute">as - Preload</a>
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
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">referrerPolicy attribute - Referrer Policy</a>
   */
  @Nonnull
  @ReferrerPolicy
  public String referrerPolicy;

  /**
   * The HTMLLinkElement.rel property reflects the rel attribute. It is a DOMString containing a space-separated list of link types indicating the relationship between the resource represented by the link element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLinkElement/rel">HTMLLinkElement.rel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#attr-link-rel">rel - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-41369587">rel - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-41369587">rel - Document Object Model (DOM) Level 1 Specification</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/semantics.html#dom-link-rellist">relList - HTML Living Standard</a>
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
