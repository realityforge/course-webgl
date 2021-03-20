package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Comment interface represents textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Comment">Comment - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#comment">Comment - DOM</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-1728279322">Comment - Document Object Model (DOM) Level 3 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1728279322">Comment - Document Object Model (DOM) Level 2 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-1728279322">Comment - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Comment"
)
public class Comment extends CharacterData {
  /**
   * The Comment() constructor returns a newly created Comment object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Comment/Comment">Comment.Comment - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-comment-comment">Comment: Comment - DOM</a>
   */
  public Comment(@Nonnull final String data) {
  }

  /**
   * The Comment() constructor returns a newly created Comment object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Comment/Comment">Comment.Comment - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-comment-comment">Comment: Comment - DOM</a>
   */
  public Comment() {
  }
}
