package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cs extends c_ implements bZ {
    private int f;
    private fv g;
    private dp h;
    private boolean i;
    private boolean j;
    private List k;
    private boolean l;
    private Object m;
    private boolean n;

    public cs a(boolean z) {
        this.f |= 8;
        this.n = z;
        g();
        return this;
    }

    cs(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public cs c(boolean z) {
        this.f |= 4;
        this.l = z;
        g();
        return this;
    }

    public cs b(boolean z) {
        this.f |= 32;
        this.i = z;
        g();
        return this;
    }

    public ci getDefaultInstanceForType() {
        return j();
    }

    private void d() {
        try {
            if (bL.d) {
                i();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public cj a(int i) {
        try {
            return this.g == null ? (cj) this.k.get(i) : (cj) this.g.c(i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private cs() {
        this.h = dp.STRING;
        this.m = "";
        this.k = Collections.emptyList();
        d();
    }

    private void h() {
        try {
            if ((this.f & 64) != 64) {
                this.k = new ArrayList(this.k);
                this.f |= 64;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cY m() {
        Object k = k();
        try {
            if (k.isInitialized()) {
                return k;
            }
            throw a((ci) k);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c_ b() {
        return n();
    }

    public Object m264clone() {
        return n();
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
        r3 = r4.l();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cs.isInitialized():boolean");
    }

    public ch m266mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public int l() {
        try {
            return this.g == null ? this.k.size() : this.g.d();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private fv i() {
        try {
            if (this.g == null) {
                boolean z;
                List list = this.k;
                if ((this.f & 64) == 64) {
                    z = true;
                } else {
                    z = false;
                }
                this.g = new fv(list, z, e(), a());
                this.k = null;
            }
            return this.g;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public il m268mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fO m261buildPartial() {
        return k();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fl m267mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fO m265getDefaultInstanceForType() {
        return j();
    }

    public cY j() {
        return cY.w();
    }

    public cs d(boolean z) {
        this.f |= 2;
        this.j = z;
        g();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cY k() {
        /*
        r5 = this;
        r0 = 1;
        r2 = new com.google.cY;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.f;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x008b;
    L_0x000e:
        r1 = r5.h;
        com.google.cY.a(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.j;
        com.google.cY.b(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0026;
    L_0x0024:
        r0 = r0 | 4;
    L_0x0026:
        r1 = r5.l;
        com.google.cY.d(r2, r1);
        r1 = r3 & 8;
        r4 = 8;
        if (r1 != r4) goto L_0x0033;
    L_0x0031:
        r0 = r0 | 8;
    L_0x0033:
        r1 = r5.n;
        com.google.cY.c(r2, r1);
        r1 = r3 & 16;
        r4 = 16;
        if (r1 != r4) goto L_0x0040;
    L_0x003e:
        r0 = r0 | 16;
    L_0x0040:
        r1 = r5.m;
        com.google.cY.a(r2, r1);
        r1 = r3 & 32;
        r3 = 32;
        if (r1 != r3) goto L_0x004d;
    L_0x004b:
        r0 = r0 | 32;
    L_0x004d:
        r1 = r5.i;	 Catch:{ NullPointerException -> 0x0085 }
        com.google.cY.a(r2, r1);	 Catch:{ NullPointerException -> 0x0085 }
        r1 = r5.g;	 Catch:{ NullPointerException -> 0x0085 }
        if (r1 != 0) goto L_0x0075;
    L_0x0056:
        r1 = r5.f;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = r1 & 64;
        r3 = 64;
        if (r1 != r3) goto L_0x006c;
    L_0x005e:
        r1 = r5.k;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ NullPointerException -> 0x0087 }
        r5.k = r1;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = r5.f;	 Catch:{ NullPointerException -> 0x0087 }
        r1 = r1 & -65;
        r5.f = r1;	 Catch:{ NullPointerException -> 0x0087 }
    L_0x006c:
        r1 = r5.k;	 Catch:{ NullPointerException -> 0x0089 }
        com.google.cY.a(r2, r1);	 Catch:{ NullPointerException -> 0x0089 }
        r1 = com.google.bA.b;	 Catch:{ NullPointerException -> 0x0089 }
        if (r1 == 0) goto L_0x007e;
    L_0x0075:
        r1 = r5.g;	 Catch:{ NullPointerException -> 0x0089 }
        r1 = r1.f();	 Catch:{ NullPointerException -> 0x0089 }
        com.google.cY.a(r2, r1);	 Catch:{ NullPointerException -> 0x0089 }
    L_0x007e:
        com.google.cY.a(r2, r0);
        r5.f();
        return r2;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cs.k():com.google.cY");
    }

    public c3 clone() {
        return n();
    }

    private static cs a() {
        return new cs();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.o().a(cY.class, cs.class);
    }

    public ci buildPartial() {
        return k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cs a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cY.n;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cY) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cY) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cs.a(com.google.ad, com.google.h):com.google.cs");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cs a(com.google.cY r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.cY.w();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.c();	 Catch:{ NullPointerException -> 0x00de }
        if (r2 == 0) goto L_0x0019;
    L_0x0012:
        r2 = r5.p();	 Catch:{ NullPointerException -> 0x00de }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00de }
    L_0x0019:
        r2 = r5.g();	 Catch:{ NullPointerException -> 0x00e0 }
        if (r2 == 0) goto L_0x0026;
    L_0x001f:
        r2 = r5.o();	 Catch:{ NullPointerException -> 0x00e0 }
        r4.d(r2);	 Catch:{ NullPointerException -> 0x00e0 }
    L_0x0026:
        r2 = r5.e();	 Catch:{ NullPointerException -> 0x00e2 }
        if (r2 == 0) goto L_0x0033;
    L_0x002c:
        r2 = r5.t();	 Catch:{ NullPointerException -> 0x00e2 }
        r4.c(r2);	 Catch:{ NullPointerException -> 0x00e2 }
    L_0x0033:
        r2 = r5.d();	 Catch:{ NullPointerException -> 0x00e4 }
        if (r2 == 0) goto L_0x0040;
    L_0x0039:
        r2 = r5.n();	 Catch:{ NullPointerException -> 0x00e4 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00e4 }
    L_0x0040:
        r2 = r5.l();	 Catch:{ NullPointerException -> 0x00e6 }
        if (r2 == 0) goto L_0x0055;
    L_0x0046:
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x00e6 }
        r2 = r2 | 16;
        r4.f = r2;	 Catch:{ NullPointerException -> 0x00e6 }
        r2 = com.google.cY.b(r5);	 Catch:{ NullPointerException -> 0x00e6 }
        r4.m = r2;	 Catch:{ NullPointerException -> 0x00e6 }
        r4.g();	 Catch:{ NullPointerException -> 0x00e6 }
    L_0x0055:
        r2 = r5.m();	 Catch:{ NullPointerException -> 0x00e8 }
        if (r2 == 0) goto L_0x0062;
    L_0x005b:
        r2 = r5.x();	 Catch:{ NullPointerException -> 0x00e8 }
        r4.b(r2);	 Catch:{ NullPointerException -> 0x00e8 }
    L_0x0062:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00ea }
        if (r2 != 0) goto L_0x0097;
    L_0x0066:
        r2 = com.google.cY.c(r5);	 Catch:{ NullPointerException -> 0x00ec }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00ec }
        if (r2 != 0) goto L_0x00d2;
    L_0x0070:
        r2 = r4.k;	 Catch:{ NullPointerException -> 0x00ee }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00ee }
        if (r2 == 0) goto L_0x0086;
    L_0x0078:
        r2 = com.google.cY.c(r5);	 Catch:{ NullPointerException -> 0x00f0 }
        r4.k = r2;	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = r2 & -65;
        r4.f = r2;	 Catch:{ NullPointerException -> 0x00f0 }
        if (r1 == 0) goto L_0x0092;
    L_0x0086:
        r4.h();	 Catch:{ NullPointerException -> 0x00f0 }
        r2 = r4.k;	 Catch:{ NullPointerException -> 0x00f0 }
        r3 = com.google.cY.c(r5);	 Catch:{ NullPointerException -> 0x00f0 }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x00f0 }
    L_0x0092:
        r4.g();	 Catch:{ NullPointerException -> 0x00f2 }
        if (r1 == 0) goto L_0x00d2;
    L_0x0097:
        r2 = com.google.cY.c(r5);	 Catch:{ NullPointerException -> 0x00f4 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00f4 }
        if (r2 != 0) goto L_0x00d2;
    L_0x00a1:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00f6 }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x00f6 }
        if (r2 == 0) goto L_0x00c9;
    L_0x00a9:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00f8 }
        r2.b();	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = 0;
        r4.g = r2;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = com.google.cY.c(r5);	 Catch:{ NullPointerException -> 0x00f8 }
        r4.k = r2;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = r2 & -65;
        r4.f = r2;	 Catch:{ NullPointerException -> 0x00f8 }
        r2 = com.google.bL.d;	 Catch:{ NullPointerException -> 0x00f8 }
        if (r2 == 0) goto L_0x00c5;
    L_0x00c1:
        r0 = r4.i();	 Catch:{ NullPointerException -> 0x00f8 }
    L_0x00c5:
        r4.g = r0;	 Catch:{ NullPointerException -> 0x00fa }
        if (r1 == 0) goto L_0x00d2;
    L_0x00c9:
        r0 = r4.g;	 Catch:{ NullPointerException -> 0x00fa }
        r1 = com.google.cY.c(r5);	 Catch:{ NullPointerException -> 0x00fa }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x00fa }
    L_0x00d2:
        r4.a(r5);
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cs.a(com.google.cY):com.google.cs");
    }

    public cs a(dp dpVar) {
        if (dpVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.f |= 1;
        this.h = dpVar;
        g();
        return this;
    }

    static cs e() {
        return a();
    }

    private cs(ec ecVar) {
        super(ecVar);
        this.h = dp.STRING;
        this.m = "";
        this.k = Collections.emptyList();
        d();
    }

    public fn getDescriptorForType() {
        return bh.K();
    }

    public fO m260build() {
        return m();
    }

    public cJ m262clone() {
        return n();
    }

    public cs n() {
        return a().a(k());
    }

    public ci build() {
        return m();
    }

    public cs a(ci ciVar) {
        try {
            if (ciVar instanceof cY) {
                this = a((cY) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ch m263clone() {
        return n();
    }
}
