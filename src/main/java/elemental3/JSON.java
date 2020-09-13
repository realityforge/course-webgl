package elemental3;

import elemental2.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The JSON object contains methods for parsing JavaScript Object Notation (JSON) and converting values to JSON. It can't be called or constructed, and aside from its two method properties, it has no interesting functionality of its own.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON">JSON - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "JSON"
)
public class JSON {
  JSON() {
  }

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer,
      @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer,
      @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer,
      int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@Nullable Any value);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify - MDN</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value);

  /**
   * The JSON.parse() method parses a JSON string, constructing the JavaScript value or object described by the string. An optional reviver function can be provided to perform a transformation on the resulting object before it is returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse">JSON.parse - MDN</a>
   */
  @Nullable
  public static native Any parse(@Nonnull String text, @Nullable ParseReviverFn reviver);

  /**
   * The JSON.parse() method parses a JSON string, constructing the JavaScript value or object described by the string. An optional reviver function can be provided to perform a transformation on the resulting object before it is returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse">JSON.parse - MDN</a>
   */
  @Nullable
  public static native Any parse(@Nonnull String text);
}
