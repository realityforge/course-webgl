package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ValidityState interface represents the validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState">ValidityState - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ValidityState"
)
public class ValidityState {
  ValidityState() {
  }

  /**
   * The read-only badInput property of a ValidityState object indicates if the user has provided input that the browser is unable to convert. For example, if you have a number input element whose content is a string. Note: While this is unsupported in Internet Explorer, any non-numeric value will be dismissed from the field if it is a number input.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/badInput">ValidityState.badInput - MDN</a>
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
   */
  @JsProperty(
      name = "patternMismatch"
  )
  public native boolean patternMismatch();

  /**
   * The read-only rangeOverflow property of a ValidityState object indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's max attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/rangeOverflow">ValidityState.rangeOverflow - MDN</a>
   */
  @JsProperty(
      name = "rangeOverflow"
  )
  public native boolean rangeOverflow();

  /**
   * The read-only rangeUnderflow property of a ValidityState object indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's min attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/rangeUnderflow">ValidityState.rangeUnderflow - MDN</a>
   */
  @JsProperty(
      name = "rangeUnderflow"
  )
  public native boolean rangeUnderflow();

  /**
   * The read-only stepMismatch property of a ValidityState object indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's step attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/stepMismatch">ValidityState.stepMismatch - MDN</a>
   */
  @JsProperty(
      name = "stepMismatch"
  )
  public native boolean stepMismatch();

  /**
   * The read-only tooLong property of a ValidityState object indicates if the value of an input or textarea, after having been edited by the user, exceeds the maximum code-unit length established by the element's maxlength attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/tooLong">ValidityState.tooLong - MDN</a>
   */
  @JsProperty(
      name = "tooLong"
  )
  public native boolean tooLong();

  /**
   * The read-only tooShort property of a ValidityState object indicates if the value of an input, button, select, output, fieldset or textarea, after having been edited by the user, is less than the minimum code-unit length established by the element's minlength attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/tooShort">ValidityState.tooShort - MDN</a>
   */
  @JsProperty(
      name = "tooShort"
  )
  public native boolean tooShort();

  /**
   * If the type attribute expects specific strings, such as the email and url types and the value don't doesn't conform to the constraints set by the type, the typeMismatch property will be true.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ValidityState/typeMismatch">ValidityState.typeMismatch - MDN</a>
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
