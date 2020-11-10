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
import jsinterop.base.JsPropertyMap;

/**
 * The HTMLFormElement interface represents a form element in the DOM. It allows access to&mdash;and, in some cases, modification of&mdash;aspects of the form, as well as access to its component elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement">HTMLFormElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlformelement">The definition of 'HTMLFormElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/sec-forms.html#htmlformelement">The definition of 'HTMLFormElement' in the 'HTML5' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFormElement"
)
public class HTMLFormElement extends HTMLElement {
  /**
   * The HTMLFormElement.acceptCharset property represents a list of the supported character encodings for the given form element. This list can be comma-separated or space-separated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/acceptCharset">HTMLFormElement.acceptCharset - MDN</a>
   */
  @Nonnull
  public String acceptCharset;

  /**
   * The HTMLFormElement.action property represents the action of the form element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/action">HTMLFormElement.action - MDN</a>
   */
  @Nonnull
  public String action;

  @Nonnull
  @FormAutocompleteType
  public String autocomplete;

  /**
   * The HTMLFormElement.encoding property is an alternative name for the enctype element on the DOM HTMLFormElement object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/encoding">HTMLFormElement.encoding - MDN</a>
   */
  @Nonnull
  public String encoding;

  /**
   * The HTMLFormElement.enctype property is the MIME type of content that is used to submit the form to the server. Possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/enctype">HTMLFormElement.enctype - MDN</a>
   */
  @Nonnull
  @FormEncodingType
  public String enctype;

  /**
   * The HTMLFormElement.method property represents the HTTP method used to submit the form.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/method">HTMLFormElement.method - MDN</a>
   */
  @Nonnull
  @FormMethodType
  public String method;

  /**
   * The HTMLFormElement.name property represents the name of the current form element as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/name">HTMLFormElement.name - MDN</a>
   */
  @Nonnull
  public String name;

  public boolean noValidate;

  @Nonnull
  public String rel;

  /**
   * The target property of the HTMLFormElement interface represents the target of the form's action (i.e., the frame in which to render its output).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/target">HTMLFormElement.target - MDN</a>
   */
  @Nonnull
  public String target;

  protected HTMLFormElement() {
  }

  /**
   * The HTMLFormElement property elements returns an HTMLFormControlsCollection listing all the form controls contained in the form element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/elements">HTMLFormElement.elements - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-form-elements">The definition of 'HTMLFormElement.elements' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-76728479">The definition of 'HTMLFormElement.elements' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
   */
  @JsProperty(
      name = "elements"
  )
  @Nonnull
  public native HTMLFormControlsCollection elements();

  /**
   * The HTMLFormElement.length read-only property returns the number of controls in the form element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/length">HTMLFormElement.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  public native boolean checkValidity();

  /**
   * The HTMLFormElement.reportValidity() method returns true if the element's child controls satisfy their validation constraints. When false is returned, cancelable invalid events are fired for each invalid child and validation problems are reported to the user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/reportValidity">HTMLFormElement.reportValidity - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-cva-reportvalidity">The definition of 'HTMLFormElement.reportValidity()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/semantics.html#the-constraint-validation-api">The definition of 'HTMLFormElement.reportValidity()' in the 'HTML 5.1' specification.</a>
   */
  public native boolean reportValidity();

  /**
   * The HTMLFormElement method requestSubmit() requests that the form be submitted using a specific submit button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/requestSubmit">HTMLFormElement.requestSubmit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-form-requestsubmit">The definition of 'requestSubmit()' in the 'HTML Living Standard' specification.</a>
   */
  public native void requestSubmit(@Nullable HTMLElement submitter);

  /**
   * The HTMLFormElement method requestSubmit() requests that the form be submitted using a specific submit button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/requestSubmit">HTMLFormElement.requestSubmit - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-form-requestsubmit">The definition of 'requestSubmit()' in the 'HTML Living Standard' specification.</a>
   */
  public native void requestSubmit();

  /**
   * The HTMLFormElement.reset() method restores a form element's default values. This method does the same thing as clicking the form's reset button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/reset">HTMLFormElement.reset - MDN</a>
   */
  public native void reset();

  /**
   * The HTMLFormElement.submit() method submits a given form.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/submit">HTMLFormElement.submit - MDN</a>
   */
  public native void submit();

  @JsOverlay
  @Nonnull
  public final Element getAt(final int index) {
    return Js.<JsArrayLike<Element>>cast( this ).getAt( index );
  }

  @JsOverlay
  @Nonnull
  public final RadioNodeListOrElementUnion get(@Nonnull final String name) {
    return Js.<JsPropertyMap<RadioNodeListOrElementUnion>>cast( this ).get( name );
  }

  @JsOverlay
  public final void addFormdataListener(@Nonnull final FormDataEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "formdata", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFormdataListener(@Nonnull final FormDataEventListener callback,
      final boolean useCapture) {
    addEventListener( "formdata", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFormdataListener(@Nonnull final FormDataEventListener callback) {
    addEventListener( "formdata", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFormdataListener(@Nonnull final FormDataEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "formdata", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFormdataListener(@Nonnull final FormDataEventListener callback,
      final boolean useCapture) {
    removeEventListener( "formdata", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFormdataListener(@Nonnull final FormDataEventListener callback) {
    removeEventListener( "formdata", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSubmitListener(@Nonnull final SubmitEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "submit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSubmitListener(@Nonnull final SubmitEventListener callback,
      final boolean useCapture) {
    addEventListener( "submit", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSubmitListener(@Nonnull final SubmitEventListener callback) {
    addEventListener( "submit", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSubmitListener(@Nonnull final SubmitEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "submit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSubmitListener(@Nonnull final SubmitEventListener callback,
      final boolean useCapture) {
    removeEventListener( "submit", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSubmitListener(@Nonnull final SubmitEventListener callback) {
    removeEventListener( "submit", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addResetListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "reset", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResetListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "reset", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addResetListener(@Nonnull final EventListener callback) {
    addEventListener( "reset", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResetListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "reset", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResetListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "reset", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeResetListener(@Nonnull final EventListener callback) {
    removeEventListener( "reset", Js.cast( callback ) );
  }
}
