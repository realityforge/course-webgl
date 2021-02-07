package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The FileReader object lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader">FileReader - MDN</a>
 * @see <a href="https://w3c.github.io/FileAPI/#dfn-filereader">FileReader - File API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileReader"
)
public class FileReader extends EventTarget {
  @JsOverlay
  public static final int DONE = 2;

  @JsOverlay
  public static final int EMPTY = 0;

  @JsOverlay
  public static final int LOADING = 1;

  /**
   * The FileReader.onabort property contains an event handler executed when the abort event is fired, i.e. when the process of reading the file is aborted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/onabort">FileReader.onabort - MDN</a>
   */
  @Nullable
  public ProgressEventHandler onabort;

  /**
   * The FileReader onerror handler receives an Event object, not an Error object, as a parameter, but an error can be accessed from the FileReader object, as instanceOfFileReader.error
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/onerror">FileReader.onerror - MDN</a>
   */
  @Nullable
  public ProgressEventHandler onerror;

  /**
   * The FileReader.onload property contains an event handler executed when the load event is fired, when content read with readAsArrayBuffer, readAsBinaryString, readAsDataURL or readAsText is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/onload">FileReader.onload - MDN</a>
   */
  @Nullable
  public ProgressEventHandler onload;

  @Nullable
  public ProgressEventHandler onloadend;

  @Nullable
  public ProgressEventHandler onloadstart;

  @Nullable
  public ProgressEventHandler onprogress;

  /**
   * The FileReader() constructor creates a new FileReader.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/FileReader">FileReader.FileReader - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/">File API</a>
   */
  public FileReader() {
  }

  /**
   * The FileReader error property returns the error that occurred while reading the file.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/error">FileReader.error - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dom-filereader-error">FileReader: error - File API</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  /**
   * The FileReader readyState property provides the current state of the reading operation a FileReader is in. A FileReader exists in one of the following states:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readyState">FileReader.readyState - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dom-filereader-readystate">readyState - File API</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @FileReaderReadyState
  public native int readyState();

  /**
   * The FileReader result property returns the file's contents. This property is only valid after the read operation is complete, and the format of the data depends on which of the methods was used to initiate the read operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/result">FileReader.result - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#dom-filereader-result">result - File API</a>
   */
  @JsProperty(
      name = "result"
  )
  @Nullable
  public native StringOrArrayBufferUnion result();

  /**
   * The abort method aborts the read operation. Upon return, the readyState will be DONE.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/abort">FileReader.abort - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#abort">abort() - File API</a>
   */
  public native void abort();

  /**
   * The FileReader interface's readAsArrayBuffer() method is used to start reading the contents of a specified Blob or File. When the read operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result attribute contains an ArrayBuffer representing the file's data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsArrayBuffer">FileReader.readAsArrayBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#readAsArrayBuffer">FileReader.readAsArrayBuffer - File API</a>
   */
  public native void readAsArrayBuffer(@Nonnull Blob blob);

  /**
   * The readAsBinaryString method is used to start reading the contents of the specified Blob or File. When the read operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result attribute contains the raw binary data from the file.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsBinaryString">FileReader.readAsBinaryString - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#readAsBinaryString">readAsBinaryString - File API</a>
   */
  public native void readAsBinaryString(@Nonnull Blob blob);

  /**
   * The readAsDataURL method is used to read the contents of the specified Blob or File. When the read operation is finished, the readyState becomes DONE, and the loadend is triggered. At that time, the result attribute contains the data as a data: URL representing the file's data as a base64 encoded string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsDataURL">FileReader.readAsDataURL - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#readAsDataURL">readAsDataURL() - File API</a>
   */
  public native void readAsDataURL(@Nonnull Blob blob);

  /**
   * The readAsText() method is used to read the contents of the specified Blob or File. When the read operation is complete, the readyState is changed to DONE, the loadend event is triggered, and the result property contains the contents of the file as a text string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsText">FileReader.readAsText - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#readAsDataText">readAsText() - File API</a>
   */
  public native void readAsText(@Nonnull Blob blob, @Nonnull String encoding);

  /**
   * The readAsText() method is used to read the contents of the specified Blob or File. When the read operation is complete, the readyState is changed to DONE, the loadend event is triggered, and the result property contains the contents of the file as a text string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReader/readAsText">FileReader.readAsText - MDN</a>
   * @see <a href="https://w3c.github.io/FileAPI/#readAsDataText">readAsText() - File API</a>
   */
  public native void readAsText(@Nonnull Blob blob);

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "loadend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "loadend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "loadend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "loadend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "loadstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "loadstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "progress", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "progress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "progress", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "progress", Js.cast( callback ) );
  }
}
