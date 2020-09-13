package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLIFrameElement interface provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement">HTMLIFrameElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLIFrameElement"
)
public class HTMLIFrameElement extends HTMLElement {
  @Nonnull
  public String allow;

  public boolean allowFullscreen;

  /**
   * The allowPaymentRequest property of the HTMLIFrameElement interface returns a Boolean indicating whether the Payment Request API may be invoked on a cross-origin iframe.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/allowPaymentRequest">HTMLIFrameElement.allowPaymentRequest - MDN</a>
   */
  public boolean allowPaymentRequest;

  @Nonnull
  public String height;

  @Nonnull
  public String name;

  /**
   * The HTMLIFrameElement.src property reflects the HTML referrerpolicy attribute of the iframe element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/src">HTMLIFrameElement.src - MDN</a>
   */
  @Nonnull
  public String src;

  /**
   * The srcdoc property of the HTMLIFrameElement specifies the content of the page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/srcdoc">HTMLIFrameElement.srcdoc - MDN</a>
   */
  @Nonnull
  public String srcdoc;

  @Nonnull
  public String width;

  @Nonnull
  public String align;

  @Nonnull
  public String frameBorder;

  @Nonnull
  public String longDesc;

  @Nonnull
  public String marginHeight;

  @Nonnull
  public String marginWidth;

  @Nonnull
  public String scrolling;

  /**
   * The HTMLIFrameElement.referrerPolicy property reflects the HTML referrerpolicy attribute of the iframe element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy">HTMLIFrameElement.referrerPolicy - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = ReferrerPolicy.class
  )
  public String referrerPolicy;

  @Nonnull
  @MagicConstant(
      valuesFromClass = LoadingType.class
  )
  public String loading;

  public HTMLIFrameElement() {
  }

  /**
   * If the iframe and the iframe's parent document are Same Origin, returns a Document (that is, the active document in the inline frame's nested browsing context), else returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/contentDocument">HTMLIFrameElement.contentDocument - MDN</a>
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
