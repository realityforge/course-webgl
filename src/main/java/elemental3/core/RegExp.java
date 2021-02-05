package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RegExp object is used for matching text with a pattern.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp">RegExp - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RegExp"
)
public class RegExp {
  public int lastIndex;

  public RegExp(@RegExpLanguage @Nonnull final String pattern,
      @RegExpFlags @Nonnull final String flags) {
  }

  public RegExp(@RegExpLanguage @Nonnull final String pattern) {
  }

  @JsProperty(
      name = "dotAll"
  )
  public native boolean dotAll();

  @JsProperty(
      name = "flags"
  )
  @RegExpFlags
  @Nonnull
  public native String flags();

  @JsProperty(
      name = "global"
  )
  public native boolean global();

  @JsProperty(
      name = "ignoreCase"
  )
  public native boolean ignoreCase();

  @JsProperty(
      name = "multiline"
  )
  public native boolean multiline();

  @JsProperty(
      name = "source"
  )
  @RegExpLanguage
  @Nonnull
  public native String source();

  @JsProperty(
      name = "sticky"
  )
  public native boolean sticky();

  @JsProperty(
      name = "unicode"
  )
  public native boolean unicode();

  @Nullable
  public native RegExpResult exec(@Nonnull String text);

  public native boolean test(@Nonnull String text);

  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
