package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Plugin interface provides information about a browser plugin.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Plugin">Plugin - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#dom-plugin">The definition of 'Plugin' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Plugin"
)
public class Plugin {
  protected Plugin() {
  }

  @JsProperty(
      name = "description"
  )
  @Nonnull
  public native String description();

  @JsProperty(
      name = "filename"
  )
  @Nonnull
  public native String filename();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @Nullable
  public native MimeType item(int index);

  @Nullable
  public native MimeType namedItem(@Nonnull String name);
}
