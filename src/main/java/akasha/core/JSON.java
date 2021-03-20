package akasha.core;

import akasha.StringOrLongLongUnion;
import akasha.lang.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The JSON object contains methods for parsing JavaScript Object Notation (JSON) and converting values to JSON.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON">MDN - JSON</a>
 * @see <a href="https://tc39.es/ecma262/#sec-json-object">Atomics - ECMA</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "JSON"
)
public class JSON {
  protected JSON() {
  }

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nullable StringifySpaceUnionType space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nonnull String space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer, int space);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringifyReplacerFn replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value,
      @Nonnull StringOrLongLongUnion[] replacer);

  /**
   * The JSON.stringify() method converts a JavaScript object or value to a JSON string, optionally replacing values if a replacer function is specified or optionally including only the specified properties if a replacer array is specified.
   * Throws a {@link akasha.core.TypeError} if a circular reference is found or an attempt is made to stringify a BigInt.
   *
   * @return A JSON string representing the given value.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify">JSON.stringify() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.stringify">JSON.stringify() - ECMA</a>
   */
  @Nonnull
  public static native String stringify(@DoNotAutobox @Nullable Object value);

  /**
   * The JSON.parse() method parses a JSON string, constructing the JavaScript value or object described by the string.
   * Throws a {@link akasha.core.SyntaxError} if the string to parse is not valid JSON.
   *
   * @return The Object, Array, string, number, boolean, or null value corresponding to the given JSON text.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse">JSON.parse() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.parse">JSON.parse() - ECMA</a>
   */
  @Nullable
  public static native Any parse(@Nonnull String text, @Nullable ParseReviverFn reviver);

  /**
   * The JSON.parse() method parses a JSON string, constructing the JavaScript value or object described by the string.
   * Throws a {@link akasha.core.SyntaxError} if the string to parse is not valid JSON.
   *
   * @return The Object, Array, string, number, boolean, or null value corresponding to the given JSON text.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse">JSON.parse() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-json.parse">JSON.parse() - ECMA</a>
   */
  @Nullable
  public static native Any parse(@Nonnull String text);
}
