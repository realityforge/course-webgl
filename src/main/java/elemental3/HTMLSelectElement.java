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
 * The HTMLSelectElement interface represents a select HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement">HTMLSelectElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlselectelement">The definition of 'HTMLSelectElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#htmlselectelement">The definition of 'HTMLSelectElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-94282980">The definition of 'HTMLSelectElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-94282980">The definition of 'HTMLSelectElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-fe-disabled">The definition of 'disabled' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-disabled">The definition of 'HTMLSelectElement' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-selectedindex">The definition of 'HTMLSelectElement' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-selectedindex">The definition of 'HTMLSelectElement' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-fae-form">The definition of 'form' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-form">The definition of 'HTMLSelectElement' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">The definition of 'labels' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-lfe-labels">The definition of 'labels' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-options">The definition of 'options' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#htmlselectelement">The definition of 'options' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/form-elements.html#dom-select-selectedoptions">The definition of 'HTMLSelectElement.selectedOptions' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-selectedoptions">The definition of 'HTMLSelectElement.selectedOptions' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-type">The definition of 'HTMLSelectElement' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-type">The definition of 'HTMLSelectElement' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-58783172">The definition of 'HTMLSelectElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-58783172">The definition of 'HTMLSelectElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void add(@Nonnull HTMLOptionElement element, @Nonnull HTMLElement before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element, @Nonnull HTMLElement before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void add(@Nonnull HTMLOptionElement element, int before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element, int before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void add(@Nonnull HTMLOptionElement element);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-add">The definition of 'HTMLSelectElement.add()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-14493106">The definition of 'HTMLSelectElement.add()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element);

  /**
   * The HTMLSelectElement.checkValidity() method checks whether the element has any constraints and whether it satisfies them. If the element fails its constraints, the browser fires a cancelable invalid event at the element, and then returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/checkValidity">HTMLSelectElement.checkValidity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-checkvalidity">The definition of 'HTMLSelectElement.checkValidity()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-cva-checkvalidity">The definition of 'HTMLSelectElement.checkValidity()' in the 'HTML5' specification.</a>
   */
  public native boolean checkValidity();

  /**
   * The HTMLSelectElement.namedItem() method returns the HTMLOptionElement corresponding to the HTMLOptionElement whose name or id match the specified name, or null if no option matches.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/namedItem">HTMLSelectElement.namedItem - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-nameditem">The definition of 'HTMLSelectElement.namedItem()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-nameditem">The definition of 'HTMLSelectElement.namedItem()' in the 'HTML5' specification.</a>
   */
  @Nullable
  public native HTMLOptionElement namedItem(@Nonnull String name);

  /**
   * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/remove">HTMLSelectElement.remove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-remove">The definition of 'HTMLSelectElement.remove()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-remove">The definition of 'HTMLSelectElement.remove()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-33404570">The definition of 'HTMLSelectElement.remove()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-33404570">The definition of 'HTMLSelectElement.remove()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void remove();

  /**
   * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/remove">HTMLSelectElement.remove - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-remove">The definition of 'HTMLSelectElement.remove()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-remove">The definition of 'HTMLSelectElement.remove()' in the 'HTML5' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-33404570">The definition of 'HTMLSelectElement.remove()' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-33404570">The definition of 'HTMLSelectElement.remove()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native void remove(int index);

  public native boolean reportValidity();

  /**
   * The HTMLSelectElement.setCustomValidity() method sets the custom validity message for the selection element to the specified message. Use the empty string to indicate that the element does not have a custom validity error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/setCustomValidity">HTMLSelectElement.setCustomValidity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-cva-setcustomvalidity">The definition of 'HTMLSelectElement.setCustomValidity()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-cva-setcustomvalidity">The definition of 'HTMLSelectElement.setCustomValidity()' in the 'HTML5' specification.</a>
   */
  public native void setCustomValidity(@Nonnull String error);

  /**
   * The HTMLSelectElement.item() method returns the Element corresponding to the HTMLOptionElement whose position in the options list corresponds to the index given in the parameter, or null if there are none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/item">HTMLSelectElement.item - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-select-item">The definition of 'HTMLSelectElement.item()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-select-item">The definition of 'HTMLSelectElement.item()' in the 'HTML5' specification.</a>
   */
  @Nullable
  public native Element item(int index);

  @JsOverlay
  public final void setAt(final int index, @Nullable final HTMLOptionElement option) {
    Js.<JsArrayLike<HTMLOptionElement>>cast( this ).setAt( index, option );
  }
}
