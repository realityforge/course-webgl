package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SecurityPolicyViolationEvent interface inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent">SecurityPolicyViolationEvent - MDN</a>
 * @see <a href="https://w3c.github.io/webappsec-csp/2/#firing-securitypolicyviolationevent-events">The definition of 'SecurityPolicyViolationEvent' in the 'Content Security Policy Level 2' specification.</a>
 * @see <a href="https://w3c.github.io/webappsec-csp/#report-violation">The definition of 'SecurityPolicyViolationEvent' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-securitypolicyviolationevent">The definition of 'SecurityPolicyViolationEvent' in the 'Content Security Policy Level 3' specification.</a>
   */
  public SecurityPolicyViolationEvent(@Nonnull final String type,
      @Nonnull final SecurityPolicyViolationEventInit eventInitDict) {
    super( null );
  }

  /**
   * The SecurityPolicyViolationEvent constructor creates a new SecurityPolicyViolationEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent">SecurityPolicyViolationEvent.SecurityPolicyViolationEvent - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-securitypolicyviolationevent">The definition of 'SecurityPolicyViolationEvent' in the 'Content Security Policy Level 3' specification.</a>
   */
  public SecurityPolicyViolationEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The blockedURI read-only property of the SecurityPolicyViolationEvent interface is a USVString representing the URI of the resource that was blocked because it violates a policy.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/blockedURI">SecurityPolicyViolationEvent.blockedURI - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-blockeduri">The definition of 'blockedURI' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-columnnumber">The definition of 'columnNumber' in the 'Content Security Policy Level 3' specification.</a>
   */
  @JsProperty(
      name = "columnNumber"
  )
  public native int columnNumber();

  /**
   * The disposition read-only property of the SecurityPolicyViolationEvent interface indicates how the violated policy is configured to be treated by the user agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/disposition">SecurityPolicyViolationEvent.disposition - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-disposition">The definition of 'disposition' in the 'Content Security Policy Level 3' specification.</a>
   */
  @JsProperty(
      name = "disposition"
  )
  @Nonnull
  @SecurityPolicyViolationEventDisposition
  public native String disposition();

  /**
   * The documentURI read-only property of the SecurityPolicyViolationEvent interface is a USVString representing the URI of the document or worker in which the violation was found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/documentURI">SecurityPolicyViolationEvent.documentURI - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-documenturi">The definition of 'documentURI' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-effectivedirective">The definition of 'effectiveDirective' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-linenumber">The definition of 'lineNumber' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-originalpolicy">The definition of 'originalPolicy' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-referrer">The definition of 'referrer' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-sample">The definition of 'sample' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-sourcefile">The definition of 'sourceFile' in the 'Content Security Policy Level 3' specification.</a>
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
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-statuscode">The definition of 'statusCode' in the 'Content Security Policy Level 3' specification.</a>
   */
  @JsProperty(
      name = "statusCode"
  )
  public native int statusCode();

  /**
   * The violatedDirective read-only property of the SecurityPolicyViolationEvent interface is a DOMString representing the directive whose enforcement uncovered the violation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SecurityPolicyViolationEvent/violatedDirective">SecurityPolicyViolationEvent.violatedDirective - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-csp/#dom-securitypolicyviolationevent-violateddirective">The definition of 'violatedDirective' in the 'Content Security Policy Level 3' specification.</a>
   */
  @JsProperty(
      name = "violatedDirective"
  )
  @Nonnull
  public native String violatedDirective();
}
