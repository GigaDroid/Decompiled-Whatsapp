package org.whispersystems;

import org.v;

public class n {
    private static final String f;
    private static final String[] z;
    private final ab a;
    private final ai b;
    private final j c;
    private final aM d;
    private final I e;

    static {
        String[] strArr = new String[6];
        String str = "\u0017x}UZ29<_Za88IJ(88K\u001f.$8\u0018K('8\u0018O3/6]Fa#9\u0019";
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
                        i3 = 65;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 63;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0016/zNZa+1JZ .$\u0018L$>(H\u001f j.]L2#2V\u001f'%/\u0018K)#.\u0018irj0]L2+:]\u0013a&8LK($:\u0018]4$9TZ%j0]L2+:]\u001f'+1T\u001f5\"/WJ&\"s\u0016\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0014$6VP6$}NZ394WQ{j";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0003%)P\u001f2#:VZ%j<V[a?3KV&$8\\\u001f188SZ89}YM$j<ZL$$)\u0019";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\b$+YS(.}KV&$<LJ3/}WQa.8NV\"/}SZ8k";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    f = n.class.getSimpleName();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016/zNZa+1JZ .$\u0018O3%>]L2/9\u0018K)/}HM$!8A\u001f1+/L\u001f.,}LW(9}n\ra98KL(%3\u0014\u001f-/)LV/-}ZJ/.1][a'8KL -8\u0018Y &1\u0018K)82MX)ds\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public n(I i, aM aMVar, ai aiVar, ab abVar, j jVar) {
        this.e = i;
        this.d = aMVar;
        this.b = aiVar;
        this.a = abVar;
        this.c = jVar;
    }

    public void a(bM bMVar) {
        boolean z = false;
        boolean z2 = av.a;
        synchronized (i.a) {
            if (!this.a.b(this.c.b(), bMVar.d())) {
                throw new b1(this.c.b(), bMVar.d());
            } else if (bMVar.b() != null && !bx.a(bMVar.d().a(), bMVar.b().a(), bMVar.c())) {
                throw new av(z[5]);
            } else if (bMVar.b() == null && bMVar.a() == null) {
                throw new av(z[4]);
            } else {
                boolean z3;
                E b;
                o a;
                int i;
                if (bMVar.b() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b0 a2 = this.e.a(this.c);
                e a3 = bx.a();
                if (z3) {
                    b = bMVar.b();
                } else {
                    b = bMVar.a();
                }
                o b2 = o.b(bMVar.a());
                if (b2.a()) {
                    a = o.a(Integer.valueOf(bMVar.g()));
                } else {
                    a = o.d();
                }
                bz c = aS.c();
                bz b3 = c.a(a3).a(this.a.b()).a(bMVar.d()).a(b).b(b);
                if (!z3) {
                    b2 = o.d();
                }
                b3.a(b2);
                if (!a2.b()) {
                    a2.c();
                }
                t a4 = a2.a();
                if (z3) {
                    i = 3;
                } else {
                    i = 2;
                }
                f.a(a4, i, c.a());
                a2.a().a(a, bMVar.f(), a3.b());
                a2.a().b(this.a.a());
                a2.a().c(bMVar.e());
                a2.a().a(a3.b().a());
                this.e.a(this.c, a2);
                this.a.a(this.c.b(), bMVar.d());
            }
        }
        if (z2) {
            if (!a5.o) {
                z = true;
            }
            a5.o = z;
        }
    }

    private o a(b0 b0Var, w wVar) {
        if (!wVar.d().a()) {
            throw new y(z[0]);
        } else if (this.d.b(((Integer) wVar.d().c()).intValue()) || !this.e.b(this.c)) {
            e c = this.d.a(((Integer) wVar.d().c()).intValue()).c();
            ae b = d.b();
            b.a(this.a.b()).a(c).b(c).a(o.d()).a(wVar.g()).a(wVar.e());
            if (!b0Var.b()) {
                b0Var.c();
            }
            f.a(b0Var.a(), wVar.b(), b.a());
            b0Var.a().b(this.a.a());
            b0Var.a().c(wVar.h());
            b0Var.a().a(wVar.e().a());
            if (((Integer) wVar.d().c()).intValue() != G.a) {
                return wVar.d();
            }
            return o.d();
        } else {
            aB.a(f, z[1]);
            return o.d();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    org.whispersystems.o b(org.whispersystems.b0 r6, org.whispersystems.w r7) {
        /*
        r5 = this;
        r1 = org.whispersystems.av.a;
        r2 = r7.b();
        r3 = r7.g();
        r0 = r5.a;
        r4 = r5.c;
        r4 = r4.b();
        r0 = r0.b(r4, r3);
        if (r0 != 0) goto L_0x0024;
    L_0x0018:
        r0 = new org.whispersystems.b1;
        r1 = r5.c;
        r1 = r1.b();
        r0.<init>(r1, r3);
        throw r0;
    L_0x0024:
        switch(r2) {
            case 2: goto L_0x0043;
            case 3: goto L_0x0049;
            default: goto L_0x0027;
        };
    L_0x0027:
        r0 = new java.lang.AssertionError;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0043:
        r0 = r5.a(r6, r7);
        if (r1 == 0) goto L_0x004f;
    L_0x0049:
        r0 = r5.c(r6, r7);
        if (r1 != 0) goto L_0x0027;
    L_0x004f:
        r1 = r5.a;
        r2 = r5.c;
        r2 = r2.b();
        r1.a(r2, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.n.b(org.whispersystems.b0, org.whispersystems.w):org.whispersystems.o");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.whispersystems.o c(org.whispersystems.b0 r5, org.whispersystems.w r6) {
        /*
        r4 = this;
        r0 = r6.b();
        r1 = r6.e();
        r1 = r1.a();
        r0 = r5.a(r0, r1);
        if (r0 == 0) goto L_0x0021;
    L_0x0012:
        r0 = f;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        org.whispersystems.aB.a(r0, r1);
        r0 = org.whispersystems.o.d();
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = r4.b;
        r1 = r6.f();
        r0 = r0.a(r1);
        r0 = r0.c();
        r1 = org.whispersystems.d.b();
        r2 = r6.e();
        r2 = r1.a(r2);
        r3 = r6.g();
        r2 = r2.a(r3);
        r3 = r4.a;
        r3 = r3.b();
        r2 = r2.a(r3);
        r2 = r2.a(r0);
        r2.b(r0);
        r0 = r6.d();
        r0 = r0.a();
        if (r0 == 0) goto L_0x0081;
    L_0x005e:
        r2 = r4.d;
        r0 = r6.d();
        r0 = r0.c();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = r2.a(r0);
        r0 = r0.c();
        r0 = org.whispersystems.o.a(r0);
        r1.a(r0);
        r0 = org.whispersystems.av.a;
        if (r0 == 0) goto L_0x0088;
    L_0x0081:
        r0 = org.whispersystems.o.d();
        r1.a(r0);
    L_0x0088:
        r0 = r5.b();
        if (r0 != 0) goto L_0x0091;
    L_0x008e:
        r5.c();
    L_0x0091:
        r0 = r5.a();
        r2 = r6.b();
        r1 = r1.a();
        org.whispersystems.f.a(r0, r2, r1);
        r0 = r5.a();
        r1 = r4.a;
        r1 = r1.a();
        r0.b(r1);
        r0 = r5.a();
        r1 = r6.h();
        r0.c(r1);
        r0 = r5.a();
        r1 = r6.e();
        r1 = r1.a();
        r0.a(r1);
        r0 = r6.d();
        r0 = r0.a();
        if (r0 == 0) goto L_0x00e9;
    L_0x00d1:
        r0 = r6.d();
        r0 = r0.c();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r1 = org.whispersystems.G.a;
        if (r0 == r1) goto L_0x00e9;
    L_0x00e3:
        r0 = r6.d();
        goto L_0x0020;
    L_0x00e9:
        r0 = org.whispersystems.o.d();
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.n.c(org.whispersystems.b0, org.whispersystems.w):org.whispersystems.o");
    }
}
