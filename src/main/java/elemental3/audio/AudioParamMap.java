package elemental3.audio;

import elemental3.core.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The Web Audio API interface AudioParamMap represents a set of multiple audio parameters, each described as a mapping of a DOMString identifying the parameter to the AudioParam object representing its value.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParamMap">AudioParamMap - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioParamMap"
)
public class AudioParamMap {
  protected AudioParamMap() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  public native boolean has(@Nonnull String key);

  @Nullable
  public native AudioParam get(@Nonnull String key);

  @Nonnull
  public native JsIterator<String> keys();

  @Nonnull
  public native JsIterator<AudioParam> values();

  @Nonnull
  public native JsIterator<Entry> entries();

  public native void forEach(@Nonnull ForEachCallback callback);

  public native void forEach(@Nonnull ForEachCallback2 callback);

  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      name = "?",
      namespace = JsPackage.GLOBAL
  )
  public interface Entry {
    @JsOverlay
    default String key() {
      return Js.asArray( this )[ 0 ].cast();
    }

    @JsOverlay
    default AudioParam value() {
      return Js.asArray( this )[ 1 ].cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull AudioParam value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull AudioParam value, @Nonnull String key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull AudioParam value, @Nonnull String key, @Nonnull AudioParamMap map);
  }
}
