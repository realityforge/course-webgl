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
 * @see <a href="https://fetch.spec.whatwg.org/#request-class">Request - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">Request() - Fetch</a>
   */
  public Request(@Nonnull final RequestInfo input, @Nonnull final RequestInit init) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">Request() - Fetch</a>
   */
  public Request(@Nonnull final Request input, @Nonnull final RequestInit init) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">Request() - Fetch</a>
   */
  public Request(@Nonnull final String input, @Nonnull final RequestInit init) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">Request() - Fetch</a>
   */
  public Request(@Nonnull final RequestInfo input) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">Request() - Fetch</a>
   */
  public Request(@Nonnull final Request input) {
  }

  /**
   * The Request() constructor creates a new Request object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/Request">Request.Request - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request">Request() - Fetch</a>
   */
  public Request(@Nonnull final String input) {
  }

  /**
   * The body read-only property of the Body mixin is a simple getter used to expose a ReadableStream of the body contents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Body/body">Body.body - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-body">body - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-bodyused">bodyUsed - Fetch</a>
   */
  @JsProperty(
      name = "bodyUsed"
  )
  public native boolean bodyUsed();

  /**
   * The cache read-only property of the Request interface contains the cache mode of the request. It controls how the request will interact with the browser's HTTP cache.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/cache">Request.cache - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-cache">cache - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-credentials">credentials - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-destination">destination - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-headers">headers - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-integrity">integrity - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-method">method - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-mode">mode - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-redirect">redirect - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-referrer">referrer - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-referrerpolicy">referrerPolicy - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-url">url - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-request-clone">clone - Fetch</a>
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
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-arraybuffer">arrayBuffer() - Fetch</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> arrayBuffer();

  /**
   * The blob() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with a Blob.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/blob">Request.blob - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-blob">blob() - Fetch</a>
   */
  @Nonnull
  public native Promise<Blob> blob();

  /**
   * The formData() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with a FormData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Body/formData">Body.formData - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-formdata">formData() - Fetch</a>
   */
  @Nonnull
  public native Promise<FormData> formData();

  /**
   * The json() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with the result of parsing the body text as JSON.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/json">Request.json - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-json">Body.json() - Fetch</a>
   */
  @Nonnull
  public native Promise<Any> json();

  /**
   * The text() method of the Body mixin takes a Response stream and reads it to completion. It returns a promise that resolves with a USVString object (text). The response is always decoded using UTF-8.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Request/text">Request.text - MDN</a>
   * @see <a href="https://fetch.spec.whatwg.org/#dom-body-text">text() - Fetch</a>
   */
  @Nonnull
  public native Promise<String> text();
}
