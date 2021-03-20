package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        DOMException.INDEX_SIZE_ERR,
        DOMException.DOMSTRING_SIZE_ERR,
        DOMException.HIERARCHY_REQUEST_ERR,
        DOMException.WRONG_DOCUMENT_ERR,
        DOMException.INVALID_CHARACTER_ERR,
        DOMException.NO_DATA_ALLOWED_ERR,
        DOMException.NO_MODIFICATION_ALLOWED_ERR,
        DOMException.NOT_FOUND_ERR,
        DOMException.NOT_SUPPORTED_ERR,
        DOMException.INUSE_ATTRIBUTE_ERR,
        DOMException.INVALID_STATE_ERR,
        DOMException.SYNTAX_ERR,
        DOMException.INVALID_MODIFICATION_ERR,
        DOMException.NAMESPACE_ERR,
        DOMException.INVALID_ACCESS_ERR,
        DOMException.VALIDATION_ERR,
        DOMException.TYPE_MISMATCH_ERR,
        DOMException.SECURITY_ERR,
        DOMException.NETWORK_ERR,
        DOMException.ABORT_ERR,
        DOMException.URL_MISMATCH_ERR,
        DOMException.QUOTA_EXCEEDED_ERR,
        DOMException.TIMEOUT_ERR,
        DOMException.INVALID_NODE_TYPE_ERR,
        DOMException.DATA_CLONE_ERR
    }
)
public @interface DOMExceptionCode {
  final class Util {
    private Util() {
    }

    @DOMExceptionCode
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@DOMExceptionCode annotated value must be one of [DOMException.INDEX_SIZE_ERR, DOMException.DOMSTRING_SIZE_ERR, DOMException.HIERARCHY_REQUEST_ERR, DOMException.WRONG_DOCUMENT_ERR, DOMException.INVALID_CHARACTER_ERR, DOMException.NO_DATA_ALLOWED_ERR, DOMException.NO_MODIFICATION_ALLOWED_ERR, DOMException.NOT_FOUND_ERR, DOMException.NOT_SUPPORTED_ERR, DOMException.INUSE_ATTRIBUTE_ERR, DOMException.INVALID_STATE_ERR, DOMException.SYNTAX_ERR, DOMException.INVALID_MODIFICATION_ERR, DOMException.NAMESPACE_ERR, DOMException.INVALID_ACCESS_ERR, DOMException.VALIDATION_ERR, DOMException.TYPE_MISMATCH_ERR, DOMException.SECURITY_ERR, DOMException.NETWORK_ERR, DOMException.ABORT_ERR, DOMException.URL_MISMATCH_ERR, DOMException.QUOTA_EXCEEDED_ERR, DOMException.TIMEOUT_ERR, DOMException.INVALID_NODE_TYPE_ERR, DOMException.DATA_CLONE_ERR] but is " + value;
    }

    public static boolean isValid(final int value) {
      return DOMException.INDEX_SIZE_ERR == value || DOMException.DOMSTRING_SIZE_ERR == value || DOMException.HIERARCHY_REQUEST_ERR == value || DOMException.WRONG_DOCUMENT_ERR == value || DOMException.INVALID_CHARACTER_ERR == value || DOMException.NO_DATA_ALLOWED_ERR == value || DOMException.NO_MODIFICATION_ALLOWED_ERR == value || DOMException.NOT_FOUND_ERR == value || DOMException.NOT_SUPPORTED_ERR == value || DOMException.INUSE_ATTRIBUTE_ERR == value || DOMException.INVALID_STATE_ERR == value || DOMException.SYNTAX_ERR == value || DOMException.INVALID_MODIFICATION_ERR == value || DOMException.NAMESPACE_ERR == value || DOMException.INVALID_ACCESS_ERR == value || DOMException.VALIDATION_ERR == value || DOMException.TYPE_MISMATCH_ERR == value || DOMException.SECURITY_ERR == value || DOMException.NETWORK_ERR == value || DOMException.ABORT_ERR == value || DOMException.URL_MISMATCH_ERR == value || DOMException.QUOTA_EXCEEDED_ERR == value || DOMException.TIMEOUT_ERR == value || DOMException.INVALID_NODE_TYPE_ERR == value || DOMException.DATA_CLONE_ERR == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return DOMException.INDEX_SIZE_ERR == value ? "INDEX_SIZE_ERR" : DOMException.DOMSTRING_SIZE_ERR == value ? "DOMSTRING_SIZE_ERR" : DOMException.HIERARCHY_REQUEST_ERR == value ? "HIERARCHY_REQUEST_ERR" : DOMException.WRONG_DOCUMENT_ERR == value ? "WRONG_DOCUMENT_ERR" : DOMException.INVALID_CHARACTER_ERR == value ? "INVALID_CHARACTER_ERR" : DOMException.NO_DATA_ALLOWED_ERR == value ? "NO_DATA_ALLOWED_ERR" : DOMException.NO_MODIFICATION_ALLOWED_ERR == value ? "NO_MODIFICATION_ALLOWED_ERR" : DOMException.NOT_FOUND_ERR == value ? "NOT_FOUND_ERR" : DOMException.NOT_SUPPORTED_ERR == value ? "NOT_SUPPORTED_ERR" : DOMException.INUSE_ATTRIBUTE_ERR == value ? "INUSE_ATTRIBUTE_ERR" : DOMException.INVALID_STATE_ERR == value ? "INVALID_STATE_ERR" : DOMException.SYNTAX_ERR == value ? "SYNTAX_ERR" : DOMException.INVALID_MODIFICATION_ERR == value ? "INVALID_MODIFICATION_ERR" : DOMException.NAMESPACE_ERR == value ? "NAMESPACE_ERR" : DOMException.INVALID_ACCESS_ERR == value ? "INVALID_ACCESS_ERR" : DOMException.VALIDATION_ERR == value ? "VALIDATION_ERR" : DOMException.TYPE_MISMATCH_ERR == value ? "TYPE_MISMATCH_ERR" : DOMException.SECURITY_ERR == value ? "SECURITY_ERR" : DOMException.NETWORK_ERR == value ? "NETWORK_ERR" : DOMException.ABORT_ERR == value ? "ABORT_ERR" : DOMException.URL_MISMATCH_ERR == value ? "URL_MISMATCH_ERR" : DOMException.QUOTA_EXCEEDED_ERR == value ? "QUOTA_EXCEEDED_ERR" : DOMException.TIMEOUT_ERR == value ? "TIMEOUT_ERR" : DOMException.INVALID_NODE_TYPE_ERR == value ? "INVALID_NODE_TYPE_ERR" : DOMException.DATA_CLONE_ERR == value ? "DATA_CLONE_ERR" : "Unknown value " + value;
    }
  }
}
