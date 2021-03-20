package akasha;

import akasha.lang.JsArray;
import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ReadableStream interface of the Streams API represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream">ReadableStream - MDN</a>
 * @see <a href="https://streams.spec.whatwg.org/#rs-class">ReadableStream - Streams</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReadableStream"
)
public class ReadableStream implements Transferable {
  /**
   * The ReadableStream() constructor creates and returns a readable stream object from the given handlers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream">ReadableStream.ReadableStream - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-constructor">ReadableStream() - Streams</a>
   */
  public ReadableStream(@Nonnull final Object underlyingSource,
      @Nonnull final QueuingStrategy strategy) {
  }

  /**
   * The ReadableStream() constructor creates and returns a readable stream object from the given handlers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream">ReadableStream.ReadableStream - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-constructor">ReadableStream() - Streams</a>
   */
  public ReadableStream(@Nonnull final Object underlyingSource) {
  }

  /**
   * The ReadableStream() constructor creates and returns a readable stream object from the given handlers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream">ReadableStream.ReadableStream - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-constructor">ReadableStream() - Streams</a>
   */
  public ReadableStream() {
  }

  /**
   * The locked read-only property of the ReadableStream interface returns whether or not the readable stream is locked to a reader.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/locked">ReadableStream.locked - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-locked">locked - Streams</a>
   */
  @JsProperty(
      name = "locked"
  )
  public native boolean locked();

  /**
   * The cancel() method of the ReadableStream interface cancels the associated stream. The supplied reason parameter will be given to the underlying source, which may or may not use it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/cancel">ReadableStream.cancel - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-cancel">cancel() - Streams</a>
   */
  @Nonnull
  public native Promise<Void> cancel(@DoNotAutobox @Nullable Object reason);

  /**
   * The cancel() method of the ReadableStream interface cancels the associated stream. The supplied reason parameter will be given to the underlying source, which may or may not use it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/cancel">ReadableStream.cancel - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-cancel">cancel() - Streams</a>
   */
  @Nonnull
  public native Promise<Void> cancel();

  /**
   * The getReader() method of the ReadableStream interface creates a reader and locks the stream to it. While the stream is locked, no other reader can be acquired until this one is released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/getReader">ReadableStream.getReader - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-get-reader">getReader() - Streams</a>
   */
  @Nonnull
  public native ReadableStreamReader getReader(@Nonnull ReadableStreamGetReaderOptions options);

  /**
   * The getReader() method of the ReadableStream interface creates a reader and locks the stream to it. While the stream is locked, no other reader can be acquired until this one is released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/getReader">ReadableStream.getReader - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-get-reader">getReader() - Streams</a>
   */
  @Nonnull
  public native ReadableStreamReader getReader();

  /**
   * The pipeThrough() method of the ReadableStream interface provides a chainable way of piping the current stream through a transform stream or any other writable/readable pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/pipeThrough">ReadableStream.pipeThrough - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-pipe-through">pipeThrough() - Streams</a>
   */
  @Nonnull
  public native ReadableStream pipeThrough(@Nonnull ReadableWritablePair transform,
      @Nonnull StreamPipeOptions options);

  /**
   * The pipeThrough() method of the ReadableStream interface provides a chainable way of piping the current stream through a transform stream or any other writable/readable pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/pipeThrough">ReadableStream.pipeThrough - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-pipe-through">pipeThrough() - Streams</a>
   */
  @Nonnull
  public native ReadableStream pipeThrough(@Nonnull ReadableWritablePair transform);

  /**
   * The pipeTo() method of the ReadableStream interface pipes the current ReadableStream to a given WritableStream and returns a promise that fulfills when the piping process completes successfully, or rejects if any errors were encountered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/pipeTo">ReadableStream.pipeTo - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-pipe-to">pipeTo() - Streams</a>
   */
  @Nonnull
  public native Promise<Void> pipeTo(@Nonnull WritableStream destination,
      @Nonnull StreamPipeOptions options);

  /**
   * The pipeTo() method of the ReadableStream interface pipes the current ReadableStream to a given WritableStream and returns a promise that fulfills when the piping process completes successfully, or rejects if any errors were encountered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/pipeTo">ReadableStream.pipeTo - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-pipe-to">pipeTo() - Streams</a>
   */
  @Nonnull
  public native Promise<Void> pipeTo(@Nonnull WritableStream destination);

  /**
   * The tee() method of the ReadableStream interface tees the current readable stream, returning a two-element array containing the two resulting branches as new ReadableStream instances.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/tee">ReadableStream.tee - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#rs-tee">tee() - Streams</a>
   */
  @Nonnull
  public native JsArray<ReadableStream> tee();
}
