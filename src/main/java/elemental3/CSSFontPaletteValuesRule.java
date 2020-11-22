package elemental3;

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
    name = "CSSFontPaletteValuesRule"
)
public class CSSFontPaletteValuesRule extends CSSRule {
  @Nonnull
  public String basePalette;

  @Nonnull
  public String fontFamily;

  protected CSSFontPaletteValuesRule() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  public native boolean has(int key);

  @Nullable
  public native String get(int key);

  @Nonnull
  public native JsIterator<Double> keys();

  @Nonnull
  public native JsIterator<String> values();

  @Nonnull
  public native JsIterator<Entry> entries();

  public native void forEach(@Nonnull ForEachCallback callback);

  public native void forEach(@Nonnull ForEachCallback2 callback);

  public native void forEach(@Nonnull ForEachCallback3 callback);

  public native void set(int key, @Nonnull String value);

  public native boolean delete(int key);

  public native void clear();

  @JsType(
      isNative = true,
      name = "?",
      namespace = JsPackage.GLOBAL
  )
  public interface Entry {
    @JsOverlay
    default int key() {
      return Js.asArray( this )[ 0 ].cast();
    }

    @JsOverlay
    default String value() {
      return Js.asArray( this )[ 1 ].cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull String value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull String value, int key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull String value, int key, @Nonnull CSSFontPaletteValuesRule map);
  }
}
