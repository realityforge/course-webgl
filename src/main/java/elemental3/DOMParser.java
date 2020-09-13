package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The DOMParser interface provides the ability to parse XML or HTML source code from a string into a DOM Document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMParser">DOMParser - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMParser"
)
public class DOMParser {
  public DOMParser() {
  }

  @Nonnull
  public native Document parseFromString(@Nonnull String string,
      @MagicConstant(valuesFromClass = DOMParserSupportedType.class) @Nonnull String type);
}
