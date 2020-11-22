package elemental3;

import elemental3.core.JsArray;
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
    name = "?"
)
public interface JsonWebKey {
  @JsOverlay
  @Nonnull
  static JsonWebKey create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alg"
  )
  String alg();

  @JsProperty
  void setAlg(@Nonnull String alg);

  @JsOverlay
  @Nonnull
  default JsonWebKey alg(@Nonnull final String alg) {
    setAlg( alg );
    return this;
  }

  @JsProperty(
      name = "crv"
  )
  String crv();

  @JsProperty
  void setCrv(@Nonnull String crv);

  @JsOverlay
  @Nonnull
  default JsonWebKey crv(@Nonnull final String crv) {
    setCrv( crv );
    return this;
  }

  @JsProperty(
      name = "d"
  )
  String d();

  @JsProperty
  void setD(@Nonnull String d);

  @JsOverlay
  @Nonnull
  default JsonWebKey d(@Nonnull final String d) {
    setD( d );
    return this;
  }

  @JsProperty(
      name = "dp"
  )
  String dp();

  @JsProperty
  void setDp(@Nonnull String dp);

  @JsOverlay
  @Nonnull
  default JsonWebKey dp(@Nonnull final String dp) {
    setDp( dp );
    return this;
  }

  @JsProperty(
      name = "dq"
  )
  String dq();

  @JsProperty
  void setDq(@Nonnull String dq);

  @JsOverlay
  @Nonnull
  default JsonWebKey dq(@Nonnull final String dq) {
    setDq( dq );
    return this;
  }

  @JsProperty(
      name = "e"
  )
  String e();

  @JsProperty
  void setE(@Nonnull String e);

  @JsOverlay
  @Nonnull
  default JsonWebKey e(@Nonnull final String e) {
    setE( e );
    return this;
  }

  @JsProperty(
      name = "ext"
  )
  boolean ext();

  @JsProperty
  void setExt(boolean ext);

  @JsOverlay
  @Nonnull
  default JsonWebKey ext(final boolean ext) {
    setExt( ext );
    return this;
  }

  @JsProperty(
      name = "k"
  )
  String k();

  @JsProperty
  void setK(@Nonnull String k);

  @JsOverlay
  @Nonnull
  default JsonWebKey k(@Nonnull final String k) {
    setK( k );
    return this;
  }

  @JsProperty(
      name = "key_ops"
  )
  JsArray<String> key_ops();

  @JsProperty
  void setKey_ops(@Nonnull JsArray<String> key_ops);

  @JsOverlay
  @Nonnull
  default JsonWebKey key_ops(@Nonnull final JsArray<String> key_ops) {
    setKey_ops( key_ops );
    return this;
  }

  @JsOverlay
  default void setKey_ops(@Nonnull final String... key_ops) {
    setKey_ops( Js.<JsArray<String>>uncheckedCast( key_ops ) );
  }

  @JsOverlay
  @Nonnull
  default JsonWebKey key_ops(@Nonnull final String... key_ops) {
    setKey_ops( key_ops );
    return this;
  }

  @JsProperty(
      name = "kty"
  )
  String kty();

  @JsProperty
  void setKty(@Nonnull String kty);

  @JsOverlay
  @Nonnull
  default JsonWebKey kty(@Nonnull final String kty) {
    setKty( kty );
    return this;
  }

  @JsProperty(
      name = "n"
  )
  String n();

  @JsProperty
  void setN(@Nonnull String n);

  @JsOverlay
  @Nonnull
  default JsonWebKey n(@Nonnull final String n) {
    setN( n );
    return this;
  }

  @JsProperty(
      name = "oth"
  )
  JsArray<RsaOtherPrimesInfo> oth();

  @JsProperty
  void setOth(@Nonnull JsArray<RsaOtherPrimesInfo> oth);

  @JsOverlay
  @Nonnull
  default JsonWebKey oth(@Nonnull final JsArray<RsaOtherPrimesInfo> oth) {
    setOth( oth );
    return this;
  }

  @JsOverlay
  default void setOth(@Nonnull final RsaOtherPrimesInfo... oth) {
    setOth( Js.<JsArray<RsaOtherPrimesInfo>>uncheckedCast( oth ) );
  }

  @JsOverlay
  @Nonnull
  default JsonWebKey oth(@Nonnull final RsaOtherPrimesInfo... oth) {
    setOth( oth );
    return this;
  }

  @JsProperty(
      name = "p"
  )
  String p();

  @JsProperty
  void setP(@Nonnull String p);

  @JsOverlay
  @Nonnull
  default JsonWebKey p(@Nonnull final String p) {
    setP( p );
    return this;
  }

  @JsProperty(
      name = "q"
  )
  String q();

  @JsProperty
  void setQ(@Nonnull String q);

  @JsOverlay
  @Nonnull
  default JsonWebKey q(@Nonnull final String q) {
    setQ( q );
    return this;
  }

  @JsProperty(
      name = "qi"
  )
  String qi();

  @JsProperty
  void setQi(@Nonnull String qi);

  @JsOverlay
  @Nonnull
  default JsonWebKey qi(@Nonnull final String qi) {
    setQi( qi );
    return this;
  }

  @JsProperty(
      name = "use"
  )
  String use();

  @JsProperty
  void setUse(@Nonnull String use);

  @JsOverlay
  @Nonnull
  default JsonWebKey use(@Nonnull final String use) {
    setUse( use );
    return this;
  }

  @JsProperty(
      name = "x"
  )
  String x();

  @JsProperty
  void setX(@Nonnull String x);

  @JsOverlay
  @Nonnull
  default JsonWebKey x(@Nonnull final String x) {
    setX( x );
    return this;
  }

  @JsProperty(
      name = "y"
  )
  String y();

  @JsProperty
  void setY(@Nonnull String y);

  @JsOverlay
  @Nonnull
  default JsonWebKey y(@Nonnull final String y) {
    setY( y );
    return this;
  }
}
