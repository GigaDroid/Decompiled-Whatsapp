package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class r3 implements Runnable {
    private static final String[] z;
    final String a;
    final b0 b;

    static {
        String[] strArr = new String[9];
        String str = "o\u000e@k";
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
                        i3 = 29;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "&KK}\bn\nA}Uv\u000e_%";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "r\tL}\u0018iKGt\tx\nBa[x\u0013Ok\u000fx\u000f\u0006w\u0015=\u0006C|\u0012|KU}\tk\u000eT#[h\u001bJw\u001ayKCv\u001ft\u0005A#[p\u000eUk\u001az\u000e\bs\u001edV";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ".Z";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "u\nUp";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "o\u000eUm\u0016x";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "T$c`\u0018x\u001bRq\u0014sKQp\u0012q\u000e\u0006{\u0014p\u001bSl\u0012s\f\u0006{\u0012m\u0003Cj\u000fx\u0013R8\bu\n\u000b*N+KBm\tt\u0005A8\tx\u0018Su\u001e=\bN}\u0018vP\u0006k\u0010t\u001bVq\u0015zKBm\u000bq\u0002Ey\u000fxKB}\u000fx\bRq\u0014sP\u0006u\u001en\u0018G\u007f\u001e3\u0000CaF";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "o\u000eUm\u0016xK@j\u0014pK";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "P&u8\u000em\u0007Iy\u001f=\u0019Ck\u000ep\u000e\u0006~\u0014o\u0006\u0006h\u0014n\u001f\u0006~\u001at\u0007C|@=\u0006Ck\b|\fC6\u0010x\u0012\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    r3(b0 b0Var, String str) {
        this.b = b0Var;
        this.a = str;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicInteger atomicInteger = new AtomicInteger();
        mk mkVar = new mk(this.a, new adz(this, atomicInteger, atomicBoolean));
        try {
            if (sx.c(this.b.e).forward || sx.b(this.b.e)) {
                Closeable c = sx.c(this.b.e, b0.a(this.b));
                if (c != null) {
                    aw5 com_whatsapp_aw5 = new aw5(c);
                    do {
                        try {
                        } catch (IOException e) {
                            throw e;
                        } catch (Throwable e2) {
                            Log.c(z[7] + this.b.e.p.k, e2);
                        }
                    } while (com_whatsapp_aw5.read(new byte[16384]) > 0);
                    mkVar.b(z[5], Base64.encodeToString(com_whatsapp_aw5.a(), 2));
                    mkVar.b(z[0], sx.a(this.b.e, this.b.e.p.k.c, this.b.e.p.g, sx.c(this.b.e).refKey));
                    ao.a(c);
                }
            }
            mkVar.b(z[6], z[4]);
            try {
                mkVar.b();
            } catch (Throwable e22) {
                Log.c(z[1] + this.b.e.p.k, e22);
            }
            try {
                if (atomicBoolean.get()) {
                    Log.i(z[8] + atomicInteger.get() + z[2] + this.b.e.p.k);
                    b0.a(this.b, new l(this.b.e, this.a, b0.a(this.b), atomicInteger.get()));
                    if (!z) {
                        return;
                    }
                }
                Log.i(z[3] + this.b.e.p.k);
                b0.a(this.b, null);
            } catch (IOException e3) {
                throw e3;
            } catch (IOException e32) {
                throw e32;
            }
        } catch (IOException e322) {
            throw e322;
        }
    }
}
