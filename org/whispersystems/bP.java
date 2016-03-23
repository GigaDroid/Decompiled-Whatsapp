package org.whispersystems;

import com.google.hx;
import org.v;

public class bP implements m {
    private static final String[] z;
    private final byte[] a;
    private final int b;
    private final byte[] c;
    private final E d;
    private final int e;

    static {
        String[] strArr = new String[3];
        String str = "\u0003oG2z:mA)rjlA.d+fAs";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 36;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 23;
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
                    str = "\u0006dC<t3!I8d9`C8-j";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001foO3x=o\u0004+r8rM2yp!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public bP(int i, int i2, byte[] bArr, E e) {
        byte[] bArr2 = new byte[]{aw.a(3, 3)};
        byte[] b = N.m().b(i).a(i2).a(hx.a(bArr)).b(hx.a(e.a())).h().b();
        this.e = i;
        this.b = i2;
        this.a = bArr;
        this.d = e;
        this.c = aw.a(new byte[][]{bArr2, b});
    }

    public byte[] d() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bP(byte[] r6) {
        /*
        r5 = this;
        r3 = 3;
        r5.<init>();
        r0 = 1;
        r1 = r6.length;	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = r1 + -1;
        r0 = org.whispersystems.aw.c(r6, r0, r1);	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = 0;
        r1 = r0[r1];	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r2 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x003b, av -> 0x006c }
        if (r2 >= r3) goto L_0x0044;
    L_0x001b:
        r0 = new org.whispersystems.bF;	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r2 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r2.<init>();	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r3 = z;	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r2 = r2.append(r3);	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r1 = r2.append(r1);	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r1 = r1.toString();	 Catch:{ fN -> 0x003b, av -> 0x006c }
        r0.<init>(r1);	 Catch:{ fN -> 0x003b, av -> 0x006c }
        throw r0;	 Catch:{ fN -> 0x003b, av -> 0x006c }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x003d, av -> 0x006c }
    L_0x003d:
        r0 = move-exception;
    L_0x003e:
        r1 = new org.whispersystems.bH;
        r1.<init>(r0);
        throw r1;
    L_0x0044:
        r2 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x006a, av -> 0x006c }
        if (r2 <= r3) goto L_0x006e;
    L_0x004a:
        r0 = new org.whispersystems.bH;	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r2 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r2.<init>();	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r3 = z;	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r2 = r2.append(r3);	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r1 = org.whispersystems.aw.a(r1);	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r1 = r2.append(r1);	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r1 = r1.toString();	 Catch:{ fN -> 0x006a, av -> 0x006c }
        r0.<init>(r1);	 Catch:{ fN -> 0x006a, av -> 0x006c }
        throw r0;	 Catch:{ fN -> 0x006a, av -> 0x006c }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x003d, av -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        goto L_0x003e;
    L_0x006e:
        r0 = org.whispersystems.N.a(r0);	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = r0.n();	 Catch:{ fN -> 0x0097, av -> 0x006c }
        if (r1 == 0) goto L_0x008a;
    L_0x0078:
        r1 = r0.p();	 Catch:{ fN -> 0x0097, av -> 0x006c }
        if (r1 == 0) goto L_0x008a;
    L_0x007e:
        r1 = r0.g();	 Catch:{ fN -> 0x0099, av -> 0x006c }
        if (r1 == 0) goto L_0x008a;
    L_0x0084:
        r1 = r0.b();	 Catch:{ fN -> 0x009b, av -> 0x006c }
        if (r1 != 0) goto L_0x009d;
    L_0x008a:
        r0 = new org.whispersystems.bH;	 Catch:{ fN -> 0x0095, av -> 0x006c }
        r1 = z;	 Catch:{ fN -> 0x0095, av -> 0x006c }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ fN -> 0x0095, av -> 0x006c }
        r0.<init>(r1);	 Catch:{ fN -> 0x0095, av -> 0x006c }
        throw r0;	 Catch:{ fN -> 0x0095, av -> 0x006c }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x003d, av -> 0x006c }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0099, av -> 0x006c }
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009b, av -> 0x006c }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0095, av -> 0x006c }
    L_0x009d:
        r5.c = r6;	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = r0.i();	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r5.e = r1;	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = r0.f();	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r5.b = r1;	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = r0.h();	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = r1.h();	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r5.a = r1;	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r0 = r0.k();	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r0 = r0.h();	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r1 = 0;
        r0 = org.whispersystems.bx.a(r0, r1);	 Catch:{ fN -> 0x003d, av -> 0x006c }
        r5.d = r0;	 Catch:{ fN -> 0x003d, av -> 0x006c }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.bP.<init>(byte[]):void");
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.b;
    }

    public byte[] m767b() {
        return this.c;
    }

    public E e() {
        return this.d;
    }

    public int a() {
        return 5;
    }
}
