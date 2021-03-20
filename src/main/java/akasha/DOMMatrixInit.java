package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface DOMMatrixInit extends DOMMatrix2DInit {
  @JsOverlay
  @Nonnull
  static DOMMatrixInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "is2D"
  )
  boolean is2D();

  @JsProperty
  void setIs2D(boolean is2D);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit is2D(final boolean is2D) {
    setIs2D( is2D );
    return this;
  }

  @JsProperty(
      name = "m13"
  )
  double m13();

  @JsProperty
  void setM13(double m13);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m13(final double m13) {
    setM13( m13 );
    return this;
  }

  @JsProperty(
      name = "m14"
  )
  double m14();

  @JsProperty
  void setM14(double m14);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m14(final double m14) {
    setM14( m14 );
    return this;
  }

  @JsProperty(
      name = "m23"
  )
  double m23();

  @JsProperty
  void setM23(double m23);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m23(final double m23) {
    setM23( m23 );
    return this;
  }

  @JsProperty(
      name = "m24"
  )
  double m24();

  @JsProperty
  void setM24(double m24);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m24(final double m24) {
    setM24( m24 );
    return this;
  }

  @JsProperty(
      name = "m31"
  )
  double m31();

  @JsProperty
  void setM31(double m31);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m31(final double m31) {
    setM31( m31 );
    return this;
  }

  @JsProperty(
      name = "m32"
  )
  double m32();

  @JsProperty
  void setM32(double m32);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m32(final double m32) {
    setM32( m32 );
    return this;
  }

  @JsProperty(
      name = "m33"
  )
  double m33();

  @JsProperty
  void setM33(double m33);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m33(final double m33) {
    setM33( m33 );
    return this;
  }

  @JsProperty(
      name = "m34"
  )
  double m34();

  @JsProperty
  void setM34(double m34);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m34(final double m34) {
    setM34( m34 );
    return this;
  }

  @JsProperty(
      name = "m43"
  )
  double m43();

  @JsProperty
  void setM43(double m43);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m43(final double m43) {
    setM43( m43 );
    return this;
  }

  @JsProperty(
      name = "m44"
  )
  double m44();

  @JsProperty
  void setM44(double m44);

  @JsOverlay
  @Nonnull
  default DOMMatrixInit m44(final double m44) {
    setM44( m44 );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit a(final double a) {
    setA( a );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit b(final double b) {
    setB( b );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit c(final double c) {
    setC( c );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit d(final double d) {
    setD( d );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit e(final double e) {
    setE( e );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit f(final double f) {
    setF( f );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit m11(final double m11) {
    setM11( m11 );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit m12(final double m12) {
    setM12( m12 );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit m21(final double m21) {
    setM21( m21 );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit m22(final double m22) {
    setM22( m22 );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit m41(final double m41) {
    setM41( m41 );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DOMMatrixInit m42(final double m42) {
    setM42( m42 );
    return this;
  }
}
