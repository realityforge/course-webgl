package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CSSCounterStyleRule interface represents an @counter-style at-rule.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSCounterStyleRule">CSSCounterStyleRule - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-counter-styles-3/#the-csscounterstylerule-interface">The definition of 'CSSCounterStyleRule' in the 'CSS Counter Styles Level 3' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSCounterStyleRule"
)
public class CSSCounterStyleRule extends CSSRule {
  @Nonnull
  public String additiveSymbols;

  @Nonnull
  public String fallback;

  @Nonnull
  public String name;

  @Nonnull
  public String negative;

  @Nonnull
  public String pad;

  @Nonnull
  public String prefix;

  @Nonnull
  public String range;

  @Nonnull
  public String speakAs;

  @Nonnull
  public String suffix;

  @Nonnull
  public String symbols;

  @Nonnull
  public String system;

  protected CSSCounterStyleRule() {
  }
}
