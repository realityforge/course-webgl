package elemental3;

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
public interface CollectedClientData {
  @JsOverlay
  @Nonnull
  static CollectedClientData create(@Nonnull final String challenge, @Nonnull final String origin,
      @Nonnull final String type) {
    return Js.<CollectedClientData>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).origin( origin ).type( type );
  }

  @JsProperty(
      name = "challenge"
  )
  @Nonnull
  String challenge();

  @JsProperty
  void setChallenge(@Nonnull String challenge);

  @JsOverlay
  @Nonnull
  default CollectedClientData challenge(@Nonnull final String challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  String origin();

  @JsProperty
  void setOrigin(@Nonnull String origin);

  @JsOverlay
  @Nonnull
  default CollectedClientData origin(@Nonnull final String origin) {
    setOrigin( origin );
    return this;
  }

  @JsProperty(
      name = "tokenBinding"
  )
  TokenBinding tokenBinding();

  @JsProperty
  void setTokenBinding(@Nonnull TokenBinding tokenBinding);

  @JsOverlay
  @Nonnull
  default CollectedClientData tokenBinding(@Nonnull final TokenBinding tokenBinding) {
    setTokenBinding( tokenBinding );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @Nonnull
  String type();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default CollectedClientData type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
