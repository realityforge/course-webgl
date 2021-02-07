package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The HTMLSelectElement interface represents a &lt;select&gt; HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement">HTMLSelectElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlselectelement">HTMLSelectElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#htmlselectelement">HTMLSelectElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-94282980">HTMLSelectElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-94282980">HTMLSelectElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLSelectElement"
)
public class HTMLSelectElement extends HTMLElement {
  @Nonnull
  @AutocompleteType
  public String autocomplete;

  /**
   * The HTMLSelectElement.disabled is a Boolean that reflects the disabled HTML attribute, which indicates whether the control is disabled. If it is disabled, it does not accept clicks. A disabled element is unusable and un-clickable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/disabled">HTMLSelectElement.disabled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-fe-disabled">disabled - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-disabled">HTMLSelectElement - HTML5</a>
   */
  public boolean disabled;

  public int length;

  public boolean multiple;

  @Nonnull
  public String name;

  public boolean required;

  /**
   * The HTMLSelectElement.selectedIndex is a long that reflects the index of the first or last selected option element, depending on the value of multiple. The value -1 indicates that no element is selected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/selectedIndex">HTMLSelectElement.selectedIndex - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-selectedindex">HTMLSelectElement - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-selectedindex">HTMLSelectElement - HTML5</a>
   */
  public int selectedIndex;

  public int size;

  @Nonnull
  public String value;

  protected HTMLSelectElement() {
  }

  /**
   * The HTMLSelectElement.form read-only property returns a HTMLFormElement representing the form that this element is associated with. If the element is not associated with of a form element, then it returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/form">HTMLSelectElement.form - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-fae-form">form - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-form">HTMLSelectElement - HTML5</a>
   */
  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  /**
   * The HTMLSelectElement.labels read-only property returns a NodeList of the label elements associated with the select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/labels">HTMLSelectElement.labels - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">labels - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-lfe-labels">labels - HTML5</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

  /**
   * The HTMLSelectElement.options read-only property returns a HTMLOptionsCollection of the option elements contained by the select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/options">HTMLSelectElement.options - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-options">options - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#htmlselectelement">options - HTML5</a>
   */
  @JsProperty(
      name = "options"
  )
  @Nonnull
  public native HTMLOptionsCollection options();

  /**
   * The read-only HTMLSelectElement property selectedOptions contains a list of the option elements contained within the select element that are currently selected. The list of selected options is an HTMLCollection object with one entry per currently selected option.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/selectedOptions">HTMLSelectElement.selectedOptions - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#dom-select-selectedoptions">HTMLSelectElement.selectedOptions - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-selectedoptions">HTMLSelectElement.selectedOptions - HTML5</a>
   */
  @JsProperty(
      name = "selectedOptions"
  )
  @Nonnull
  public native HTMLCollection selectedOptions();

  /**
   * The HTMLSelectElement.type read-only property returns the form control's type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/type">HTMLSelectElement.type - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-type">HTMLSelectElement - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-type">HTMLSelectElement - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-58783172">HTMLSelectElement - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-58783172">HTMLSelectElement - Document Object Model (DOM) Level 1 Specification</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @JsProperty(
      name = "validationMessage"
  )
  @Nonnull
  public native String validationMessage();

  @JsProperty(
      name = "validity"
  )
  @Nonnull
  public native ValidityState validity();

  @JsProperty(
      name = "willValidate"
  )
  public native boolean willValidate();

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">HTMLSelectElement.add() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">HTMLSelectElement.add() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void add(@Nonnull HTMLOptionElement element, @Nonnull HTMLElement before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">HTMLSelectElement.add() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">HTMLSelectElement.add() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element, @Nonnull HTMLElement before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">HTMLSelectElement.add() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">HTMLSelectElement.add() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void add(@Nonnull HTMLOptionElement element, int before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">HTMLSelectElement.add() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">HTMLSelectElement.add() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element, int before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">HTMLSelectElement.add() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">HTMLSelectElement.add() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void add(@Nonnull HTMLOptionElement element);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">HTMLSelectElement.add() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">HTMLSelectElement.add() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">HTMLSelectElement.add() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element);

  /**
   * The HTMLSelectElement.checkValidity() method checks whether the element has any constraints and whether it satisfies them. If the element fails its constraints, the browser fires a cancelable invalid event at the element, and then returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/checkValidity">HTMLSelectElement.checkValidity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-checkvalidity">HTMLSelectElement.checkValidity() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-cva-checkvalidity">HTMLSelectElement.checkValidity() - HTML5</a>
   */
  public native boolean checkValidity();

  /**
   * The HTMLSelectElement.namedItem() method returns the HTMLOptionElement corresponding to the HTMLOptionElement whose name or id match the specified name, or null if no option matches.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/namedItem">HTMLSelectElement.namedItem - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-nameditem">HTMLSelectElement.namedItem() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-nameditem">HTMLSelectElement.namedItem() - HTML5</a>
   */
  @Nullable
  public native HTMLOptionElement namedItem(@Nonnull String name);

  /**
   * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/remove">HTMLSelectElement.remove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-remove">HTMLSelectElement.remove() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-remove">HTMLSelectElement.remove() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-33404570">HTMLSelectElement.remove() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-33404570">HTMLSelectElement.remove() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void remove();

  /**
   * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/remove">HTMLSelectElement.remove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-remove">HTMLSelectElement.remove() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-remove">HTMLSelectElement.remove() - HTML5</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-33404570">HTMLSelectElement.remove() - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-33404570">HTMLSelectElement.remove() - Document Object Model (DOM) Level 1 Specification</a>
   */
  public native void remove(int index);

  public native boolean reportValidity();

  /**
   * The HTMLSelectElement.setCustomValidity() method sets the custom validity message for the selection element to the specified message. Use the empty string to indicate that the element does not have a custom validity error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/setCustomValidity">HTMLSelectElement.setCustomValidity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-setcustomvalidity">HTMLSelectElement.setCustomValidity() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-cva-setcustomvalidity">HTMLSelectElement.setCustomValidity() - HTML5</a>
   */
  public native void setCustomValidity(@Nonnull String error);

  /**
   * The HTMLSelectElement.item() method returns the Element corresponding to the HTMLOptionElement whose position in the options list corresponds to the index given in the parameter, or null if there are none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/item">HTMLSelectElement.item - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-item">HTMLSelectElement.item() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-item">HTMLSelectElement.item() - HTML5</a>
   */
  @Nullable
  public native Element item(int index);

  @JsOverlay
  public final void setAt(final int index, @Nullable final HTMLOptionElement option) {
    Js.<JsArrayLike<HTMLOptionElement>>cast( this ).setAt( index, option );
  }
}
