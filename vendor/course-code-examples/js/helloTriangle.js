
document.addEventListener("DOMContentLoaded", start);
var gl;

function start()
{
    console.log("I started");
    var canvas = document.getElementById("renderCanvas");
    gl = canvas.getContext("webgl2");

    var triangleVertices = [
        1.0, -1.0, 0.0,
        0.0, 1.0, 0.0,
        - 1.0, -1.0, 0.0];

    var triangleVertexPositionBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, triangleVertexPositionBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(triangleVertices), gl.STATIC_DRAW);

    var triangleColors = [
        1.0, 0.0, 0.0, 1.0,
        0.0, 1.0, 0.0, 1.0,
        0.0, 0.0, 1.0, 1.0
    ]

    var triangleVertexColorBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, triangleVertexColorBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(triangleColors), gl.STATIC_DRAW);


    // Alternative - 1
    var triangleVerticesAndColors = [
    1.0, -1.0, 0.0, 1.0, 0.0, 0.0, 1.0,
    0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0,
    - 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 1.0
    ]

    var triangleVetexPositionAndColorBuffer = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, triangleVetexPositionAndColorBuffer);
    gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(triangleVerticesAndColors), gl.STATIC_DRAW);
    
    // End of Alternative - 1

    var vertexShader = getAndCompileShader("vertexShader");
    var fragmentshader = getAndCompileShader("fragmentShader");
    var shaderProgram = gl.createProgram();
    gl.attachShader(shaderProgram, vertexShader);
    gl.attachShader(shaderProgram, fragmentshader);
    gl.linkProgram(shaderProgram);

    if (!gl.getProgramParameter(shaderProgram, gl.LINK_STATUS)) {
        alert("Could not link shaders");
    }

    gl.useProgram(shaderProgram);

    var vao = gl.createVertexArray();
    gl.bindVertexArray(vao);

    var positionAttributeLocation = gl.getAttribLocation(shaderProgram, "position");
    gl.enableVertexAttribArray(positionAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, triangleVertexPositionBuffer);
    //void gl.vertexAttribPointer(index, size, type, normalized, stride, offset);
    gl.vertexAttribPointer(positionAttributeLocation, 3, gl.FLOAT,false, 0, 0);

    var colorAttributeLocation = gl.getAttribLocation(shaderProgram, "color");
    gl.enableVertexAttribArray(colorAttributeLocation);
    gl.bindBuffer(gl.ARRAY_BUFFER, triangleVertexColorBuffer);
    //void gl.vertexAttribPointer(index, size, type, normalized, stride, offset);
    gl.vertexAttribPointer(colorAttributeLocation, 4, gl.FLOAT,false, 0, 0);

    // Alternative - 1 again
    //const FLOAT_SIZE = 4;
    //gl.bindBuffer(gl.ARRAY_BUFFER, triangleVetexPositionAndColorBuffer);
    //gl.vertexAttribPointer(positionAttributeLocation, 3, gl.FLOAT, false, 7*FLOAT_SIZE, 0);
    //gl.vertexAttribPointer(colorAttributeLocation, 4, gl.FLOAT, false, 7*FLOAT_SIZE, 3*FLOAT_SIZE);


    requestAnimationFrame(runRenderLoop);


    function runRenderLoop()
    {
        gl.clearColor(1, 0, 0, 1);
        gl.clear(gl.COLOR_BUFFER_BIT);

        gl.useProgram(shaderProgram);
        gl.bindVertexArray(vao);
        gl.drawArrays(gl.TRIANGLES, 0, 3);

        requestAnimationFrame(runRenderLoop);
    }


}

function getAndCompileShader(id)
{
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

