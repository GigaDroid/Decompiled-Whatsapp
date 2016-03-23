package com.whatsapp;

import com.whatsapp.contact.i;
import com.whatsapp.contact.o;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.v;
import org.whispersystems.at;

public class zb {
    private static Thread a;
    private static final Runnable b;
    private static AtomicBoolean c;
    private static final String[] z;

    static AtomicBoolean h() {
        return c;
    }

    static {
        String[] strArr = new String[4];
        String str = "\u0002@fM&)\u0001jK\u0010\u0004\\";
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
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 15;
                        break;
                    case at.o /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 98;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000fO{XB\u0006GhK\u0003\u001fG`WB\nB}\\\u0003\u000fW/K\u0017\u0005@fW\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000fO{XB\u0006GhK\u0003\u001fG`WB\nB}\\\u0003\u000fW/J\u0017\bMjJ\u0011\r[c";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new AtomicBoolean();
                    b = new nm();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000fO{X\u000f\u0002I}X\u0016DGaP\u0016\u000fL";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean b() {
        return a != null && a.isAlive();
    }

    static boolean f() {
        return e();
    }

    public static boolean d() {
        if (b()) {
            a.join();
        }
        return c.get();
    }

    public static void i() {
        c.set(false);
    }

    public static boolean c() {
        return c.get();
    }

    public static void a() {
        c.set(true);
    }

    public static void g() {
        boolean z = l5.s;
        if (b()) {
            Log.i(z[2]);
            if (!z) {
                return;
            }
        }
        if (c.get()) {
            Log.i(z[3]);
            if (!z) {
                return;
            }
        }
        a = new Thread(b);
        a.start();
    }

    private static boolean e() {
        try {
            int b;
            Log.i(z[1]);
            boolean c = i.c();
            if (c) {
                App.ao();
                App.as.j();
                b = App.as.b();
            } else {
                App.ao();
                App.as.j();
                b = App.as.b();
            }
            i.c(App.z(), o.REGISTRATION_FULL);
            App.aB.sendEmptyMessage(1);
            if (c && i.b()) {
            }
            App.aA.b(true);
            App.aA.a(b);
            return true;
        } catch (Exception e) {
            throw e;
        } catch (Throwable e2) {
            Log.b(z[0], e2);
            return false;
        }
    }
}
