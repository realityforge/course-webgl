package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The DOMImplementation interface represents an object providing methods which are not dependent on any particular document. Such an object is returned by the Document.implementation property.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation">DOMImplementation - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#domimplementation">The definition of 'DOMImplementation' in the 'DOM' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-102161490">The definition of 'DOMImplementation' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-102161490">The definition of 'DOMImplementation' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-102161490">The definition of 'DOMImplementation' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMImplementation"
)
public class DOMImplementation {
  protected DOMImplementation() {
  }

  /**
   * The DOMImplementation.createDocument() method creates and returns an XMLDocument.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation/createDocument">DOMImplementation.createDocument - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domimplementation-createdocument">The definition of 'DOMImplementation.createDocument' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#Level-2-Core-DOM-createDocument">The definition of 'DOMImplementation.createDocument' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#Level-2-Core-DOM-createDocument">The definition of 'DOMImplementation.createDocument' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   */
  @Nonnull
  public native XMLDocument createDocument(@Nullable String namespace,
      @Nonnull String qualifiedName, @Nullable DocumentType doctype);

  /**
   * The DOMImplementation.createDocument() method creates and returns an XMLDocument.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation/createDocument">DOMImplementation.createDocument - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domimplementation-createdocument">The definition of 'DOMImplementation.createDocument' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#Level-2-Core-DOM-createDocument">The definition of 'DOMImplementation.createDocument' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#Level-2-Core-DOM-createDocument">The definition of 'DOMImplementation.createDocument' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   */
  @Nonnull
  public native XMLDocument createDocument(@Nullable String namespace,
      @Nonnull String qualifiedName);

  /**
   * The DOMImplementation.createDocumentType() method returns a DocumentType object which can either be used with DOMImplementation.createDocument upon document creation or can be put into the document via methods like Node.insertBefore() or Node.replaceChild().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation/createDocumentType">DOMImplementation.createDocumentType - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domimplementation-createdocumenttype">The definition of 'DOMImplementation.createDocumentType' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#Level-2-Core-DOM-createDocType">The definition of 'DOMImplementation.createDocumentType' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#Level-2-Core-DOM-createDocType">The definition of 'DOMImplementation.createDocumentType' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   */
  @Nonnull
  public native DocumentType createDocumentType(@Nonnull String qualifiedName,
      @Nonnull String publicId, @Nonnull String systemId);

  /**
   * The DOMImplementation.createHTMLDocument() method creates a new HTML Document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation/createHTMLDocument">DOMImplementation.createHTMLDocument - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domimplementation-createhtmldocument">The definition of 'DOMImplementation.createHTMLDocument' in the 'DOM' specification.</a>
   */
  @Nonnull
  public native Document createHTMLDocument(@Nonnull String title);

  /**
   * The DOMImplementation.createHTMLDocument() method creates a new HTML Document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation/createHTMLDocument">DOMImplementation.createHTMLDocument - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domimplementation-createhtmldocument">The definition of 'DOMImplementation.createHTMLDocument' in the 'DOM' specification.</a>
   */
  @Nonnull
  public native Document createHTMLDocument();

  /**
   * The DOMImplementation.hasFeature() method returns a Boolean flag indicating if a given feature is supported. It is deprecated and modern browsers return true in all cases.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation/hasFeature">DOMImplementation.hasFeature - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domimplementation-hasfeature">The definition of 'DOMImplementation.hasFeature' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-5CED94D7">The definition of 'DOMImplementation.hasFeature' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-5CED94D7">The definition of 'DOMImplementation.hasFeature' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-5CED94D7">The definition of 'DOMImplementation.hasFeature' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  public native boolean hasFeature();
}
