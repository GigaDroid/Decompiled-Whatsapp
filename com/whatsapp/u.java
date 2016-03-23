package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import org.v;
import org.whispersystems.at;

final class u extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "<?m\u0002M=2+\u0013G .j\u0013\\=";
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
                        i3 = 78;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 11;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 40;
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
                    str = ")(d\u0005Xnw+\u0002M((n\u0003@n9d\u001e\\/9\u007f\u0003";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r3) {
        /*
        r2 = this;
        r0 = r3.what;
        if (r0 != 0) goto L_0x0010;
    L_0x0004:
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0022;
    L_0x0010:
        r0 = com.whatsapp.App.as;
        r0.g();
        r0 = com.whatsapp.App.ab;
        r0.c();
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
    L_0x0022:
        com.whatsapp.App.a8();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u.handleMessage(android.os.Message):void");
    }

    u(Looper looper) {
        super(looper);
    }
}
