package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * A key range can be a single value or a range with upper and lower bounds or endpoints. If the key range has both upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain range, you can use the following code constructs:
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange">IDBKeyRange - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBKeyRange"
)
public class IDBKeyRange {
  IDBKeyRange() {
  }

  /**
   * The lower bound of the key range (can be any type.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/lower">IDBKeyRange.lower - MDN</a>
   */
  @JsProperty(
      name = "lower"
  )
  @Nullable
  public native Any lower();

  /**
   * A boolean:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/lowerOpen">IDBKeyRange.lowerOpen - MDN</a>
   */
  @JsProperty(
      name = "lowerOpen"
  )
  public native boolean lowerOpen();

  /**
   * The upper bound of the key range (can be any type.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/upper">IDBKeyRange.upper - MDN</a>
   */
  @JsProperty(
      name = "upper"
  )
  @Nullable
  public native Any upper();

  /**
   * A boolean:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/upperOpen">IDBKeyRange.upperOpen - MDN</a>
   */
  @JsProperty(
      name = "upperOpen"
  )
  public native boolean upperOpen();

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @Nullable Any upper,
      boolean lowerOpen, boolean upperOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@DoNotAutobox @Nullable Object lower, @Nullable Any upper,
      boolean lowerOpen, boolean upperOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @DoNotAutobox @Nullable Object upper,
      boolean lowerOpen, boolean upperOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@DoNotAutobox @Nullable Object lower,
      @DoNotAutobox @Nullable Object upper, boolean lowerOpen, boolean upperOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @Nullable Any upper,
      boolean lowerOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@DoNotAutobox @Nullable Object lower, @Nullable Any upper,
      boolean lowerOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @DoNotAutobox @Nullable Object upper,
      boolean lowerOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@DoNotAutobox @Nullable Object lower,
      @DoNotAutobox @Nullable Object upper, boolean lowerOpen);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @Nullable Any upper);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@DoNotAutobox @Nullable Object lower, @Nullable Any upper);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @DoNotAutobox @Nullable Object upper);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/bound">IDBKeyRange.bound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange bound(@DoNotAutobox @Nullable Object lower,
      @DoNotAutobox @Nullable Object upper);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/lowerBound">IDBKeyRange.lowerBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange lowerBound(@Nullable Any lower, boolean open);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/lowerBound">IDBKeyRange.lowerBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange lowerBound(@DoNotAutobox @Nullable Object lower, boolean open);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/lowerBound">IDBKeyRange.lowerBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange lowerBound(@Nullable Any lower);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/lowerBound">IDBKeyRange.lowerBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange lowerBound(@DoNotAutobox @Nullable Object lower);

  /**
   * value is the value for the new key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/only">IDBKeyRange.only - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange only(@Nullable Any value);

  /**
   * value is the value for the new key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/only">IDBKeyRange.only - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange only(@DoNotAutobox @Nullable Object value);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/upperBound">IDBKeyRange.upperBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange upperBound(@Nullable Any upper, boolean open);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/upperBound">IDBKeyRange.upperBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange upperBound(@DoNotAutobox @Nullable Object upper, boolean open);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/upperBound">IDBKeyRange.upperBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange upperBound(@Nullable Any upper);

  /**
   * IDBKeyRange: The newly created key range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/upperBound">IDBKeyRange.upperBound - MDN</a>
   */
  @Nonnull
  public static native IDBKeyRange upperBound(@DoNotAutobox @Nullable Object upper);

  /**
   * key The key you want to check for in your key range. This can be any type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/includes">IDBKeyRange.includes - MDN</a>
   */
  public native boolean includes(@Nullable Any key);

  /**
   * key The key you want to check for in your key range. This can be any type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBKeyRange/includes">IDBKeyRange.includes - MDN</a>
   */
  public native boolean includes(@DoNotAutobox @Nullable Object key);
}
