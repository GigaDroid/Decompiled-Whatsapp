package org.whispersystems.jobqueue;

import java.io.UnsupportedEncodingException;
import org.v;
import org.whispersystems.at;

public class r {
    public static int a;
    static final boolean b;
    private static final String[] z;

    public static String c(byte[] bArr, int i) {
        try {
            return new String(b(bArr, i), z[1]);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    static {
        boolean z = true;
        String[] strArr = new String[2];
        String str = ",j?\u0014k/x>\u0019?z";
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
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (r.class.desiredAssertionStatus()) {
                            z = false;
                        }
                        b = z;
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "\u001bXvuZ\rB\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    public static byte[] b(byte[] bArr, int i) {
        return b(bArr, 0, bArr.length, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(byte[] r5, int r6, int r7, int r8) {
        /*
        r1 = 1;
        r2 = a;
        r3 = new org.whispersystems.jobqueue.d;
        r0 = 0;
        r3.<init>(r8, r0);
        r0 = r7 / 3;
        r0 = r0 * 4;
        r4 = r3.f;	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r4 == 0) goto L_0x0019;
    L_0x0011:
        r4 = r7 % 3;
        if (r4 <= 0) goto L_0x001e;
    L_0x0015:
        r0 = r0 + 4;
        if (r2 == 0) goto L_0x001e;
    L_0x0019:
        r4 = r7 % 3;
        switch(r4) {
            case 0: goto L_0x0056;
            case 1: goto L_0x0058;
            case 2: goto L_0x005c;
            default: goto L_0x001e;
        };
    L_0x001e:
        r2 = r0;
    L_0x001f:
        r0 = r3.g;	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r0 == 0) goto L_0x006d;
    L_0x0023:
        if (r7 <= 0) goto L_0x006d;
    L_0x0025:
        r0 = r7 + -1;
        r0 = r0 / 57;
        r4 = r0 + 1;
        r0 = r3.i;	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r0 == 0) goto L_0x0066;
    L_0x002f:
        r0 = 2;
    L_0x0030:
        r0 = r0 * r4;
        r0 = r0 + r2;
    L_0x0032:
        r1 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3.a = r1;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r1 = 1;
        r3.a(r5, r6, r7, r1);	 Catch:{ IllegalArgumentException -> 0x0068 }
        r1 = b;	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r1 != 0) goto L_0x006a;
    L_0x003e:
        r1 = r3.b;	 Catch:{ IllegalArgumentException -> 0x0048 }
        if (r1 == r0) goto L_0x006a;
    L_0x0042:
        r0 = new java.lang.AssertionError;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0048 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        if (r2 == 0) goto L_0x001e;
    L_0x0058:
        r0 = r0 + 2;
        if (r2 == 0) goto L_0x001e;
    L_0x005c:
        r0 = r0 + 3;
        r2 = r0;
        goto L_0x001f;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = r1;
        goto L_0x0030;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x006a:
        r0 = r3.a;
        return r0;
    L_0x006d:
        r0 = r2;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.r.b(byte[], int, int, int):byte[]");
    }

    public static byte[] a(String str, int i) {
        return a(str.getBytes(), i);
    }

    public static byte[] a(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, new byte[((i2 * 3) / 4)]);
        try {
            if (cVar.a(bArr, i, i2, true)) {
                try {
                    if (cVar.b == cVar.a.length) {
                        return cVar.a;
                    }
                    byte[] bArr2 = new byte[cVar.b];
                    System.arraycopy(cVar.a, 0, bArr2, 0, cVar.b);
                    return bArr2;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private r() {
    }

    public static byte[] a(byte[] bArr, int i) {
        return a(bArr, 0, bArr.length, i);
    }
}
