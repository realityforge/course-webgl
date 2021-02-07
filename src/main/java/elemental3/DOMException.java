package elemental3;

import elemental3.core.JsError;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOMException interface represents an abnormal event (called an exception) that occurs as a result of calling a method or accessing a property of a web API.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMException">DOMException - MDN</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-DOMException">constructor - Web IDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMException"
)
public class DOMException extends JsError {
  @JsOverlay
  public static final int ABORT_ERR = 20;

  @JsOverlay
  public static final int DATA_CLONE_ERR = 25;

  @JsOverlay
  public static final int DOMSTRING_SIZE_ERR = 2;

  @JsOverlay
  public static final int HIERARCHY_REQUEST_ERR = 3;

  @JsOverlay
  public static final int INDEX_SIZE_ERR = 1;

  @JsOverlay
  public static final int INUSE_ATTRIBUTE_ERR = 10;

  @JsOverlay
  public static final int INVALID_ACCESS_ERR = 15;

  @JsOverlay
  public static final int INVALID_CHARACTER_ERR = 5;

  @JsOverlay
  public static final int INVALID_MODIFICATION_ERR = 13;

  @JsOverlay
  public static final int INVALID_NODE_TYPE_ERR = 24;

  @JsOverlay
  public static final int INVALID_STATE_ERR = 11;

  @JsOverlay
  public static final int NAMESPACE_ERR = 14;

  @JsOverlay
  public static final int NETWORK_ERR = 19;

  @JsOverlay
  public static final int NOT_FOUND_ERR = 8;

  @JsOverlay
  public static final int NOT_SUPPORTED_ERR = 9;

  @JsOverlay
  public static final int NO_DATA_ALLOWED_ERR = 6;

  @JsOverlay
  public static final int NO_MODIFICATION_ALLOWED_ERR = 7;

  @JsOverlay
  public static final int QUOTA_EXCEEDED_ERR = 22;

  @JsOverlay
  public static final int SECURITY_ERR = 18;

  @JsOverlay
  public static final int SYNTAX_ERR = 12;

  @JsOverlay
  public static final int TIMEOUT_ERR = 23;

  @JsOverlay
  public static final int TYPE_MISMATCH_ERR = 17;

  @JsOverlay
  public static final int URL_MISMATCH_ERR = 21;

  @JsOverlay
  public static final int VALIDATION_ERR = 16;

  @JsOverlay
  public static final int WRONG_DOCUMENT_ERR = 4;

  /**
   * The DOMException() constructor returns a DOMException object with a specified message and name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMException/DOMException">DOMException.DOMException - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#dom-domexception-domexception">DOMException() - Web IDL</a>
   */
  public DOMException(@Nonnull final String message, @Nonnull final String name) {
  }

  /**
   * The DOMException() constructor returns a DOMException object with a specified message and name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMException/DOMException">DOMException.DOMException - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#dom-domexception-domexception">DOMException() - Web IDL</a>
   */
  public DOMException(@Nonnull final String message) {
  }

  /**
   * The DOMException() constructor returns a DOMException object with a specified message and name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMException/DOMException">DOMException.DOMException - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#dom-domexception-domexception">DOMException() - Web IDL</a>
   */
  public DOMException() {
  }

  /**
   * The code read-only property of the DOMException interface returns a short that contains one of the error code constants, or 0 if none match. This field is used for historical reasons. New DOM exceptions don't use this anymore: they put this info in the DOMException.name attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMException/code">DOMException.code - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#dom-domexception-code">code - Web IDL</a>
   */
  @JsProperty(
      name = "code"
  )
  @Nonnull
  public native DOMException code();
}
