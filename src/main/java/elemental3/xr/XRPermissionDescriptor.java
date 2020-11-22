package elemental3.xr;

import elemental3.PermissionDescriptor;
import elemental3.PermissionName;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * User permissions in the WebXR Device API are managed using the Permissions API. To that end, the XRPermissionDescriptor dictionary is used to describe the WebXR features the app needs to use, as well as those features it would like ot use if permision is granted.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor">XRPermissionDescriptor - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrpermissiondescriptor">The definition of 'XRPermissionDescriptor' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static XRPermissionDescriptor create(@PermissionName @Nonnull final String name) {
    return Js.<XRPermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  /**
   * The mode property of the XRPermissionDescriptor dictionary is a string taken from the XRSessionMode enumerated type, specifying which Web XR session mode (inline, immersive-vr, or immersive-ar) the described permissions will be used for.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/mode">XRPermissionDescriptor.mode - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-mode">The definition of 'XRPermissionDescriptor.mode' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "mode"
  )
  @XRSessionMode
  String mode();

  /**
   * The mode property of the XRPermissionDescriptor dictionary is a string taken from the XRSessionMode enumerated type, specifying which Web XR session mode (inline, immersive-vr, or immersive-ar) the described permissions will be used for.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/mode">XRPermissionDescriptor.mode - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-mode">The definition of 'XRPermissionDescriptor.mode' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty
  void setMode(@XRSessionMode @Nonnull String mode);

  /**
   * The mode property of the XRPermissionDescriptor dictionary is a string taken from the XRSessionMode enumerated type, specifying which Web XR session mode (inline, immersive-vr, or immersive-ar) the described permissions will be used for.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/mode">XRPermissionDescriptor.mode - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-mode">The definition of 'XRPermissionDescriptor.mode' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default XRPermissionDescriptor mode(@XRSessionMode @Nonnull final String mode) {
    setMode( mode );
    return this;
  }

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">The definition of 'XRPermissionDescriptor.optionalFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "optionalFeatures"
  )
  JsArray<Any> optionalFeatures();

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">The definition of 'XRPermissionDescriptor.optionalFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty
  void setOptionalFeatures(@Nonnull JsArray<Any> optionalFeatures);

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">The definition of 'XRPermissionDescriptor.optionalFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default XRPermissionDescriptor optionalFeatures(@Nonnull final JsArray<Any> optionalFeatures) {
    setOptionalFeatures( optionalFeatures );
    return this;
  }

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">The definition of 'XRPermissionDescriptor.optionalFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  default void setOptionalFeatures(@Nonnull final Any... optionalFeatures) {
    setOptionalFeatures( Js.<JsArray<Any>>uncheckedCast( optionalFeatures ) );
  }

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">The definition of 'XRPermissionDescriptor.optionalFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default XRPermissionDescriptor optionalFeatures(@Nonnull final Any... optionalFeatures) {
    setOptionalFeatures( optionalFeatures );
    return this;
  }

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">The definition of 'XRPermissionDescriptor.requiredFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty(
      name = "requiredFeatures"
  )
  JsArray<Any> requiredFeatures();

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">The definition of 'XRPermissionDescriptor.requiredFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsProperty
  void setRequiredFeatures(@Nonnull JsArray<Any> requiredFeatures);

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">The definition of 'XRPermissionDescriptor.requiredFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default XRPermissionDescriptor requiredFeatures(@Nonnull final JsArray<Any> requiredFeatures) {
    setRequiredFeatures( requiredFeatures );
    return this;
  }

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">The definition of 'XRPermissionDescriptor.requiredFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  default void setRequiredFeatures(@Nonnull final Any... requiredFeatures) {
    setRequiredFeatures( Js.<JsArray<Any>>uncheckedCast( requiredFeatures ) );
  }

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">The definition of 'XRPermissionDescriptor.requiredFeatures' in the 'WebXR Device API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default XRPermissionDescriptor requiredFeatures(@Nonnull final Any... requiredFeatures) {
    setRequiredFeatures( requiredFeatures );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRPermissionDescriptor name(@PermissionName @Nonnull final String name) {
    setName( name );
    return this;
  }
}
