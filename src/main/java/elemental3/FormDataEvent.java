package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The FormDataEvent interface represents a formdata event &mdash; such an event is fired on an HTMLFormElement object after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormDataEvent">FormDataEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#the-formdataevent-interface">FormDataEvent - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FormDataEvent"
)
public class FormDataEvent extends Event {
  /**
   * The FormDataEvent() constructor creates a new FormDataEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormDataEvent/FormDataEvent">FormDataEvent.FormDataEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#the-formdataevent-interface">FormDataEvent - HTML Living Standard</a>
   */
  public FormDataEvent(@Nonnull final String type, @Nonnull final FormDataEventInit eventInitDict) {
    super( null );
  }

  /**
   * The formData read only property of the FormDataEvent interface contains the FormData object representing the data contained in the form when the event was fired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormDataEvent/formData">FormDataEvent.formData - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-formdataevent-formdata">formData - HTML Living Standard</a>
   */
  @JsProperty(
      name = "formData"
  )
  @Nonnull
  public native FormData formData();
}
