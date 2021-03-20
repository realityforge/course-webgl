package akasha.audio;

import akasha.core.Float32Array;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface AudioWorkletProcessCallback {
  boolean onInvoke(@Nonnull JsArray<JsArray<Float32Array>> inputs,
      @Nonnull JsArray<JsArray<Float32Array>> outputs, @Nonnull Object parameters);
}
