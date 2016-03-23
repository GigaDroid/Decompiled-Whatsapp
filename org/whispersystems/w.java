package org.whispersystems;

import com.google.hx;
import org.v;

public class w implements m {
    private static final String[] z;
    private final bp a;
    private final int b;
    private final b c;
    private final E d;
    private final byte[] e;
    private final int f;
    private final int g;
    private final o h;

    static {
        String[] strArr = new String[2];
        String str = ";?n\u0015n\u0019?%\rd\u001c\"l\u0014oTq";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 5;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 1;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'?f\u0014l\u001e=`\u000fdN<`\br\u000f6`U";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    public E e() {
        return this.d;
    }

    public int b() {
        return this.f;
    }

    public w(int i, int i2, o oVar, int i3, E e, bp bpVar, b bVar) {
        this.f = i;
        this.b = i2;
        this.h = oVar;
        this.g = i3;
        this.d = e;
        this.a = bpVar;
        this.c = bVar;
        aa b = M.c().c(i3).b(hx.a(e.a())).c(hx.a(bpVar.b())).a(hx.a(bVar.b())).b(i2);
        if (oVar.a()) {
            b.a(((Integer) oVar.c()).intValue());
        }
        byte[] bArr = new byte[]{aw.a(this.f, 3)};
        byte[] b2 = b.b().b();
        this.e = aw.a(new byte[][]{bArr, b2});
    }

    public bp g() {
        return this.a;
    }

    public o d() {
        return this.h;
    }

    public int h() {
        return this.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(byte[] r8) {
        /*
        r7 = this;
        r6 = 3;
        r1 = 1;
        r0 = 0;
        r3 = org.whispersystems.aC.d;
        r7.<init>();
        r2 = 0;
        r2 = r8[r2];	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = org.whispersystems.aw.a(r2);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r7.f = r2;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = r7.f;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        if (r2 <= r6) goto L_0x003a;
    L_0x0015:
        r0 = new org.whispersystems.r;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r1.<init>();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = z;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = r7.f;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r1 = r1.toString();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        throw r0;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
    L_0x0033:
        r0 = move-exception;
    L_0x0034:
        r1 = new org.whispersystems.bH;
        r1.<init>(r0);
        throw r1;
    L_0x003a:
        r2 = 1;
        r4 = r8.length;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r4 = r4 + -1;
        r2 = com.google.hx.a(r8, r2, r4);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r4 = org.whispersystems.M.a(r2);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = r7.f;	 Catch:{ fN -> 0x007c, av -> 0x007a, bF -> 0x0088 }
        r5 = 2;
        if (r2 != r5) goto L_0x0051;
    L_0x004b:
        r2 = r4.r();	 Catch:{ fN -> 0x007c, av -> 0x007a, bF -> 0x0088 }
        if (r2 == 0) goto L_0x006d;
    L_0x0051:
        r2 = r7.f;	 Catch:{ fN -> 0x007e, av -> 0x007a, bF -> 0x0088 }
        if (r2 != r6) goto L_0x005b;
    L_0x0055:
        r2 = r4.b();	 Catch:{ fN -> 0x0080, av -> 0x007a, bF -> 0x0088 }
        if (r2 == 0) goto L_0x006d;
    L_0x005b:
        r2 = r4.h();	 Catch:{ fN -> 0x0082, av -> 0x007a, bF -> 0x0088 }
        if (r2 == 0) goto L_0x006d;
    L_0x0061:
        r2 = r4.l();	 Catch:{ fN -> 0x0084, av -> 0x007a, bF -> 0x0088 }
        if (r2 == 0) goto L_0x006d;
    L_0x0067:
        r2 = r4.p();	 Catch:{ fN -> 0x0086, av -> 0x007a, bF -> 0x0088 }
        if (r2 != 0) goto L_0x008a;
    L_0x006d:
        r0 = new org.whispersystems.bH;	 Catch:{ fN -> 0x0078, av -> 0x007a, bF -> 0x0088 }
        r1 = z;	 Catch:{ fN -> 0x0078, av -> 0x007a, bF -> 0x0088 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ fN -> 0x0078, av -> 0x007a, bF -> 0x0088 }
        r0.<init>(r1);	 Catch:{ fN -> 0x0078, av -> 0x007a, bF -> 0x0088 }
        throw r0;	 Catch:{ fN -> 0x0078, av -> 0x007a, bF -> 0x0088 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
    L_0x007a:
        r0 = move-exception;
        goto L_0x0034;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x007e, av -> 0x007a, bF -> 0x0088 }
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0080, av -> 0x007a, bF -> 0x0088 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0082, av -> 0x007a, bF -> 0x0088 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0084, av -> 0x007a, bF -> 0x0088 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0086, av -> 0x007a, bF -> 0x0088 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0078, av -> 0x007a, bF -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        goto L_0x0034;
    L_0x008a:
        r7.e = r8;	 Catch:{ fN -> 0x00ed, av -> 0x007a, bF -> 0x0088 }
        r2 = r4.g();	 Catch:{ fN -> 0x00ed, av -> 0x007a, bF -> 0x0088 }
        r7.b = r2;	 Catch:{ fN -> 0x00ed, av -> 0x007a, bF -> 0x0088 }
        r2 = r4.r();	 Catch:{ fN -> 0x00ed, av -> 0x007a, bF -> 0x0088 }
        if (r2 == 0) goto L_0x00ef;
    L_0x0098:
        r2 = r4.k();	 Catch:{ fN -> 0x00ed, av -> 0x007a, bF -> 0x0088 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ fN -> 0x00ed, av -> 0x007a, bF -> 0x0088 }
        r2 = org.whispersystems.o.a(r2);	 Catch:{ fN -> 0x00ed, av -> 0x007a, bF -> 0x0088 }
    L_0x00a4:
        r7.h = r2;	 Catch:{ fN -> 0x00f4, av -> 0x007a, bF -> 0x0088 }
        r2 = r4.b();	 Catch:{ fN -> 0x00f4, av -> 0x007a, bF -> 0x0088 }
        if (r2 == 0) goto L_0x00f6;
    L_0x00ac:
        r2 = r4.s();	 Catch:{ fN -> 0x00f4, av -> 0x007a, bF -> 0x0088 }
    L_0x00b0:
        r7.g = r2;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = r4.e();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = r2.h();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r5 = 0;
        r2 = org.whispersystems.bx.a(r2, r5);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r7.d = r2;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = new org.whispersystems.bp;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r5 = r4.f();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r5 = r5.h();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r6 = 0;
        r5 = org.whispersystems.bx.a(r5, r6);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2.<init>(r5);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r7.a = r2;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = new org.whispersystems.b;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r4 = r4.d();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r4 = r4.h();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2.<init>(r4);	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r7.c = r2;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        r2 = org.whispersystems.a5.o;	 Catch:{ fN -> 0x00f8 }
        if (r2 == 0) goto L_0x00ec;
    L_0x00e8:
        if (r3 == 0) goto L_0x00fc;
    L_0x00ea:
        org.whispersystems.aC.d = r0;
    L_0x00ec:
        return;
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
    L_0x00ef:
        r2 = org.whispersystems.o.d();	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
        goto L_0x00a4;
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0033, av -> 0x007a, bF -> 0x0088 }
    L_0x00f6:
        r2 = -1;
        goto L_0x00b0;
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00fa }
    L_0x00fa:
        r0 = move-exception;
        throw r0;
    L_0x00fc:
        r0 = r1;
        goto L_0x00ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.w.<init>(byte[]):void");
    }

    public int a() {
        return 3;
    }

    public int f() {
        return this.g;
    }

    public byte[] m727b() {
        return this.e;
    }

    public b c() {
        return this.c;
    }
}
