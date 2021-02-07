package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The RadioNodeList interface represents a collection of radio elements in a &lt;form&gt; or a &lt;fieldset&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RadioNodeList">RadioNodeList - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#radionodelist">RadioNodeList - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RadioNodeList"
)
public class RadioNodeList extends NodeList {
  /**
   * If the underlying element collection contains radio buttons, the RadioNodeList.value property represents the checked radio button. On retrieving the value property, the value of the currently checked radio button is returned as a string. If the collection does not contain any radio buttons or none of the radio buttons in the collection is in checked state, the empty string is returned. On setting the value property, the first radio button input element whose value property is equal to the new value will be set to checked.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RadioNodeList/value">RadioNodeList.value - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-radionodelist-value">RadioNodeList.value - HTML Living Standard</a>
   */
  @Nonnull
  public String value;

  protected RadioNodeList() {
  }
}
