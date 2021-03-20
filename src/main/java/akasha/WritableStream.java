package akasha;

import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WritableStream interface of the Streams API provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream">WritableStream - MDN</a>
 * @see <a href="https://streams.spec.whatwg.org/#ws-class">WritableStream - Streams</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WritableStream"
)
public class WritableStream implements Transferable {
  /**
   * The WritableStream() constructor creates a new WritableStream object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream/WritableStream">WritableStream.WritableStream - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#ws-constructor">WritableStream() - Streams</a>
   */
  public WritableStream(@Nonnull final Object underlyingSink,
      @Nonnull final QueuingStrategy strategy) {
  }

  /**
   * The WritableStream() constructor creates a new WritableStream object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream/WritableStream">WritableStream.WritableStream - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#ws-constructor">WritableStream() - Streams</a>
   */
  public WritableStream(@Nonnull final Object underlyingSink) {
  }

  /**
   * The WritableStream() constructor creates a new WritableStream object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream/WritableStream">WritableStream.WritableStream - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#ws-constructor">WritableStream() - Streams</a>
   */
  public WritableStream() {
  }

  /**
   * The locked read-only property of the WritableStream interface returns a boolean indicating whether the WritableStream is locked to a writer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream/locked">WritableStream.locked - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#ws-locked">locked - Streams</a>
   */
  @JsProperty(
      name = "locked"
  )
  public native boolean locked();

  /**
   * The abort() method of the WritableStream interface aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream/abort">WritableStream.abort - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#ws-abort">abort() - Streams</a>
   */
  @Nonnull
  public native Promise<Void> abort(@DoNotAutobox @Nullable Object reason);

  /**
   * The abort() method of the WritableStream interface aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream/abort">WritableStream.abort - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#ws-abort">abort() - Streams</a>
   */
  @Nonnull
  public native Promise<Void> abort();

  @Nonnull
  public native Promise<Void> close();

  /**
   * The getWriter() method of the WritableStream interface returns a new instance of WritableStreamDefaultWriter and locks the stream to that instance. While the stream is locked, no other writer can be acquired until this one is released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WritableStream/getWriter">WritableStream.getWriter - MDN</a>
   * @see <a href="https://streams.spec.whatwg.org/#ws-get-writer">getWriter() - Streams</a>
   */
  @Nonnull
  public native WritableStreamDefaultWriter getWriter();
}
