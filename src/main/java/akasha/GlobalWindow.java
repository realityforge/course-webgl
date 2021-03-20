package akasha;

import akasha.core.AtomicsNamespace;
import akasha.core.JsMathNamespace;
import akasha.wasm.WebAssemblyNamespace;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The global <b>globalThis</b> property or the global object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/globalThis">globalThis - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "goog.global"
)
public final class GlobalWindow extends Window {
  private GlobalWindow() {
  }

  @JsProperty(
      name = "console"
  )
  @Nonnull
  public native ConsoleNamespace console();

  @JsProperty(
      name = "CSS"
  )
  @Nonnull
  public native CSSNamespace css();

  @JsProperty(
      name = "WebAssembly"
  )
  @Nonnull
  public native WebAssemblyNamespace webAssembly();

  @JsProperty(
      name = "Math"
  )
  @Nonnull
  public native JsMathNamespace math();

  @JsProperty(
      name = "Atomics"
  )
  @Nonnull
  public native AtomicsNamespace atomics();

  /**
   * The decodeURI() function decodes a Uniform Resource Identifier (URI) previously created by encodeURI() or by a similar routine.
   *
   * @return A new string representing the unencoded version of the given encoded Uniform Resource Identifier (URI).
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/decodeURI">decodeURI - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-decodeuri-encodeduri">decodeURI() - ECMA</a>
   */
  @Nonnull
  public native String decodeURI(@Nonnull String encodedURI);

  /**
   * The decodeURIComponent() function decodes a Uniform Resource Identifier (URI) component previously created by encodeURIComponent or by a similar routine.
   *
   * @return A new string representing the decoded version of the given encoded Uniform Resource Identifier (URI) component.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/decodeURIComponent">decodeURIComponent - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-decodeuricomponent-encodeduricomponent">decodeURIComponent() - ECMA</a>
   */
  @Nonnull
  public native String decodeURIComponent(@Nonnull String encodedURI);

  /**
   * The encodeURI() function encodes a URI by replacing each instance of certain characters by one, two, three, or four escape sequences representing the UTF-8 encoding of the character (will only be four escape sequences for characters composed of two "surrogate" characters).
   *
   * @return a new string representing the provided string encoded as a URI.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/encodeURI">encodeURI - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-encodeuri-uri">encodeURI() - ECMA</a>
   */
  @Nonnull
  public native String encodeURI(@Nonnull String uri);

  /**
   * The encodeURIComponent() function encodes a URI by replacing each instance of certain characters by one, two, three, or four escape sequences representing the UTF-8 encoding of the character (will only be four escape sequences for characters composed of two "surrogate" characters).
   *
   * @return a new string representing the provided string encoded as a URI component.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent">encodeURIComponent - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-encodeuricomponent-uricomponent">encodeURIComponent() - ECMA</a>
   */
  @Nonnull
  public native String encodeURIComponent(@Nonnull String uri);

  /**
   * The escape() function computes a new string in which certain characters have been replaced by a hexadecimal escape sequence.
   *
   * @return a new string in which certain characters have been escaped.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/escape">escape - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-escape-string">escape() - ECMA</a>
   * @deprecated
   */
  @Deprecated
  @Nonnull
  public native String escape(@Nonnull String str);

  /**
   * The eval() function evaluates JavaScript code represented as a string.
   *
   * @return The completion value of evaluating the given code. If the completion value is empty, undefined is returned.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval">eval - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-eval-x">eval() - ECMA</a>
   */
  @Nullable
  public native Any eval(@Nonnull String code);

  /**
   * The global isFinite() function determines whether the passed value is a finite number.
   *
   * @return false if the specified value positive or negative infinity or NaN else true.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/isFinite">isFinite - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-isfinite-number">isFinite() - ECMA</a>
   */
  public native boolean isFinite(double num);

  /**
   * The isNaN() function determines whether a value is NaN or not. Note, coercion inside the isNaN function has interesting rules; you may alternatively want to use Number.isNaN(), as defined in ECMAScript 2015.
   *
   * @return true if the specified value is NaN else false.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/isNaN">isNaN - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-isnan-number">isNaN() - ECMA</a>
   */
  public native boolean isNaN(double value);

  /**
   * The parseFloat() function parses an argument (converting it to a string first if needed) and returns a floating point number.
   *
   * @return a floating point number parsed from the given string.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/parseFloat">parseFloat - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-parsefloat-string">parseFloat() - ECMA</a>
   */
  public native double parseFloat(@Nonnull String string);

  /**
   * The parseInt() function parses a string argument and returns an integer of the specified radix (the base in mathematical numeral systems).
   *
   * @return an integer parsed from the given string.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/parseInt">parseInt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-parseint-string-radix">parseInt() - ECMA</a>
   */
  public native int parseInt(@Nonnull String string, int radix);

  /**
   * The parseInt() function parses a string argument and returns an integer of the specified radix (the base in mathematical numeral systems).
   *
   * @return an integer parsed from the given string.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/parseInt">parseInt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-parseint-string-radix">parseInt() - ECMA</a>
   */
  public native int parseInt(@Nonnull String string);

  /**
   * The unescape() function computes a new string in which hexadecimal escape sequences are replaced with the character that it represents. The escape sequences might be introduced by a function like escape. Usually, decodeURI or decodeURIComponent are preferred over unescape.
   *
   * @return a new string in which certain characters have been unescaped.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/unescape">unescape - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-unescape-string">unescape() - ECMA</a>
   * @deprecated
   */
  @Deprecated
  @Nonnull
  public native String unescape(@Nonnull String str);
}
