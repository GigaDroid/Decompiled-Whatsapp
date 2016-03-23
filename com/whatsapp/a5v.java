package com.whatsapp;

import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class a5v implements Runnable {
    private static final String[] z;
    final qh a;
    final boolean b;
    final co c;

    static {
        String[] strArr = new String[8];
        String str = "5I\u0005n{i\u0000\u0004}~C\f\u0019osi\f!yk3";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ".\r\u001fy2z\u0006Ji|e\u0007\u0005k|.\u001d\u000b{2|\f\ty{~\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "j\u0006\u001dru|\b\u000eu|iI\u001es2{\u0007\u0019y|zI";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "o\u0011\u0005p}z\u0005Jnw}\f\u0004x{`\u000eJ";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "k\u0007\tnk~\u001d\u0003s|.\u0000\u0019<~a\n\u0001yv.\u0006\u0004'2{\u0007\u000b~~kI\u001es2}\f\u0004x2~\u0005\u000bu|z\f\u0012h2o\u001aJnw\u007f\u001c\u000fofk\rJ~k.\u001c\u0004w|a\u001e\u0004<fo\u000e\u0019<`k\n\u000fubzRJofo\u0007\u0010}Yk\u0010W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".\r\u001fy2z\u0006Ji|e\u0007\u0005k|.\u001d\u000b{2|\f\ty{~\u001d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "5I\u0005n{i\u0000\u0004}~C\f\u0019osi\f!yk3";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "c\u0000\u0019o{`\u000eJqw}\u001a\u000b{w.\r\u001fn{`\u000eJi|e\u0007\u0005k|.\u001d\u000b{a.\u001b\u000f\u007fwg\u0019\u001e'2}\u001d\u000brho\"\u000fe/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a5v(qh qhVar, co coVar, boolean z) {
        this.a = qhVar;
        this.c = coVar;
        this.b = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
        r2 = 0;
        r3 = 3;
        r6 = 2;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.c;
        if (r0 == 0) goto L_0x0099;
    L_0x000b:
        r0 = r7.b;
        if (r0 != 0) goto L_0x0099;
    L_0x000f:
        r0 = r7.c;
        r0.a(r2);
        r0 = r7.c;
        r0.b(r2);
        r0 = r7.c;
        r0 = r0.c;
        if (r0 == r6) goto L_0x0033;
    L_0x001f:
        r0 = r7.c;
        r0 = r0.c;
        if (r0 == r3) goto L_0x0033;
    L_0x0025:
        r0 = r7.c;
        r0 = r0.c;
        if (r0 == r5) goto L_0x0033;
    L_0x002b:
        r0 = r7.c;
        r0 = r0.c;
        r2 = 9;
        if (r0 != r2) goto L_0x006b;
    L_0x0033:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r7.a;
        r2 = r2.c;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r7.c;
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r0.autodownloadRetryEnabled = r4;
        r0.transferred = r4;
        r0 = com.whatsapp.App.aK;
        r2 = r7.c;
        r0.c(r2);
        if (r1 == 0) goto L_0x0116;
    L_0x006b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r7.a;
        r2 = r2.c;
        r0 = r0.append(r2);
        r2 = z;
        r2 = r2[r6];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r7.c;
        r2 = 0;
        com.whatsapp.App.a(r0, r4, r2);
        if (r1 == 0) goto L_0x0116;
    L_0x0099:
        r0 = r7.b;
        if (r0 != 0) goto L_0x00cc;
    L_0x009d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r2 = r2[r5];
        r0 = r0.append(r2);
        r2 = r7.a;
        r2 = r2.a;
        r0 = r0.append(r2);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r7.a;
        r2 = r2.c;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        if (r1 == 0) goto L_0x0116;
    L_0x00cc:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r7.a;
        r1 = r1.a;
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r7.a;
        r1 = r1.c;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = new com.whatsapp.fieldstats.bz;
        r0.<init>();
        r1 = com.whatsapp.fieldstats.b4.UNKNOWN_TAGS_RECEIPT;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.a = r1;
        r1 = r7.a;
        r1 = r1.d;
        r1 = com.whatsapp.adn.a(r1);
        com.whatsapp.fieldstats.i.a(r1, r0);
    L_0x0116:
        r0 = r7.a;
        r0 = r0.a;
        com.whatsapp.App.b(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5v.run():void");
    }
}
