package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface WebGLContextAttributes {
  @JsOverlay
  @Nonnull
  static WebGLContextAttributes create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  @JsProperty
  void setAlpha(boolean alpha);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes alpha(final boolean alpha) {
    setAlpha( alpha );
    return this;
  }

  @JsProperty(
      name = "antialias"
  )
  boolean antialias();

  @JsProperty
  void setAntialias(boolean antialias);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes antialias(final boolean antialias) {
    setAntialias( antialias );
    return this;
  }

  @JsProperty(
      name = "depth"
  )
  boolean depth();

  @JsProperty
  void setDepth(boolean depth);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes depth(final boolean depth) {
    setDepth( depth );
    return this;
  }

  @JsProperty(
      name = "desynchronized"
  )
  boolean desynchronized();

  @JsProperty
  void setDesynchronized(boolean desynchronized);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes desynchronized(final boolean desynchronized) {
    setDesynchronized( desynchronized );
    return this;
  }

  @JsProperty(
      name = "failIfMajorPerformanceCaveat"
  )
  boolean failIfMajorPerformanceCaveat();

  @JsProperty
  void setFailIfMajorPerformanceCaveat(boolean failIfMajorPerformanceCaveat);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes failIfMajorPerformanceCaveat(
      final boolean failIfMajorPerformanceCaveat) {
    setFailIfMajorPerformanceCaveat( failIfMajorPerformanceCaveat );
    return this;
  }

  @JsProperty(
      name = "powerPreference"
  )
  @MagicConstant(
      valuesFromClass = WebGLPowerPreference.class
  )
  String powerPreference();

  @JsProperty
  void setPowerPreference(
      @MagicConstant(valuesFromClass = WebGLPowerPreference.class) @Nonnull String powerPreference);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes powerPreference(
      @MagicConstant(valuesFromClass = WebGLPowerPreference.class) @Nonnull final String powerPreference) {
    setPowerPreference( powerPreference );
    return this;
  }

  @JsProperty(
      name = "premultipliedAlpha"
  )
  boolean premultipliedAlpha();

  @JsProperty
  void setPremultipliedAlpha(boolean premultipliedAlpha);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes premultipliedAlpha(final boolean premultipliedAlpha) {
    setPremultipliedAlpha( premultipliedAlpha );
    return this;
  }

  @JsProperty(
      name = "preserveDrawingBuffer"
  )
  boolean preserveDrawingBuffer();

  @JsProperty
  void setPreserveDrawingBuffer(boolean preserveDrawingBuffer);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes preserveDrawingBuffer(final boolean preserveDrawingBuffer) {
    setPreserveDrawingBuffer( preserveDrawingBuffer );
    return this;
  }

  @JsProperty(
      name = "stencil"
  )
  boolean stencil();

  @JsProperty
  void setStencil(boolean stencil);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes stencil(final boolean stencil) {
    setStencil( stencil );
    return this;
  }

  @JsProperty(
      name = "xrCompatible"
  )
  boolean xrCompatible();

  @JsProperty
  void setXrCompatible(boolean xrCompatible);

  @JsOverlay
  @Nonnull
  default WebGLContextAttributes xrCompatible(final boolean xrCompatible) {
    setXrCompatible( xrCompatible );
    return this;
  }
}
