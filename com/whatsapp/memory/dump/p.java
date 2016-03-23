package com.whatsapp.memory.dump;

import android.content.Context;
import android.os.Debug;
import com.whatsapp.App;
import com.whatsapp.auq;
import com.whatsapp.memory.a;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.ve;
import java.io.File;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

public class p {
    private static final String[] z;
    private final k a;

    static {
        String[] strArr = new String[6];
        String str = "Q\u001d\u001bH@\u0019\u001e\u001aDE\u0006\u0001R";
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
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = 110;
                        break;
                    case at.i /*2*/:
                        i3 = 52;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 53;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ";!ydT\u001a\nXIG[\nAAET\u001dAOV\u0011\u001dGJ@\u0018";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ";!ydT\u001a\nXIG['{iM\u0017\u000bDX\\\u001b\u0000\u0014XG\r\u0007ZK\u0015\u0000\u0001\u0014[G\u001d\u001aQ\fQ\u0001\u0003D";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ";!ydT\u001a\nXIG[\u0006D^Z\u0012NPYX\u0004NWC[\u0010\u0007@EZ\u001a\u001d\u0014BZ\u0000NYIA";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ";!ydT\u001a\nXIG[\u0006D^Z\u0012NPYX\u0004NZCAT\u000fX@Z\u0003\u000bP";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "#\u0006UXF5\u001eD{Z\u0006\u0005Q^FT\u001d@MA\u0011T\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static boolean f() {
        return auq.a() > 10;
    }

    public void b(Throwable th) {
        if (a(th)) {
            d();
            c(th);
        }
    }

    private boolean c() {
        return this.a.a() && b() && !e() && !ve.F();
    }

    private boolean b() {
        return !a.a();
    }

    private boolean a(Throwable th) {
        while (!(th instanceof OutOfMemoryError)) {
            th = th.getCause();
            if (th == null) {
                return false;
            }
        }
        return true;
    }

    private boolean g() {
        return App.j == 1 || App.am == 1;
    }

    private boolean e() {
        File[] a = this.a.a(this.a.b());
        return a != null && a.length > 0;
    }

    private void d() {
        Log.i(z[1] + bq.b());
    }

    public p(Context context) {
        this.a = new k(context);
    }

    private void a() {
        Debug.dumpHprofData(String.format(z[0], new Object[]{this.a.b()}));
    }

    private void c(Throwable th) {
        try {
            if (!g() || f()) {
                Log.i(z[5]);
                return;
            }
            if (c()) {
                try {
                    a();
                    Log.i(z[2]);
                    return;
                } catch (IOException e) {
                    try {
                        Log.c(z[3], th);
                        if (!n.a) {
                            return;
                        }
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
            }
            Log.i(z[4]);
            n.c();
        } catch (IOException e22) {
            throw e22;
        } catch (IOException e222) {
            throw e222;
        }
    }
}
