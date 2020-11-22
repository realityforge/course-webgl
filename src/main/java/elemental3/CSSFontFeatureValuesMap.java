package elemental3;

import elemental3.core.JsArray;
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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSFontFeatureValuesMap"
)
public class CSSFontFeatureValuesMap {
  protected CSSFontFeatureValuesMap() {
  }

  public native void set(@Nonnull String featureValueName, int values);

  public native void set(@Nonnull String featureValueName, @Nonnull JsArray<Double> values);

  public native void set(@Nonnull String featureValueName, @Nonnull double[] values);

  @JsProperty(
      name = "size"
  )
  public native int size();

  public native boolean has(@Nonnull String key);

  @Nullable
  public native JsArray<Double> get(@Nonnull String key);

  @Nonnull
  public native JsIterator<String> keys();

  @Nonnull
  public native JsIterator<JsArray<Double>> values();

  @Nonnull
  public native JsIterator<Entry> entries();

  public native void forEach(@Nonnull ForEachCallback callback);

  public native void forEach(@Nonnull ForEachCallback2 callback);

  public native void forEach(@Nonnull ForEachCallback3 callback);

  public native boolean delete(@Nonnull String key);

  public native void clear();

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
    default JsArray<Double> value() {
      return Js.asArray( this )[ 1 ].cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull JsArray<Double> value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull JsArray<Double> value, @Nonnull String key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull JsArray<Double> value, @Nonnull String key,
        @Nonnull CSSFontFeatureValuesMap map);
  }
}
