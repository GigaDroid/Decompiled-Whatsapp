package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public final class ScreenLockReceiver extends BroadcastReceiver {
    private static final String[] z;
    private boolean a;

    static {
        String[] strArr = new String[8];
        String str = "A/l\u0001J|\u0000q\u0007D@)}\u0001Fd)l\u001fC}/u\u0001K/";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 30;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 47;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "s\"z\u0016@{(0\rAf)p\u0010\u0001s/j\r@|bM'}W\tP;`\\";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "s\"z\u0016@{(0\rAf)p\u0010\u0001s/j\r@|bM'}W\tP;`T\n";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "s<nK\\q>{\u0001A=#p";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "s\"z\u0016@{(0\rAf)p\u0010\u0001s/j\r@|bM'}W\tP;`\\";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "s\"z\u0016@{(0\rAf)p\u0010\u0001s/j\r@|bM'}W\tP;`T\n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "b#i\u0001]";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "s<nK\\q>{\u0001A=#x\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Context context) {
        boolean z;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(z[6]);
        intentFilter.addAction(z[5]);
        context.registerReceiver(this, intentFilter);
        if (((PowerManager) context.getSystemService(z[7])).isScreenOn()) {
            z = false;
        } else {
            z = true;
        }
        this.a = z;
        h.b().d(new ana(this.a));
    }

    public String toString() {
        return z[0] + this.a + '}';
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
        r5 = this;
        r4 = 1;
        r0 = r5.a;
        r1 = r7.getAction();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0021;
    L_0x0012:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        r5.a = r1;
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0039;
    L_0x0021:
        r1 = r7.getAction();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0039;
    L_0x0030:
        r1 = z;
        r1 = r1[r4];
        com.whatsapp.util.Log.i(r1);
        r5.a = r4;
    L_0x0039:
        r1 = r5.a;
        if (r1 == r0) goto L_0x004b;
    L_0x003d:
        r0 = de.greenrobot.event.h.b();
        r1 = new com.whatsapp.ana;
        r2 = r5.a;
        r1.<init>(r2);
        r0.d(r1);
    L_0x004b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ScreenLockReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
