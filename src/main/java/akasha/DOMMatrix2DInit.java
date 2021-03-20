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
public interface DOMMatrix2DInit {
  @JsOverlay
  @Nonnull
  static DOMMatrix2DInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "a"
  )
  double a();

  @JsProperty
  void setA(double a);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit a(final double a) {
    setA( a );
    return this;
  }

  @JsProperty(
      name = "b"
  )
  double b();

  @JsProperty
  void setB(double b);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit b(final double b) {
    setB( b );
    return this;
  }

  @JsProperty(
      name = "c"
  )
  double c();

  @JsProperty
  void setC(double c);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit c(final double c) {
    setC( c );
    return this;
  }

  @JsProperty(
      name = "d"
  )
  double d();

  @JsProperty
  void setD(double d);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit d(final double d) {
    setD( d );
    return this;
  }

  @JsProperty(
      name = "e"
  )
  double e();

  @JsProperty
  void setE(double e);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit e(final double e) {
    setE( e );
    return this;
  }

  @JsProperty(
      name = "f"
  )
  double f();

  @JsProperty
  void setF(double f);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit f(final double f) {
    setF( f );
    return this;
  }

  @JsProperty(
      name = "m11"
  )
  double m11();

  @JsProperty
  void setM11(double m11);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m11(final double m11) {
    setM11( m11 );
    return this;
  }

  @JsProperty(
      name = "m12"
  )
  double m12();

  @JsProperty
  void setM12(double m12);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m12(final double m12) {
    setM12( m12 );
    return this;
  }

  @JsProperty(
      name = "m21"
  )
  double m21();

  @JsProperty
  void setM21(double m21);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m21(final double m21) {
    setM21( m21 );
    return this;
  }

  @JsProperty(
      name = "m22"
  )
  double m22();

  @JsProperty
  void setM22(double m22);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m22(final double m22) {
    setM22( m22 );
    return this;
  }

  @JsProperty(
      name = "m41"
  )
  double m41();

  @JsProperty
  void setM41(double m41);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m41(final double m41) {
    setM41( m41 );
    return this;
  }

  @JsProperty(
      name = "m42"
  )
  double m42();

  @JsProperty
  void setM42(double m42);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m42(final double m42) {
    setM42( m42 );
    return this;
  }
}
