/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.FloatBuffer
 *  java.nio.IntBuffer
 *  org.lwjgl.opengl.ARBFramebufferObject
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexBufferObject
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.EXTBlendFuncSeparate
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 *  oshi.SystemInfo
 *  oshi.hardware.Processor
 */
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import oshi.SystemInfo;
import oshi.hardware.Processor;

public class bqs {
    public static boolean a;
    public static boolean b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    private static int T;
    public static boolean l;
    private static boolean U;
    private static boolean V;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    private static boolean W;
    public static int q;
    public static int r;
    public static int s;
    private static boolean X;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    private static boolean Y;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    private static String Z;
    private static String aa;
    public static boolean P;
    public static boolean Q;
    private static boolean ab;
    public static int R;
    public static int S;

    public static void a() {
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        W = contextCapabilities.GL_ARB_multitexture && !contextCapabilities.OpenGL13;
        boolean bl = X = contextCapabilities.GL_ARB_texture_env_combine && !contextCapabilities.OpenGL13;
        if (W) {
            Z = Z + "Using ARB_multitexture.\n";
            q = 33984;
            r = 33985;
            s = 33986;
        } else {
            Z = Z + "Using GL 1.3 multitexturing.\n";
            q = 33984;
            r = 33985;
            s = 33986;
        }
        if (X) {
            Z = Z + "Using ARB_texture_env_combine.\n";
            t = 34160;
            u = 34165;
            v = 34167;
            w = 34166;
            x = 34168;
            y = 34161;
            z = 34176;
            A = 34177;
            B = 34178;
            C = 34192;
            D = 34193;
            E = 34194;
            F = 34162;
            G = 34184;
            H = 34185;
            I = 34186;
            J = 34200;
            K = 34201;
            L = 34202;
        } else {
            Z = Z + "Using GL 1.3 texture combiners.\n";
            t = 34160;
            u = 34165;
            v = 34167;
            w = 34166;
            x = 34168;
            y = 34161;
            z = 34176;
            A = 34177;
            B = 34178;
            C = 34192;
            D = 34193;
            E = 34194;
            F = 34162;
            G = 34184;
            H = 34185;
            I = 34186;
            J = 34200;
            K = 34201;
            L = 34202;
        }
        M = contextCapabilities.GL_EXT_blend_func_separate && !contextCapabilities.OpenGL14;
        Y = contextCapabilities.OpenGL14 || contextCapabilities.GL_EXT_blend_func_separate;
        boolean bl2 = l = Y && (contextCapabilities.GL_ARB_framebuffer_object || contextCapabilities.GL_EXT_framebuffer_object || contextCapabilities.OpenGL30);
        if (l) {
            Z = Z + "Using framebuffer objects because ";
            if (contextCapabilities.OpenGL30) {
                Z = Z + "OpenGL 3.0 is supported and separate blending is supported.\n";
                T = 0;
                c = 36160;
                d = 36161;
                e = 36064;
                f = 36096;
                g = 36053;
                h = 36054;
                i = 36055;
                j = 36059;
                k = 36060;
            } else if (contextCapabilities.GL_ARB_framebuffer_object) {
                Z = Z + "ARB_framebuffer_object is supported and separate blending is supported.\n";
                T = 1;
                c = 36160;
                d = 36161;
                e = 36064;
                f = 36096;
                g = 36053;
                i = 36055;
                h = 36054;
                j = 36059;
                k = 36060;
            } else if (contextCapabilities.GL_EXT_framebuffer_object) {
                Z = Z + "EXT_framebuffer_object is supported.\n";
                T = 2;
                c = 36160;
                d = 36161;
                e = 36064;
                f = 36096;
                g = 36053;
                i = 36055;
                h = 36054;
                j = 36059;
                k = 36060;
            }
        } else {
            Z = Z + "Not using framebuffer objects because ";
            Z = Z + "OpenGL 1.4 is " + (contextCapabilities.OpenGL14 ? "" : "not ") + "supported, ";
            Z = Z + "EXT_blend_func_separate is " + (contextCapabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
            Z = Z + "OpenGL 3.0 is " + (contextCapabilities.OpenGL30 ? "" : "not ") + "supported, ";
            Z = Z + "ARB_framebuffer_object is " + (contextCapabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
            Z = Z + "EXT_framebuffer_object is " + (contextCapabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
        }
        N = contextCapabilities.OpenGL21;
        U = N || contextCapabilities.GL_ARB_vertex_shader && contextCapabilities.GL_ARB_fragment_shader && contextCapabilities.GL_ARB_shader_objects;
        Z = Z + "Shaders are " + (U ? "" : "not ") + "available because ";
        if (U) {
            if (contextCapabilities.OpenGL21) {
                Z = Z + "OpenGL 2.1 is supported.\n";
                V = false;
                m = 35714;
                n = 35713;
                o = 35633;
                p = 35632;
            } else {
                Z = Z + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                V = true;
                m = 35714;
                n = 35713;
                o = 35633;
                p = 35632;
            }
        } else {
            Z = Z + "OpenGL 2.1 is " + (contextCapabilities.OpenGL21 ? "" : "not ") + "supported, ";
            Z = Z + "ARB_shader_objects is " + (contextCapabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
            Z = Z + "ARB_vertex_shader is " + (contextCapabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
            Z = Z + "ARB_fragment_shader is " + (contextCapabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
        }
        O = l && U;
        String \u26032 = GL11.glGetString((int)7936).toLowerCase();
        a = \u26032.contains((CharSequence)"nvidia");
        ab = !contextCapabilities.OpenGL15 && contextCapabilities.GL_ARB_vertex_buffer_object;
        P = contextCapabilities.OpenGL15 || ab;
        Z = Z + "VBOs are " + (P ? "" : "not ") + "available because ";
        if (P) {
            if (ab) {
                Z = Z + "ARB_vertex_buffer_object is supported.\n";
                S = 35044;
                R = 34962;
            } else {
                Z = Z + "OpenGL 1.5 is supported.\n";
                S = 35044;
                R = 34962;
            }
        }
        if (b = \u26032.contains((CharSequence)"ati")) {
            if (P) {
                Q = true;
            } else {
                avh.a.f.a(16.0f);
            }
        }
        try {
            Processor[] processorArray = new SystemInfo().getHardware().getProcessors();
            aa = String.format((String)"%dx %s", (Object[])new Object[]{processorArray.length, processorArray[0]}).replaceAll("\\s+", " ");
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static boolean b() {
        return O;
    }

    public static String c() {
        return Z;
    }

    public static int a(int n, int n2) {
        if (V) {
            return ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)n2);
        }
        return GL20.glGetProgrami((int)n, (int)n2);
    }

    public static void b(int n, int n2) {
        if (V) {
            ARBShaderObjects.glAttachObjectARB((int)n, (int)n2);
        } else {
            GL20.glAttachShader((int)n, (int)n2);
        }
    }

    public static void a(int n) {
        if (V) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
        } else {
            GL20.glDeleteShader((int)n);
        }
    }

    public static int b(int n) {
        if (V) {
            return ARBShaderObjects.glCreateShaderObjectARB((int)n);
        }
        return GL20.glCreateShader((int)n);
    }

    public static void a(int n, ByteBuffer byteBuffer) {
        if (V) {
            ARBShaderObjects.glShaderSourceARB((int)n, (ByteBuffer)byteBuffer);
        } else {
            GL20.glShaderSource((int)n, (ByteBuffer)byteBuffer);
        }
    }

    public static void c(int n) {
        if (V) {
            ARBShaderObjects.glCompileShaderARB((int)n);
        } else {
            GL20.glCompileShader((int)n);
        }
    }

    public static int c(int n, int n2) {
        if (V) {
            return ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)n2);
        }
        return GL20.glGetShaderi((int)n, (int)n2);
    }

    public static String d(int n, int n2) {
        if (V) {
            return ARBShaderObjects.glGetInfoLogARB((int)n, (int)n2);
        }
        return GL20.glGetShaderInfoLog((int)n, (int)n2);
    }

    public static String e(int n, int n2) {
        if (V) {
            return ARBShaderObjects.glGetInfoLogARB((int)n, (int)n2);
        }
        return GL20.glGetProgramInfoLog((int)n, (int)n2);
    }

    public static void d(int n) {
        if (V) {
            ARBShaderObjects.glUseProgramObjectARB((int)n);
        } else {
            GL20.glUseProgram((int)n);
        }
    }

    public static int d() {
        if (V) {
            return ARBShaderObjects.glCreateProgramObjectARB();
        }
        return GL20.glCreateProgram();
    }

    public static void e(int n) {
        if (V) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
        } else {
            GL20.glDeleteProgram((int)n);
        }
    }

    public static void f(int n) {
        if (V) {
            ARBShaderObjects.glLinkProgramARB((int)n);
        } else {
            GL20.glLinkProgram((int)n);
        }
    }

    public static int a(int n, CharSequence charSequence) {
        if (V) {
            return ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)charSequence);
        }
        return GL20.glGetUniformLocation((int)n, (CharSequence)charSequence);
    }

    public static void a(int n, IntBuffer intBuffer) {
        if (V) {
            ARBShaderObjects.glUniform1ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform1((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void f(int n, int n2) {
        if (V) {
            ARBShaderObjects.glUniform1iARB((int)n, (int)n2);
        } else {
            GL20.glUniform1i((int)n, (int)n2);
        }
    }

    public static void a(int n, FloatBuffer floatBuffer) {
        if (V) {
            ARBShaderObjects.glUniform1ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform1((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void b(int n, IntBuffer intBuffer) {
        if (V) {
            ARBShaderObjects.glUniform2ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform2((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void b(int n, FloatBuffer floatBuffer) {
        if (V) {
            ARBShaderObjects.glUniform2ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform2((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void c(int n, IntBuffer intBuffer) {
        if (V) {
            ARBShaderObjects.glUniform3ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform3((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void c(int n, FloatBuffer floatBuffer) {
        if (V) {
            ARBShaderObjects.glUniform3ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform3((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void d(int n, IntBuffer intBuffer) {
        if (V) {
            ARBShaderObjects.glUniform4ARB((int)n, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform4((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void d(int n, FloatBuffer floatBuffer) {
        if (V) {
            ARBShaderObjects.glUniform4ARB((int)n, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform4((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void a(int n, boolean bl, FloatBuffer floatBuffer) {
        if (V) {
            ARBShaderObjects.glUniformMatrix2ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix2((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static void b(int n, boolean bl, FloatBuffer floatBuffer) {
        if (V) {
            ARBShaderObjects.glUniformMatrix3ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix3((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static void c(int n, boolean bl, FloatBuffer floatBuffer) {
        if (V) {
            ARBShaderObjects.glUniformMatrix4ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix4((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static int b(int n, CharSequence charSequence) {
        if (V) {
            return ARBVertexShader.glGetAttribLocationARB((int)n, (CharSequence)charSequence);
        }
        return GL20.glGetAttribLocation((int)n, (CharSequence)charSequence);
    }

    public static int e() {
        if (ab) {
            return ARBVertexBufferObject.glGenBuffersARB();
        }
        return GL15.glGenBuffers();
    }

    public static void g(int n, int n2) {
        if (ab) {
            ARBVertexBufferObject.glBindBufferARB((int)n, (int)n2);
        } else {
            GL15.glBindBuffer((int)n, (int)n2);
        }
    }

    public static void a(int n, ByteBuffer byteBuffer, int n2) {
        if (ab) {
            ARBVertexBufferObject.glBufferDataARB((int)n, (ByteBuffer)byteBuffer, (int)n2);
        } else {
            GL15.glBufferData((int)n, (ByteBuffer)byteBuffer, (int)n2);
        }
    }

    public static void g(int n) {
        if (ab) {
            ARBVertexBufferObject.glDeleteBuffersARB((int)n);
        } else {
            GL15.glDeleteBuffers((int)n);
        }
    }

    public static boolean f() {
        return P && ave.A().t.u;
    }

    public static void h(int n, int n2) {
        if (!l) {
            return;
        }
        switch (T) {
            case 0: {
                GL30.glBindFramebuffer((int)n, (int)n2);
                break;
            }
            case 1: {
                ARBFramebufferObject.glBindFramebuffer((int)n, (int)n2);
                break;
            }
            case 2: {
                EXTFramebufferObject.glBindFramebufferEXT((int)n, (int)n2);
            }
        }
    }

    public static void i(int n, int n2) {
        if (!l) {
            return;
        }
        switch (T) {
            case 0: {
                GL30.glBindRenderbuffer((int)n, (int)n2);
                break;
            }
            case 1: {
                ARBFramebufferObject.glBindRenderbuffer((int)n, (int)n2);
                break;
            }
            case 2: {
                EXTFramebufferObject.glBindRenderbufferEXT((int)n, (int)n2);
            }
        }
    }

    public static void h(int n) {
        if (!l) {
            return;
        }
        switch (T) {
            case 0: {
                GL30.glDeleteRenderbuffers((int)n);
                break;
            }
            case 1: {
                ARBFramebufferObject.glDeleteRenderbuffers((int)n);
                break;
            }
            case 2: {
                EXTFramebufferObject.glDeleteRenderbuffersEXT((int)n);
            }
        }
    }

    public static void i(int n) {
        if (!l) {
            return;
        }
        switch (T) {
            case 0: {
                GL30.glDeleteFramebuffers((int)n);
                break;
            }
            case 1: {
                ARBFramebufferObject.glDeleteFramebuffers((int)n);
                break;
            }
            case 2: {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)n);
            }
        }
    }

    public static int g() {
        if (!l) {
            return -1;
        }
        switch (T) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
        }
        return -1;
    }

    public static int h() {
        if (!l) {
            return -1;
        }
        switch (T) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
        }
        return -1;
    }

    public static void a(int n, int n2, int n3, int n4) {
        if (!l) {
            return;
        }
        switch (T) {
            case 0: {
                GL30.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                break;
            }
            case 1: {
                ARBFramebufferObject.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                break;
            }
            case 2: {
                EXTFramebufferObject.glRenderbufferStorageEXT((int)n, (int)n2, (int)n3, (int)n4);
            }
        }
    }

    public static void b(int n, int n2, int n3, int n4) {
        if (!l) {
            return;
        }
        switch (T) {
            case 0: {
                GL30.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                break;
            }
            case 1: {
                ARBFramebufferObject.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                break;
            }
            case 2: {
                EXTFramebufferObject.glFramebufferRenderbufferEXT((int)n, (int)n2, (int)n3, (int)n4);
            }
        }
    }

    public static int j(int n) {
        if (!l) {
            return -1;
        }
        switch (T) {
            case 0: {
                return GL30.glCheckFramebufferStatus((int)n);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus((int)n);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n);
            }
        }
        return -1;
    }

    public static void a(int n, int n2, int n3, int n4, int n5) {
        if (!l) {
            return;
        }
        switch (T) {
            case 0: {
                GL30.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case 1: {
                ARBFramebufferObject.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case 2: {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
            }
        }
    }

    public static void k(int n) {
        if (W) {
            ARBMultitexture.glActiveTextureARB((int)n);
        } else {
            GL13.glActiveTexture((int)n);
        }
    }

    public static void l(int n) {
        if (W) {
            ARBMultitexture.glClientActiveTextureARB((int)n);
        } else {
            GL13.glClientActiveTexture((int)n);
        }
    }

    public static void a(int n, float f, float f2) {
        if (W) {
            ARBMultitexture.glMultiTexCoord2fARB((int)n, (float)f, (float)f2);
        } else {
            GL13.glMultiTexCoord2f((int)n, (float)f, (float)f2);
        }
    }

    public static void c(int n, int n2, int n3, int n4) {
        if (Y) {
            if (M) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT((int)n, (int)n2, (int)n3, (int)n4);
            } else {
                GL14.glBlendFuncSeparate((int)n, (int)n2, (int)n3, (int)n4);
            }
        } else {
            GL11.glBlendFunc((int)n, (int)n2);
        }
    }

    public static boolean i() {
        return l && ave.A().t.f;
    }

    public static String j() {
        return aa == null ? "<unknown>" : aa;
    }

    static {
        Z = "";
    }
}
