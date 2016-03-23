package com.whatsapp;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.util.Log;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class aiu implements OnFrameAvailableListener {
    private static final String[] z;
    private EGL10 a;
    private EGLDisplay b;
    private EGLContext c;
    private EGLSurface d;
    private a20 e;
    private Object f;
    private Surface g;
    private SurfaceTexture h;
    private boolean i;

    static {
        String[] strArr = new String[15];
        String str = "\u0006\"Uh\u0002\u000e%Qh\u0006\u0007\u0005Ee\nK\u0005K{\n\n\u0000^)\u001c\u000e\u0010\u000b)\t\u0019\u0005JlO\b\u000bRe\u000bK\u0006B)\u000b\u0019\u000bWy\n\u000f";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 100;
                        break;
                    case at.i /*2*/:
                        i3 = 39;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "8\u0011Uo\u000e\b\u0001\u0007o\u001d\n\tB)\u0018\n\rS)\u001b\u0002\tBmO\u0004\u0011S";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u000e\u0003KD\u000e\u0000\u0001d|\u001d\u0019\u0001I}O\r\u0005Ne\n\u000f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\t\u0001Af\u001d\u000eDJh\u0004\u000e'R{\u001d\u000e\nS";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0005\u000bS)\f\u0004\nA`\b\u001e\u0016BmO\r\u000bU)\u0002\n\u000fBJ\u001a\u0019\u0016Bg\u001b";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000e\u0003KJ\u001d\u000e\u0005Sl,\u0004\nSl\u0017\u001f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0018\u0011Uo\u000e\b\u0001\u0007~\u000e\u0018DI|\u0003\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001e\nFk\u0003\u000eDSfO\u0002\nN}\u0006\n\bNs\nK!`E^[";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "\u000e\u0003KJ\u001d\u000e\u0005Sl?\t\u0011Ao\n\u00197R{\t\n\u0007B";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "\u001e\nFk\u0003\u000eDSfO\r\rImO9#e1WSOWk\u001a\r\u0002B{O.#k)\f\u0004\nA`\b";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0005\u0011KeO\b\u000bI}\n\u0013\u0010";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "$\u0011Sy\u001a\u001f7R{\t\n\u0007B";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ".#k)\n\u0019\u0016H{O\u000e\nDf\u001a\u0005\u0010B{\n\u000fD\u000fz\n\u000eDKf\bB";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "QDbN#K\u0001U{\u0000\u0019^\u00079\u0017";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\t\u0001Af\u001d\u000eDRy\u000b\n\u0010B]\n\u0013-Jh\b\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public aiu(int i, int i2) {
        this.f = new Object();
        if (i <= 0 || i2 <= 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        a(i, i2);
        d();
        c();
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f) {
            if (this.i) {
                throw new RuntimeException(z[0]);
            }
            this.i = true;
            this.f.notifyAll();
        }
    }

    private void a(String str) {
        boolean z = DialogToastActivity.f;
        Object obj = null;
        do {
            int eglGetError = this.a.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Log.e(z[12], str + z[14] + Integer.toHexString(eglGetError));
            obj = 1;
        } while (!z);
        if (obj != null) {
            try {
                throw new RuntimeException(z[13]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private void c() {
        this.e = new a20();
        this.e.a();
        this.h = new SurfaceTexture(this.e.b());
        this.h.setOnFrameAvailableListener(this);
        this.g = new Surface(this.h);
    }

    public Surface b() {
        return this.g;
    }

    public void e() {
        synchronized (this.f) {
            do {
                if (this.i) {
                    this.i = false;
                } else {
                    try {
                        this.f.wait(500);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
            } while (this.i);
            throw new RuntimeException(z[2]);
        }
        this.e.a(z[1]);
        this.h.updateTexImage();
    }

    public aiu() {
        this.f = new Object();
        c();
    }

    private void a(int i, int i2) {
        try {
            this.a = (EGL10) EGLContext.getEGL();
            this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.a.eglInitialize(this.b, null)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                try {
                    if (this.a.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                        try {
                            this.c = this.a.eglCreateContext(this.b, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                            a(z[6]);
                            if (this.c == null) {
                                throw new RuntimeException(z[11]);
                            }
                            try {
                                this.d = this.a.eglCreatePbufferSurface(this.b, eGLConfigArr[0], new int[]{12375, i, 12374, i2, 12344});
                                a(z[9]);
                                if (this.d == null) {
                                    throw new RuntimeException(z[7]);
                                }
                                return;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    throw new RuntimeException(z[10]);
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            throw new RuntimeException(z[8]);
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void d() {
        try {
            if (this.a == null) {
                throw new RuntimeException(z[5]);
            }
            try {
                a(z[4]);
                if (!this.a.eglMakeCurrent(this.b, this.d, this.d, this.c)) {
                    throw new RuntimeException(z[3]);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void a() {
        this.e.a(this.h);
    }
}
