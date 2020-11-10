package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLDataListElement interface provides special properties (beyond the HTMLElement object interface it also has available to it by inheritance) to manipulate datalist elements and their content.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDataListElement">HTMLDataListElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmldatalistelement">The definition of 'HTMLDataListElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-datalist-element">The definition of 'HTMLDataListElement' in the 'HTML5' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDataListElement"
)
public class HTMLDataListElement extends HTMLElement {
  protected HTMLDataListElement() {
  }

  @JsProperty(
      name = "options"
  )
  @Nonnull
  public native HTMLCollection options();
}
