// <reference path="js/glMatrix-0.9.5.max.js" />


document.addEventListener("DOMContentLoaded", start);
var gl;

function createRectangle() {
    var rectangle = {};

    rectangle.vertices = [
        -1, -1, 0, //0
         1, -1, 0, //1
         1,  1, 0, //2
        -1,  1, 0 //3
    ];

    rectangle.indices =
        [
        0, 1, 2,
        0, 2, 3
        ]


    rectangle.colors = [
        1, 0, 0, 1,
        1, 0, 0, 1,
        1, 0, 0, 1,
        1, 0, 0, 1,
    ];


    rectangle.vao = gl.createVertexArray();
    gl.bindVertexArray(rectangle.vao);


    rectangle.positionBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, rectangle.positionBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(rectangle.vertices), gl.STATIC_DRAW);



    rectangle.colorBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, rectangle.colorBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(rectangle.colors), gl.STATIC_DRAW);

    rectangle.indicesBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ELEMENT_ARRAY_BUFFER, rectangle.indicesBuffer);
    gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(rectangle.indices), gl.STATIC_DRAW);



    rectangle.vertexShader = getAndCompileShader("vertexShader");
    rectangle.fragmentshader = getAndCompileShader("fragmentShader");
    rectangle.shaderProgram = gl.createProgram();
    gl.attachShader(rectangle.shaderProgram, rectangle.vertexShader);
    gl.attachShader(rectangle.shaderProgram, rectangle.fragmentshader);
    gl.linkProgram(rectangle.shaderProgram);

    if (!gl.getProgramParameter(rectangle.shaderProgram, gl.LINK_STATUS)) {
        alert("Could not link shaders");
    }




    rectangle.positionAttributeLocation = gl.getAttribLocation(rectangle.shaderProgram, "position");
    gl.enableVertexAttribArray(rectangle.positionAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, rectangle.positionBuffer);
    gl.vertexAttribPointer(rectangle.positionAttributeLocation, 3, gl.FLOAT, false, 0, 0);

    rectangle.colorAttributeLocation = gl.getAttribLocation(rectangle.shaderProgram, "color");
    gl.enableVertexAttribArray(rectangle.colorAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, rectangle.colorBuffer);
    gl.vertexAttribPointer(rectangle.colorAttributeLocation, 4, gl.FLOAT, false, 0, 0);



    rectangle.modelMatrix = mat4.create();

    rectangle.modelMatrixLocation = gl.getUniformLocation(rectangle.shaderProgram, "modelMatrix");



    return rectangle;

}

function start() {

    var canvas = document.getElementById("renderCanvas");
    gl = canvas.getContext("webgl2");

    var rectangle = createRectangle();

    gl.useProgram(rectangle.shaderProgram);

    var viewMatrix = mat4.create();
    var projectionMatrix = mat4.create();
    mat4.perspective(projectionMatrix, 45 * Math.PI / 180.0, canvas.width / canvas.height, 0.1, 10);
    var viewMatrixLocation = gl.getUniformLocation(rectangle.shaderProgram, "viewMatrix");
    var projectionMatrixLocation = gl.getUniformLocation(rectangle.shaderProgram, "projectionMatrix");

    var angle = 0;

    function runRenderLoop() {
        gl.clearColor(0, 0, 0, 1);
        gl.clear(gl.COLOR_BUFFER_BIT | gl.DEPTH_BUFFER_BIT);
        gl.enable(gl.DEPTH_TEST);

        mat4.identity(rectangle.modelMatrix);

        mat4.translate(rectangle.modelMatrix, rectangle.modelMatrix, [2, 0, -7]);
        mat4.rotateY(rectangle.modelMatrix, rectangle.modelMatrix, angle);
        mat4.rotateX(rectangle.modelMatrix, rectangle.modelMatrix, .25);


        angle += .1;

        gl.uniformMatrix4fv(rectangle.modelMatrixLocation, false, rectangle.modelMatrix);
        gl.uniformMatrix4fv(viewMatrixLocation, false, viewMatrix);
        gl.uniformMatrix4fv(projectionMatrixLocation, false, projectionMatrix);

        gl.useProgram(rectangle.shaderProgram);
        gl.bindVertexArray(rectangle.vao);

     //   gl.drawArrays(gl.TRIANGLES, 0, 6);
        gl.drawElements(gl.TRIANGLES, 6, gl.UNSIGNED_SHORT,0);

        mat4.identity(rectangle.modelMatrix);

        mat4.translate(rectangle.modelMatrix, rectangle.modelMatrix, [0, 0, -7]);
        mat4.rotateY(rectangle.modelMatrix, rectangle.modelMatrix, angle);
        mat4.rotateX(rectangle.modelMatrix, rectangle.modelMatrix, .25);

        gl.uniformMatrix4fv(rectangle.modelMatrixLocation, false, rectangle.modelMatrix);
        gl.uniformMatrix4fv(viewMatrixLocation, false, viewMatrix);
        gl.uniformMatrix4fv(projectionMatrixLocation, false, projectionMatrix);
        gl.drawElements(gl.TRIANGLES, 6, gl.UNSIGNED_SHORT, 0);
        mat4.identity(rectangle.modelMatrix);

        mat4.translate(rectangle.modelMatrix, rectangle.modelMatrix, [-2, 0, -7]);
        mat4.rotateY(rectangle.modelMatrix, rectangle.modelMatrix, angle * 2);
        mat4.rotateX(rectangle.modelMatrix, rectangle.modelMatrix, angle / 5);

        gl.uniformMatrix4fv(rectangle.modelMatrixLocation, false, rectangle.modelMatrix);
        gl.uniformMatrix4fv(viewMatrixLocation, false, viewMatrix);
        gl.uniformMatrix4fv(projectionMatrixLocation, false, projectionMatrix);
        gl.drawElements(gl.TRIANGLES, 6, gl.UNSIGNED_SHORT, 0);
        requestAnimationFrame(runRenderLoop);
    }

    requestAnimationFrame(runRenderLoop);

}

function getAndCompileShader(id) {
    var shader;
    var shaderElement = document.getElementById(id);
    var shaderText = shaderElement.text.trim();
    if (id == "vertexShader")
        shader = gl.createShader(gl.VERTEX_SHADER);
    else if (id == "fragmentShader")
        shader = gl.createShader(gl.FRAGMENT_SHADER);

    gl.shaderSource(shader, shaderText);
    gl.compileShader(shader);
    if (!gl.getShaderParameter(shader, gl.COMPILE_STATUS)) {
        alert(gl.getShaderInfoLog(shader));
        return null;
    }
    return shader;
}

