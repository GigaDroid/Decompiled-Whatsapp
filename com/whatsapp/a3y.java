package com.whatsapp;

import org.v;
import org.whispersystems.at;

class a3y implements Runnable {
    private static final String[] z;
    final bv a;
    final adn b;

    static {
        String[] strArr = new String[4];
        String str = "2Z+~i~Mcsy2\u0017~1";
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
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "`L tudL'1lzF7~CfA6|~M@'1u|_\"}uv\u0005c";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "2Z+~i~Mcsy2\u0017~1";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "`L tudL'1lzF7~Ct\\/}C{McxrdH/xx>\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r12 = this;
        r1 = 0;
        r11 = 2;
        r3 = 0;
        r10 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.as;
        r2 = r12.a;
        r2 = r2.d;
        r9 = r0.b(r2);
        r0 = r12.a;
        r0 = r0.c;
        if (r0 != r10) goto L_0x0109;
    L_0x0016:
        r0 = r12.a;
        r0 = r0.b;
    L_0x001a:
        r2 = r12.a;
        r2 = r2.c;
        if (r2 != r11) goto L_0x010c;
    L_0x0020:
        r2 = r12.a;
        r2 = r2.b;
        r8 = r2;
    L_0x0025:
        r9.a(r0, r8);
        r2 = r9.c;
        if (r0 == 0) goto L_0x0032;
    L_0x002c:
        r2 = r12.a;
        r2 = r2.a;
        if (r5 == 0) goto L_0x0071;
    L_0x0032:
        r4 = r12.a;
        r4 = r4.a;
        if (r2 == r4) goto L_0x0071;
    L_0x0038:
        r4 = r12.a;
        r4 = r4.a;
        if (r4 >= r2) goto L_0x0069;
    L_0x003e:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r6 = z;
        r6 = r6[r10];
        r4 = r4.append(r6);
        r6 = r12.a;
        r6 = r6.a;
        r4 = r4.append(r6);
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r4 = r4.append(r6);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        if (r5 == 0) goto L_0x0071;
    L_0x0069:
        r2 = r9.x();
        r2.delete();
        r2 = r3;
    L_0x0071:
        r4 = r9.o;
        if (r8 == 0) goto L_0x007b;
    L_0x0075:
        r4 = r12.a;
        r4 = r4.a;
        if (r5 == 0) goto L_0x00b9;
    L_0x007b:
        r6 = r12.a;
        r6 = r6.a;
        if (r4 == r6) goto L_0x00b9;
    L_0x0081:
        r6 = r12.a;
        r6 = r6.a;
        if (r6 >= r4) goto L_0x00b1;
    L_0x0087:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r7 = r7[r11];
        r6 = r6.append(r7);
        r7 = r12.a;
        r7 = r7.a;
        r6 = r6.append(r7);
        r7 = z;
        r7 = r7[r3];
        r6 = r6.append(r7);
        r6 = r6.append(r4);
        r6 = r6.toString();
        com.whatsapp.util.Log.e(r6);
        if (r5 == 0) goto L_0x00b9;
    L_0x00b1:
        r4 = r9.r();
        r4.delete();
        r4 = r3;
    L_0x00b9:
        r9.c(r2, r4);
        r2 = r12.a;
        r2 = r2.c;
        if (r2 != r10) goto L_0x010f;
    L_0x00c2:
        r1 = com.whatsapp.App.Q;
        r2 = r9.p;
        r1 = r1.a(r2);
        r4 = r1;
    L_0x00cb:
        if (r4 == 0) goto L_0x00f6;
    L_0x00cd:
        r1 = com.whatsapp.App.z();
        r2 = r12.a;
        r2 = r2.b;
        if (r2 != 0) goto L_0x011f;
    L_0x00d7:
        r2 = com.whatsapp.fieldstats.c2.OK_DID_NOT_CHANGE;
    L_0x00d9:
        r3 = r12.a;
        r3 = r3.c;
        if (r3 != r10) goto L_0x0122;
    L_0x00df:
        r3 = com.whatsapp.fieldstats.bg.FULL;
    L_0x00e1:
        r6 = android.os.SystemClock.elapsedRealtime();
        r4 = r4.longValue();
        r4 = r6 - r4;
        r6 = r12.a;
        r6 = r6.b;
        if (r6 != 0) goto L_0x0125;
    L_0x00f1:
        r6 = 0;
    L_0x00f3:
        com.whatsapp.nf.a(r1, r2, r3, r4, r6);
    L_0x00f6:
        if (r0 != 0) goto L_0x00fa;
    L_0x00f8:
        if (r8 == 0) goto L_0x0108;
    L_0x00fa:
        r0 = com.whatsapp.App.p;
        r0 = r0.M();
        r1 = new com.whatsapp.aaa;
        r1.<init>(r12, r9);
        r0.post(r1);
    L_0x0108:
        return;
    L_0x0109:
        r0 = r1;
        goto L_0x001a;
    L_0x010c:
        r8 = r1;
        goto L_0x0025;
    L_0x010f:
        r2 = r12.a;
        r2 = r2.c;
        if (r2 != r11) goto L_0x012c;
    L_0x0115:
        r1 = com.whatsapp.App.a2;
        r2 = r9.p;
        r1 = r1.a(r2);
        r4 = r1;
        goto L_0x00cb;
    L_0x011f:
        r2 = com.whatsapp.fieldstats.c2.OK_GOT_PICTURE;
        goto L_0x00d9;
    L_0x0122:
        r3 = com.whatsapp.fieldstats.bg.THUMB;
        goto L_0x00e1;
    L_0x0125:
        r6 = r12.a;
        r6 = r6.b;
        r6 = r6.length;
        r6 = (long) r6;
        goto L_0x00f3;
    L_0x012c:
        r4 = r1;
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3y.run():void");
    }

    a3y(adn com_whatsapp_adn, bv bvVar) {
        this.b = com_whatsapp_adn;
        this.a = bvVar;
    }
}
