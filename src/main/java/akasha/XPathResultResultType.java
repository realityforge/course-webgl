package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        XPathResult.ANY_TYPE,
        XPathResult.NUMBER_TYPE,
        XPathResult.STRING_TYPE,
        XPathResult.BOOLEAN_TYPE,
        XPathResult.UNORDERED_NODE_ITERATOR_TYPE,
        XPathResult.ORDERED_NODE_ITERATOR_TYPE,
        XPathResult.UNORDERED_NODE_SNAPSHOT_TYPE,
        XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,
        XPathResult.ANY_UNORDERED_NODE_TYPE,
        XPathResult.FIRST_ORDERED_NODE_TYPE
    }
)
public @interface XPathResultResultType {
  final class Util {
    private Util() {
    }

    @XPathResultResultType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@XPathResultResultType annotated value must be one of [XPathResult.ANY_TYPE, XPathResult.STRING_TYPE, XPathResult.NUMBER_TYPE, XPathResult.BOOLEAN_TYPE, XPathResult.UNORDERED_NODE_ITERATOR_TYPE, XPathResult.ORDERED_NODE_ITERATOR_TYPE, XPathResult.UNORDERED_NODE_SNAPSHOT_TYPE, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, XPathResult.ANY_UNORDERED_NODE_TYPE, XPathResult.FIRST_ORDERED_NODE_TYPE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return XPathResult.ANY_TYPE == value || XPathResult.STRING_TYPE == value || XPathResult.NUMBER_TYPE == value || XPathResult.BOOLEAN_TYPE == value || XPathResult.UNORDERED_NODE_ITERATOR_TYPE == value || XPathResult.ORDERED_NODE_ITERATOR_TYPE == value || XPathResult.UNORDERED_NODE_SNAPSHOT_TYPE == value || XPathResult.ORDERED_NODE_SNAPSHOT_TYPE == value || XPathResult.ANY_UNORDERED_NODE_TYPE == value || XPathResult.FIRST_ORDERED_NODE_TYPE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return XPathResult.ANY_TYPE == value ? "ANY_TYPE" : XPathResult.STRING_TYPE == value ? "STRING_TYPE" : XPathResult.NUMBER_TYPE == value ? "NUMBER_TYPE" : XPathResult.BOOLEAN_TYPE == value ? "BOOLEAN_TYPE" : XPathResult.UNORDERED_NODE_ITERATOR_TYPE == value ? "UNORDERED_NODE_ITERATOR_TYPE" : XPathResult.ORDERED_NODE_ITERATOR_TYPE == value ? "ORDERED_NODE_ITERATOR_TYPE" : XPathResult.UNORDERED_NODE_SNAPSHOT_TYPE == value ? "UNORDERED_NODE_SNAPSHOT_TYPE" : XPathResult.ORDERED_NODE_SNAPSHOT_TYPE == value ? "ORDERED_NODE_SNAPSHOT_TYPE" : XPathResult.ANY_UNORDERED_NODE_TYPE == value ? "ANY_UNORDERED_NODE_TYPE" : XPathResult.FIRST_ORDERED_NODE_TYPE == value ? "FIRST_ORDERED_NODE_TYPE" : "Unknown value " + value;
    }
  }
}
