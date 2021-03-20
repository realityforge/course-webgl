package akasha.xr;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRRenderStateInit dictionary is a writeable version of the XRRenderState interface, and is used when calling an XRSession's updateRenderState() method to apply changes to the render state prior to rendering the next frame.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRRenderStateInit">XRRenderStateInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrrenderstateinit">XRRenderStateInit - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface XRRenderStateInit {
  @JsOverlay
  @Nonnull
  static XRRenderStateInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "baseLayer"
  )
  @Nullable
  XRWebGLLayer baseLayer();

  @JsProperty
  void setBaseLayer(@Nullable XRWebGLLayer baseLayer);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit baseLayer(@Nullable final XRWebGLLayer baseLayer) {
    setBaseLayer( baseLayer );
    return this;
  }

  @JsProperty(
      name = "depthFar"
  )
  double depthFar();

  @JsProperty
  void setDepthFar(double depthFar);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit depthFar(final double depthFar) {
    setDepthFar( depthFar );
    return this;
  }

  @JsProperty(
      name = "depthNear"
  )
  double depthNear();

  @JsProperty
  void setDepthNear(double depthNear);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit depthNear(final double depthNear) {
    setDepthNear( depthNear );
    return this;
  }

  @JsProperty(
      name = "inlineVerticalFieldOfView"
  )
  double inlineVerticalFieldOfView();

  @JsProperty
  void setInlineVerticalFieldOfView(double inlineVerticalFieldOfView);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit inlineVerticalFieldOfView(final double inlineVerticalFieldOfView) {
    setInlineVerticalFieldOfView( inlineVerticalFieldOfView );
    return this;
  }

  @JsProperty(
      name = "layers"
  )
  @Nullable
  JsArray<XRLayer> layers();

  @JsProperty
  void setLayers(@Nullable JsArray<XRLayer> layers);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit layers(@Nullable final JsArray<XRLayer> layers) {
    setLayers( layers );
    return this;
  }

  @JsOverlay
  default void setLayers(@Nullable final XRLayer... layers) {
    setLayers( Js.<JsArray<XRLayer>>uncheckedCast( layers ) );
  }

  @JsOverlay
  @Nonnull
  default XRRenderStateInit layers(@Nullable final XRLayer... layers) {
    setLayers( layers );
    return this;
  }
}
