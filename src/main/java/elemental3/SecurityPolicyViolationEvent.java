package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The SecurityPolicyViolationEvent interface inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent">SecurityPolicyViolationEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SecurityPolicyViolationEvent"
)
public class SecurityPolicyViolationEvent extends Event {
  /**
   * The SecurityPolicyViolationEvent constructor creates a new SecurityPolicyViolationEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent">SecurityPolicyViolationEvent.SecurityPolicyViolationEvent - MDN</a>
   */
  public SecurityPolicyViolationEvent(@Nonnull final String type,
      @Nonnull final SecurityPolicyViolationEventInit eventInitDict) {
    super( null );
  }

  /**
   * The SecurityPolicyViolationEvent constructor creates a new SecurityPolicyViolationEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent">SecurityPolicyViolationEvent.SecurityPolicyViolationEvent - MDN</a>
   */
  public SecurityPolicyViolationEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The blockedURI read-only property of the SecurityPolicyViolationEvent interface is a USVString representing the URI of the resource that was blocked because it violates a policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/blockedURI">SecurityPolicyViolationEvent.blockedURI - MDN</a>
   */
  @JsProperty(
      name = "blockedURI"
  )
  @Nonnull
  public native String blockedURI();

  @JsProperty(
      name = "blockedURL"
  )
  @Nonnull
  public native String blockedURL();

  @JsProperty(
      name = "colno"
  )
  public native int colno();

  /**
   * The columnNumber read-only property of the SecurityPolicyViolationEvent interface is the column number in the document or worker at which the violation occurred.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/columnNumber">SecurityPolicyViolationEvent.columnNumber - MDN</a>
   */
  @JsProperty(
      name = "columnNumber"
  )
  public native int columnNumber();

  /**
   * The disposition read-only property of the SecurityPolicyViolationEvent interface indicates how the violated policy is configured to be treated by the user agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/disposition">SecurityPolicyViolationEvent.disposition - MDN</a>
   */
  @JsProperty(
      name = "disposition"
  )
  @Nonnull
  @MagicConstant(
      valuesFromClass = SecurityPolicyViolationEventDisposition.class
  )
  public native String disposition();

  /**
   * The documentURI read-only property of the SecurityPolicyViolationEvent interface is a USVString representing the URI of the document or worker in which the violation was found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/documentURI">SecurityPolicyViolationEvent.documentURI - MDN</a>
   */
  @JsProperty(
      name = "documentURI"
  )
  @Nonnull
  public native String documentURI();

  @JsProperty(
      name = "documentURL"
  )
  @Nonnull
  public native String documentURL();

  /**
   * The effectiveDirective read-only property of the SecurityPolicyViolationEvent interface is a DOMString representing the directive whose enforcement uncovered the violation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/effectiveDirective">SecurityPolicyViolationEvent.effectiveDirective - MDN</a>
   */
  @JsProperty(
      name = "effectiveDirective"
  )
  @Nonnull
  public native String effectiveDirective();

  /**
   * The lineNumber read-only property of the SecurityPolicyViolationEvent interface is the line number in the document or worker at which the violation occurred.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/lineNumber">SecurityPolicyViolationEvent.lineNumber - MDN</a>
   */
  @JsProperty(
      name = "lineNumber"
  )
  public native int lineNumber();

  @JsProperty(
      name = "lineno"
  )
  public native int lineno();

  /**
   * The originalPolicy read-only property of the SecurityPolicyViolationEvent interface is a DOMString containing the policy whose enforcement uncovered the violation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/originalPolicy">SecurityPolicyViolationEvent.originalPolicy - MDN</a>
   */
  @JsProperty(
      name = "originalPolicy"
  )
  @Nonnull
  public native String originalPolicy();

  /**
   * The referrer read-only property of the SecurityPolicyViolationEvent interface is a USVString representing the referrer of the resources whose policy was violated. This will be a URL or null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/referrer">SecurityPolicyViolationEvent.referrer - MDN</a>
   */
  @JsProperty(
      name = "referrer"
  )
  @Nonnull
  public native String referrer();

  /**
   * The sample read-only property of the SecurityPolicyViolationEvent interface is a DOMString representing a sample of the resource that caused the violation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/sample">SecurityPolicyViolationEvent.sample - MDN</a>
   */
  @JsProperty(
      name = "sample"
  )
  @Nonnull
  public native String sample();

  /**
   * The sourceFile read-only property of the SecurityPolicyViolationEvent interface is a USVString representing the URI of the document or worker in which the violation was found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/sourceFile">SecurityPolicyViolationEvent.sourceFile - MDN</a>
   */
  @JsProperty(
      name = "sourceFile"
  )
  @Nonnull
  public native String sourceFile();

  /**
   * The statusCode read-only property of the SecurityPolicyViolationEvent interface is a number representing the HTTP status code of the document or worker in which the violation occurred.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/statusCode">SecurityPolicyViolationEvent.statusCode - MDN</a>
   */
  @JsProperty(
      name = "statusCode"
  )
  public native int statusCode();

  /**
   * The violatedDirective read-only property of the SecurityPolicyViolationEvent interface is a DOMString representing the directive whose enforcement uncovered the violation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/violatedDirective">SecurityPolicyViolationEvent.violatedDirective - MDN</a>
   */
  @JsProperty(
      name = "violatedDirective"
  )
  @Nonnull
  public native String violatedDirective();
}
