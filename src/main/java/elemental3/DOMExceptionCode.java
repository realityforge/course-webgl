package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
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
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return DOMException.INDEX_SIZE_ERR == value || DOMException.DOMSTRING_SIZE_ERR == value || DOMException.HIERARCHY_REQUEST_ERR == value || DOMException.WRONG_DOCUMENT_ERR == value || DOMException.INVALID_CHARACTER_ERR == value || DOMException.NO_DATA_ALLOWED_ERR == value || DOMException.NO_MODIFICATION_ALLOWED_ERR == value || DOMException.NOT_FOUND_ERR == value || DOMException.NOT_SUPPORTED_ERR == value || DOMException.INUSE_ATTRIBUTE_ERR == value || DOMException.INVALID_STATE_ERR == value || DOMException.SYNTAX_ERR == value || DOMException.INVALID_MODIFICATION_ERR == value || DOMException.NAMESPACE_ERR == value || DOMException.INVALID_ACCESS_ERR == value || DOMException.VALIDATION_ERR == value || DOMException.TYPE_MISMATCH_ERR == value || DOMException.SECURITY_ERR == value || DOMException.NETWORK_ERR == value || DOMException.ABORT_ERR == value || DOMException.URL_MISMATCH_ERR == value || DOMException.QUOTA_EXCEEDED_ERR == value || DOMException.TIMEOUT_ERR == value || DOMException.INVALID_NODE_TYPE_ERR == value || DOMException.DATA_CLONE_ERR == value;
    }
  }
}
