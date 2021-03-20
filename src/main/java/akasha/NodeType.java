package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        Node.ELEMENT_NODE,
        Node.ATTRIBUTE_NODE,
        Node.TEXT_NODE,
        Node.CDATA_SECTION_NODE,
        Node.ENTITY_REFERENCE_NODE,
        Node.ENTITY_NODE,
        Node.PROCESSING_INSTRUCTION_NODE,
        Node.COMMENT_NODE,
        Node.DOCUMENT_NODE,
        Node.DOCUMENT_TYPE_NODE,
        Node.DOCUMENT_FRAGMENT_NODE,
        Node.NOTATION_NODE
    }
)
public @interface NodeType {
  final class Util {
    private Util() {
    }

    @NodeType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@NodeType annotated value must be one of [Node.ELEMENT_NODE, Node.ATTRIBUTE_NODE, Node.TEXT_NODE, Node.CDATA_SECTION_NODE, Node.ENTITY_REFERENCE_NODE, Node.ENTITY_NODE, Node.PROCESSING_INSTRUCTION_NODE, Node.COMMENT_NODE, Node.DOCUMENT_NODE, Node.DOCUMENT_TYPE_NODE, Node.DOCUMENT_FRAGMENT_NODE, Node.NOTATION_NODE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return Node.ELEMENT_NODE == value || Node.ATTRIBUTE_NODE == value || Node.TEXT_NODE == value || Node.CDATA_SECTION_NODE == value || Node.ENTITY_REFERENCE_NODE == value || Node.ENTITY_NODE == value || Node.PROCESSING_INSTRUCTION_NODE == value || Node.COMMENT_NODE == value || Node.DOCUMENT_NODE == value || Node.DOCUMENT_TYPE_NODE == value || Node.DOCUMENT_FRAGMENT_NODE == value || Node.NOTATION_NODE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return Node.ELEMENT_NODE == value ? "ELEMENT_NODE" : Node.ATTRIBUTE_NODE == value ? "ATTRIBUTE_NODE" : Node.TEXT_NODE == value ? "TEXT_NODE" : Node.CDATA_SECTION_NODE == value ? "CDATA_SECTION_NODE" : Node.ENTITY_REFERENCE_NODE == value ? "ENTITY_REFERENCE_NODE" : Node.ENTITY_NODE == value ? "ENTITY_NODE" : Node.PROCESSING_INSTRUCTION_NODE == value ? "PROCESSING_INSTRUCTION_NODE" : Node.COMMENT_NODE == value ? "COMMENT_NODE" : Node.DOCUMENT_NODE == value ? "DOCUMENT_NODE" : Node.DOCUMENT_TYPE_NODE == value ? "DOCUMENT_TYPE_NODE" : Node.DOCUMENT_FRAGMENT_NODE == value ? "DOCUMENT_FRAGMENT_NODE" : Node.NOTATION_NODE == value ? "NOTATION_NODE" : "Unknown value " + value;
    }
  }
}
