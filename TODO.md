
## Actions

* Look at [Three.JS](https://threejs.org/docs/) and recreate a very small proportion of it that
  is needed as part of learning experiments.

* Complete the `Learn GLSL Shaders from Scratch` udemy course 

* Start experimenting with the lessons on `WebGL Academy`

* Port [quake2-gwt](https://github.com/treblereel/quake2-gwt-port)

* Rewrite [model-viewer](https://github.com/google/model-viewer)

* Reimplement each of https://github.com/lettier/3d-game-shaders-for-beginners

## References

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

* Consider writing a tool that parses GLSL and adds explicit locations for all attributes and uniforms and generates
  a descriptor to avoid the need to look up data at runtime.