package org.realityforge.webgl.webgpu.glb_viewer.model;

import akasha.Blob;
import akasha.BlobPart;
import akasha.BlobPropertyBag;
import akasha.Console;
import akasha.ImageBitmap;
import akasha.WindowGlobal;
import akasha.core.Uint8Array;
import akasha.gpu.GPUAddressMode;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUExtent3DDict;
import akasha.gpu.GPUFilterMode;
import akasha.gpu.GPUImageCopyExternalImage;
import akasha.gpu.GPUImageCopyTextureTagged;
import akasha.gpu.GPUQueue;
import akasha.gpu.GPUSampler;
import akasha.gpu.GPUSamplerDescriptor;
import akasha.gpu.GPUTexture;
import akasha.gpu.GPUTextureDescriptor;
import akasha.gpu.GPUTextureFormat;
import akasha.gpu.GPUTextureUsage;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.GltfBufferView;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.GltfImage;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.GltfModel;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.MagFilter;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.MinFilter;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.SamplerConfig;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.WrapMode;

public final class Model
{
  @Nonnull
  private final GPUDevice _device;
  @Nonnull
  private final GltfModel _gltfModel;
  @Nullable
  private Uint8Array _binaryChunk;
  private BufferView[] _bufferViews;
  private GPUTexture[] _images;
  private GPUSampler[] _samplers;

  private Model( @Nonnull final GPUDevice device,
                 @Nonnull final GltfModel gltfModel,
                 @Nonnull final Uint8Array binaryChunk )
  {
    _device = Objects.requireNonNull( device );
    _gltfModel = Objects.requireNonNull( gltfModel );
    _binaryChunk = Objects.requireNonNull( binaryChunk );
  }

  @Nonnull
  public static Promise<Model> load( @Nonnull final GPUDevice device,
                                     @Nonnull final GltfModel gltfModel,
                                     @Nonnull final Uint8Array binaryChunk )
  {
    return
      Promise
        .resolve( new Model( device, gltfModel, binaryChunk ) )
        //TODO: Load Buffer here in future but as sample data all have one buffer
        // and it is supplied binary chunk, then let's ignore
        .then( model -> {
          model.loadBufferViews();
          return Promise.resolve( model );
        } )
        .then( Model::loadImages )
        .then( model -> {
          model.loadSamplers();
          return Promise.resolve( model );
        } )
        .then( model -> {
          model.uploadBufferViews();
          return Promise.resolve( model );
        } )
        .then( model -> {
          model.completeLoad();
          return Promise.resolve( model );
        } );
  }

  private void loadSamplers()
  {
    final SamplerConfig[] configs = _gltfModel.getSamplers();
    final int count = null != configs ? configs.length : 0;
    _samplers = new GPUSampler[ count ];
    for ( int i = 0; i < _samplers.length; ++i )
    {
      final SamplerConfig config = configs[ i ];
      _samplers[ i ] = createSampler( _device, config );
    }
  }

  @Nonnull
  private static GPUSampler createSampler( @Nonnull final GPUDevice device, @Nonnull final SamplerConfig config )
  {
    @GPUFilterMode
    final String magFilter =
      !config.isMagFilterPresent() || MagFilter.LINEAR == config.getMagFilter() ?
      GPUFilterMode.linear :
      GPUFilterMode.nearest;

    @MinFilter
    final int configMinFilter = config.isMinFilterPresent() ? config.getMinFilter() : MinFilter.LINEAR;
    @GPUFilterMode
    final String minFilter =
      MinFilter.LINEAR == configMinFilter ||
      MinFilter.LINEAR_MIPMAP_LINEAR == configMinFilter ||
      MinFilter.LINEAR_MIPMAP_NEAREST == configMinFilter ?
      GPUFilterMode.linear :
      GPUFilterMode.nearest;
    @GPUFilterMode
    final String mipmapFilter =
      MinFilter.NEAREST == configMinFilter ||
      MinFilter.NEAREST_MIPMAP_NEAREST == configMinFilter ||
      MinFilter.LINEAR_MIPMAP_NEAREST == configMinFilter ?
      GPUFilterMode.nearest :
      GPUFilterMode.linear;

    final int wrapS = config.isWrapSPresent() ? config.getWrapS() : WrapMode.REPEAT;
    @GPUAddressMode
    final String addressModeU =
      WrapMode.REPEAT == wrapS ? GPUAddressMode.repeat :
      WrapMode.MIRRORED_REPEAT == wrapS ? GPUAddressMode.mirror_repeat :
      GPUAddressMode.clamp_to_edge;
    final int wrapT = config.isWrapTPresent() ? config.getWrapT() : WrapMode.REPEAT;
    @GPUAddressMode
    final String addressModeV =
      WrapMode.REPEAT == wrapT ? GPUAddressMode.repeat :
      WrapMode.MIRRORED_REPEAT == wrapT ? GPUAddressMode.mirror_repeat :
      GPUAddressMode.clamp_to_edge;

    return device.createSampler( GPUSamplerDescriptor
                                   .of()
                                   .magFilter( magFilter )
                                   .minFilter( minFilter )
                                   .mipmapFilter( mipmapFilter )
                                   .addressModeU( addressModeU )
                                   .addressModeV( addressModeV ) );
  }

  @Nonnull
  private Promise<Model> loadImages()
  {
    final GltfImage[] gltfImages = _gltfModel.getImages();
    final int count = null != gltfImages ? gltfImages.length : 0;
    _images = new GPUTexture[ count ];
    final JsArray<Promise<? extends Void>> promises = JsArray.of();
    if ( null != gltfImages )
    {
      for ( int i = 0; i < gltfImages.length; ++i )
      {
        final GltfImage gltfImage = gltfImages[ i ];
        if ( gltfImage.isBufferViewPresent() )
        {
          final BufferView bufferView = _bufferViews[ gltfImage.getBufferView() ];
          final String mimeType = gltfImage.getMimeType();
          assert null != mimeType;
          final Blob imageData =
            new Blob( new BlobPart[]{ BlobPart.of( bufferView.getData() ) },
                      BlobPropertyBag.of().type( mimeType ) );
          final int index = i;
          promises.push( WindowGlobal
                           .createImageBitmap( imageData )
                           .thenAccept( imageBitmap -> _images[ index ] = createImage( _device, imageBitmap ) ) );
        }
        else
        {
          throw new IllegalStateException( "Image section present with uri is not currently supported." );
        }
      }
    }
    if ( count > 0 )
    {
      return Promise.all( promises ).then( v -> Promise.resolve( this ) );
    }
    else
    {
      return Promise.resolve( this );
    }
  }

  @Nonnull
  private static GPUTexture createImage( @Nonnull final GPUDevice device, @Nonnull final ImageBitmap imageBitmap )
  {
    // TODO: For glTF we need to look at where an image is used to know
    // if it should be srgb or not. We basically need to pass through
    // the material list and find if the texture which uses this image
    // is used by a metallic/roughness param

    final int width = imageBitmap.width();
    final int height = imageBitmap.height();
    final GPUTexture texture =
      device.createTexture( GPUTextureDescriptor
                               .size( GPUExtent3DDict
                                        .width( width )
                                        .height( height )
                                        .depthOrArrayLayers( 1 ) )
                               .format( GPUTextureFormat.rgba8unorm_srgb )
                               .usage( GPUTextureUsage.TEXTURE_BINDING |
                                       GPUTextureUsage.COPY_DST |
                                       GPUTextureUsage.RENDER_ATTACHMENT ) );
    final GPUQueue queue = device.queue();
    queue.copyExternalImageToTexture( GPUImageCopyExternalImage.source( imageBitmap ),
                                      GPUImageCopyTextureTagged.texture( texture ),
                                      GPUExtent3DDict
                                        .width( width )
                                        .height( height )
                                        .depthOrArrayLayers( 1 ) );

    queue
      .onSubmittedWorkDone()
      .thenAccept( v -> {
        Console.log( "Closing ImageBitmap" + imageBitmap );
        //TODO: Does this schedule a imageBitmap.close() after texture has been uploaded?
        imageBitmap.close();
      } );
    return texture;
  }

  private void loadBufferViews()
  {
    final GltfBufferView[] gltfBufferViews = _gltfModel.getBufferViews();
    _bufferViews = new BufferView[ null != gltfBufferViews ? gltfBufferViews.length : 0 ];
    if ( null != gltfBufferViews )
    {
      // TODO: Later could look at merging buffers and actually using the starting
      // offsets, but want to avoid uploading the entire buffer since it may
      // contain packed images
      for ( int i = 0; i < gltfBufferViews.length; ++i )
      {
        _bufferViews[ i ] = new BufferView( getBinaryChunk(), gltfBufferViews[ i ] );
      }
    }
  }

  private void uploadBufferViews()
  {
    // Upload the different views used by meshes
    for ( final BufferView bufferView : _bufferViews )
    {
      bufferView.uploadIfNeeded( _device );
    }
  }

  @Nonnull
  private Uint8Array getBinaryChunk()
  {
    assert null != _binaryChunk;
    return _binaryChunk;
  }

  private void completeLoad()
  {
    _binaryChunk = null;
  }
}
