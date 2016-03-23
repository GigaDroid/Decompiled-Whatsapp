package com.whatsapp;

import android.os.Handler.Callback;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class fw implements Callback {
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "\u0000\"\tO\bS\"\u0001O\u001d\u001d";
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
                        i3 = 32;
                        break;
                    case at.g /*1*/:
                        i3 = 86;
                        break;
                    case at.i /*2*/:
                        i3 = 96;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = arj.Theme_switchStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "G3\u0014Q\u0019A\"\u0015QBF7\tN\bDv\nK\t\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "G3\u0014Q\u0019A\"\u0015QBN9\u0003J\fN1\u0005\u0002\u0007I2]";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u00005\u000fF\b\u001d";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "G3\u0014Q\u0019A\"\u0015QBR3\u0003G\u0004V3\u0004\u0002MJ?\u0004\u001f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "J?\u0004";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "T?\rG\u001eT7\rR";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "S\"\u0001V\u0018S";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0000%\u0014C\u0019U%]";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "G3\u0014Q\u0019A\"\u0015QBD3\fG\u0019Ev\nK\t\u001d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    fw() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r10) {
        /*
        r9 = this;
        r2 = 0;
        r8 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.obj;
        r0 = (android.os.Bundle) r0;
        r1 = z;
        r4 = 6;
        r1 = r1[r4];
        r4 = r0.getString(r1);
        if (r4 == 0) goto L_0x0021;
    L_0x0013:
        r1 = com.whatsapp.App.as;
        r1 = r1.f(r4);
    L_0x0019:
        if (r1 == 0) goto L_0x0020;
    L_0x001b:
        r5 = r10.what;
        switch(r5) {
            case 0: goto L_0x0023;
            case 1: goto L_0x004d;
            case 2: goto L_0x00a6;
            case 3: goto L_0x00c1;
            default: goto L_0x0020;
        };
    L_0x0020:
        return r8;
    L_0x0021:
        r1 = r2;
        goto L_0x0019;
    L_0x0023:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 2;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r6 = z;
        r7 = 4;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = r10.arg1;
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.w(r5);
        if (r3 == 0) goto L_0x0020;
    L_0x004d:
        r5 = z;
        r6 = 8;
        r5 = r5[r6];
        r5 = r0.getString(r5);
        r1.w = r5;
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r6 = r0.getLong(r5);
        r1.r = r6;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r0 = r0.append(r4);
        r5 = z;
        r6 = 9;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r5 = r1.w;
        r0 = r0.append(r5);
        r5 = z;
        r6 = 0;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r6 = r1.r;
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.as;
        r0.i(r1);
        com.whatsapp.App.y(r4);
        if (r3 == 0) goto L_0x0020;
    L_0x00a6:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = z;
        r6 = 3;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r3 == 0) goto L_0x0020;
    L_0x00c1:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r3 = r3[r8];
        r0 = r0.append(r3);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r1.w = r2;
        r2 = 0;
        r1.r = r2;
        r0 = com.whatsapp.App.as;
        r0.i(r1);
        com.whatsapp.App.y(r4);
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fw.handleMessage(android.os.Message):boolean");
    }
}
