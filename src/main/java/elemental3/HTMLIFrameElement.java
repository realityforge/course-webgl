package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLIFrameElement interface provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement">HTMLIFrameElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmliframeelement">HTMLIFrameElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#the-iframe-element">HTMLIFrameElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-50708718">HTMLIFrameElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-50708718">HTMLIFrameElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLIFrameElement"
)
public class HTMLIFrameElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String allow;

  public boolean allowFullscreen;

  @Nonnull
  public String frameBorder;

  @Nonnull
  public String height;

  @Nonnull
  @LoadingType
  public String loading;

  @Nonnull
  public String longDesc;

  @Nonnull
  public String marginHeight;

  @Nonnull
  public String marginWidth;

  @Nonnull
  public String name;

  /**
   * The HTMLIFrameElement.referrerPolicy property reflects the HTML referrerpolicy attribute of the iframe element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy">HTMLIFrameElement.referrerPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">referrerpolicy attribute - Referrer Policy</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-referrerpolicy">HTMLIFrameElement: referrerPolicy - HTML Living Standard</a>
   */
  @Nonnull
  @ReferrerPolicy
  public String referrerPolicy;

  @Nonnull
  public String scrolling;

  /**
   * The HTMLIFrameElement.src property reflects the HTML referrerpolicy attribute of the iframe element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/src">HTMLIFrameElement.src - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-src">HTMLIFrameElement: src - HTML Living Standard</a>
   */
  @Nonnull
  public String src;

  /**
   * The srcdoc property of the HTMLIFrameElement specifies the content of the page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/srcdoc">HTMLIFrameElement.srcdoc - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#attr-iframe-srcdoc">HTMLIFrameElement: srcdoc - HTML Living Standard</a>
   */
  @Nonnull
  public String srcdoc;

  @Nonnull
  public String width;

  protected HTMLIFrameElement() {
  }

  /**
   * If the iframe and the iframe's parent document are Same Origin, returns a Document (that is, the active document in the inline frame's nested browsing context), else returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/contentDocument">HTMLIFrameElement.contentDocument - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-contentdocument">HTMLIFrameElement: contentDocument - HTML Living Standard</a>
   */
  @JsProperty(
      name = "contentDocument"
  )
  @Nullable
  public native Document contentDocument();

  /**
   * The contentWindow property returns the Window object of an HTMLIFrameElement. You can use this Window object to access the iframe's document and its internal DOM. This attribute is read-only, but its properties can be manipulated like the global Window object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/contentWindow">HTMLIFrameElement.contentWindow - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-contentwindow">HTMLIFrameElement: contentWindow - HTML Living Standard</a>
   */
  @JsProperty(
      name = "contentWindow"
  )
  @Nullable
  public native Window contentWindow();

  @JsProperty(
      name = "sandbox"
  )
  @Nonnull
  public native DOMTokenList sandbox();

  @Nullable
  public native Document getSVGDocument();
}
