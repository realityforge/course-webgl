package akasha.core;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The String object is used to represent and manipulate a sequence of characters.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String">String - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-string-objects">String - ECMAScript (ECMA-262)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "String"
)
public class JsString {
  public JsString(@Nonnull final String str) {
  }

  public JsString() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The static String.fromCharCode() method returns a string created from the specified sequence of UTF-16 code units.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCharCode">String.fromCharCode - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.fromcharcode">String.fromCharCode - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public static native String fromCharCode(int... charCodes);

  /**
   * The static String.fromCodePoint() method returns a string created by using the specified sequence of code points.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCodePoint">String.fromCodePoint - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.fromcodepoint">String.fromCodePoint - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public static native String fromCodePoint(int codePoint, int... codePoints);

  /**
   * The String object's charAt() method returns a new string consisting of the single UTF-16 code unit located at the specified offset into the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/charAt">String.charAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.charat">String.prototype.charAt - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String charAt(int index);

  /**
   * The charCodeAt() method returns an integer between 0 and 65535 representing the UTF-16 code unit at the given index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/charCodeAt">String.charCodeAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.charcodeat">String.prototype.charCodeAt - ECMAScript (ECMA-262)</a>
   */
  public native int charCodeAt();

  /**
   * The charCodeAt() method returns an integer between 0 and 65535 representing the UTF-16 code unit at the given index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/charCodeAt">String.charCodeAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.charcodeat">String.prototype.charCodeAt - ECMAScript (ECMA-262)</a>
   */
  public native int charCodeAt(int index);

  /**
   * The codePointAt() method returns a non-negative integer that is the UTF-16 code point value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/codePointAt">String.codePointAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.codepointat">String.prototype.codePointAt - ECMAScript (ECMA-262)</a>
   */
  public native int codePointAt(int index);

  /**
   * The concat() method concatenates the string arguments to the calling string and returns a new string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/concat">String.concat - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.concat">String.prototype.concat - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String concat(@Nonnull String... strings);

  /**
   * The endsWith() method determines whether a string ends with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/endsWith">String.endsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.endswith">String.prototype.endsWith - ECMAScript (ECMA-262)</a>
   */
  public native boolean endsWith(@Nonnull String searchString, int position);

  /**
   * The endsWith() method determines whether a string ends with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/endsWith">String.endsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.endswith">String.prototype.endsWith - ECMAScript (ECMA-262)</a>
   */
  public native boolean endsWith(@Nonnull String searchString);

  /**
   * The includes() method performs a case-sensitive search to determine whether one string may be found within another string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes">String.includes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.includes">String.prototype.includes - ECMAScript (ECMA-262)</a>
   */
  public native boolean includes(@Nonnull String searchString, int position);

  /**
   * The includes() method performs a case-sensitive search to determine whether one string may be found within another string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes">String.includes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.includes">String.prototype.includes - ECMAScript (ECMA-262)</a>
   */
  public native boolean includes(@Nonnull String searchString);

  /**
   * The indexOf() method returns the index within the calling String object of the first occurrence of the specified value, starting the search at fromIndex. Returns -1 if the value is not found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf">String.indexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.indexof">String.prototype.indexOf - ECMAScript (ECMA-262)</a>
   */
  public native int indexOf(@Nonnull String searchValue, int fromIndex);

  /**
   * The indexOf() method returns the index within the calling String object of the first occurrence of the specified value, starting the search at fromIndex. Returns -1 if the value is not found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf">String.indexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.indexof">String.prototype.indexOf - ECMAScript (ECMA-262)</a>
   */
  public native int indexOf(@Nonnull String searchValue);

  /**
   * The lastIndexOf() method returns the index within the calling String object of the last occurrence of the specified value, searching backwards from fromIndex. Returns -1 if the value is not found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf">String.lastIndexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.lastindexof">String.prototype.lastIndexOf - ECMAScript (ECMA-262)</a>
   */
  public native int lastIndexOf(@Nonnull String searchValue, int fromIndex);

  /**
   * The lastIndexOf() method returns the index within the calling String object of the last occurrence of the specified value, searching backwards from fromIndex. Returns -1 if the value is not found.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf">String.lastIndexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.lastindexof">String.prototype.lastIndexOf - ECMAScript (ECMA-262)</a>
   */
  public native int lastIndexOf(@Nonnull String searchValue);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.localecompare">String.prototype.localeCompare - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare">String.prototype.localeCompare - ECMAScript Internationalization API (ECMA-402)</a>
   */
  public native int localeCompare(@Nonnull String compareString, @Nonnull String locales,
      @Nonnull Object options);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.localecompare">String.prototype.localeCompare - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare">String.prototype.localeCompare - ECMAScript Internationalization API (ECMA-402)</a>
   */
  public native int localeCompare(@Nonnull String compareString, @Nonnull JsArray<String> locales,
      @Nonnull Object options);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.localecompare">String.prototype.localeCompare - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare">String.prototype.localeCompare - ECMAScript Internationalization API (ECMA-402)</a>
   */
  public native int localeCompare(@Nonnull String compareString, @Nonnull String[] locales,
      @Nonnull Object options);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.localecompare">String.prototype.localeCompare - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare">String.prototype.localeCompare - ECMAScript Internationalization API (ECMA-402)</a>
   */
  public native int localeCompare(@Nonnull String compareString, @Nonnull String locales);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.localecompare">String.prototype.localeCompare - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare">String.prototype.localeCompare - ECMAScript Internationalization API (ECMA-402)</a>
   */
  public native int localeCompare(@Nonnull String compareString, @Nonnull JsArray<String> locales);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.localecompare">String.prototype.localeCompare - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare">String.prototype.localeCompare - ECMAScript Internationalization API (ECMA-402)</a>
   */
  public native int localeCompare(@Nonnull String compareString, @Nonnull String[] locales);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.localecompare">String.prototype.localeCompare - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare">String.prototype.localeCompare - ECMAScript Internationalization API (ECMA-402)</a>
   */
  public native int localeCompare(@Nonnull String compareString);

  /**
   * The match() method retrieves the result of matching a string against a regular expression.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/match">String.match - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.match">String.prototype.match - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native JsArray<String> match(@Nonnull RegExp regexp);

  /**
   * The match() method retrieves the result of matching a string against a regular expression.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/match">String.match - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.match">String.prototype.match - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native JsArray<String> match(@Nonnull String regexp);

  /**
   * The normalize() method returns the Unicode Normalization Form of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/normalize">String.normalize - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.normalize">String.prototype.normalize - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String normalize(@Nonnull String form);

  /**
   * The normalize() method returns the Unicode Normalization Form of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/normalize">String.normalize - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.normalize">String.prototype.normalize - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String normalize();

  /**
   * The padEnd() method pads the current string with a given string (repeated, if needed) so that the resulting string reaches a given length. The padding is applied from the end of the current string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padEnd">String.padEnd - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.padend">String.prototype.padEnd - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String padEnd(int targetLength, @Nonnull String padString);

  /**
   * The padEnd() method pads the current string with a given string (repeated, if needed) so that the resulting string reaches a given length. The padding is applied from the end of the current string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padEnd">String.padEnd - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.padend">String.prototype.padEnd - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String padEnd(int targetLength);

  /**
   * The padStart() method pads the current string with another string (multiple times, if needed) until the resulting string reaches the given length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padStart">String.padStart - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.padstart">String.prototype.padStart - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String padStart(int targetLength, @Nonnull String padString);

  /**
   * The padStart() method pads the current string with another string (multiple times, if needed) until the resulting string reaches the given length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padStart">String.padStart - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.padstart">String.prototype.padStart - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String padStart(int targetLength);

  /**
   * The repeat() method constructs and returns a new string which contains the specified number of copies of the string on which it was called, concatenated together.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/repeat">String.repeat - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.repeat">String.prototype.repeat - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String repeat(int count);

  /**
   * The replace() method returns a new string with some or all matches of a pattern replaced by a replacement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace">String.replace - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.replace">String.prototype.replace - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String replace(@Nonnull RegExp pattern, @Nonnull String replacement);

  /**
   * The replace() method returns a new string with some or all matches of a pattern replaced by a replacement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace">String.replace - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.replace">String.prototype.replace - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String replace(@Nonnull String pattern, @Nonnull String replacement);

  /**
   * The search() method executes a search for a match between a regular expression and this String object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/search">String.search - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.search">String.prototype.search - ECMAScript (ECMA-262)</a>
   */
  public native int search(@Nonnull RegExp pattern);

  /**
   * The search() method executes a search for a match between a regular expression and this String object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/search">String.search - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.search">String.prototype.search - ECMAScript (ECMA-262)</a>
   */
  public native int search(@Nonnull String pattern);

  /**
   * The slice() method extracts a section of a string and returns it as a new string, without modifying the original string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/slice">String.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.slice">String.prototype.slice - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String slice(int begin, int end);

  /**
   * The slice() method extracts a section of a string and returns it as a new string, without modifying the original string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/slice">String.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.slice">String.prototype.slice - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String slice(int begin);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.split">String.prototype.split - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native JsArray<String> split(@Nonnull RegExp separator, int limit);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.split">String.prototype.split - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native JsArray<String> split(@Nonnull String separator, int limit);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.split">String.prototype.split - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native JsArray<String> split(@Nonnull RegExp separator);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.split">String.prototype.split - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native JsArray<String> split(@Nonnull String separator);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.split">String.prototype.split - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native JsArray<String> split();

  /**
   * The startsWith() method determines whether a string begins with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/startsWith">String.startsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.startswith">String.prototype.startsWith - ECMAScript (ECMA-262)</a>
   */
  public native boolean startsWith(@Nonnull String searchString, int position);

  /**
   * The startsWith() method determines whether a string begins with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/startsWith">String.startsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.startswith">String.prototype.startsWith - ECMAScript (ECMA-262)</a>
   */
  public native boolean startsWith(@Nonnull String searchString);

  /**
   * The substring() method returns the part of the string between the start and end indexes, or to the end of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/substring">String.substring - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.substring">String.prototype.substring - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String substring(int start, int end);

  /**
   * The substring() method returns the part of the string between the start and end indexes, or to the end of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/substring">String.substring - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.substring">String.prototype.substring - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String substring(int start);

  /**
   * The toLocaleLowerCase() method returns the calling string value converted to lower case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleLowerCase">String.toLocaleLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tolocalelowercase">String.prototype.toLocaleLowerCase - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocalelowercase">String.prototype.toLocaleLowerCase - ECMAScript Internationalization API (ECMA-402)</a>
   */
  @Nonnull
  public native String toLocaleLowerCase(@Nonnull JsArray<String> locales);

  /**
   * The toLocaleLowerCase() method returns the calling string value converted to lower case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleLowerCase">String.toLocaleLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tolocalelowercase">String.prototype.toLocaleLowerCase - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocalelowercase">String.prototype.toLocaleLowerCase - ECMAScript Internationalization API (ECMA-402)</a>
   */
  @Nonnull
  public native String toLocaleLowerCase(@Nonnull String[] locales);

  /**
   * The toLocaleLowerCase() method returns the calling string value converted to lower case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleLowerCase">String.toLocaleLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tolocalelowercase">String.prototype.toLocaleLowerCase - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocalelowercase">String.prototype.toLocaleLowerCase - ECMAScript Internationalization API (ECMA-402)</a>
   */
  @Nonnull
  public native String toLocaleLowerCase();

  /**
   * The toLocaleUpperCase() method returns the calling string value converted to upper case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleUpperCase">String.toLocaleUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tolocaleuppercase">String.prototype.toLocaleUpperCase - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocaleuppercase">String.prototype.toLocaleUpperCase - ECMAScript Internationalization API (ECMA-402)</a>
   */
  @Nonnull
  public native String toLocaleUpperCase(@Nonnull JsArray<String> locales);

  /**
   * The toLocaleUpperCase() method returns the calling string value converted to upper case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleUpperCase">String.toLocaleUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tolocaleuppercase">String.prototype.toLocaleUpperCase - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocaleuppercase">String.prototype.toLocaleUpperCase - ECMAScript Internationalization API (ECMA-402)</a>
   */
  @Nonnull
  public native String toLocaleUpperCase(@Nonnull String[] locales);

  /**
   * The toLocaleUpperCase() method returns the calling string value converted to upper case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleUpperCase">String.toLocaleUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tolocaleuppercase">String.prototype.toLocaleUpperCase - ECMAScript (ECMA-262)</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocaleuppercase">String.prototype.toLocaleUpperCase - ECMAScript Internationalization API (ECMA-402)</a>
   */
  @Nonnull
  public native String toLocaleUpperCase();

  /**
   * The toLowerCase() method returns the calling string value converted to lower case.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLowerCase">String.toLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tolowercase">String.prototype.toLowerCase - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String toLowerCase();

  /**
   * The toUpperCase() method returns the calling string value converted to uppercase (the value will be converted to a string if it isn't one).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toUpperCase">String.toUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.touppercase">String.prototype.toUpperCase - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String toUpperCase();

  /**
   * The trim() method removes whitespace from both ends of a string. Whitespace in this context is all the whitespace characters (space, tab, no-break space, etc.) and all the line terminator characters (LF, CR, etc.).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/trim">String.trim - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.trim">String.prototype.trim - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String trim();

  /**
   * The trimEnd() method removes whitespace from the end of a string. trimRight() is an alias of this method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/trimEnd">String.trimEnd - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.trimend">String.prototype.trimEnd - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String trimEnd();

  @Nonnull
  public native String trimLeft();

  @Nonnull
  public native String trimRight();

  /**
   * The trimStart() method removes whitespace from the beginning of a string. trimLeft() is an alias of this method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/trimStart">String.trimStart - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.trimstart"> String.prototype.trimStart - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String trimStart();

  /**
   * The valueOf() method returns the primitive value of a String object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/valueOf">String.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.valueof">String.prototype.valueOf - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String valueOf();

  /**
   * The toString() method returns a string representing the specified object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toString">String.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-string.prototype.tostring">String.prototype.toString - ECMAScript (ECMA-262)</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
