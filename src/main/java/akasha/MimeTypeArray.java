package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MimeTypeArray interface returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MimeTypeArray">MimeTypeArray - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#mimetypearray">MimeTypeArray - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MimeTypeArray"
)
public class MimeTypeArray {
  protected MimeTypeArray() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native Object namedItem(@Nonnull String name);

  @Nullable
  public native Object item(int index);
}
