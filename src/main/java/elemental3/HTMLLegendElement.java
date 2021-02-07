package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLLegendElement is an interface allowing to access properties of the &lt;legend&gt; elements. It inherits properties and methods from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLegendElement">HTMLLegendElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmllegendelement">HTMLLegendElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/forms.html#the-legend-element">HTMLLegendElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-legend-element">HTMLLegendElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-21482039">HTMLLegendElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-21482039">HTMLLegendElement - Document Object Model (DOM) Level 1 Specification</a>
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
