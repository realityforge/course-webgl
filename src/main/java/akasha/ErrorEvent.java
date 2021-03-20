package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The ErrorEvent interface represents events providing information related to errors in scripts or in files.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ErrorEvent">ErrorEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#the-errorevent-interface">ErrorEvent - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/webappapis.html#the-errorevent-interface">ErrorEvent - HTML5</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ErrorEvent"
)
public class ErrorEvent extends Event {
  public ErrorEvent(@Nonnull final String type, @Nonnull final ErrorEventInit eventInitDict) {
    super( null );
  }

  public ErrorEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "colno"
  )
  public native int colno();

  @JsProperty(
      name = "error"
  )
  @Nullable
  public native Any error();

  @JsProperty(
      name = "filename"
  )
  @Nonnull
  public native String filename();

  @JsProperty(
      name = "lineno"
  )
  public native int lineno();

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
