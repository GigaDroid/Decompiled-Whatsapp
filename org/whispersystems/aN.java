package org.whispersystems;

import com.google.hx;
import org.v;

public class aN implements m {
    private static final String[] z;
    private final byte[] a;
    private final int b;
    private final int c;
    private final byte[] d;
    private final int e;

    static {
        String[] strArr = new String[4];
        String str = "T\u001a\u001aQIv\u001aQICs\u0007\u0018PH;T";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 116;
                        break;
                    case at.i /*2*/:
                        i3 = 113;
                        break;
                    case at.o /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 38;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "H\u001a\u0012PKq\u0018\u0014KC!\u0019\u0014LU`\u0013\u0014\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "H\u001a\u0007^Jh\u0010QLOf\u001a\u0010KSs\u0011P";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "M\u0011\u0016^ExT\u001cZUr\u0015\u0016Z\u001c!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int a() {
        return 4;
    }

    public byte[] m1262b() {
        return this.a;
    }

    public int b() {
        return this.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aN(byte[] r6) {
        /*
        r5 = this;
        r4 = 3;
        r5.<init>();
        r0 = 1;
        r1 = r6.length;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r1 = r1 + -1;
        r1 = r1 + -64;
        r2 = 64;
        r0 = org.whispersystems.aw.a(r6, r0, r1, r2);	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r1 = 0;
        r1 = r0[r1];	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r2 = 1;
        r2 = r0[r2];	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r3 = 2;
        r0 = r0[r3];	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r0 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        if (r0 >= r4) goto L_0x004b;
    L_0x0022:
        r0 = new org.whispersystems.bF;	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r2 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r2.<init>();	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r3 = z;	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r2 = r2.append(r3);	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r1 = r2.append(r1);	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r1 = r1.toString();	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
        throw r0;	 Catch:{ fN -> 0x0042, ParseException -> 0x0073 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
    L_0x0044:
        r0 = move-exception;
    L_0x0045:
        r1 = new org.whispersystems.bH;
        r1.<init>(r0);
        throw r1;
    L_0x004b:
        r0 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        if (r0 <= r4) goto L_0x0075;
    L_0x0051:
        r0 = new org.whispersystems.bH;	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r2 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r2.<init>();	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r3 = z;	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r2 = r2.append(r3);	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r1 = r2.append(r1);	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r1 = r1.toString();	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
        throw r0;	 Catch:{ fN -> 0x0071, ParseException -> 0x0073 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        goto L_0x0045;
    L_0x0075:
        r0 = org.whispersystems.O.a(r2);	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r2 = r0.l();	 Catch:{ fN -> 0x0098, ParseException -> 0x0073 }
        if (r2 == 0) goto L_0x008b;
    L_0x007f:
        r2 = r0.a();	 Catch:{ fN -> 0x0098, ParseException -> 0x0073 }
        if (r2 == 0) goto L_0x008b;
    L_0x0085:
        r2 = r0.k();	 Catch:{ fN -> 0x009a, ParseException -> 0x0073 }
        if (r2 != 0) goto L_0x009c;
    L_0x008b:
        r0 = new org.whispersystems.bH;	 Catch:{ fN -> 0x0096, ParseException -> 0x0073 }
        r1 = z;	 Catch:{ fN -> 0x0096, ParseException -> 0x0073 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ fN -> 0x0096, ParseException -> 0x0073 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0096, ParseException -> 0x0073 }
        throw r0;	 Catch:{ fN -> 0x0096, ParseException -> 0x0073 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009a, ParseException -> 0x0073 }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0096, ParseException -> 0x0073 }
    L_0x009c:
        r5.a = r6;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r5.c = r1;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r1 = r0.j();	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r5.b = r1;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r1 = r0.i();	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r5.e = r1;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r0 = r0.b();	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r0 = r0.h();	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        r5.d = r0;	 Catch:{ fN -> 0x0044, ParseException -> 0x0073 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aN.<init>(byte[]):void");
    }

    public aN(int i, int i2, byte[] bArr, u uVar) {
        byte[] bArr2 = new byte[]{aw.a(3, 3)};
        byte[] b = O.f().a(i).b(i2).a(hx.a(bArr)).b().b();
        byte[] a = a(uVar, aw.a(new byte[][]{bArr2, b}));
        this.a = aw.a(new byte[][]{bArr2, b, a});
        this.c = 3;
        this.b = i;
        this.e = i2;
        this.d = bArr;
    }

    public byte[] d() {
        return this.d;
    }

    public void a(E e) {
        try {
            byte[][] c = aw.c(this.a, this.a.length - 64, 64);
            if (!bx.a(e, c[0], c[1])) {
                throw new bH(z[3]);
            }
        } catch (av e2) {
            throw e2;
        } catch (Throwable e3) {
            throw new bH(e3);
        }
    }

    private byte[] a(u uVar, byte[] bArr) {
        try {
            return bx.a(uVar, bArr);
        } catch (av e) {
            throw new AssertionError(e);
        }
    }

    public int c() {
        return this.b;
    }
}
