package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationRecord">MutationRecord - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#mutationrecord">MutationRecord - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MutationRecord"
)
public class MutationRecord {
  protected MutationRecord() {
  }

  @JsProperty(
      name = "addedNodes"
  )
  @Nonnull
  public native NodeList addedNodes();

  @JsProperty(
      name = "attributeName"
  )
  @Nullable
  public native String attributeName();

  @JsProperty(
      name = "attributeNamespace"
  )
  @Nullable
  public native String attributeNamespace();

  @JsProperty(
      name = "nextSibling"
  )
  @Nullable
  public native Node nextSibling();

  @JsProperty(
      name = "oldValue"
  )
  @Nullable
  public native String oldValue();

  @JsProperty(
      name = "previousSibling"
  )
  @Nullable
  public native Node previousSibling();

  @JsProperty(
      name = "removedNodes"
  )
  @Nonnull
  public native NodeList removedNodes();

  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native Node target();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();
}
