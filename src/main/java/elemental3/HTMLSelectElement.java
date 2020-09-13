package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLSelectElement interface represents a select HTML Element. These elements also share all of the properties and methods of other HTML elements via the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement">HTMLSelectElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLSelectElement"
)
public class HTMLSelectElement extends HTMLElement {
  /**
   * The HTMLSelectElement.disabled is a Boolean that reflects the disabled HTML attribute, which indicates whether the control is disabled. If it is disabled, it does not accept clicks. A disabled element is unusable and un-clickable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/disabled">HTMLSelectElement.disabled - MDN</a>
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
   */
  public int selectedIndex;

  public int size;

  @Nonnull
  public String value;

  @Nonnull
  @MagicConstant(
      valuesFromClass = AutocompleteType.class
  )
  public String autocomplete;

  public HTMLSelectElement() {
  }

  /**
   * The HTMLSelectElement.form read-only property returns a HTMLFormElement representing the form that this element is associated with. If the element is not associated with of a form element, then it returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/form">HTMLSelectElement.form - MDN</a>
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
   */
  public native void add(@Nonnull HTMLOptionElement element, @Nonnull HTMLElement before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element, @Nonnull HTMLElement before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   */
  public native void add(@Nonnull HTMLOptionElement element, int before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element, int before);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   */
  public native void add(@Nonnull HTMLOptionElement element);

  /**
   * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/add">HTMLSelectElement.add - MDN</a>
   */
  public native void add(@Nonnull HTMLOptGroupElement element);

  /**
   * The HTMLSelectElement.checkValidity() method checks whether the element has any constraints and whether it satisfies them. If the element fails its constraints, the browser fires a cancelable invalid event at the element, and then returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/checkValidity">HTMLSelectElement.checkValidity - MDN</a>
   */
  public native boolean checkValidity();

  /**
   * The HTMLSelectElement.namedItem() method returns the HTMLOptionElement corresponding to the HTMLOptionElement whose name or id match the specified name, or null if no option matches.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/namedItem">HTMLSelectElement.namedItem - MDN</a>
   */
  @Nullable
  public native HTMLOptionElement namedItem(@Nonnull String name);

  /**
   * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/remove">HTMLSelectElement.remove - MDN</a>
   */
  public native void remove();

  /**
   * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for this select element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/remove">HTMLSelectElement.remove - MDN</a>
   */
  public native void remove(int index);

  public native boolean reportValidity();

  /**
   * The HTMLSelectElement.setCustomValidity() method sets the custom validity message for the selection element to the specified message. Use the empty string to indicate that the element does not have a custom validity error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/setCustomValidity">HTMLSelectElement.setCustomValidity - MDN</a>
   */
  public native void setCustomValidity(@Nonnull String error);

  /**
   * The HTMLSelectElement.item() method returns the Element corresponding to the HTMLOptionElement whose position in the options list corresponds to the index given in the parameter, or null if there are none.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSelectElement/item">HTMLSelectElement.item - MDN</a>
   */
  @Nullable
  public native Element item(int index);
}
