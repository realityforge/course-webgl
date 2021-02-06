package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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

    @CSSRuleType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@CSSRuleType annotated value must be one of [CSSRule.STYLE_RULE, CSSRule.CHARSET_RULE, CSSRule.IMPORT_RULE, CSSRule.MEDIA_RULE, CSSRule.FONT_FACE_RULE, CSSRule.PAGE_RULE, CSSRule.KEYFRAMES_RULE, CSSRule.KEYFRAME_RULE, CSSRule.MARGIN_RULE, CSSRule.NAMESPACE_RULE, CSSRule.COUNTER_STYLE_RULE, CSSRule.SUPPORTS_RULE, CSSRule.FONT_FEATURE_VALUES_RULE, CSSRule.FONT_PALETTE_VALUES_RULE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return CSSRule.STYLE_RULE == value || CSSRule.CHARSET_RULE == value || CSSRule.IMPORT_RULE == value || CSSRule.MEDIA_RULE == value || CSSRule.FONT_FACE_RULE == value || CSSRule.PAGE_RULE == value || CSSRule.KEYFRAMES_RULE == value || CSSRule.KEYFRAME_RULE == value || CSSRule.MARGIN_RULE == value || CSSRule.NAMESPACE_RULE == value || CSSRule.COUNTER_STYLE_RULE == value || CSSRule.SUPPORTS_RULE == value || CSSRule.FONT_FEATURE_VALUES_RULE == value || CSSRule.FONT_PALETTE_VALUES_RULE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return CSSRule.STYLE_RULE == value ? "STYLE_RULE" : CSSRule.CHARSET_RULE == value ? "CHARSET_RULE" : CSSRule.IMPORT_RULE == value ? "IMPORT_RULE" : CSSRule.MEDIA_RULE == value ? "MEDIA_RULE" : CSSRule.FONT_FACE_RULE == value ? "FONT_FACE_RULE" : CSSRule.PAGE_RULE == value ? "PAGE_RULE" : CSSRule.KEYFRAMES_RULE == value ? "KEYFRAMES_RULE" : CSSRule.KEYFRAME_RULE == value ? "KEYFRAME_RULE" : CSSRule.MARGIN_RULE == value ? "MARGIN_RULE" : CSSRule.NAMESPACE_RULE == value ? "NAMESPACE_RULE" : CSSRule.COUNTER_STYLE_RULE == value ? "COUNTER_STYLE_RULE" : CSSRule.SUPPORTS_RULE == value ? "SUPPORTS_RULE" : CSSRule.FONT_FEATURE_VALUES_RULE == value ? "FONT_FEATURE_VALUES_RULE" : CSSRule.FONT_PALETTE_VALUES_RULE == value ? "FONT_PALETTE_VALUES_RULE" : "Unknown value " + value;
    }
  }
}
