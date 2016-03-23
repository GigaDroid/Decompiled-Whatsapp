package com.whatsapp;

import javax.net.ssl.HttpsURLConnection;
import org.v;
import org.whispersystems.at;

final class m2 {
    private static final String[] z;
    private String a;
    private final HttpsURLConnection b;
    private String c;

    static {
        String[] strArr = new String[7];
        String str = "M\u001c*P\u0003R\u0005#\b";
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
                        i3 = 43;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "M\u001c*P\u001fJ\u0006.\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "sX\u0011tZf\u00102T\u0013J\u0001'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "M\u001c*P\u0003R\u0005#\b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "M\u001c*P\u001fJ\u0006.\b";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "M\u001c*P\u001fJ\u0006.\b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "M\u001c*P\u0003R\u0005#\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.m2 a() {
        /*
        r6 = this;
        r5 = 59;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r6.b;
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.getHeaderField(r2);
        if (r1 != 0) goto L_0x0012;
    L_0x0011:
        return r6;
    L_0x0012:
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r2 = r1.indexOf(r2);
        if (r2 < 0) goto L_0x0040;
    L_0x0022:
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = r1.indexOf(r5, r2);
        if (r3 < 0) goto L_0x003a;
    L_0x0032:
        r3 = r1.substring(r2, r3);
        r6.a = r3;
        if (r0 == 0) goto L_0x0040;
    L_0x003a:
        r2 = r1.substring(r2);
        r6.a = r2;
    L_0x0040:
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r2 = r1.indexOf(r2);
        if (r2 < 0) goto L_0x0011;
    L_0x0050:
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = r1.indexOf(r5, r2);
        if (r3 < 0) goto L_0x0068;
    L_0x0060:
        r3 = r1.substring(r2, r3);
        r6.c = r3;
        if (r0 == 0) goto L_0x0011;
    L_0x0068:
        r0 = r1.substring(r2);
        r6.c = r0;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m2.a():com.whatsapp.m2");
    }

    public m2(HttpsURLConnection httpsURLConnection) {
        this.b = httpsURLConnection;
    }

    public String c() {
        return this.c;
    }

    public String b() {
        return this.a;
    }
}
