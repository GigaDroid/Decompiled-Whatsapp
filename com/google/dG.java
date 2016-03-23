package com.google;

import java.lang.reflect.Array;
import org.v;
import org.whispersystems.at;

public final class dG {
    public static int c;
    private static final String[] z;
    private final byte[][] a;
    private final int b;
    private final int d;

    static {
        String[] strArr = new String[3];
        String str = "XL";
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
                        i3 = 120;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 55;
                        break;
                    case at.o /*3*/:
                        i3 = 65;
                        break;
                    default:
                        i3 = 12;
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
                    str = "X]";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "XM";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public byte[][] a() {
        return this.a;
    }

    public byte a(int i, int i2) {
        return this.a[i2][i];
    }

    public int c() {
        return this.d;
    }

    public void a(int i, int i2, boolean z) {
        int i3;
        byte[] bArr = this.a[i2];
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        bArr[i] = (byte) i3;
    }

    public void a(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public int b() {
        return this.b;
    }

    public void a(byte b) {
        int i = c;
        int i2 = 0;
        while (i2 < this.d) {
            int i3 = 0;
            while (i3 < this.b) {
                this.a[i2][i3] = b;
                i3++;
                if (i != 0) {
                    break;
                }
            }
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public dG(int i, int i2) {
        this.a = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{i2, i});
        this.b = i;
        this.d = i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r7 = this;
        r1 = 0;
        r3 = c;
        r4 = new java.lang.StringBuilder;
        r0 = r7.b;
        r0 = r0 * 2;
        r2 = r7.d;
        r0 = r0 * r2;
        r0 = r0 + 2;
        r4.<init>(r0);
        r0 = r1;
    L_0x0012:
        r2 = r7.d;
        if (r0 >= r2) goto L_0x0039;
    L_0x0016:
        r2 = r1;
    L_0x0017:
        r5 = r7.b;
        if (r2 >= r5) goto L_0x0030;
    L_0x001b:
        r5 = r7.a;
        r5 = r5[r0];
        r5 = r5[r2];
        switch(r5) {
            case 0: goto L_0x003e;
            case 1: goto L_0x0048;
            default: goto L_0x0024;
        };
    L_0x0024:
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r4.append(r5);
    L_0x002c:
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0017;
    L_0x0030:
        r2 = 10;
        r4.append(r2);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0012;
    L_0x0039:
        r0 = r4.toString();
        return r0;
    L_0x003e:
        r5 = z;
        r6 = 1;
        r5 = r5[r6];
        r4.append(r5);
        if (r3 == 0) goto L_0x002c;
    L_0x0048:
        r5 = z;
        r5 = r5[r1];
        r4.append(r5);
        if (r3 == 0) goto L_0x002c;
    L_0x0051:
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dG.toString():java.lang.String");
    }
}
