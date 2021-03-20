package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ProcessingInstruction interface represents a processing instruction; that is, a Node which embeds an instruction targeting a specific application but that can be ignored by any other applications which don't recognize the instruction.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ProcessingInstruction">ProcessingInstruction - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#processinginstruction">ProcessingInstruction - DOM</a>
 * @see <a href="https://www.w3.org/TR/xml/#sec-pi">XML specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ProcessingInstruction"
)
public class ProcessingInstruction extends CharacterData {
  protected ProcessingInstruction() {
  }

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();

  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native String target();
}
