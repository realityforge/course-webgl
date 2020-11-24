package elemental3.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The data type symbol is a primitive data type. The Symbol() function returns a value of type symbol, has static properties that expose several members of built-in objects, has static methods that expose the global symbol registry, and resembles a built-in object class, but is incomplete as a constructor because it does not support the syntax &quot;new Symbol()&quot;.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol">Symbol - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-symbol-objects">The definition of 'Symbol' in the 'ECMAScript (ECMA-262)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Symbol"
)
public class Symbol {
  protected Symbol() {
  }

  @JsProperty(
      name = "asyncIterator"
  )
  @Nonnull
  public static native Symbol asyncIterator();

  @JsProperty(
      name = "hasInstance"
  )
  @Nonnull
  public static native Symbol hasInstance();

  @JsProperty(
      name = "isConcatSpreadable"
  )
  @Nonnull
  public static native Symbol isConcatSpreadable();

  @JsProperty(
      name = "iterator"
  )
  @Nonnull
  public static native Symbol iterator();

  @JsProperty(
      name = "match"
  )
  @Nonnull
  public static native Symbol match();

  @JsProperty(
      name = "matchAll"
  )
  @Nonnull
  public static native Symbol matchAll();

  @JsProperty(
      name = "replace"
  )
  @Nonnull
  public static native Symbol replace();

  @JsProperty(
      name = "search"
  )
  @Nonnull
  public static native Symbol search();

  @JsProperty(
      name = "species"
  )
  @Nonnull
  public static native Symbol species();

  @JsProperty(
      name = "split"
  )
  @Nonnull
  public static native Symbol split();

  @JsProperty(
      name = "toPrimitive"
  )
  @Nonnull
  public static native Symbol toPrimitive();

  @JsProperty(
      name = "toStringTag"
  )
  @Nonnull
  public static native Symbol toStringTag();

  @JsProperty(
      name = "unscopables"
  )
  @Nonnull
  public static native Symbol unscopables();

  @JsMethod(
      name = "for"
  )
  @Nonnull
  public static native Symbol for_(@Nonnull String key);

  /**
   * The Symbol.keyFor(sym) method retrieves a shared symbol key from the global symbol registry for the given symbol.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol/keyFor">Symbol.keyFor - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-symbol.keyfor">The definition of 'Symbol.keyFor' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @Nonnull
  public static native String keyFor(@Nonnull Symbol symbol);

  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
