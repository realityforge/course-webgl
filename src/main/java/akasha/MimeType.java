package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MimeType interface provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MimeType">MimeType - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#mimetype">MimeType - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MimeType"
)
public class MimeType {
  protected MimeType() {
  }

  @JsProperty(
      name = "description"
  )
  @Nonnull
  public native void description();

  @JsProperty(
      name = "enabledPlugin"
  )
  @Nonnull
  public native void enabledPlugin();

  @JsProperty(
      name = "suffixes"
  )
  @Nonnull
  public native void suffixes();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native void type();
}
