package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Plugin interface provides information about a browser plugin.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Plugin">Plugin - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#dom-plugin">Plugin - HTML Living Standard</a>
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
  public native void description();

  @JsProperty(
      name = "filename"
  )
  @Nonnull
  public native void filename();

  @JsProperty(
      name = "length"
  )
  @Nonnull
  public native void length();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native void name();

  public native void namedItem(@Nonnull String name);

  public native void item(int index);
}
