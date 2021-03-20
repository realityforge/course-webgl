package akasha;

import akasha.core.ArrayBufferView;
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
    name = "ReadableStreamBYOBRequest"
)
public class ReadableStreamBYOBRequest {
  protected ReadableStreamBYOBRequest() {
  }

  @JsProperty(
      name = "view"
  )
  @Nullable
  public native ArrayBufferView view();

  public native void respond(int bytesWritten);

  public native void respondWithNewView(@Nonnull ArrayBufferView view);
}
