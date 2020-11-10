package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLLegendElement is an interface allowing to access properties of the legend elements. It inherits properties and methods from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLegendElement">HTMLLegendElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmllegendelement">The definition of 'HTMLLegendElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/forms.html#the-legend-element">The definition of 'HTMLLegendElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-legend-element">The definition of 'HTMLLegendElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-21482039">The definition of 'HTMLLegendElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-21482039">The definition of 'HTMLLegendElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLLegendElement"
)
public class HTMLLegendElement extends HTMLElement {
  @Nonnull
  public String align;

  protected HTMLLegendElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();
}
