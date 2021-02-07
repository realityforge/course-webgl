package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * An object of this type is returned by the files property of the HTML &lt;input&gt; element; this lets you access the list of files selected with the &lt;input type=&quot;file&quot;&gt; element. It's also used for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for details on this usage.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileList">FileList - MDN</a>
 * @see <a href="https://w3c.github.io/FileAPI/#filelist-section">FileList - File API</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#concept-input-type-file-selected">selected files - HTML Living Standard</a>
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
