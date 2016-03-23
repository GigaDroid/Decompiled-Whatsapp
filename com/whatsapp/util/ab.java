package com.whatsapp.util;

import android.os.SystemClock;
import org.v;
import org.whispersystems.at;

public class ab {
    private static final String[] z;
    private long a;
    private String b;
    private final boolean c;
    private boolean d;

    static {
        String[] strArr = new String[5];
        String str = "9w@9Rd,Z Xf9\t";
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
                        i3 = 22;
                        break;
                    case at.g /*1*/:
                        i3 = 3;
                        break;
                    case at.i /*2*/:
                        i3 = 41;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "EwF$`wwJ<h3p";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "bjD1E9fE5GefMn\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "9w@9Rd,L8VfpL0\r6";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "bjD1E9p];G,#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private long a() {
        if (this.c) {
            return SystemClock.elapsedRealtime();
        }
        return SystemClock.uptimeMillis();
    }

    public void b(String str) {
        this.b = str;
        this.d = true;
        c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long d() {
        /*
        r5 = this;
        r0 = r5.a();
        r2 = r5.a;
        r0 = r0 - r2;
        r2 = r5.d;
        if (r2 == 0) goto L_0x004b;
    L_0x000b:
        r2 = r5.b;
        if (r2 == 0) goto L_0x0032;
    L_0x000f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r5.b;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.util.Log.h;
        if (r2 == 0) goto L_0x004b;
    L_0x0032:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ab.d():long");
    }

    public ab() {
        this(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b() {
        /*
        r8 = this;
        r6 = 1;
        r0 = 0;
        r7 = 0;
        r2 = r8.a;
        r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r2 = r8.a();
        r4 = r8.a;
        r2 = r2 - r4;
        r4 = r8.d;
        if (r4 == 0) goto L_0x0054;
    L_0x0016:
        r4 = r8.b;
        if (r4 == 0) goto L_0x003c;
    L_0x001a:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r8.b;
        r4 = r4.append(r5);
        r5 = z;
        r5 = r5[r7];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = com.whatsapp.util.Log.h;
        if (r4 == 0) goto L_0x0054;
    L_0x003c:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
    L_0x0054:
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r5 = new java.lang.Object[r6];
        r6 = r8.b;
        r5[r7] = r6;
        r4 = java.lang.String.format(r4, r5);
        com.whatsapp.tp.a(r4, r2);
        r8.a = r0;
        r8.d = r7;
        r0 = 0;
        r8.b = r0;
        r0 = r2;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ab.b():long");
    }

    public ab(boolean z) {
        this.d = false;
        this.b = null;
        this.a = 0;
        this.c = z;
    }

    public long a(String str) {
        long b = b();
        b(str);
        return b;
    }

    public void c() {
        if (this.d && this.b == null) {
            this.a = a();
        } else {
            this.a = a();
        }
    }

    public ab(String str) {
        this(false);
        b(str);
    }
}
