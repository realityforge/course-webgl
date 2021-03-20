package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface ShareData {
  @JsOverlay
  @Nonnull
  static ShareData create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "files"
  )
  JsArray<File> files();

  @JsProperty
  void setFiles(@Nonnull JsArray<File> files);

  @JsOverlay
  @Nonnull
  default ShareData files(@Nonnull final JsArray<File> files) {
    setFiles( files );
    return this;
  }

  @JsOverlay
  default void setFiles(@Nonnull final File... files) {
    setFiles( Js.<JsArray<File>>uncheckedCast( files ) );
  }

  @JsOverlay
  @Nonnull
  default ShareData files(@Nonnull final File... files) {
    setFiles( files );
    return this;
  }

  @JsProperty(
      name = "text"
  )
  String text();

  @JsProperty
  void setText(@Nonnull String text);

  @JsOverlay
  @Nonnull
  default ShareData text(@Nonnull final String text) {
    setText( text );
    return this;
  }

  @JsProperty(
      name = "title"
  )
  String title();

  @JsProperty
  void setTitle(@Nonnull String title);

  @JsOverlay
  @Nonnull
  default ShareData title(@Nonnull final String title) {
    setTitle( title );
    return this;
  }

  @JsProperty(
      name = "url"
  )
  String url();

  @JsProperty
  void setUrl(@Nonnull String url);

  @JsOverlay
  @Nonnull
  default ShareData url(@Nonnull final String url) {
    setUrl( url );
    return this;
  }
}
