package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DOMParserSupportedType.class
)
public @interface DOMParserSupportedType {
  @Nonnull
  String application_xhtml_xml = "application/xhtml+xml";

  @Nonnull
  String application_xml = "application/xml";

  @Nonnull
  String image_svg_xml = "image/svg+xml";

  @Nonnull
  String text_html = "text/html";

  @Nonnull
  String text_xml = "text/xml";

  final class Validator {
    private Validator() {
    }

    @DOMParserSupportedType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return DOMParserSupportedType.application_xhtml_xml.equals( value ) || DOMParserSupportedType.application_xml.equals( value ) || DOMParserSupportedType.image_svg_xml.equals( value ) || DOMParserSupportedType.text_html.equals( value ) || DOMParserSupportedType.text_xml.equals( value );
    }
  }
}
