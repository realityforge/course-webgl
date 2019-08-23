// <reference path="js/glMatrix-0.9.5.max.js" />


document.addEventListener("DOMContentLoaded", start);
var gl;
var ready = false;
var light = { ambient: vec3.fromValues(1, 1, 1), position: vec3.fromValues(8, 0, -7) };

function createCube() {
    var cube = {};

    cube.vertices = [
        -0.5, -0.5, -0.5,
         0.5, -0.5, -0.5,
         0.5, 0.5, -0.5,
         0.5, 0.5, -0.5,
        -0.5, 0.5, -0.5,
        -0.5, -0.5, -0.5,

        -0.5, -0.5, 0.5,
         0.5, -0.5, 0.5,
         0.5, 0.5, 0.5,
         0.5, 0.5, 0.5,
        -0.5, 0.5, 0.5,
        -0.5, -0.5, 0.5,

        -0.5, 0.5, 0.5,
        -0.5, 0.5, -0.5,
        -0.5, -0.5, -0.5,
        -0.5, -0.5, -0.5,
        -0.5, -0.5, 0.5,
        -0.5, 0.5, 0.5,

         0.5, 0.5, 0.5,
         0.5, 0.5, -0.5,
         0.5, -0.5, -0.5,
         0.5, -0.5, -0.5,
         0.5, -0.5, 0.5,
         0.5, 0.5, 0.5,

        -0.5, -0.5, -0.5,
         0.5, -0.5, -0.5,
         0.5, -0.5, 0.5,
         0.5, -0.5, 0.5,
        -0.5, -0.5, 0.5,
        -0.5, -0.5, -0.5,

        -0.5, 0.5, -0.5,
         0.5, 0.5, -0.5,
         0.5, 0.5, 0.5,
         0.5, 0.5, 0.5,
        -0.5, 0.5, 0.5,
        -0.5, 0.5, -0.5
    ];


    cube.colors = [];

    var faceColors = [
        [1.0, 0.0, 0.0, 1.0], // Front face
        [0.0, 1.0, 0.0, 1.0], // Back face
        [0.0, 0.0, 1.0, 1.0], // Top face
        [1.0, 1.0, 0.0, 1.0], // Bottom face
        [1.0, 0.0, 1.0, 1.0], // Right face
        [0.0, 1.0, 1.0, 1.0] // Left face
    ];

    faceColors.forEach(function (color) {
        for (var i = 0 ; i < 6 ; i++) {
            cube.colors = cube.colors.concat(color);
        }
    }
    );

    cube.textureCoordinates = [
          0.0, 0.0,
          1.0, 0.0,
          1.0, 1.0,
          1.0, 1.0,
          0.0, 1.0,
          0.0, 0.0,

          0.0, 0.0,
          1.0, 0.0,
          1.0, 1.0,
          1.0, 1.0,
          0.0, 1.0,
          0.0, 0.0,

          1.0, 0.0,
          1.0, 1.0,
          0.0, 1.0,
          0.0, 1.0,
          0.0, 0.0,
          1.0, 0.0,

          1.0, 0.0,
          1.0, 1.0,
          0.0, 1.0,
          0.0, 1.0,
          0.0, 0.0,
          1.0, 0.0,

          0.0, 1.0,
          1.0, 1.0,
          1.0, 0.0,
          1.0, 0.0,
          0.0, 0.0,
          0.0, 1.0,

          0.0, 1.0,
          1.0, 1.0,
          1.0, 0.0,
          1.0, 0.0,
          0.0, 0.0,
          0.0, 1.0
    ];

    cube.vertexNormals = [

          0.0,  0.0, -1.0,
          0.0,  0.0, -1.0,
          0.0,  0.0, -1.0,
          0.0,  0.0, -1.0,
          0.0,  0.0, -1.0,
          0.0,  0.0, -1.0,

          0.0,  0.0,  1.0,
          0.0,  0.0,  1.0,
          0.0,  0.0,  1.0,
          0.0,  0.0,  1.0,
          0.0,  0.0,  1.0,
          0.0,  0.0,  1.0,

         -1.0,  0.0,  0.0,
         -1.0,  0.0,  0.0,
         -1.0,  0.0,  0.0,
         -1.0,  0.0,  0.0,
         -1.0,  0.0,  0.0,
         -1.0,  0.0,  0.0,

          1.0,  0.0,  0.0,
          1.0,  0.0,  0.0,
          1.0,  0.0,  0.0,
          1.0,  0.0,  0.0,
          1.0,  0.0,  0.0,
          1.0,  0.0,  0.0,

          0.0, -1.0,  0.0,
          0.0, -1.0,  0.0,
          0.0, -1.0,  0.0,
          0.0, -1.0,  0.0,
          0.0, -1.0,  0.0,
          0.0, -1.0,  0.0,

          0.0,  1.0,  0.0,
          0.0,  1.0,  0.0,
          0.0,  1.0,  0.0,
          0.0,  1.0,  0.0,
          0.0,  1.0,  0.0,
          0.0,  1.0,  0.0

    ]

    cube.positionBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.positionBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(cube.vertices), gl.STATIC_DRAW);



    cube.colorBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.colorBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(cube.colors), gl.STATIC_DRAW);

    cube.normalsBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.normalsBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(cube.vertexNormals), gl.STATIC_DRAW);


    cube.textureCoordinatesBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.textureCoordinatesBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(cube.textureCoordinates), gl.STATIC_DRAW);

    cube.texture1 = gl.createTexture();
    cube.texture1.image = new Image();
    cube.texture1.image.src = "images/wood.jpg";

    cube.texture1.image.onload = function()
    {
        gl.bindTexture(gl.TEXTURE_2D, cube.texture1);
        gl.pixelStorei(gl.UNPACK_FLIP_Y_WEBGL, true);
        //void gl.texImage2D(target, level, internalformat, format, type, HTMLImageElement? pixels);
        gl.texImage2D(gl.TEXTURE_2D, 0, gl.RGB, gl.RGB, gl.UNSIGNED_BYTE, cube.texture1.image);

        gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MAG_FILTER, gl.LINEAR);
        gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MIN_FILTER, gl.LINEAR);


        ready = true;
    }

    cube.texture2 = gl.createTexture();
    cube.texture2.image = new Image();
    cube.texture2.image.src = "images/StoreLogo.png";
    cube.texture2.image.onload = function()
    {
        gl.bindTexture(gl.TEXTURE_2D, cube.texture2);
        gl.pixelStorei(gl.UNPACK_FLIP_Y_WEBGL, true);
        //void gl.texImage2D(target, level, internalformat, format, type, HTMLImageElement? pixels);
        gl.texImage2D(gl.TEXTURE_2D, 0, gl.RGB, gl.RGB, gl.UNSIGNED_BYTE, cube.texture2.image);

        gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MAG_FILTER, gl.LINEAR);
        gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MIN_FILTER, gl.LINEAR);
    }


    return cube;

}

function createObjectCubes(cube) {
    var objectCube = {};
    objectCube.vertexShader = getAndCompileShader("objectCubeVertexShader");
    objectCube.fragmentshader = getAndCompileShader("objectCubeFragmentShader");
    objectCube.shaderProgram = gl.createProgram();
    gl.attachShader(objectCube.shaderProgram, objectCube.vertexShader);
    gl.attachShader(objectCube.shaderProgram, objectCube.fragmentshader);
    gl.linkProgram(objectCube.shaderProgram);

    if (!gl.getProgramParameter(objectCube.shaderProgram, gl.LINK_STATUS)) {
        alert("Could not link shaders");
    }


    objectCube.vao = gl.createVertexArray();
    gl.bindVertexArray(objectCube.vao);

    objectCube.positionAttributeLocation = gl.getAttribLocation(objectCube.shaderProgram, "position");
    gl.enableVertexAttribArray(objectCube.positionAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.positionBuffer);
    gl.vertexAttribPointer(objectCube.positionAttributeLocation, 3, gl.FLOAT, false, 0, 0);

    objectCube.colorAttributeLocation = gl.getAttribLocation(objectCube.shaderProgram, "color");
    gl.enableVertexAttribArray(objectCube.colorAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.colorBuffer);
    gl.vertexAttribPointer(objectCube.colorAttributeLocation, 4, gl.FLOAT, false, 0, 0);

    objectCube.vertexNormalAttributeLocation = gl.getAttribLocation(objectCube.shaderProgram, "normal");
    gl.enableVertexAttribArray(objectCube.vertexNormalAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.normalsBuffer);
    gl.vertexAttribPointer(objectCube.vertexNormalAttributeLocation, 3, gl.FLOAT, false, 0, 0);


    objectCube.textureCoordinateAttributeLocation = gl.getAttribLocation(objectCube.shaderProgram, "textureCoordinate");
    gl.enableVertexAttribArray(objectCube.textureCoordinateAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.textureCoordinatesBuffer);
    gl.vertexAttribPointer(objectCube.textureCoordinateAttributeLocation, 2, gl.FLOAT, false, 0, 0);


    objectCube.modelMatrix = mat4.create();

    gl.useProgram(objectCube.shaderProgram);

    objectCube.modelMatrixLocation = gl.getUniformLocation(objectCube.shaderProgram, "modelMatrix");

    objectCube.samplerUniformLocation = gl.getUniformLocation(objectCube.shaderProgram, "sampler0");


    gl.activeTexture(gl.TEXTURE0); // you have at least 8 textures possible
    gl.bindTexture(gl.TEXTURE_2D, cube.texture1);
    gl.uniform1i(objectCube.samplerUniformLocation, 0);


    objectCube.samplerUniformLocation = gl.getUniformLocation(objectCube.shaderProgram, "sampler1");


    gl.activeTexture(gl.TEXTURE1); // you have at least 8 textures possible
    gl.bindTexture(gl.TEXTURE_2D, cube.texture2);
    gl.uniform1i(objectCube.samplerUniformLocation, 1);

    return objectCube;

}

function createLightCubes(cube) {
    var lightCube = {};
    lightCube.vertexShader = getAndCompileShader("lightCubeVertexShader");
    lightCube.fragmentshader = getAndCompileShader("lightCubeFragmentShader");
    lightCube.shaderProgram = gl.createProgram();
    gl.attachShader(lightCube.shaderProgram, lightCube.vertexShader);
    gl.attachShader(lightCube.shaderProgram, lightCube.fragmentshader);
    gl.linkProgram(lightCube.shaderProgram);

    if (!gl.getProgramParameter(lightCube.shaderProgram, gl.LINK_STATUS)) {
        alert("Could not link shaders");
    }


    lightCube.vao = gl.createVertexArray();
    gl.bindVertexArray(lightCube.vao);

    lightCube.positionAttributeLocation = gl.getAttribLocation(lightCube.shaderProgram, "position");
    gl.enableVertexAttribArray(lightCube.positionAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, cube.positionBuffer);
    gl.vertexAttribPointer(lightCube.positionAttributeLocation, 3, gl.FLOAT, false, 0, 0);


    lightCube.modelMatrix = mat4.create();

    gl.useProgram(lightCube.shaderProgram);

    lightCube.modelMatrixLocation = gl.getUniformLocation(lightCube.shaderProgram, "modelMatrix");

    return lightCube;

}
function start() {
    var canvas = document.getElementById("renderCanvas");
    gl = canvas.getContext("webgl2", {alpha:false});

    var cube = createCube();

    var objectCube = createObjectCubes(cube);
    var lightCube = createLightCubes(cube);

    gl.useProgram(objectCube.shaderProgram);

    var viewMatrix = mat4.create();
    var projectionMatrix = mat4.create();
    mat4.perspective(projectionMatrix, 45 * Math.PI / 180.0, canvas.width / canvas.height, 0.1, 100);
    objectCube.viewMatrixLocation = gl.getUniformLocation(objectCube.shaderProgram, "viewMatrix");
    objectCube.projectionMatrixLocation = gl.getUniformLocation(objectCube.shaderProgram, "projectionMatrix");
    objectCube.lightColorAttributeLocation = gl.getUniformLocation(objectCube.shaderProgram, "lightColor");
    objectCube.lightPositionAttributeLocation = gl.getUniformLocation(objectCube.shaderProgram, "lightPosition");
    objectCube.cameraPositionAttributeLocation = gl.getUniformLocation(objectCube.shaderProgram, "cameraPosition");

    lightCube.colorLocation = gl.getUniformLocation(lightCube.shaderProgram, "color");
    lightCube.viewMatrixLocation = gl.getUniformLocation(lightCube.shaderProgram, "viewMatrix");
    lightCube.projectionMatrixLocation = gl.getUniformLocation(lightCube.shaderProgram, "projectionMatrix");

    var angle = 0;

    var camera = {position: vec3.fromValues(0,0,0), direction:vec3.fromValues(0,0,-1) , pitch:0, yaw : -1*Math.PI/2.0};
    
    gl.enable(gl.BLEND);
    gl.blendFunc(gl.SRC_ALPHA, gl.ONE_MINUS_SRC_ALPHA);

    var time = 0;
    function runRenderLoop() {
        
        requestAnimationFrame(runRenderLoop);
        if (!ready) return;

        gl.clearColor(0, 0, 0, 1);
        gl.clear(gl.COLOR_BUFFER_BIT | gl.DEPTH_BUFFER_BIT);
        gl.enable(gl.DEPTH_TEST);

        gl.useProgram(objectCube.shaderProgram);

        moveCamera(camera);
        var target = vec3.create();
        vec3.add(target, camera.position, camera.direction);

        mat4.lookAt(viewMatrix, camera.position, target, vec3.fromValues(0,1,0));

 

        mat4.identity(objectCube.modelMatrix);

        mat4.translate(objectCube.modelMatrix, objectCube.modelMatrix, [4, 0, -7]);
        mat4.rotateY(objectCube.modelMatrix, objectCube.modelMatrix, angle);
        mat4.rotateX(objectCube.modelMatrix, objectCube.modelMatrix, .25);
        mat4.scale(objectCube.modelMatrix, objectCube.modelMatrix, vec3.fromValues(2, 2, 2));

        gl.uniform3fv(objectCube.lightColorAttributeLocation, light.ambient);
        gl.uniform3fv(objectCube.lightPositionAttributeLocation, light.position);
        gl.uniform3fv(objectCube.cameraPositionAttributeLocation, camera.position);


        gl.uniformMatrix4fv(objectCube.modelMatrixLocation, false, objectCube.modelMatrix);
        gl.uniformMatrix4fv(objectCube.viewMatrixLocation, false, viewMatrix);
        gl.uniformMatrix4fv(objectCube.projectionMatrixLocation, false, projectionMatrix);

        gl.useProgram(objectCube.shaderProgram);
        gl.bindVertexArray(objectCube.vao);

        gl.drawArrays(gl.TRIANGLES, 0, 36);

        mat4.identity(objectCube.modelMatrix);

        mat4.translate(objectCube.modelMatrix, objectCube.modelMatrix, [0, 0, -7]);
        mat4.rotateY(objectCube.modelMatrix, objectCube.modelMatrix, angle);
        mat4.rotateX(objectCube.modelMatrix, objectCube.modelMatrix, .25);
        mat4.scale(objectCube.modelMatrix, objectCube.modelMatrix, vec3.fromValues(2, 2, 2));

        gl.uniformMatrix4fv(objectCube.modelMatrixLocation, false, objectCube.modelMatrix);
        gl.drawArrays(gl.TRIANGLES, 0, 36);

        mat4.identity(objectCube.modelMatrix);

        mat4.translate(objectCube.modelMatrix, objectCube.modelMatrix, [-4, 0, -7]);
        mat4.rotateY(objectCube.modelMatrix, objectCube.modelMatrix, angle * 2);
        mat4.rotateX(objectCube.modelMatrix, objectCube.modelMatrix, angle / 5);
        mat4.scale(objectCube.modelMatrix, objectCube.modelMatrix, vec3.fromValues(2, 2, 2));

        gl.uniformMatrix4fv(objectCube.modelMatrixLocation, false, objectCube.modelMatrix);
        gl.drawArrays(gl.TRIANGLES, 0, 36);


        // light visualization

        gl.useProgram(lightCube.shaderProgram);

        mat4.identity(lightCube.modelMatrix);

        //light.position[1] = 6 * Math.sin(.1 * (time + light.position[1]));
        //light.position[0] = -6 * Math.sin(.1 * (time + light.position[0]));
       
        //time += .1;
        mat4.translate(lightCube.modelMatrix, lightCube.modelMatrix, light.position);

        mat4.scale(lightCube.modelMatrix, lightCube.modelMatrix, vec3.fromValues(.2, .2, .2));

        gl.uniformMatrix4fv(lightCube.modelMatrixLocation, false, lightCube.modelMatrix);
        gl.uniform3fv(lightCube.colorLocation, light.ambient);
        gl.uniformMatrix4fv(lightCube.viewMatrixLocation, false, viewMatrix);
        gl.uniformMatrix4fv(lightCube.projectionMatrixLocation, false, projectionMatrix);

        gl.drawArrays(gl.TRIANGLES, 0, 36);
        
    }

    requestAnimationFrame(runRenderLoop);

}

function getAndCompileShader(id) {
    var shader;
    var shaderElement = document.getElementById(id);
    var shaderText = shaderElement.text.trim();
    if (shaderElement.type == "vertexShader")
        shader = gl.createShader(gl.VERTEX_SHADER);
    else if (shaderElement.type == "fragmentShader")
        shader = gl.createShader(gl.FRAGMENT_SHADER);

    gl.shaderSource(shader, shaderText);
    gl.compileShader(shader);
    if (!gl.getShaderParameter(shader, gl.COMPILE_STATUS)) {
        alert(gl.getShaderInfoLog(shader));
        return null;
    }
    return shader;
}


var isWPressed = false;
var isSPressed = false;
var isAPressed = false;
var isDPressed = false;
var isGPressed = false;
var isJPressed = false;
var isYPressed = false;
var isHPressed = false;

document.addEventListener("keydown", function (event) {
    if (event.key == 'w') {
        isWPressed = true;
    }
    if (event.key == 's') {
        isSPressed = true;
    }
    if (event.key == 'a') {
        isAPressed = true;
    }
    if (event.key == 'd') {
        isDPressed = true;
    }
    if (event.key == 'g') {
        isGPressed = true;
    }
    if (event.key == 'j') {
        isJPressed = true;
    }
    if (event.key == 'y') {
        isYPressed = true;
    } if (event.key == 'h') {
        isHPressed = true;
    }
}
);

document.addEventListener("keyup", function (event) {
    if (event.key == 'w') {
        isWPressed = false;
    }
    if (event.key == 's') {
        isSPressed = false;
    }
    if (event.key == 'a') {
        isAPressed = false;
    }
    if (event.key == 'd') {
        isDPressed = false;
    }
    if (event.key == 'j') {
        isJPressed = false;
    }
    if (event.key == 'g') {
        isGPressed = false;
    }
    if (event.key == 'y') {
        isYPressed = false;
    }
    if (event.key == 'h') {
        isHPressed = false;
    }
});

function moveCamera(camera) {
    camera.direction[0] = Math.cos(camera.pitch) * Math.cos(camera.yaw);
    camera.direction[1] = Math.sin(camera.pitch);
    camera.direction[2] = Math.cos(camera.pitch) * Math.sin(camera.yaw);

    camera.right = vec3.fromValues(-1 * Math.sin(camera.yaw), 0, Math.cos(camera.yaw));

    //console.log(camera.right);
    var movementDirection = vec3.create();
    if (isWPressed) {
        vec3.scale(movementDirection, camera.direction, .1);
        vec3.add(camera.position, camera.position, movementDirection);
    }
    if (isSPressed) {
        vec3.scale(movementDirection, camera.direction, -.1);
        vec3.add(camera.position, camera.position, movementDirection);
    }
    if (isAPressed) {
        vec3.scale(movementDirection, camera.right, -.1);
        vec3.add(camera.position, camera.position, movementDirection);
    }
    if (isDPressed) {
        vec3.scale(movementDirection, camera.right, .1);
        vec3.add(camera.position, camera.position, movementDirection);
    }
    // rotations
    if (isGPressed) {
        camera.yaw -=.02;
    }
    if (isJPressed) {
        camera.yaw += .02;
    }
    if (isYPressed) {
        camera.pitch += .02;
    }
    if (isHPressed) {
        camera.pitch -= .02;
    }
}