package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  final class Util {
    private Util() {
    }

    @FileReaderReadyState
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@FileReaderReadyState annotated value must be one of [FileReader.EMPTY, FileReader.LOADING, FileReader.DONE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return FileReader.EMPTY == value || FileReader.LOADING == value || FileReader.DONE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return FileReader.EMPTY == value ? "EMPTY" : FileReader.LOADING == value ? "LOADING" : FileReader.DONE == value ? "DONE" : "Unknown value " + value;
    }
  }
}
