package akasha.gl;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OVR_multiview2 extension is part of the WebGL API and adds support for rendering into multiple views simultaneously. This especially useful for virtual reality (VR) and WebXR.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OVR_multiview2">OVR_multiview2 - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/OVR_multiview2/">OVR_multiview2</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OVR_multiview2"
)
public class OVR_multiview2 implements WebGLExtension {
  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR = 0x9630;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;

  @JsOverlay
  public static final int MAX_VIEWS_OVR = 0x9631;

  @JsOverlay
  public static final String NAME = "OVR_multiview2";

  protected OVR_multiview2() {
  }

  public native void framebufferTextureMultiviewOVR(int target, int attachment,
      @Nullable WebGLTexture texture, int level, int baseViewIndex, int numViews);
}
