package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * XMLHttpRequestEventTarget is the interface that describes the event handlers you can implement in an object that will handle events for an XMLHttpRequest.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget">XMLHttpRequestEventTarget - MDN</a>
 * @see <a href="https://xhr.spec.whatwg.org/">XMLHttpRequest</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XMLHttpRequestEventTarget"
)
public class XMLHttpRequestEventTarget extends EventTarget {
  /**
   * The XMLHttpRequestEventTarget.onabort is the function called when an XMLHttpRequest transaction is aborted, such as when the XMLHttpRequest.abort() function is called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onabort">XMLHttpRequestEventTarget.onabort - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onabort">XMLHttpRequest</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The XMLHttpRequestEventTarget.onerror is the function called when an XMLHttpRequest transaction fails due to an error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onerror">XMLHttpRequestEventTarget.onerror - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onerror">XMLHttpRequest</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The XMLHttpRequestEventTarget.onload is the function called when an XMLHttpRequest transaction completes successfully.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onload">XMLHttpRequestEventTarget.onload - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onload">XMLHttpRequest</a>
   */
  @Nullable
  public EventHandler onload;

  @Nullable
  public EventHandler onloadend;

  /**
   * The XMLHttpRequestEventTarget.onloadstart is the function called when an XMLHttpRequest transaction starts transferring data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onloadstart">XMLHttpRequestEventTarget.onloadstart - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onloadstart">XMLHttpRequest</a>
   */
  @Nullable
  public EventHandler onloadstart;

  /**
   * The XMLHttpRequestEventTarget.onprogress is the function called periodically with information when an XMLHttpRequest before success completely.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onprogress">XMLHttpRequestEventTarget.onprogress - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onload">XMLHttpRequest</a>
   */
  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler ontimeout;

  protected XMLHttpRequestEventTarget() {
  }
}
