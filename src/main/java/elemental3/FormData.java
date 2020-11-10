package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The FormData interface provides a way to easily construct a set of key/value pairs representing form fields and their values, which can then be easily sent using the XMLHttpRequest.send() method. It uses the same format a form would use if the encoding type were set to &quot;multipart/form-data&quot;.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData">FormData - MDN</a>
 * @see <a href="https://xhr.spec.whatwg.org/#interface-formdata">The definition of 'FormData' in the 'XMLHttpRequest' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FormData"
)
public class FormData {
  /**
   * The FormData() constructor creates a new FormData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/FormData">FormData.FormData - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata">The definition of 'FormData()' in the 'XMLHttpRequest' specification.</a>
   */
  public FormData(@Nonnull final HTMLFormElement form) {
  }

  /**
   * The FormData() constructor creates a new FormData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/FormData">FormData.FormData - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata">The definition of 'FormData()' in the 'XMLHttpRequest' specification.</a>
   */
  public FormData() {
  }

  /**
   * The append() method of the FormData interface appends a new value onto an existing key inside a FormData object, or adds the key if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/append">FormData.append - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-append">The definition of 'append()' in the 'XMLHttpRequest' specification.</a>
   */
  public native void append(@Nonnull String name, @Nonnull String value);

  /**
   * The append() method of the FormData interface appends a new value onto an existing key inside a FormData object, or adds the key if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/append">FormData.append - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-append">The definition of 'append()' in the 'XMLHttpRequest' specification.</a>
   */
  public native void append(@Nonnull String name, @Nonnull Blob blobValue,
      @Nonnull String filename);

  /**
   * The append() method of the FormData interface appends a new value onto an existing key inside a FormData object, or adds the key if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/append">FormData.append - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-append">The definition of 'append()' in the 'XMLHttpRequest' specification.</a>
   */
  public native void append(@Nonnull String name, @Nonnull Blob blobValue);

  /**
   * The delete() method of the FormData interface deletes a key and its value(s) from a FormData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/delete">FormData.delete - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-delete">The definition of 'delete()' in the 'XMLHttpRequest' specification.</a>
   */
  public native void delete(@Nonnull String name);

  /**
   * The get() method of the FormData interface returns the first value associated with a given key from within a FormData object. If you expect multiple values and want all of them, use the getAll() method instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/get">FormData.get - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-get">The definition of 'get()' in the 'XMLHttpRequest' specification.</a>
   */
  @Nullable
  public native FormDataEntryValue get(@Nonnull String name);

  /**
   * The getAll() method of the FormData interface returns all the values associated with a given key from within a FormData object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/getAll">FormData.getAll - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-getall">The definition of 'getAll()' in the 'XMLHttpRequest' specification.</a>
   */
  @Nonnull
  public native JsArray<FormDataEntryValue> getAll(@Nonnull String name);

  /**
   * The has() method of the FormData interface returns a boolean stating whether a FormData object contains a certain key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/has">FormData.has - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-has">The definition of 'has()' in the 'XMLHttpRequest' specification.</a>
   */
  public native boolean has(@Nonnull String name);

  /**
   * The set() method of the FormData interface sets a new value for an existing key inside a FormData object, or adds the key/value if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/set">FormData.set - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-set">The definition of 'set()' in the 'XMLHttpRequest' specification.</a>
   */
  public native void set(@Nonnull String name, @Nonnull String value);

  /**
   * The set() method of the FormData interface sets a new value for an existing key inside a FormData object, or adds the key/value if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/set">FormData.set - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-set">The definition of 'set()' in the 'XMLHttpRequest' specification.</a>
   */
  public native void set(@Nonnull String name, @Nonnull Blob blobValue, @Nonnull String filename);

  /**
   * The set() method of the FormData interface sets a new value for an existing key inside a FormData object, or adds the key/value if it does not already exist.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FormData/set">FormData.set - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#dom-formdata-set">The definition of 'set()' in the 'XMLHttpRequest' specification.</a>
   */
  public native void set(@Nonnull String name, @Nonnull Blob blobValue);
}
