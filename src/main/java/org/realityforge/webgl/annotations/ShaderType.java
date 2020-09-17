package org.realityforge.webgl.annotations;

import elemental3.WebGL2RenderingContext;
import org.intellij.lang.annotations.MagicConstant;

@MagicConstant( intValues = { WebGL2RenderingContext.VERTEX_SHADER, WebGL2RenderingContext.FRAGMENT_SHADER } )
public @interface ShaderType
{
}
