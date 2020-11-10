package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * An object of this type is returned by the files property of the HTML input element; this lets you access the list of files selected with the input type=&quot;file&quot; element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileList">FileList - MDN</a>
 * @see <a href="https://w3c.github.io/FileAPI/#filelist-section">The definition of 'FileList' in the 'File API' specification.</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#concept-input-type-file-selected">The definition of 'selected files' in the 'HTML Living Standard' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileList"
)
public class FileList {
  protected FileList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native File item(int index);
}
