package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        FileReader.EMPTY,
        FileReader.LOADING,
        FileReader.DONE
    }
)
public @interface FileReaderReadyState {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return FileReader.EMPTY == value || FileReader.LOADING == value || FileReader.DONE == value;
    }
  }
}
