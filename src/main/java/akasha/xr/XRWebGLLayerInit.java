package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebXR Device API's XRWebGLLayerInit dictionary is used to provide configuration options when creating a new XRWebGLLayer object with the XRWebGLLayer() constructor.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit">XRWebGLLayerInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrwebgllayerinit">XRWebGLLayerInit - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface XRWebGLLayerInit {
  @JsOverlay
  @Nonnull
  static XRWebGLLayerInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The alpha property is a Boolean value which, if present and set to true in the XRWebGLLayerInit dictionary passed into the XRWebGLLayer() constructor, specifies that the new layer's color buffer is to include an alpha channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/alpha">XRWebGLLayerInit.alpha - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-alpha">XRWebGLLayerInit.alpha - WebXR Device API</a>
   */
  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  /**
   * The alpha property is a Boolean value which, if present and set to true in the XRWebGLLayerInit dictionary passed into the XRWebGLLayer() constructor, specifies that the new layer's color buffer is to include an alpha channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/alpha">XRWebGLLayerInit.alpha - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-alpha">XRWebGLLayerInit.alpha - WebXR Device API</a>
   */
  @JsProperty
  void setAlpha(boolean alpha);

  /**
   * The alpha property is a Boolean value which, if present and set to true in the XRWebGLLayerInit dictionary passed into the XRWebGLLayer() constructor, specifies that the new layer's color buffer is to include an alpha channel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/alpha">XRWebGLLayerInit.alpha - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-alpha">XRWebGLLayerInit.alpha - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit alpha(final boolean alpha) {
    setAlpha( alpha );
    return this;
  }

  /**
   * The Boolean antialias property, if present and set to true in the XRWebGLLayerInit object provided as the XRWebGLLayer() constructor's layerInit parameter, requests that the new WebGL rendering layer support anti-aliasing. If this property is missing or is false, anti-aliasing is not desired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/antialias">XRWebGLLayerInit.antialias - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-antialias">XRWebGLLayerInit.antialias - WebXR Device API</a>
   */
  @JsProperty(
      name = "antialias"
  )
  boolean antialias();

  /**
   * The Boolean antialias property, if present and set to true in the XRWebGLLayerInit object provided as the XRWebGLLayer() constructor's layerInit parameter, requests that the new WebGL rendering layer support anti-aliasing. If this property is missing or is false, anti-aliasing is not desired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/antialias">XRWebGLLayerInit.antialias - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-antialias">XRWebGLLayerInit.antialias - WebXR Device API</a>
   */
  @JsProperty
  void setAntialias(boolean antialias);

  /**
   * The Boolean antialias property, if present and set to true in the XRWebGLLayerInit object provided as the XRWebGLLayer() constructor's layerInit parameter, requests that the new WebGL rendering layer support anti-aliasing. If this property is missing or is false, anti-aliasing is not desired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/antialias">XRWebGLLayerInit.antialias - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-antialias">XRWebGLLayerInit.antialias - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit antialias(final boolean antialias) {
    setAntialias( antialias );
    return this;
  }

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose depth property is false will request that the new layer be created without a depth buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/depth">XRWebGLLayerInit.depth - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-depth">XRWebGLLayerInit.depth - WebXR Device API</a>
   */
  @JsProperty(
      name = "depth"
  )
  boolean depth();

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose depth property is false will request that the new layer be created without a depth buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/depth">XRWebGLLayerInit.depth - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-depth">XRWebGLLayerInit.depth - WebXR Device API</a>
   */
  @JsProperty
  void setDepth(boolean depth);

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose depth property is false will request that the new layer be created without a depth buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/depth">XRWebGLLayerInit.depth - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-depth">XRWebGLLayerInit.depth - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit depth(final boolean depth) {
    setDepth( depth );
    return this;
  }

  /**
   * The XRWebGLLayerInit dictionary's framebufferScaleFactor property, when specified upon instantiating a new XRWebGLLayer using its constructor, XRWebGLLayer(), specifies the scaling factor to use when determining the size of the frame buffer to use when rendering the scene, relative to the default XR device display resolution.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/framebufferScaleFactor">XRWebGLLayerInit.framebufferScaleFactor - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-framebufferscalefactor">XRWebGLLayerInit.framebufferScaleFactor - WebXR Device API</a>
   */
  @JsProperty(
      name = "framebufferScaleFactor"
  )
  double framebufferScaleFactor();

  /**
   * The XRWebGLLayerInit dictionary's framebufferScaleFactor property, when specified upon instantiating a new XRWebGLLayer using its constructor, XRWebGLLayer(), specifies the scaling factor to use when determining the size of the frame buffer to use when rendering the scene, relative to the default XR device display resolution.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/framebufferScaleFactor">XRWebGLLayerInit.framebufferScaleFactor - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-framebufferscalefactor">XRWebGLLayerInit.framebufferScaleFactor - WebXR Device API</a>
   */
  @JsProperty
  void setFramebufferScaleFactor(double framebufferScaleFactor);

  /**
   * The XRWebGLLayerInit dictionary's framebufferScaleFactor property, when specified upon instantiating a new XRWebGLLayer using its constructor, XRWebGLLayer(), specifies the scaling factor to use when determining the size of the frame buffer to use when rendering the scene, relative to the default XR device display resolution.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/framebufferScaleFactor">XRWebGLLayerInit.framebufferScaleFactor - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-framebufferscalefactor">XRWebGLLayerInit.framebufferScaleFactor - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit framebufferScaleFactor(final double framebufferScaleFactor) {
    setFramebufferScaleFactor( framebufferScaleFactor );
    return this;
  }

  /**
   * The XRWebGLLayerInit dictionary's Boolean ignoreDepthValues property can be provided in the options passed into the XRWebGLLayer() constructor to indicate that the depth buffer, if it exists, should be ignored while composing the scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/ignoreDepthValues">XRWebGLLayerInit.ignoreDepthValues - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-ignoredepthvalues">XRWebGLLayerInit.ignoreDepthValues - WebXR Device API</a>
   */
  @JsProperty(
      name = "ignoreDepthValues"
  )
  boolean ignoreDepthValues();

  /**
   * The XRWebGLLayerInit dictionary's Boolean ignoreDepthValues property can be provided in the options passed into the XRWebGLLayer() constructor to indicate that the depth buffer, if it exists, should be ignored while composing the scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/ignoreDepthValues">XRWebGLLayerInit.ignoreDepthValues - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-ignoredepthvalues">XRWebGLLayerInit.ignoreDepthValues - WebXR Device API</a>
   */
  @JsProperty
  void setIgnoreDepthValues(boolean ignoreDepthValues);

  /**
   * The XRWebGLLayerInit dictionary's Boolean ignoreDepthValues property can be provided in the options passed into the XRWebGLLayer() constructor to indicate that the depth buffer, if it exists, should be ignored while composing the scene.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/ignoreDepthValues">XRWebGLLayerInit.ignoreDepthValues - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-ignoredepthvalues">XRWebGLLayerInit.ignoreDepthValues - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit ignoreDepthValues(final boolean ignoreDepthValues) {
    setIgnoreDepthValues( ignoreDepthValues );
    return this;
  }

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose stencil property is false requests that the new layer be created without a stencil buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/stencil">XRWebGLLayerInit.stencil - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-stencil">XRWebGLLayerInit.stencil - WebXR Device API</a>
   */
  @JsProperty(
      name = "stencil"
  )
  boolean stencil();

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose stencil property is false requests that the new layer be created without a stencil buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/stencil">XRWebGLLayerInit.stencil - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-stencil">XRWebGLLayerInit.stencil - WebXR Device API</a>
   */
  @JsProperty
  void setStencil(boolean stencil);

  /**
   * When using the XRWebGLLayer() constructor to create a new WebGL rendering layer for WebXR, providing as the layerInit parameter an object whose stencil property is false requests that the new layer be created without a stencil buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRWebGLLayerInit/stencil">XRWebGLLayerInit.stencil - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrwebgllayerinit-stencil">XRWebGLLayerInit.stencil - WebXR Device API</a>
   */
  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit stencil(final boolean stencil) {
    setStencil( stencil );
    return this;
  }
}
