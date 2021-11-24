package org.realityforge.webgl.webgpu.glb_viewer.model;

import akasha.Console;
import akasha.core.Uint8Array;
import akasha.gpu.GPUBuffer;
import akasha.gpu.GPUBufferDescriptor;
import akasha.gpu.GPUDevice;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.webgl.webgpu.glb_viewer.gltf.GltfBufferView;
import org.realityforge.webgl.webgpu.util.WebGpuKit;

@SuppressWarnings( "UnstableApiUsage" )
public final class BufferView
{
  @Nonnull
  private final Uint8Array _data;
  @BufferViewUsage
  private int _usage;
  @Nullable
  private GPUBuffer _buffer;
  private boolean _needsUpload;

  public BufferView( @Nonnull final Uint8Array buffer, @Nonnull final GltfBufferView gltf )
  {
    // final int byteStride = gltf.isByteStridePresent() ? gltf.getByteStride() : 0;
    // final int target = gltf.isTargetPresent() ? gltf.getTarget() : 0;
    _data = new Uint8Array( buffer.buffer(), buffer.byteOffset() + gltf.getByteOffset(), gltf.getByteLength() );
  }

  @Nullable
  public GPUBuffer getBuffer()
  {
    return _buffer;
  }

  @Nonnull
  public Uint8Array getData()
  {
    return _data;
  }

  public void setUsage( @BufferViewUsage final int usage )
  {
    _usage = BufferViewUsage.Util.requireValid( usage );
  }

  public void uploadIfNeeded( @Nonnull final GPUDevice device )
  {
    if ( _needsUpload )
    {
      upload( device );
    }
  }

  public void upload( @Nonnull final GPUDevice device )
  {
    Console.log( "Performing upload" );
    BufferViewUsage.Util.assertValid( _usage );
    final GPUBuffer buffer =
      device.createBuffer( GPUBufferDescriptor
                             // Note: must align to 4 byte size when mapped at creation is true
                             .size( WebGpuKit.align( _data.byteLength() ) )
                             .usage( _usage )
                             .mappedAtCreation( true ) );
    new Uint8Array( buffer.getMappedRange() ).set( _data );
    buffer.unmap();
    _buffer = buffer;
    _needsUpload = false;
  }
}
