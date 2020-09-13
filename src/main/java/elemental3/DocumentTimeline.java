package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The DocumentTimeline interface of the the Web Animations API represents animation timelines, including the default document timeline (accessed via Document.timeline).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentTimeline">DocumentTimeline - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DocumentTimeline"
)
public class DocumentTimeline extends AnimationTimeline {
  /**
   * The DocumentTimeline() constructor of the Web Animations API creates a new instance of the DocumentTimeline object associated with the active document of the current browsing context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentTimeline/DocumentTimeline">DocumentTimeline.DocumentTimeline - MDN</a>
   */
  public DocumentTimeline(@Nonnull final DocumentTimelineOptions options) {
  }

  /**
   * The DocumentTimeline() constructor of the Web Animations API creates a new instance of the DocumentTimeline object associated with the active document of the current browsing context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentTimeline/DocumentTimeline">DocumentTimeline.DocumentTimeline - MDN</a>
   */
  public DocumentTimeline() {
  }
}
