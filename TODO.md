# WebGPU

webgpu-gltf viewier!!!!!!!!
  - Take inspiration from WebGL2 variant at https://github.com/KhronosGroup/glTF-Sample-Viewer
  - Use sample gltf (embedded/loose/binary) asset examples from https://github.com/KhronosGroup/glTF-Sample-Models
  - Start sample box https://github.com/KhronosGroup/glTF-Sample-Models/tree/master/2.0/Box

Examples in order:
* animometer
* imageBlur
* shadowMapping
  - shadow mapping still looks bad????
* reversedZ
* deferredRendering

https://github.com/toji/webgpu-clustered-shading
Port https://github.com/toji/web-texture-tool

https://github.com/jack1232/WebGPU-Step-By-Step

## Actions

* Translate colours in shaders using perception derived model - https://bottosson.github.io/posts/oklab/

* Asset loaders so that shaders and images can be loaded asynchronously and not included inline.

Adopt UBOs as described in https://www.youtube.com/watch?v=bdIZ2ZloXEA

* Use gl.bindAttribLocation(  ); and semantic flags for attribute intents. Probably grab semantic intents from
  all of the materials we have used and places like
  https://github.com/jmarshall23/IcedTech/blob/Doom-3-Vanilla-Compatible/code/renderer/RenderProgs_GLSL.cpp

* Incorporate
    - https://github.com/stackgl/gl-vao
    - https://github.com/stackgl/gl-buffer

* Alternatively imitate https://luma.gl/docs/api-reference/webgl/buffer

* Rework the way we do buffers so we split it between `Buffer`, `BufferView` and `Accessor` as is done in glTf. The idea is that a `BufferView` can be uploaded once and bound to multiple `Accessor` and our code should implement this. Contrast this with what we are doing in `webglacademy/l7`

* Implement post processing similar to https://github.com/vanruesc/postprocessing

* Add flags to attributes to determine whether they need to be uploaded and clear flag on next upload.

* Add orbit controls either by looking at `THREE.OrbitControls` or a-frame, or x, or y...

* Start experimenting with the lessons on `WebGL Academy`

* Port [quake2-gwt](https://github.com/treblereel/quake2-gwt-port)

* Rewrite [model-viewer](https://github.com/google/model-viewer)

* Reimplement each of https://github.com/lettier/3d-game-shaders-for-beginners

* Figure out how to benchmark/performance profile

* Figure out how to "unit test" - maybe render scene and look at pixels? Should also query the API
  and make sure the state is as expected. This includes which attributePointers etc are enabled/disabled etc.

* Typically Engines have fixed locations for attribute data so don't have to look them up.
  In this scenario you do need the layout specifier when declaring attributes/vertex shader
  in values:

```glsl
#version 410
layout (location = 0) in vec3 pos; layout (location = 3) in vec2 uv;
out vec2 fragUV;
void main() {
gl_Position = vec4(pos, 1.0);
fragUV = uv; }
```
  Locations for `OpenFramework`

  1. Position
  2. Color
  3. Normal
  4. UV Coordinates

* Use TextureAtlas to merge multiple textures.
* Use specialized shaders so that can draw multiple mesh. Transforms are uploaded in a buffer and
  object ids are used to select the mesh and the transform. So a single draw command can result in
  multiple mesh draws with multiple transforms. Probably not needed if WEB_GL_multidraw extension
  enabled

* Add OCULUS_multiview2 so one command pipeline can be used to render twice
  - See https://developer.mozilla.org/en-US/docs/Web/API/OVR_multiview2
  - See https://developer.oculus.com/documentation/oculus-browser/browser-multiview/#using-multiview-in-webgl-20

## Apps to stretch skills

* Port https://github.com/toji/webxr-particles

* WebRTC + XR + Hand-tracking to create VR chat with a real feel of social presence. Each "area" would be hosted
  independently and other users use webrtc so connect to that peer. The communication could include audio and/or
  video as well as a data stream. Video would allow the immersion of desktop users into the world.
- Hand Tracking: https://github.com/marlon360/webxr-handtracking
- Hand Tracking: https://github.com/stewdio/handy.js
- WebXR Layers Spec: https://github.com/immersive-web/layers
- WebXR Layers Sample: https://cabanier.github.io/WebXRLayers-samples/index.html

## References

* [gltf-pipeline](https://github.com/CesiumGS/gltf-pipeline)

https://github.com/KhronosGroup/glTF-Tutorials

* [meshoptimizer](https://github.com/zeux/meshoptimizer)

* [Learn Webgl](http://learnwebgl.brown37.net/index.html)

* [WebGL2 Fundamentals](https://webgl2fundamentals.org/) - a great learning resource.

* [WebGL Academy](http://www.webglacademy.com/) - a great learning resource. I should walk
  through each tutorial ... at least in the advanced section.

* [StackGL Shader School](https://github.com/stackgl/shader-school) - an interactive shader school.

* [The Book of Shaders](https://thebookofshaders.com/) - a good learning resource.

* [Learn OpenGL](https://learnopengl.com/) - another good learning resource

* [GLSL.g4](https://github.com/google/graphicsfuzz/blob/master/ast/src/main/antlr4/com/graphicsfuzz/parser/GLSL.g4) -
  an Antlr grammar for GLSL. It would be useful if we ever wanted to build a tool that processed shaders or
  analyzed them to extract features like required uniforms and attributes or to automatically specify locations
  to avoid having to look them up at runtime.

* [glslify](https://github.com/glslify/glslify) is a module system for GLSL. This makes it
  trivial to piece together different effects and techniques from the community, including
  but certainly not limited to fog, noise, film grain, raymarching helpers, easing functions
  and lighting models.

## Long Term Actions

* Consider writing a tool that parses GLSL and adds explicit locations for all attributes and
  uniforms and generates a descriptor to avoid the need to look up data at runtime. Also add a
  pre-processor so that can combine multiple elements into a single shader. See how three.js does
  it?

* Collect a library of functions to use in shaders. i.e. Perlin noise through various means such as
  computationally or via textures etc.
