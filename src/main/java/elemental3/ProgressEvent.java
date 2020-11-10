package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ProgressEvent interface represents events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an img, audio, video, style or link).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ProgressEvent">ProgressEvent - MDN</a>
 * @see <a href="https://xhr.spec.whatwg.org/#interface-progressevent">The definition of 'ProgressEvent' in the 'XMLHttpRequest' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ProgressEvent"
)
public class ProgressEvent extends Event {
  /**
   * The ProgressEvent() constructor returns a newly created ProgressEvent, representing the current completion of a long process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ProgressEvent/ProgressEvent">ProgressEvent.ProgressEvent - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-progressevent-progressevent">The definition of 'ProgressEvent()' in the 'XMLHttpRequest' specification.</a>
   */
  public ProgressEvent(@Nonnull final String type, @Nonnull final ProgressEventInit eventInitDict) {
    super( null );
  }

  /**
   * The ProgressEvent() constructor returns a newly created ProgressEvent, representing the current completion of a long process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ProgressEvent/ProgressEvent">ProgressEvent.ProgressEvent - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-progressevent-progressevent">The definition of 'ProgressEvent()' in the 'XMLHttpRequest' specification.</a>
   */
  public ProgressEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The ProgressEvent.lengthComputable read-only property is a Boolean flag indicating if the resource concerned by the ProgressEvent has a length that can be calculated. If not, the ProgressEvent.total property has no significant value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ProgressEvent/lengthComputable">ProgressEvent.lengthComputable - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-progressevent-lengthcomputable">The definition of 'ProgressEvent.lengthComputable' in the 'XMLHttpRequest' specification.</a>
   */
  @JsProperty(
      name = "lengthComputable"
  )
  public native boolean lengthComputable();

  /**
   * The ProgressEvent.loaded read-only property is an integer representing the amount of work already performed by the underlying process. The ratio of work done can be calculated with the property and ProgressEvent.total. When downloading a resource using HTTP, this only represent the part of the content itself, not headers and other overhead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ProgressEvent/loaded">ProgressEvent.loaded - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-progressevent-loaded">The definition of 'ProgressEvent.loaded' in the 'XMLHttpRequest' specification.</a>
   */
  @JsProperty(
      name = "loaded"
  )
  public native int loaded();

  /**
   * The ProgressEvent.total read-only property is an unsigned 64-bit integer value indicating the total size of the data being processed or transmitted. In the case of an HTTP transmission, this is the size of the body of the message (the Content-Length), and does not include headers and other overhead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ProgressEvent/total">ProgressEvent.total - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-progressevent-total">The definition of 'ProgressEvent.lengthComputable' in the 'XMLHttpRequest' specification.</a>
   */
  @JsProperty(
      name = "total"
  )
  public native int total();
}
