package com.whatsapp;

import android.os.Handler.Callback;
import org.v;
import org.whispersystems.at;

class _2 implements Callback {
    private static final String[] z;
    final Settings a;

    static {
        String[] strArr = new String[2];
        String str = "1\r%\u007fv1";
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
                        i3 = 66;
                        break;
                    case at.g /*1*/:
                        i3 = 121;
                        break;
                    case at.i /*2*/:
                        i3 = 68;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0002\nj|k#\r7js2W*nw";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r5) {
        /*
        r4 = this;
        r3 = 1;
        r2 = 0;
        r0 = r5.what;
        if (r0 != 0) goto L_0x0030;
    L_0x0006:
        r0 = com.whatsapp.App.z();
        r1 = 2131232080; // 0x7f080550 float:1.808026E38 double:1.052968554E-314;
        com.whatsapp.App.a(r0, r1, r2);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = com.whatsapp.App.ad();
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.App.y(r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x003f;
    L_0x0030:
        r0 = r5.obj;
        r0 = (android.os.Bundle) r0;
        r1 = z;
        r1 = r1[r2];
        r0 = r0.getString(r1);
        com.whatsapp.App.t(r0);
    L_0x003f:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._2.handleMessage(android.os.Message):boolean");
    }

    _2(Settings settings) {
        this.a = settings;
    }
}
