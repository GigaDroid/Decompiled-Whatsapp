package com.whatsapp;

import android.os.Build.VERSION;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class q8 implements Runnable {
    private static final String[] z;
    final a9z a;

    static {
        String[] strArr = new String[3];
        String str = "!\u0017BD:9\u0017_Bp$\fJU+!\u0017BD:9\u0017_Bp$\fJU+1\u0019BK:3";
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
                        i3 = 87;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "!\u0017BD:9\u0017_Bp$\fJU+!\u0017BD:9\u0017_Bp$\fJU+";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "!\u0017BD:9\u0017_Bp$\fJU+!\u0017BD:9\u0017_Bp$\u0013BW";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        try {
            if (a9z.i(this.a) != null) {
                Log.i(z[2]);
                if (VERSION.SDK_INT >= 16) {
                    a9z.i().setVolume(a9z.a(this.a), 0.0f, 0.0f);
                }
                try {
                    a9z.i(this.a).c();
                    a9z.a(this.a, SystemClock.elapsedRealtime());
                    a9z.j(this.a).sendEmptyMessage(0);
                    return;
                } catch (Throwable e) {
                    try {
                        Log.b(z[0], e);
                        this.a.b(false);
                        a9z.c(this.a).a(2131231123);
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
            Log.i(z[1]);
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        }
    }

    q8(a9z com_whatsapp_a9z) {
        this.a = com_whatsapp_a9z;
    }
}
