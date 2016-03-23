package com.whatsapp;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class a20 {
    private static final String[] z;
    private float[] a;
    private FloatBuffer b;
    private int c;
    private int d;
    private final float[] e;
    private int f;
    private float[] g;
    private int h;
    private int i;
    private int j;

    static {
        String[] strArr = new String[39];
        String str = "^\bSn&J.SU=P.R";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 63;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 54;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "X0t\u007f<[\bSn&J.S6?k9Nb'M9\u007fR";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "X0bs*o=Dw?Z(Sd";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "|3Cz6\u001f2YbrX9B63K(D\u007f0\u001f0Yu3K5YxrY3D6'r\nf[3K._n";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "X0qs&j2_p=M1zy1^(_y<\u001f){@\u0002r=Bd;G";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "J\u000fb[3K._n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "J2_p=M1\u0016{3Kh\u0016c\u001fi\f{w&M5N-XJ2_p=M1\u0016{3Kh\u0016c\u0001k\u0011Wb V$\r\u001c3K(D\u007f0J(S6$Z?\u000263o3E\u007f&V3X-X^(Bd;])BsrI9U\"r^\bSn&J.SU=P.R-XI=Do;Q;\u0016`7\\n\u0016`\u0006Z$Bc Z\u001fYy [g<`=V8\u0016{3V2\u001e?rDV\u001665S\u0003fy!V(_y<\u001fa\u0016c\u001fi\f{w&M5N6x\u001f=fy!V(_y<\u0004V\u00166$k9Nb'M9uy=M8\u0016+r\u0017)eB\u001f^(D\u007f*\u001fv\u0016w\u0006Z$Bc Z\u001fYy [u\u0018n+\u0004VK\u001c";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "|3Cz6\u001f2YbrX9B63K(D\u007f0\u001f0Yu3K5YxrY3D63k9Nb'M9uy=M8";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001c9Nb7Q/_y<\u001f\u001bzI\u001dz\u000fiS\u0015s\u0003_{3X9is*K9Dx3S|\f6 Z-C\u007f ZVFd7\\5E\u007f=Q|[s6V)[frY0Yw&\u0004V@w F5XqrI9U$rI\bSn&J.SU=P.R-XJ2_p=M1\u0016e3R,Zs z$Bs Q=ZY\u0017l|EB7G(Cd7\u0004V@y;[|[w;Qt\u001f6)5|\u0016q>`\u001aDw5|3Zy \u001fa\u0016b7G(Cd7\r\u0018\u001ee\u0006Z$Bc Zp\u0016`\u0006Z$Bc Z\u001fYy [u\r\u001c/5";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "|3Cz6\u001f2YbrX9B63K(D\u007f0\u001f0Yu3K5YxrY3D63o3E\u007f&V3X";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "X0qs&j2_p=M1zy1^(_y<\u001f)eB\u001f^(D\u007f*";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "^\fYe;K5Yx";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "|3Cz6\u001f2YbrX9B63K(D\u007f0\u001f0Yu3K5YxrY3D6'l\b{w&M5N";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Y=_z7[|Ud7^(_x5\u001f,Dy5M=[";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "X0qs&~(Bd;]\u0010Yu3K5Yxr^\fYe;K5Yx";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "J\u0011`F\u001f^(D\u007f*";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0005|Qz\u0017M.Ydr";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0005|Qz\u0017M.Ydr";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "k9Nb'M9ds<[9D";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "X0sx3]0S@7M(Sn\u0013K(D\u007f0~.Dw+\u001f1WF=L5B\u007f=Q\u0014Wx6S9";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "X0sx3]0S@7M(Sn\u0013K(D\u007f0~.Dw+\u001f1WB7G(Cd7w=Xr>Z";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    str = "X0ce7o.Yq ^1";
                    obj = 21;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "X0`s K9NW&K._t\u0002P5Xb7M|[w\u0006Z$Bc Z\u0014Wx6S9";
                    obj = 22;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "P2rd3H\u001aDw?Z|Eb3M(";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "X0`s K9NW&K._t\u0002P5Xb7M|[w\u0002P/_b;P2";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "X0rd3H\u001dDd3F/";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "k9Nb'M9ds<[9D";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "|3Cz6\u001f2Ybr\\3[f;S9\u0016e:^8Sdr";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "X0ud7^(SE:^8SdrK%Fso";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "k9Nb'M9ds<[9D";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "X0ud7^(SF P;Dw?";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "X0wb&^?^E:^8Sd";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "|3Cz6\u001f2Ybr\\.Sw&Z|Fd=X.W{";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "k9Nb'M9ds<[9D";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "X0wb&^?^E:^8Sd";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "k9Nb'M9ds<[9D";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "|3Cz6\u001f2YbrS5X}rO.Yq ^1\f6";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "k9Nb'M9ds<[9D";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "X0qs&~(Bd;]\u0010Yu3K5Yxr^\bSn&J.SU=P.R";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        try {
            this.i = a(z[7], z[9]);
            if (this.i == 0) {
                throw new RuntimeException(z[14]);
            }
            try {
                this.h = GLES20.glGetAttribLocation(this.i, z[12]);
                a(z[15]);
                if (this.h == -1) {
                    throw new RuntimeException(z[10]);
                }
                try {
                    this.c = GLES20.glGetAttribLocation(this.i, z[0]);
                    a(z[1]);
                    if (this.c == -1) {
                        throw new RuntimeException(z[8]);
                    }
                    try {
                        this.d = GLES20.glGetUniformLocation(this.i, z[16]);
                        a(z[5]);
                        if (this.d == -1) {
                            throw new RuntimeException(z[4]);
                        }
                        try {
                            this.j = GLES20.glGetUniformLocation(this.i, z[6]);
                            a(z[11]);
                            if (this.j == -1) {
                                throw new RuntimeException(z[13]);
                            }
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            this.f = iArr[0];
                            GLES20.glBindTexture(36197, this.f);
                            a(z[2]);
                            GLES20.glTexParameterf(36197, 10241, 9729.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            a(z[3]);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                }
            } catch (RuntimeException e222) {
                throw e222;
            }
        } catch (RuntimeException e2222) {
            throw e2222;
        }
    }

    public a20() {
        this.e = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.g = new float[16];
        this.a = new float[16];
        this.f = -12345;
        this.b = ByteBuffer.allocateDirect(this.e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.b.put(this.e).position(0);
        Matrix.setIdentityM(this.a, 0);
    }

    public int b() {
        return this.f;
    }

    public void a(SurfaceTexture surfaceTexture) {
        a(z[24]);
        surfaceTexture.getTransformMatrix(this.a);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.i);
        a(z[22]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f);
        this.b.position(0);
        GLES20.glVertexAttribPointer(this.h, 3, 5126, false, 20, this.b);
        a(z[25]);
        GLES20.glEnableVertexAttribArray(this.h);
        a(z[20]);
        this.b.position(3);
        GLES20.glVertexAttribPointer(this.c, 2, 5126, false, 20, this.b);
        a(z[23]);
        GLES20.glEnableVertexAttribArray(this.c);
        a(z[21]);
        Matrix.setIdentityM(this.g, 0);
        GLES20.glUniformMatrix4fv(this.d, 1, false, this.g, 0);
        GLES20.glUniformMatrix4fv(this.j, 1, false, this.a, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a(z[26]);
        GLES20.glFinish();
    }

    private int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        a(z[29] + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e(z[27], z[28] + i + ":");
        Log.e(z[30], " " + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            try {
                Log.e(z[19], str + z[18] + glGetError);
                throw new RuntimeException(str + z[17] + glGetError);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    private int a(String str, String str2) {
        int a = a(35633, str);
        if (a == 0) {
            return 0;
        }
        int a2 = a(35632, str2);
        if (a2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        try {
            a(z[31]);
            if (glCreateProgram == 0) {
                Log.e(z[34], z[33]);
            }
            GLES20.glAttachShader(glCreateProgram, a);
            a(z[35]);
            GLES20.glAttachShader(glCreateProgram, a2);
            a(z[32]);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            Log.e(z[38], z[37]);
            Log.e(z[36], GLES20.glGetProgramInfoLog(glCreateProgram));
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
