package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to define the cells that the header element relates to.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ScopeType.class
)
public @interface ScopeType {
  /**
   * The default value.
   */
  @Nonnull
  String auto = "auto";

  /**
   * The header relates to all cells of the column it belongs to.
   */
  @Nonnull
  String col = "col";

  /**
   * The header belongs to a colgroup and relates to all of its cells.
   */
  @Nonnull
  String colgroup = "colgroup";

  /**
   * The header relates to all cells of the row it belongs to.
   */
  @Nonnull
  String row = "row";

  /**
   * The header belongs to a rowgroup and relates to all of its cells. These cells can be
   * placed to the right or the left of the header, depending on the value of the <code>dir</code>
   * attribute in the <code>&lt;table&gt;</code> element.
   */
  @Nonnull
  String rowgroup = "rowgroup";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ScopeType.auto.equals( value ) || ScopeType.col.equals( value ) || ScopeType.colgroup.equals( value ) || ScopeType.row.equals( value ) || ScopeType.rowgroup.equals( value );
    }
  }
}
