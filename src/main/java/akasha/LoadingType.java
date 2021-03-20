package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to indicate how the browser should load the resource.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = LoadingType.class
)
public @interface LoadingType {
  /**
   * Load the resource immediately, regardless of whether or not the resource is currently within
   * the visible viewport (this is the default value).
   */
  @Nonnull
  String eager = "eager";

  /**
   * Defer loading of the resource until it reaches a calculated distance from the viewport, as defined
   * by the browser. The intent is to avoid the network and storage bandwidth needed to handle the image
   * until it's reasonably certain that it will be needed. This generally improves the performance of the
   * content in most typical use cases.
   */
  @Nonnull
  String lazy = "lazy";

  final class Util {
    private Util() {
    }

    @LoadingType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return LoadingType.eager.equals( value ) || LoadingType.lazy.equals( value );
    }
  }
}
