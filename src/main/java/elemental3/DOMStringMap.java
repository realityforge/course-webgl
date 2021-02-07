package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The DOMStringMap interface is used for the HTMLElement.dataset attribute, to represent data for custom attributes added to elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMStringMap">DOMStringMap - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/dom.html#domstringmap">DOMStringMap - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMStringMap"
)
public class DOMStringMap {
  protected DOMStringMap() {
  }

  @JsOverlay
  @Nonnull
  public final String get(@Nonnull final String name) {
    return Js.<JsPropertyMap<String>>cast( this ).get( name );
  }

  @JsOverlay
  public final void set(@Nonnull final String name, @Nonnull final String value) {
    Js.<JsPropertyMap<String>>cast( this ).set( name, value );
  }

  @JsOverlay
  public final void delete(@Nonnull final String name) {
    Js.<JsPropertyMap<?>>cast( this ).delete( name );
  }
}
