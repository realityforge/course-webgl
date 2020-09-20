package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFrameElement"
)
public class HTMLFrameElement extends HTMLElement {
  @Nonnull
  public String frameBorder;

  @Nonnull
  public String longDesc;

  @Nonnull
  public String marginHeight;

  @Nonnull
  public String marginWidth;

  @Nonnull
  public String name;

  public boolean noResize;

  @Nonnull
  public String scrolling;

  @Nonnull
  public String src;

  protected HTMLFrameElement() {
  }

  @JsProperty(
      name = "contentDocument"
  )
  @Nullable
  public native Document contentDocument();

  @JsProperty(
      name = "contentWindow"
  )
  @Nullable
  public native Window contentWindow();
}
