package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ValidityState interface represents the validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState">ValidityState - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#validitystate">The definition of 'ValidityState' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#validitystate-validitystate">The definition of 'ValidityState' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#validitystate">The definition of 'ValidityState' in the 'HTML5' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ValidityState"
)
public class ValidityState {
  protected ValidityState() {
  }

  /**
   * The read-only badInput property of a ValidityState object indicates if the user has provided input that the browser is unable to convert. For example, if you have a number input element whose content is a string. Note: While this is unsupported in Internet Explorer, any non-numeric value will be dismissed from the field if it is a number input.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/badInput">ValidityState.badInput - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-badinput">The definition of 'ValidityState.badInput' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-badinput">The definition of 'ValidityState.badInput' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-badinput">The definition of 'ValidityState.badInput' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "badInput"
  )
  public native boolean badInput();

  @JsProperty(
      name = "customError"
  )
  public native boolean customError();

  /**
   * If the field supports the pattern attribute -- which means the input is of type text, tel, email, url, password,  or search -- and the pattern value is set to a valid regular expression, if the value don't doesn't conform to the constraints set by the pattern value, the patternMismatch property will be true.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/patternMismatch">ValidityState.patternMismatch - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-patternmismatch">The definition of 'ValidityState.patternMismatch' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-patternmismatch">The definition of 'ValidityState.patternMismatch' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-patternmismatch">The definition of 'ValidityState.patternMismatch' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "patternMismatch"
  )
  public native boolean patternMismatch();

  /**
   * The read-only rangeOverflow property of a ValidityState object indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's max attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/rangeOverflow">ValidityState.rangeOverflow - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-rangeoverflow">The definition of 'ValidityState.rangeOverflow' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-rangeoverflow">The definition of 'ValidityState.rangeOverflow' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-rangeoverflow">The definition of 'ValidityState.rangeOverflow' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "rangeOverflow"
  )
  public native boolean rangeOverflow();

  /**
   * The read-only rangeUnderflow property of a ValidityState object indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's min attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/rangeUnderflow">ValidityState.rangeUnderflow - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-rangeunderflow">The definition of 'ValidityState.rangeUnderflow' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-rangeunderflow">The definition of 'ValidityState.rangeUnderflow' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-rangeunderflow">The definition of 'ValidityState.rangeUnderflow' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "rangeUnderflow"
  )
  public native boolean rangeUnderflow();

  /**
   * The read-only stepMismatch property of a ValidityState object indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's step attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/stepMismatch">ValidityState.stepMismatch - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-stepmismatch">The definition of 'ValidityState.stepMismatch' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-stepmismatch">The definition of 'ValidityState.stepMismatch' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-stepmismatch">The definition of 'ValidityState.stepMismatch' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "stepMismatch"
  )
  public native boolean stepMismatch();

  /**
   * The read-only tooLong property of a ValidityState object indicates if the value of an input or textarea, after having been edited by the user, exceeds the maximum code-unit length established by the element's maxlength attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/tooLong">ValidityState.tooLong - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-toolong">The definition of 'ValidityState.tooLong' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-toolong">The definition of 'ValidityState.tooLong' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-toolong">The definition of 'ValidityState.tooLong' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "tooLong"
  )
  public native boolean tooLong();

  /**
   * The read-only tooShort property of a ValidityState object indicates if the value of an input, button, select, output, fieldset or textarea, after having been edited by the user, is less than the minimum code-unit length established by the element's minlength attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/tooShort">ValidityState.tooShort - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-tooshort">The definition of 'ValidityState.tooShort' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-tooshort">The definition of 'ValidityState.tooShort' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-tooshort">The definition of 'ValidityState.tooShort' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "tooShort"
  )
  public native boolean tooShort();

  /**
   * If the type attribute expects specific strings, such as the email and url types and the value don't doesn't conform to the constraints set by the type, the typeMismatch property will be true.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/typeMismatch">ValidityState.typeMismatch - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/constraints.html#dom-validitystate-typemismatch">The definition of 'ValidityState.typeMismatch' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#dom-validitystate-typemismatch">The definition of 'ValidityState.typeMismatch' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-validitystate-typemismatch">The definition of 'ValidityState.typeMismatch' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "typeMismatch"
  )
  public native boolean typeMismatch();

  @JsProperty(
      name = "valid"
  )
  public native boolean valid();

  @JsProperty(
      name = "valueMissing"
  )
  public native boolean valueMissing();
}
