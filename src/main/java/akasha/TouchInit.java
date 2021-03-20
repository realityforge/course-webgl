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
public interface TouchInit {
  @JsOverlay
  @Nonnull
  static TouchInit create(final int identifier, @Nonnull final EventTarget target) {
    return Js.<TouchInit>uncheckedCast( JsPropertyMap.of() ).identifier( identifier ).target( target );
  }

  @JsProperty(
      name = "altitudeAngle"
  )
  double altitudeAngle();

  @JsProperty
  void setAltitudeAngle(double altitudeAngle);

  @JsOverlay
  @Nonnull
  default TouchInit altitudeAngle(final double altitudeAngle) {
    setAltitudeAngle( altitudeAngle );
    return this;
  }

  @JsProperty(
      name = "azimuthAngle"
  )
  double azimuthAngle();

  @JsProperty
  void setAzimuthAngle(double azimuthAngle);

  @JsOverlay
  @Nonnull
  default TouchInit azimuthAngle(final double azimuthAngle) {
    setAzimuthAngle( azimuthAngle );
    return this;
  }

  @JsProperty(
      name = "clientX"
  )
  double clientX();

  @JsProperty
  void setClientX(double clientX);

  @JsOverlay
  @Nonnull
  default TouchInit clientX(final double clientX) {
    setClientX( clientX );
    return this;
  }

  @JsProperty(
      name = "clientY"
  )
  double clientY();

  @JsProperty
  void setClientY(double clientY);

  @JsOverlay
  @Nonnull
  default TouchInit clientY(final double clientY) {
    setClientY( clientY );
    return this;
  }

  @JsProperty(
      name = "force"
  )
  float force();

  @JsProperty
  void setForce(float force);

  @JsOverlay
  @Nonnull
  default TouchInit force(final float force) {
    setForce( force );
    return this;
  }

  @JsProperty(
      name = "identifier"
  )
  int identifier();

  @JsProperty
  void setIdentifier(int identifier);

  @JsOverlay
  @Nonnull
  default TouchInit identifier(final int identifier) {
    setIdentifier( identifier );
    return this;
  }

  @JsProperty(
      name = "pageX"
  )
  double pageX();

  @JsProperty
  void setPageX(double pageX);

  @JsOverlay
  @Nonnull
  default TouchInit pageX(final double pageX) {
    setPageX( pageX );
    return this;
  }

  @JsProperty(
      name = "pageY"
  )
  double pageY();

  @JsProperty
  void setPageY(double pageY);

  @JsOverlay
  @Nonnull
  default TouchInit pageY(final double pageY) {
    setPageY( pageY );
    return this;
  }

  @JsProperty(
      name = "radiusX"
  )
  float radiusX();

  @JsProperty
  void setRadiusX(float radiusX);

  @JsOverlay
  @Nonnull
  default TouchInit radiusX(final float radiusX) {
    setRadiusX( radiusX );
    return this;
  }

  @JsProperty(
      name = "radiusY"
  )
  float radiusY();

  @JsProperty
  void setRadiusY(float radiusY);

  @JsOverlay
  @Nonnull
  default TouchInit radiusY(final float radiusY) {
    setRadiusY( radiusY );
    return this;
  }

  @JsProperty(
      name = "rotationAngle"
  )
  float rotationAngle();

  @JsProperty
  void setRotationAngle(float rotationAngle);

  @JsOverlay
  @Nonnull
  default TouchInit rotationAngle(final float rotationAngle) {
    setRotationAngle( rotationAngle );
    return this;
  }

  @JsProperty(
      name = "screenX"
  )
  double screenX();

  @JsProperty
  void setScreenX(double screenX);

  @JsOverlay
  @Nonnull
  default TouchInit screenX(final double screenX) {
    setScreenX( screenX );
    return this;
  }

  @JsProperty(
      name = "screenY"
  )
  double screenY();

  @JsProperty
  void setScreenY(double screenY);

  @JsOverlay
  @Nonnull
  default TouchInit screenY(final double screenY) {
    setScreenY( screenY );
    return this;
  }

  @JsProperty(
      name = "target"
  )
  @Nonnull
  EventTarget target();

  @JsProperty
  void setTarget(@Nonnull EventTarget target);

  @JsOverlay
  @Nonnull
  default TouchInit target(@Nonnull final EventTarget target) {
    setTarget( target );
    return this;
  }

  @JsProperty(
      name = "touchType"
  )
  @TouchType
  String touchType();

  @JsProperty
  void setTouchType(@TouchType @Nonnull String touchType);

  @JsOverlay
  @Nonnull
  default TouchInit touchType(@TouchType @Nonnull final String touchType) {
    setTouchType( touchType );
    return this;
  }
}
