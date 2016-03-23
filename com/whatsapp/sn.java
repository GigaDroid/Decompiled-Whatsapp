package com.whatsapp;

import com.whatsapp.protocol.b5;
import org.v;
import org.whispersystems.at;

final class sn implements b5 {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "&<llj :xoo &\"ae 7f/c09og\u007fj9lvn-";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 84;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 13;
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
                    str = "&<llj :xoo &\"dl,8-";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6) {
        /*
        r5 = this;
        r4 = 6;
        r3 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        switch(r6) {
            case 400: goto L_0x0037;
            case 401: goto L_0x004f;
            case 405: goto L_0x0064;
            case 409: goto L_0x006b;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r6 >= r0) goto L_0x0036;
    L_0x0023:
        com.whatsapp.App.g(r3);
        com.whatsapp.App.aP();
        r0 = com.whatsapp.ChangeNumber.h();
        r0.sendEmptyMessage(r4);
        com.whatsapp.ve.o();
        com.whatsapp.App.aT();
    L_0x0036:
        return;
    L_0x0037:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        r1 = com.whatsapp.ChangeNumber.h();
        r2 = 5;
        r1.sendEmptyMessage(r2);
        com.whatsapp.ve.o();
        com.whatsapp.App.aT();
        if (r0 == 0) goto L_0x0036;
    L_0x004f:
        r1 = com.whatsapp.ChangeNumber.h();
        r1.sendEmptyMessage(r4);
        com.whatsapp.App.g(r3);
        com.whatsapp.App.aP();
        com.whatsapp.ve.o();
        com.whatsapp.App.aT();
        if (r0 == 0) goto L_0x0036;
    L_0x0064:
        r1 = com.whatsapp.ChangeNumber.O;
        r1.run();
        if (r0 == 0) goto L_0x0036;
    L_0x006b:
        if (r0 == 0) goto L_0x0036;
    L_0x006d:
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sn.a(int):void");
    }

    sn() {
    }
}
