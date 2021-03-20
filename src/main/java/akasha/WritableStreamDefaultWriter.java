package akasha;

import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WritableStreamDefaultWriter"
)
public class WritableStreamDefaultWriter {
  public WritableStreamDefaultWriter(@Nonnull final WritableStream stream) {
  }

  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  @JsProperty(
      name = "desiredSize"
  )
  @Nullable
  public native Double desiredSize();

  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<Void> ready();

  @Nonnull
  public native Promise<Void> abort(@DoNotAutobox @Nullable Object reason);

  @Nonnull
  public native Promise<Void> abort();

  @Nonnull
  public native Promise<Void> close();

  public native void releaseLock();

  @Nonnull
  public native Promise<Void> write(@DoNotAutobox @Nullable Object chunk);

  @Nonnull
  public native Promise<Void> write();
}
