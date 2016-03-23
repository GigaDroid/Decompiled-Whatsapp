package com.whatsapp.protocol;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class b1 {
    private static final String[] z;
    public final int a;
    public final int b;
    public final byte[] c;

    static {
        String[] strArr = new String[8];
        String str = "_`\u0003\u0011\u0001\u001b%\u0012\f\u0014\u000b44\u0001\u0001\u0016}";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 96;
                        break;
                    case at.o /*3*/:
                        i3 = 120;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0003+\r\u000b\u0016";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001a.\u0016\u0019\u001d\u001a$@\u001d\u001f\u00102\u0019\b\u0005\u0016$@\u0016\u001e\u0017%@\f\b\u0003%@\b\u0003\u001c6\t\u001c\u0014\u0017z@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u00079\u0010\u001d";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0000+\r\u000b\u0016";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001a.\u0016\u0019\u001d\u001a$@\u001d\u001f\u00102\u0019\b\u0005\u0016$@\u0016\u001e\u0017%@\u000e\u0014\u00013\t\u0017\u001fS0\u0012\u0017\u0007\u001a$\u0005\u001cKS";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001e3\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "6.\u0003\n\b\u00034\u0005\u001c<\u00163\u0013\u0019\u0016\u0016;\u0003\u0011\u0001\u001b%\u0012\f\u0014\u000b46\u001d\u0003\u0000)\u000f\u0016L";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[1] + this.a + z[0] + this.b + '}';
    }

    public static b1 a(byte[] bArr) {
        int i = 0;
        int i2 = 8;
        boolean z = co.s;
        if (bArr == null || bArr.length < 8) {
            return null;
        }
        byte[] bArr2;
        int i3 = (bArr[3] & 255) | ((((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24)) | ((bArr[2] & 255) << 8));
        int i4 = (bArr[7] & 255) | ((((bArr[5] & 255) << 16) | ((bArr[4] & 255) << 24)) | ((bArr[6] & 255) << 8));
        if (bArr.length == 8) {
            bArr2 = null;
        } else {
            bArr2 = new byte[(bArr.length - 8)];
        }
        if (bArr2 != null) {
            while (i < bArr2.length) {
                int i5 = i2 + 1;
                bArr2[i] = bArr[i2];
                i++;
                if (z) {
                    break;
                }
                i2 = i5;
            }
        }
        return new b1(i3, i4, bArr2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.protocol.b1 a(com.whatsapp.protocol.cw r6) {
        /*
        r1 = 2;
        r2 = com.whatsapp.protocol.co.s;
        r0 = "v";
        r0 = r6.b(r0);
        r3 = "1";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x001c;
    L_0x0013:
        r3 = "2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0076;
    L_0x001c:
        r3 = java.lang.Integer.parseInt(r0);
        r0 = z;
        r4 = 4;
        r0 = r0[r4];
        r4 = r6.b(r0);
        r0 = z;
        r5 = 7;
        r0 = r0[r5];
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0037;
    L_0x0034:
        r0 = 0;
        if (r2 == 0) goto L_0x006e;
    L_0x0037:
        r0 = z;
        r0 = r0[r1];
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0044;
    L_0x0041:
        r0 = 1;
        if (r2 == 0) goto L_0x006e;
    L_0x0044:
        r0 = z;
        r5 = 5;
        r0 = r0[r5];
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0051;
    L_0x004f:
        if (r2 == 0) goto L_0x006d;
    L_0x0051:
        r0 = new com.whatsapp.protocol.cz;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x006d:
        r0 = r1;
    L_0x006e:
        r1 = new com.whatsapp.protocol.b1;
        r2 = r6.a;
        r1.<init>(r3, r0, r2);
        return r1;
    L_0x0076:
        r1 = new com.whatsapp.protocol.cz;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.b1.a(com.whatsapp.protocol.cw):com.whatsapp.protocol.b1");
    }

    public b1(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static byte[] a(b1 b1Var) {
        int i = 8;
        boolean z = co.s;
        if (b1Var == null) {
            return null;
        }
        int i2;
        if (b1Var.c == null) {
            i2 = 8;
        } else {
            i2 = b1Var.c.length + 8;
        }
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) (b1Var.a >> 24);
        bArr[1] = (byte) (b1Var.a >> 16);
        bArr[2] = (byte) (b1Var.a >> 8);
        bArr[3] = (byte) b1Var.a;
        bArr[4] = (byte) (b1Var.b >> 24);
        bArr[5] = (byte) (b1Var.b >> 16);
        bArr[6] = (byte) (b1Var.b >> 8);
        bArr[7] = (byte) b1Var.b;
        if (b1Var.c != null) {
            i2 = 0;
            while (i2 < b1Var.c.length) {
                int i3 = i + 1;
                bArr[i] = b1Var.c[i2];
                i2++;
                if (z) {
                    break;
                }
                i = i3;
            }
        }
        return bArr;
    }
}
