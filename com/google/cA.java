package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cA extends c_ implements eh {
    private boolean f;
    private Object g;
    private List h;
    private boolean i;
    private fv j;
    private A k;
    private boolean l;
    private Object m;
    private Object n;
    private boolean o;
    private int p;
    private boolean q;

    public il m360mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fO m353buildPartial() {
        return e();
    }

    public int a() {
        try {
            return this.j == null ? this.h.size() : this.j.d();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cU e() {
        /*
        r5 = this;
        r0 = 1;
        r2 = new com.google.cU;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.p;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x00b2;
    L_0x000e:
        r1 = r5.m;
        com.google.cU.b(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.g;
        com.google.cU.a(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0026;
    L_0x0024:
        r0 = r0 | 4;
    L_0x0026:
        r1 = r5.i;
        com.google.cU.b(r2, r1);
        r1 = r3 & 8;
        r4 = 8;
        if (r1 != r4) goto L_0x0033;
    L_0x0031:
        r0 = r0 | 8;
    L_0x0033:
        r1 = r5.q;
        com.google.cU.a(r2, r1);
        r1 = r3 & 16;
        r4 = 16;
        if (r1 != r4) goto L_0x0040;
    L_0x003e:
        r0 = r0 | 16;
    L_0x0040:
        r1 = r5.k;
        com.google.cU.a(r2, r1);
        r1 = r3 & 32;
        r4 = 32;
        if (r1 != r4) goto L_0x004d;
    L_0x004b:
        r0 = r0 | 32;
    L_0x004d:
        r1 = r5.n;
        com.google.cU.c(r2, r1);
        r1 = r3 & 64;
        r4 = 64;
        if (r1 != r4) goto L_0x005a;
    L_0x0058:
        r0 = r0 | 64;
    L_0x005a:
        r1 = r5.o;
        com.google.cU.e(r2, r1);
        r1 = r3 & 128;
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r4) goto L_0x0067;
    L_0x0065:
        r0 = r0 | 128;
    L_0x0067:
        r1 = r5.f;
        com.google.cU.c(r2, r1);
        r1 = r3 & 256;
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r1 != r3) goto L_0x0074;
    L_0x0072:
        r0 = r0 | 256;
    L_0x0074:
        r1 = r5.l;	 Catch:{ NullPointerException -> 0x00ac }
        com.google.cU.d(r2, r1);	 Catch:{ NullPointerException -> 0x00ac }
        r1 = r5.j;	 Catch:{ NullPointerException -> 0x00ac }
        if (r1 != 0) goto L_0x009c;
    L_0x007d:
        r1 = r5.p;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = r1 & 512;
        r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r1 != r3) goto L_0x0093;
    L_0x0085:
        r1 = r5.h;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ NullPointerException -> 0x00ae }
        r5.h = r1;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = r5.p;	 Catch:{ NullPointerException -> 0x00ae }
        r1 = r1 & -513;
        r5.p = r1;	 Catch:{ NullPointerException -> 0x00ae }
    L_0x0093:
        r1 = r5.h;	 Catch:{ NullPointerException -> 0x00b0 }
        com.google.cU.a(r2, r1);	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = com.google.bA.b;	 Catch:{ NullPointerException -> 0x00b0 }
        if (r1 == 0) goto L_0x00a5;
    L_0x009c:
        r1 = r5.j;	 Catch:{ NullPointerException -> 0x00b0 }
        r1 = r1.f();	 Catch:{ NullPointerException -> 0x00b0 }
        com.google.cU.a(r2, r1);	 Catch:{ NullPointerException -> 0x00b0 }
    L_0x00a5:
        com.google.cU.a(r2, r0);
        r5.f();
        return r2;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cA.e():com.google.cU");
    }

    private void h() {
        try {
            if (bL.d) {
                j();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public fn getDescriptorForType() {
        return bh.F();
    }

    public ch m355clone() {
        return f();
    }

    public cA a(boolean z) {
        this.p |= 256;
        this.l = z;
        g();
        return this;
    }

    public fl m359mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fO m357getDefaultInstanceForType() {
        return b();
    }

    public cA c(boolean z) {
        this.p |= 128;
        this.f = z;
        g();
        return this;
    }

    public cA b(boolean z) {
        this.p |= 4;
        this.i = z;
        g();
        return this;
    }

    public cA a(ci ciVar) {
        try {
            if (ciVar instanceof cU) {
                this = a((cU) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cA a(A a) {
        if (a == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.p |= 16;
        this.k = a;
        g();
        return this;
    }

    public ch m358mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c_ m351b() {
        return f();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    static cA c() {
        return k();
    }

    public cJ m354clone() {
        return f();
    }

    private cA(ec ecVar) {
        super(ecVar);
        this.m = "";
        this.g = "";
        this.k = A.SPEED;
        this.n = "";
        this.h = Collections.emptyList();
        h();
    }

    public cA e(boolean z) {
        this.p |= 64;
        this.o = z;
        g();
        return this;
    }

    cA(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci build() {
        return d();
    }

    public cA d(boolean z) {
        this.p |= 8;
        this.q = z;
        g();
        return this;
    }

    private void i() {
        try {
            if ((this.p & 512) != 512) {
                this.h = new ArrayList(this.h);
                this.p |= 512;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private cA() {
        this.m = "";
        this.g = "";
        this.k = A.SPEED;
        this.n = "";
        this.h = Collections.emptyList();
        h();
    }

    public cA f() {
        return k().a(e());
    }

    public cU d() {
        Object e = e();
        try {
            if (e.isInitialized()) {
                return e;
            }
            throw a((ci) e);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public fO m352build() {
        return d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cA a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cU.s;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cU) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cU) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.a(r1);	 Catch:{ fN -> 0x0022 }
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cA.a(com.google.ad, com.google.h):com.google.cA");
    }

    public Object m356clone() {
        return f();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cA a(com.google.cU r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.cU.e();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.l();	 Catch:{ NullPointerException -> 0x0115 }
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = r4.p;	 Catch:{ NullPointerException -> 0x0115 }
        r2 = r2 | 1;
        r4.p = r2;	 Catch:{ NullPointerException -> 0x0115 }
        r2 = com.google.cU.b(r5);	 Catch:{ NullPointerException -> 0x0115 }
        r4.m = r2;	 Catch:{ NullPointerException -> 0x0115 }
        r4.g();	 Catch:{ NullPointerException -> 0x0115 }
    L_0x0021:
        r2 = r5.z();	 Catch:{ NullPointerException -> 0x0117 }
        if (r2 == 0) goto L_0x0036;
    L_0x0027:
        r2 = r4.p;	 Catch:{ NullPointerException -> 0x0117 }
        r2 = r2 | 2;
        r4.p = r2;	 Catch:{ NullPointerException -> 0x0117 }
        r2 = com.google.cU.c(r5);	 Catch:{ NullPointerException -> 0x0117 }
        r4.g = r2;	 Catch:{ NullPointerException -> 0x0117 }
        r4.g();	 Catch:{ NullPointerException -> 0x0117 }
    L_0x0036:
        r2 = r5.D();	 Catch:{ NullPointerException -> 0x0119 }
        if (r2 == 0) goto L_0x0043;
    L_0x003c:
        r2 = r5.v();	 Catch:{ NullPointerException -> 0x0119 }
        r4.b(r2);	 Catch:{ NullPointerException -> 0x0119 }
    L_0x0043:
        r2 = r5.j();	 Catch:{ NullPointerException -> 0x011b }
        if (r2 == 0) goto L_0x0050;
    L_0x0049:
        r2 = r5.q();	 Catch:{ NullPointerException -> 0x011b }
        r4.d(r2);	 Catch:{ NullPointerException -> 0x011b }
    L_0x0050:
        r2 = r5.b();	 Catch:{ NullPointerException -> 0x011d }
        if (r2 == 0) goto L_0x005d;
    L_0x0056:
        r2 = r5.E();	 Catch:{ NullPointerException -> 0x011d }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x011d }
    L_0x005d:
        r2 = r5.h();	 Catch:{ NullPointerException -> 0x011f }
        if (r2 == 0) goto L_0x0072;
    L_0x0063:
        r2 = r4.p;	 Catch:{ NullPointerException -> 0x011f }
        r2 = r2 | 32;
        r4.p = r2;	 Catch:{ NullPointerException -> 0x011f }
        r2 = com.google.cU.e(r5);	 Catch:{ NullPointerException -> 0x011f }
        r4.n = r2;	 Catch:{ NullPointerException -> 0x011f }
        r4.g();	 Catch:{ NullPointerException -> 0x011f }
    L_0x0072:
        r2 = r5.t();	 Catch:{ NullPointerException -> 0x0121 }
        if (r2 == 0) goto L_0x007f;
    L_0x0078:
        r2 = r5.g();	 Catch:{ NullPointerException -> 0x0121 }
        r4.e(r2);	 Catch:{ NullPointerException -> 0x0121 }
    L_0x007f:
        r2 = r5.k();	 Catch:{ NullPointerException -> 0x0123 }
        if (r2 == 0) goto L_0x008c;
    L_0x0085:
        r2 = r5.s();	 Catch:{ NullPointerException -> 0x0123 }
        r4.c(r2);	 Catch:{ NullPointerException -> 0x0123 }
    L_0x008c:
        r2 = r5.F();	 Catch:{ NullPointerException -> 0x0125 }
        if (r2 == 0) goto L_0x0099;
    L_0x0092:
        r2 = r5.d();	 Catch:{ NullPointerException -> 0x0125 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x0125 }
    L_0x0099:
        r2 = r4.j;	 Catch:{ NullPointerException -> 0x0127 }
        if (r2 != 0) goto L_0x00ce;
    L_0x009d:
        r2 = com.google.cU.a(r5);	 Catch:{ NullPointerException -> 0x0129 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0129 }
        if (r2 != 0) goto L_0x0109;
    L_0x00a7:
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x012b }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x012b }
        if (r2 == 0) goto L_0x00bd;
    L_0x00af:
        r2 = com.google.cU.a(r5);	 Catch:{ NullPointerException -> 0x012d }
        r4.h = r2;	 Catch:{ NullPointerException -> 0x012d }
        r2 = r4.p;	 Catch:{ NullPointerException -> 0x012d }
        r2 = r2 & -513;
        r4.p = r2;	 Catch:{ NullPointerException -> 0x012d }
        if (r1 == 0) goto L_0x00c9;
    L_0x00bd:
        r4.i();	 Catch:{ NullPointerException -> 0x012d }
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x012d }
        r3 = com.google.cU.a(r5);	 Catch:{ NullPointerException -> 0x012d }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x012d }
    L_0x00c9:
        r4.g();	 Catch:{ NullPointerException -> 0x012f }
        if (r1 == 0) goto L_0x0109;
    L_0x00ce:
        r2 = com.google.cU.a(r5);	 Catch:{ NullPointerException -> 0x0131 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0131 }
        if (r2 != 0) goto L_0x0109;
    L_0x00d8:
        r2 = r4.j;	 Catch:{ NullPointerException -> 0x0133 }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x0133 }
        if (r2 == 0) goto L_0x0100;
    L_0x00e0:
        r2 = r4.j;	 Catch:{ NullPointerException -> 0x0135 }
        r2.b();	 Catch:{ NullPointerException -> 0x0135 }
        r2 = 0;
        r4.j = r2;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = com.google.cU.a(r5);	 Catch:{ NullPointerException -> 0x0135 }
        r4.h = r2;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = r4.p;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = r2 & -513;
        r4.p = r2;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = com.google.bL.d;	 Catch:{ NullPointerException -> 0x0135 }
        if (r2 == 0) goto L_0x00fc;
    L_0x00f8:
        r0 = r4.j();	 Catch:{ NullPointerException -> 0x0135 }
    L_0x00fc:
        r4.j = r0;	 Catch:{ NullPointerException -> 0x0137 }
        if (r1 == 0) goto L_0x0109;
    L_0x0100:
        r0 = r4.j;	 Catch:{ NullPointerException -> 0x0137 }
        r1 = com.google.cU.a(r5);	 Catch:{ NullPointerException -> 0x0137 }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x0137 }
    L_0x0109:
        r4.a(r5);
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x0115:
        r0 = move-exception;
        throw r0;
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r0 = move-exception;
        throw r0;
    L_0x011b:
        r0 = move-exception;
        throw r0;
    L_0x011d:
        r0 = move-exception;
        throw r0;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r0 = move-exception;
        throw r0;
    L_0x0125:
        r0 = move-exception;
        throw r0;
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x012d }
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0135 }
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cA.a(com.google.cU):com.google.cA");
    }

    public cj a(int i) {
        try {
            return this.j == null ? (cj) this.h.get(i) : (cj) this.j.c(i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ci buildPartial() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isInitialized() {
        /*
        r4 = this;
        r1 = 0;
        r2 = com.google.bA.b;
        r0 = r1;
    L_0x0004:
        r3 = r4.a();
        if (r0 >= r3) goto L_0x001b;
    L_0x000a:
        r3 = r4.a(r0);	 Catch:{ NullPointerException -> 0x0015 }
        r3 = r3.isInitialized();	 Catch:{ NullPointerException -> 0x0015 }
        if (r3 != 0) goto L_0x0017;
    L_0x0014:
        return r1;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0004;
    L_0x001b:
        r0 = r4.d();	 Catch:{ NullPointerException -> 0x0023 }
        if (r0 == 0) goto L_0x0014;
    L_0x0021:
        r1 = 1;
        goto L_0x0014;
    L_0x0023:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cA.isInitialized():boolean");
    }

    private static cA k() {
        return new cA();
    }

    public c3 clone() {
        return f();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.G().a(cU.class, cA.class);
    }

    public cU b() {
        return cU.e();
    }

    public ci getDefaultInstanceForType() {
        return b();
    }

    private fv j() {
        try {
            if (this.j == null) {
                this.j = new fv(this.h, (this.p & 512) == 512, e(), a());
                this.h = null;
            }
            return this.j;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }
}
