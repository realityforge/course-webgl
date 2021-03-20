package akasha.audio;

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
public interface PannerOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static PannerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "coneInnerAngle"
  )
  double coneInnerAngle();

  @JsProperty
  void setConeInnerAngle(double coneInnerAngle);

  @JsOverlay
  @Nonnull
  default PannerOptions coneInnerAngle(final double coneInnerAngle) {
    setConeInnerAngle( coneInnerAngle );
    return this;
  }

  @JsProperty(
      name = "coneOuterAngle"
  )
  double coneOuterAngle();

  @JsProperty
  void setConeOuterAngle(double coneOuterAngle);

  @JsOverlay
  @Nonnull
  default PannerOptions coneOuterAngle(final double coneOuterAngle) {
    setConeOuterAngle( coneOuterAngle );
    return this;
  }

  @JsProperty(
      name = "coneOuterGain"
  )
  double coneOuterGain();

  @JsProperty
  void setConeOuterGain(double coneOuterGain);

  @JsOverlay
  @Nonnull
  default PannerOptions coneOuterGain(final double coneOuterGain) {
    setConeOuterGain( coneOuterGain );
    return this;
  }

  @JsProperty(
      name = "distanceModel"
  )
  @DistanceModelType
  String distanceModel();

  @JsProperty
  void setDistanceModel(@DistanceModelType @Nonnull String distanceModel);

  @JsOverlay
  @Nonnull
  default PannerOptions distanceModel(@DistanceModelType @Nonnull final String distanceModel) {
    setDistanceModel( distanceModel );
    return this;
  }

  @JsProperty(
      name = "maxDistance"
  )
  double maxDistance();

  @JsProperty
  void setMaxDistance(double maxDistance);

  @JsOverlay
  @Nonnull
  default PannerOptions maxDistance(final double maxDistance) {
    setMaxDistance( maxDistance );
    return this;
  }

  @JsProperty(
      name = "orientationX"
  )
  float orientationX();

  @JsProperty
  void setOrientationX(float orientationX);

  @JsOverlay
  @Nonnull
  default PannerOptions orientationX(final float orientationX) {
    setOrientationX( orientationX );
    return this;
  }

  @JsProperty(
      name = "orientationY"
  )
  float orientationY();

  @JsProperty
  void setOrientationY(float orientationY);

  @JsOverlay
  @Nonnull
  default PannerOptions orientationY(final float orientationY) {
    setOrientationY( orientationY );
    return this;
  }

  @JsProperty(
      name = "orientationZ"
  )
  float orientationZ();

  @JsProperty
  void setOrientationZ(float orientationZ);

  @JsOverlay
  @Nonnull
  default PannerOptions orientationZ(final float orientationZ) {
    setOrientationZ( orientationZ );
    return this;
  }

  @JsProperty(
      name = "panningModel"
  )
  @PanningModelType
  String panningModel();

  @JsProperty
  void setPanningModel(@PanningModelType @Nonnull String panningModel);

  @JsOverlay
  @Nonnull
  default PannerOptions panningModel(@PanningModelType @Nonnull final String panningModel) {
    setPanningModel( panningModel );
    return this;
  }

  @JsProperty(
      name = "positionX"
  )
  float positionX();

  @JsProperty
  void setPositionX(float positionX);

  @JsOverlay
  @Nonnull
  default PannerOptions positionX(final float positionX) {
    setPositionX( positionX );
    return this;
  }

  @JsProperty(
      name = "positionY"
  )
  float positionY();

  @JsProperty
  void setPositionY(float positionY);

  @JsOverlay
  @Nonnull
  default PannerOptions positionY(final float positionY) {
    setPositionY( positionY );
    return this;
  }

  @JsProperty(
      name = "positionZ"
  )
  float positionZ();

  @JsProperty
  void setPositionZ(float positionZ);

  @JsOverlay
  @Nonnull
  default PannerOptions positionZ(final float positionZ) {
    setPositionZ( positionZ );
    return this;
  }

  @JsProperty(
      name = "refDistance"
  )
  double refDistance();

  @JsProperty
  void setRefDistance(double refDistance);

  @JsOverlay
  @Nonnull
  default PannerOptions refDistance(final double refDistance) {
    setRefDistance( refDistance );
    return this;
  }

  @JsProperty(
      name = "rolloffFactor"
  )
  double rolloffFactor();

  @JsProperty
  void setRolloffFactor(double rolloffFactor);

  @JsOverlay
  @Nonnull
  default PannerOptions rolloffFactor(final double rolloffFactor) {
    setRolloffFactor( rolloffFactor );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PannerOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PannerOptions channelCountMode(@ChannelCountMode @Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PannerOptions channelInterpretation(
      @ChannelInterpretation @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
