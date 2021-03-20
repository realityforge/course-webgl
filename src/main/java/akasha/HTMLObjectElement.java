package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLObjectElement interface provides special properties and methods (beyond those on the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of &lt;object&gt; element, representing external resources.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement">HTMLObjectElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlobjectelement">HTMLObjectElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#the-object-element">HTMLObjectElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-9893177">HTMLObjectElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-9893177">HTMLObjectElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLObjectElement"
)
public class HTMLObjectElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String archive;

  @Nonnull
  public String border;

  @Nonnull
  public String code;

  @Nonnull
  public String codeBase;

  @Nonnull
  public String codeType;

  /**
   * The data property of the HTMLObjectElement interface returns a DOMString that reflects the data HTML attribute, specifying the address of a resource's data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/data">HTMLObjectElement.data - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-object-data">data - HTML Living Standard</a>
   */
  @Nonnull
  public String data;

  public boolean declare;

  /**
   * The height property of the HTMLObjectElement interface Returns a DOMString that reflects the height HTML attribute, specifying the displayed height of the resource in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/height">HTMLObjectElement.height - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dim-height">height - HTML Living Standard</a>
   */
  @Nonnull
  public String height;

  public int hspace;

  /**
   * The name property of the HTMLObjectElement interface returns a DOMString that reflects the name HTML attribute, specifying the name of the browsing context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/name">HTMLObjectElement.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-object-name">name - HTML Living Standard</a>
   */
  @Nonnull
  public String name;

  @Nonnull
  public String standby;

  /**
   * The type property of the HTMLObjectElement interface returns a DOMString that reflects the type HTML attribute, specifying the MIME type of the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/type">HTMLObjectElement.type - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-object-type">type - HTML Living Standard</a>
   */
  @Nonnull
  public String type;

  /**
   * The useMap property of the HTMLObjectElement interface returns a DOMString that reflects the usemap HTML attribute, specifying a map element to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/useMap">HTMLObjectElement.useMap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-object-usemap">useMap - HTML Living Standard</a>
   */
  @Nonnull
  public String useMap;

  public int vspace;

  /**
   * The width property of the HTMLObjectElement interface returns a DOMString that reflects the width HTML attribute, specifying the displayed width of the resource in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/width">HTMLObjectElement.width - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-dim-width">width - HTML Living Standard</a>
   */
  @Nonnull
  public String width;

  protected HTMLObjectElement() {
  }

  /**
   * The contentDocument read-only property of the HTMLObjectElement interface Returns a Document representing the active document of the object element's nested browsing context, if any; otherwise null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/contentDocument">HTMLObjectElement.contentDocument - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-object-contentwindow">contentDocument - HTML Living Standard</a>
   */
  @JsProperty(
      name = "contentDocument"
  )
  @Nullable
  public native Document contentDocument();

  /**
   * The contentWindow read-only property of the HTMLObjectElement interface returns a WindowProxy representing the window proxy of the object element's nested browsing context, if any; otherwise null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/contentWindow">HTMLObjectElement.contentWindow - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-object-contentwindow">contentWindow - HTML Living Standard</a>
   */
  @JsProperty(
      name = "contentWindow"
  )
  @Nullable
  public native Window contentWindow();

  /**
   * The form read-only property of the HTMLObjectElement interface Retuns a HTMLFormElement representing the object element's form owner, or null if there isn't one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/form">HTMLObjectElement.form - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-fae-form">form - HTML Living Standard</a>
   */
  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  /**
   * The validationMessage read-only property of the HTMLObjectElement interface returns a DOMString representing a localized message that describes the validation constraints that the control does not satisfy (if any). This is the empty string if the control is not a candidate for constraint validation (willValidate is false), or it satisfies its constraints.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/validationMessage">HTMLObjectElement.validationMessage - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-validationmessage">validationMessage - HTML Living Standard</a>
   */
  @JsProperty(
      name = "validationMessage"
  )
  @Nonnull
  public native String validationMessage();

  /**
   * The validity read-only property of the HTMLObjectElement interface returns a ValidityState with the validity states that this element is in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/validity">HTMLObjectElement.validity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-validity">validity - HTML Living Standard</a>
   */
  @JsProperty(
      name = "validity"
  )
  @Nonnull
  public native ValidityState validity();

  /**
   * The willValidate read-only property of the HTMLObjectElement interface returns a Boolean that indicates whether the element is a candidate for constraint validation. Always false for HTMLObjectElement objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/willValidate">HTMLObjectElement.willValidate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-willvalidate">willValidate - HTML Living Standard</a>
   */
  @JsProperty(
      name = "willValidate"
  )
  public native boolean willValidate();

  /**
   * The checkValidity() method of the HTMLObjectElement interface returns a Boolean that always is true, because object objects are never candidates for constraint validation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/checkValidity">HTMLObjectElement.checkValidity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-checkvalidity">checkValidity - HTML Living Standard</a>
   */
  public native boolean checkValidity();

  @Nullable
  public native Document getSVGDocument();

  public native boolean reportValidity();

  /**
   * The setCustomValidity() method of the HTMLObjectElement interface sets a custom validity message for the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLObjectElement/setCustomValidity">HTMLObjectElement.setCustomValidity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-setcustomvalidity">setCustomValidity - HTML Living Standard</a>
   */
  public native void setCustomValidity(@Nonnull String error);
}
