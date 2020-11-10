package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The FullscreenOptions dictionary is used to provide configuration options when calling requestFullscreen() on an element to place that element into full-screen mode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions">FullscreenOptions - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface FullscreenOptions {
  @JsOverlay
  @Nonnull
  static FullscreenOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The FullscreenOptions dictionary's navigationUI property is used when calling requestFullscreen() to specify to what extent the user agent should include its standard user interface while the element is presented in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions/navigationUI">FullscreenOptions.navigationUI - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dictdef-fullscreenoptions">The definition of 'FullscreenOptions' in the 'Fullscreen API' specification.</a>
   */
  @JsProperty(
      name = "navigationUI"
  )
  @FullscreenNavigationUI
  String navigationUI();

  /**
   * The FullscreenOptions dictionary's navigationUI property is used when calling requestFullscreen() to specify to what extent the user agent should include its standard user interface while the element is presented in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions/navigationUI">FullscreenOptions.navigationUI - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dictdef-fullscreenoptions">The definition of 'FullscreenOptions' in the 'Fullscreen API' specification.</a>
   */
  @JsProperty
  void setNavigationUI(@FullscreenNavigationUI @Nonnull String navigationUI);

  /**
   * The FullscreenOptions dictionary's navigationUI property is used when calling requestFullscreen() to specify to what extent the user agent should include its standard user interface while the element is presented in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions/navigationUI">FullscreenOptions.navigationUI - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dictdef-fullscreenoptions">The definition of 'FullscreenOptions' in the 'Fullscreen API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default FullscreenOptions navigationUI(
      @FullscreenNavigationUI @Nonnull final String navigationUI) {
    setNavigationUI( navigationUI );
    return this;
  }
}
