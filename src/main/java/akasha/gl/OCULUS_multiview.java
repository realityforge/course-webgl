package akasha.gl;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OCULUS_multiview"
)
public class OCULUS_multiview implements WebGLExtension {
  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR = 0x9630;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;

  @JsOverlay
  public static final int MAX_VIEWS_OVR = 0x9631;

  @JsOverlay
  public static final String NAME = "OCULUS_multiview";

  protected OCULUS_multiview() {
  }

  public native void framebufferTextureMultiviewOVR(int target, int attachment,
      @Nullable WebGLTexture texture, int level, int baseViewIndex, int numViews);

  public native void framebufferTextureMultisampleMultiviewOVR(int target, int attachment,
      @Nullable WebGLTexture texture, int level, int samples, int baseViewIndex, int numViews);
}
