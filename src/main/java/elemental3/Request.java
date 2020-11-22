package elemental3;

import elemental3.core.ArrayBuffer;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The Request interface of the Fetch API represents a resource request.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request">Request - MDN</a>
 * @see <a href="https://fetch.spec.whatwg.org/#request-class">The definition of 'Request' in the 'Fetch' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Request"
)
public class Request {
  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">The definition of 'Request()' in the 'Fetch' specification.</a>
   */
  public Request(@Nonnull final RequestInfo input, @Nonnull final RequestInit init) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">The definition of 'Request()' in the 'Fetch' specification.</a>
   */
  public Request(@Nonnull final Request input, @Nonnull final RequestInit init) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">The definition of 'Request()' in the 'Fetch' specification.</a>
   */
  public Request(@Nonnull final String input, @Nonnull final RequestInit init) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">The definition of 'Request()' in the 'Fetch' specification.</a>
   */
  public Request(@Nonnull final RequestInfo input) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">The definition of 'Request()' in the 'Fetch' specification.</a>
   */
  public Request(@Nonnull final Request input) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">The definition of 'Request()' in the 'Fetch' specification.</a>
   */
  public Request(@Nonnull final String input) {
  }

  /**
   * The body read-only property of the Body mixin is a simple getter used to expose a ReadableStream of the body contents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Body/body">Body.body - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-body">The definition of 'body' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "body"
  )
  @Nullable
  public native ReadableStream body();

  /**
   * The bodyUsed read-only property of the Body mixin contains a Boolean that indicates whether the body has been read yet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/bodyUsed">Request.bodyUsed - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-bodyused">The definition of 'bodyUsed' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "bodyUsed"
  )
  public native boolean bodyUsed();

  /**
   * The cache read-only property of the Request interface contains the cache mode of the request. It controls how the request will interact with the browser's HTTP cache.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/cache">Request.cache - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-cache">The definition of 'cache' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "cache"
  )
  @Nonnull
  @RequestCache
  public native String cache();

  /**
   * The credentials read-only property of the Request interface indicates whether the user agent should send cookies from the other domain in the case of cross-origin requests.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/credentials">Request.credentials - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-credentials">The definition of 'credentials' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "credentials"
  )
  @Nonnull
  @RequestCredentials
  public native String credentials();

  /**
   * The destination read-only property of the Request interface returns a string describing the type of content being requested.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/destination">Request.destination - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-destination">The definition of 'destination' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "destination"
  )
  @Nonnull
  @RequestDestination
  public native String destination();

  /**
   * The headers read-only property of the Request interface contains the Headers object associated with the request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/headers">Request.headers - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-headers">The definition of 'headers' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "headers"
  )
  @Nonnull
  public native Headers headers();

  /**
   * The integrity read-only property of the Request interface contains the subresource integrity value of the request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/integrity">Request.integrity - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-integrity">The definition of 'integrity' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "integrity"
  )
  @Nonnull
  public native String integrity();

  @JsProperty(
      name = "isHistoryNavigation"
  )
  public native boolean isHistoryNavigation();

  @JsProperty(
      name = "isReloadNavigation"
  )
  public native boolean isReloadNavigation();

  @JsProperty(
      name = "keepalive"
  )
  public native boolean keepalive();

  /**
   * The method read-only property of the Request interface contains the request's method (GET, POST, etc.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/method">Request.method - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-method">The definition of 'method' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "method"
  )
  @Nonnull
  public native String method();

  /**
   * The mode read-only property of the Request interface contains the mode of the request (e.g., cors, no-cors, same-origin, or navigate.) This is used to determine if cross-origin requests lead to valid responses, and which properties of the response are readable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/mode">Request.mode - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-mode">The definition of 'mode' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "mode"
  )
  @Nonnull
  @RequestMode
  public native String mode();

  /**
   * The redirect read-only property of the Request interface contains the mode for how redirects are handled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/redirect">Request.redirect - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-redirect">The definition of 'redirect' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "redirect"
  )
  @Nonnull
  @RequestRedirect
  public native String redirect();

  /**
   * The referrer read-only property of the Request interface is set by the user agent to be the referrer of the Request. (e.g., client, no-referrer, or a URL.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/referrer">Request.referrer - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-referrer">The definition of 'referrer' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "referrer"
  )
  @Nonnull
  public native String referrer();

  /**
   * The referrerPolicy read-only property of the Request interface returns the referrer policy, which governs what referrer information, sent in the Referer header, should be included with the request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/referrerPolicy">Request.referrerPolicy - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-referrerpolicy">The definition of 'referrerPolicy' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "referrerPolicy"
  )
  @Nonnull
  @ReferrerPolicy
  public native String referrerPolicy();

  @JsProperty(
      name = "signal"
  )
  @Nonnull
  public native AbortSignal signal();

  /**
   * The url read-only property of the Request interface contains the URL of the request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/url">Request.url - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-url">The definition of 'url' in the 'Fetch' specification.</a>
   */
  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  /**
   * The clone() method of the Request interface creates a copy of the current Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/clone">Request.clone - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-clone">The definition of 'clone' in the 'Fetch' specification.</a>
   */
  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native Request clone_();

  /**
   * The arrayBuffer() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with an ArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/arrayBuffer">Request.arrayBuffer - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-arraybuffer">The definition of 'arrayBuffer()' in the 'Fetch' specification.</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> arrayBuffer();

  /**
   * The blob() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with a Blob.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/blob">Request.blob - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-blob">The definition of 'blob()' in the 'Fetch' specification.</a>
   */
  @Nonnull
  public native Promise<Blob> blob();

  /**
   * The formData() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with a FormData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Body/formData">Body.formData - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-formdata">The definition of 'formData()' in the 'Fetch' specification.</a>
   */
  @Nonnull
  public native Promise<FormData> formData();

  /**
   * The json() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with the result of parsing the body text as JSON.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/json">Request.json - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-json">The definition of 'Body.json()' in the 'Fetch' specification.</a>
   */
  @Nonnull
  public native Promise<Any> json();

  /**
   * The text() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with a USVString object (text). The response is always decoded using UTF-8.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/text">Request.text - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-text">The definition of 'text()' in the 'Fetch' specification.</a>
   */
  @Nonnull
  public native Promise<String> text();
}
