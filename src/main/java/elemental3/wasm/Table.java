package elemental3.wasm;

import elemental3.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebAssembly.Table() object is a JavaScript wrapper object &mdash; an array-like structure representing a WebAssembly Table, which stores function references. A table created by JavaScript or in WebAssembly code will be accessible and mutable from both JavaScript and WebAssembly.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table">WebAssembly.Table - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Table"
)
public class Table {
  public Table(@Nonnull final TableDescriptor descriptor) {
  }

  /**
   * The length prototype property of the WebAssembly.Table object returns the length of the table, i.e. the number of elements in the table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/length">WebAssembly.Table.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The get() prototype method of the WebAssembly.Table() object retrieves a function reference stored at a given index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/get">WebAssembly.Table.get - MDN</a>
   */
  @Nullable
  public native Function get(int index);

  /**
   * The grow() prototype method of the WebAssembly.Table object increases the size of the Table instance by a specified number of elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/grow">WebAssembly.Table.grow - MDN</a>
   */
  public native int grow(int delta);

  /**
   * The set() prototype method of the WebAssembly.Table object mutates a reference stored at a given index to a different value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Table/set">WebAssembly.Table.set - MDN</a>
   */
  public native void set(int index, @Nullable Function value);
}
