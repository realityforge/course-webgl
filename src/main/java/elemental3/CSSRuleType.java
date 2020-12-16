package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        CSSRule.STYLE_RULE,
        CSSRule.CHARSET_RULE,
        CSSRule.IMPORT_RULE,
        CSSRule.MEDIA_RULE,
        CSSRule.FONT_FACE_RULE,
        CSSRule.PAGE_RULE,
        CSSRule.KEYFRAMES_RULE,
        CSSRule.KEYFRAME_RULE,
        CSSRule.MARGIN_RULE,
        CSSRule.NAMESPACE_RULE,
        CSSRule.COUNTER_STYLE_RULE,
        CSSRule.SUPPORTS_RULE,
        CSSRule.FONT_FEATURE_VALUES_RULE,
        CSSRule.FONT_PALETTE_VALUES_RULE
    }
)
public @interface CSSRuleType {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return CSSRule.STYLE_RULE == value || CSSRule.CHARSET_RULE == value || CSSRule.IMPORT_RULE == value || CSSRule.MEDIA_RULE == value || CSSRule.FONT_FACE_RULE == value || CSSRule.PAGE_RULE == value || CSSRule.KEYFRAMES_RULE == value || CSSRule.KEYFRAME_RULE == value || CSSRule.MARGIN_RULE == value || CSSRule.NAMESPACE_RULE == value || CSSRule.COUNTER_STYLE_RULE == value || CSSRule.SUPPORTS_RULE == value || CSSRule.FONT_FEATURE_VALUES_RULE == value || CSSRule.FONT_PALETTE_VALUES_RULE == value;
    }
  }
}
