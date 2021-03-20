package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PluginArray interface is used to store a list of Plugin objects describing the available plugins; it's returned by the navigator.plugins property. The PluginArray is not a JavaScript array, but has the length property and supports accessing individual items using bracket notation (plugins[2]), as well as via item(index) and namedItem(&quot;name&quot;) methods.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PluginArray">PluginArray - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#pluginarray">PluginArray - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PluginArray"
)
public class PluginArray {
  protected PluginArray() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native Object namedItem(@Nonnull String name);

  public native void refresh();

  @Nullable
  public native Object item(int index);
}
