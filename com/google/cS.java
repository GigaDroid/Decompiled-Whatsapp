package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cS extends cJ implements hc {
    private List e;
    private k f;
    private List g;
    private List h;
    private List i;
    private fv j;
    private k k;
    private Object l;
    private fv m;
    private List n;
    private cU o;
    private fv p;
    private fv q;
    private Object r;
    private bg s;
    private fs t;
    private int u;
    private List v;

    private fv m() {
        if (this.p == null) {
            boolean z;
            List list = this.g;
            if ((this.u & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            this.p = new fv(list, z, e(), a());
            this.g = null;
        }
        return this.p;
    }

    public int s() {
        return this.m == null ? this.i.size() : this.m.d();
    }

    private void x() {
        if ((this.u & 4) != 4) {
            this.t = new cy(this.t);
            this.u |= 4;
        }
    }

    public Object m321clone() {
        return y();
    }

    public cS a(ci ciVar) {
        if (ciVar instanceof bB) {
            return a((bB) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    private fv t() {
        if (this.j == null) {
            boolean z;
            List list = this.e;
            if ((this.u & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            this.j = new fv(list, z, e(), a());
            this.e = null;
        }
        return this.j;
    }

    public ci getDefaultInstanceForType() {
        return B();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cS a(com.google.cU r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.k;
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.u;
        r1 = r1 & 512;
        r2 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.o;
        r2 = com.google.cU.e();
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.o;
        r1 = com.google.cU.d(r1);
        r1 = r1.a(r4);
        r1 = r1.e();
        r3.o = r1;
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.o = r4;
    L_0x002a:
        r3.g();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.k;
        r0.a(r4);
    L_0x0034:
        r0 = r3.u;
        r0 = r0 | 512;
        r3.u = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cS.a(com.google.cU):com.google.cS");
    }

    public bv b(int i) {
        return this.q == null ? (bv) this.h.get(i) : (bv) this.q.c(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.bB i() {
        /*
        r6 = this;
        r0 = 1;
        r2 = com.google.bA.b;
        r3 = new com.google.bB;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.u;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x0160;
    L_0x0010:
        r1 = r6.l;
        com.google.bB.b(r3, r1);
        r1 = r4 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x001c;
    L_0x001a:
        r0 = r0 | 2;
    L_0x001c:
        r1 = r6.r;
        com.google.bB.a(r3, r1);
        r1 = r6.u;
        r1 = r1 & 4;
        r5 = 4;
        if (r1 != r5) goto L_0x0037;
    L_0x0028:
        r1 = new com.google.Z;
        r5 = r6.t;
        r1.<init>(r5);
        r6.t = r1;
        r1 = r6.u;
        r1 = r1 & -5;
        r6.u = r1;
    L_0x0037:
        r1 = r6.t;
        com.google.bB.a(r3, r1);
        r1 = r6.u;
        r1 = r1 & 8;
        r5 = 8;
        if (r1 != r5) goto L_0x0052;
    L_0x0044:
        r1 = r6.n;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.n = r1;
        r1 = r6.u;
        r1 = r1 & -9;
        r6.u = r1;
    L_0x0052:
        r1 = r6.n;
        com.google.bB.a(r3, r1);
        r1 = r6.u;
        r1 = r1 & 16;
        r5 = 16;
        if (r1 != r5) goto L_0x006d;
    L_0x005f:
        r1 = r6.v;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.v = r1;
        r1 = r6.u;
        r1 = r1 & -17;
        r6.u = r1;
    L_0x006d:
        r1 = r6.v;
        com.google.bB.d(r3, r1);
        r1 = r6.j;
        if (r1 != 0) goto L_0x0093;
    L_0x0076:
        r1 = r6.u;
        r1 = r1 & 32;
        r5 = 32;
        if (r1 != r5) goto L_0x008c;
    L_0x007e:
        r1 = r6.e;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.e = r1;
        r1 = r6.u;
        r1 = r1 & -33;
        r6.u = r1;
    L_0x008c:
        r1 = r6.e;
        com.google.bB.b(r3, r1);
        if (r2 == 0) goto L_0x009c;
    L_0x0093:
        r1 = r6.j;
        r1 = r1.f();
        com.google.bB.b(r3, r1);
    L_0x009c:
        r1 = r6.q;
        if (r1 != 0) goto L_0x00bd;
    L_0x00a0:
        r1 = r6.u;
        r1 = r1 & 64;
        r5 = 64;
        if (r1 != r5) goto L_0x00b6;
    L_0x00a8:
        r1 = r6.h;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.h = r1;
        r1 = r6.u;
        r1 = r1 & -65;
        r6.u = r1;
    L_0x00b6:
        r1 = r6.h;
        com.google.bB.f(r3, r1);
        if (r2 == 0) goto L_0x00c6;
    L_0x00bd:
        r1 = r6.q;
        r1 = r1.f();
        com.google.bB.f(r3, r1);
    L_0x00c6:
        r1 = r6.p;
        if (r1 != 0) goto L_0x00e7;
    L_0x00ca:
        r1 = r6.u;
        r1 = r1 & 128;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r5) goto L_0x00e0;
    L_0x00d2:
        r1 = r6.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.g = r1;
        r1 = r6.u;
        r1 = r1 & -129;
        r6.u = r1;
    L_0x00e0:
        r1 = r6.g;
        com.google.bB.e(r3, r1);
        if (r2 == 0) goto L_0x00f0;
    L_0x00e7:
        r1 = r6.p;
        r1 = r1.f();
        com.google.bB.e(r3, r1);
    L_0x00f0:
        r1 = r6.m;
        if (r1 != 0) goto L_0x0111;
    L_0x00f4:
        r1 = r6.u;
        r1 = r1 & 256;
        r5 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r1 != r5) goto L_0x010a;
    L_0x00fc:
        r1 = r6.i;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.i = r1;
        r1 = r6.u;
        r1 = r1 & -257;
        r6.u = r1;
    L_0x010a:
        r1 = r6.i;
        com.google.bB.c(r3, r1);
        if (r2 == 0) goto L_0x011a;
    L_0x0111:
        r1 = r6.m;
        r1 = r1.f();
        com.google.bB.c(r3, r1);
    L_0x011a:
        r1 = r4 & 512;
        r5 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r1 != r5) goto L_0x015e;
    L_0x0120:
        r0 = r0 | 4;
        r1 = r0;
    L_0x0123:
        r0 = r6.k;
        if (r0 != 0) goto L_0x012e;
    L_0x0127:
        r0 = r6.o;
        com.google.bB.a(r3, r0);
        if (r2 == 0) goto L_0x0139;
    L_0x012e:
        r0 = r6.k;
        r0 = r0.e();
        r0 = (com.google.cU) r0;
        com.google.bB.a(r3, r0);
    L_0x0139:
        r0 = r4 & 1024;
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r0 != r4) goto L_0x0141;
    L_0x013f:
        r1 = r1 | 8;
    L_0x0141:
        r0 = r6.f;
        if (r0 != 0) goto L_0x014c;
    L_0x0145:
        r0 = r6.s;
        com.google.bB.a(r3, r0);
        if (r2 == 0) goto L_0x0157;
    L_0x014c:
        r0 = r6.f;
        r0 = r0.e();
        r0 = (com.google.bg) r0;
        com.google.bB.a(r3, r0);
    L_0x0157:
        com.google.bB.a(r3, r1);
        r6.f();
        return r3;
    L_0x015e:
        r1 = r0;
        goto L_0x0123;
    L_0x0160:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cS.i():com.google.bB");
    }

    cS(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public ch m320clone() {
        return y();
    }

    private k l() {
        if (this.f == null) {
            this.f = new k(this.s, e(), a());
            this.s = null;
        }
        return this.f;
    }

    private void j() {
        if ((this.u & 256) != 256) {
            this.i = new ArrayList(this.i);
            this.u |= 256;
        }
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private void k() {
        if ((this.u & 32) != 32) {
            this.e = new ArrayList(this.e);
            this.u |= 32;
        }
    }

    public bB B() {
        return bB.t();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cS a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.bB.y;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (com.google.bB) r0;	 Catch:{ fN -> 0x0011 }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x000f }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.bB) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001e:
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r4.a(r1);	 Catch:{ fN -> 0x0024 }
    L_0x0023:
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cS.a(com.google.ad, com.google.h):com.google.cS");
    }

    public ci buildPartial() {
        return i();
    }

    private cS() {
        this.l = "";
        this.r = "";
        this.t = cy.a;
        this.n = Collections.emptyList();
        this.v = Collections.emptyList();
        this.e = Collections.emptyList();
        this.h = Collections.emptyList();
        this.g = Collections.emptyList();
        this.i = Collections.emptyList();
        this.o = cU.e();
        this.s = bg.d();
        d();
    }

    private void p() {
        if ((this.u & 128) != 128) {
            this.g = new ArrayList(this.g);
            this.u |= 128;
        }
    }

    private static cS A() {
        return new cS();
    }

    private void d() {
        if (bL.d) {
            t();
            q();
            m();
            o();
            g();
            l();
        }
    }

    public int u() {
        return this.j == null ? this.e.size() : this.j.d();
    }

    private k g() {
        if (this.k == null) {
            this.k = new k(this.o, e(), a());
            this.o = null;
        }
        return this.k;
    }

    public cS y() {
        return A().a(i());
    }

    public il m325mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private cS(ec ecVar) {
        super(ecVar);
        this.l = "";
        this.r = "";
        this.t = cy.a;
        this.n = Collections.emptyList();
        this.v = Collections.emptyList();
        this.e = Collections.emptyList();
        this.h = Collections.emptyList();
        this.g = Collections.emptyList();
        this.i = Collections.emptyList();
        this.o = cU.e();
        this.s = bg.d();
        d();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < u()) {
            if (d(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < v()) {
            if (b(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < h()) {
            if (c(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < s()) {
            if (a(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        if (!e() || f().isInitialized()) {
            return true;
        }
        return false;
    }

    public int h() {
        return this.p == null ? this.g.size() : this.p.d();
    }

    public br d(int i) {
        return this.j == null ? (br) this.e.get(i) : (br) this.j.c(i);
    }

    public fO m317build() {
        return a();
    }

    public int v() {
        return this.q == null ? this.h.size() : this.q.d();
    }

    private void w() {
        if ((this.u & 64) != 64) {
            this.h = new ArrayList(this.h);
            this.u |= 64;
        }
    }

    public fO m322getDefaultInstanceForType() {
        return B();
    }

    public fn getDescriptorForType() {
        return bh.l();
    }

    public bx c(int i) {
        return this.p == null ? (bx) this.g.get(i) : (bx) this.p.c(i);
    }

    public b6 a(int i) {
        return this.m == null ? (b6) this.i.get(i) : (b6) this.m.c(i);
    }

    public c3 clone() {
        return y();
    }

    private fv q() {
        if (this.q == null) {
            boolean z;
            List list = this.h;
            if ((this.u & 64) == 64) {
                z = true;
            } else {
                z = false;
            }
            this.q = new fv(list, z, e(), a());
            this.h = null;
        }
        return this.q;
    }

    public fl m324mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public bB a() {
        Object i = i();
        if (i.isInitialized()) {
            return i;
        }
        throw a((ci) i);
    }

    public cU f() {
        if (this.k == null) {
            return this.o;
        }
        return (cU) this.k.c();
    }

    public boolean e() {
        return (this.u & 512) == 512;
    }

    public cJ m319clone() {
        return y();
    }

    private void r() {
        if ((this.u & 16) != 16) {
            this.v = new ArrayList(this.v);
            this.u |= 16;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cS a(com.google.bg r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.f;
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.u;
        r1 = r1 & 1024;
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.s;
        r2 = com.google.bg.d();
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.s;
        r1 = com.google.bg.a(r1);
        r1 = r1.a(r4);
        r1 = r1.h();
        r3.s = r1;
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.s = r4;
    L_0x002a:
        r3.g();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.f;
        r0.a(r4);
    L_0x0034:
        r0 = r3.u;
        r0 = r0 | 1024;
        r3.u = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cS.a(com.google.bg):com.google.cS");
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.j().a(bB.class, cS.class);
    }

    public ch m323mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cS a(com.google.bB r5) {
        /*
        r4 = this;
        r1 = 0;
        r2 = com.google.bA.b;
        r0 = com.google.bB.t();
        if (r5 != r0) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = r5.l();
        if (r0 == 0) goto L_0x001f;
    L_0x0010:
        r0 = r4.u;
        r0 = r0 | 1;
        r4.u = r0;
        r0 = com.google.bB.j(r5);
        r4.l = r0;
        r4.g();
    L_0x001f:
        r0 = r5.B();
        if (r0 == 0) goto L_0x0034;
    L_0x0025:
        r0 = r4.u;
        r0 = r0 | 2;
        r4.u = r0;
        r0 = com.google.bB.e(r5);
        r4.r = r0;
        r4.g();
    L_0x0034:
        r0 = com.google.bB.i(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0063;
    L_0x003e:
        r0 = r4.t;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0054;
    L_0x0046:
        r0 = com.google.bB.i(r5);
        r4.t = r0;
        r0 = r4.u;
        r0 = r0 & -5;
        r4.u = r0;
        if (r2 == 0) goto L_0x0060;
    L_0x0054:
        r4.x();
        r0 = r4.t;
        r3 = com.google.bB.i(r5);
        r0.addAll(r3);
    L_0x0060:
        r4.g();
    L_0x0063:
        r0 = com.google.bB.f(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0092;
    L_0x006d:
        r0 = r4.n;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0083;
    L_0x0075:
        r0 = com.google.bB.f(r5);
        r4.n = r0;
        r0 = r4.u;
        r0 = r0 & -9;
        r4.u = r0;
        if (r2 == 0) goto L_0x008f;
    L_0x0083:
        r4.n();
        r0 = r4.n;
        r3 = com.google.bB.f(r5);
        r0.addAll(r3);
    L_0x008f:
        r4.g();
    L_0x0092:
        r0 = com.google.bB.a(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00c1;
    L_0x009c:
        r0 = r4.v;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00b2;
    L_0x00a4:
        r0 = com.google.bB.a(r5);
        r4.v = r0;
        r0 = r4.u;
        r0 = r0 & -17;
        r4.u = r0;
        if (r2 == 0) goto L_0x00be;
    L_0x00b2:
        r4.r();
        r0 = r4.v;
        r3 = com.google.bB.a(r5);
        r0.addAll(r3);
    L_0x00be:
        r4.g();
    L_0x00c1:
        r0 = r4.j;
        if (r0 != 0) goto L_0x00f6;
    L_0x00c5:
        r0 = com.google.bB.d(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0130;
    L_0x00cf:
        r0 = r4.e;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00e5;
    L_0x00d7:
        r0 = com.google.bB.d(r5);
        r4.e = r0;
        r0 = r4.u;
        r0 = r0 & -33;
        r4.u = r0;
        if (r2 == 0) goto L_0x00f1;
    L_0x00e5:
        r4.k();
        r0 = r4.e;
        r3 = com.google.bB.d(r5);
        r0.addAll(r3);
    L_0x00f1:
        r4.g();
        if (r2 == 0) goto L_0x0130;
    L_0x00f6:
        r0 = com.google.bB.d(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0130;
    L_0x0100:
        r0 = r4.j;
        r0 = r0.i();
        if (r0 == 0) goto L_0x0127;
    L_0x0108:
        r0 = r4.j;
        r0.b();
        r4.j = r1;
        r0 = com.google.bB.d(r5);
        r4.e = r0;
        r0 = r4.u;
        r0 = r0 & -33;
        r4.u = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x02a0;
    L_0x011f:
        r0 = r4.t();
    L_0x0123:
        r4.j = r0;
        if (r2 == 0) goto L_0x0130;
    L_0x0127:
        r0 = r4.j;
        r3 = com.google.bB.d(r5);
        r0.a(r3);
    L_0x0130:
        r0 = r4.q;
        if (r0 != 0) goto L_0x0165;
    L_0x0134:
        r0 = com.google.bB.b(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x019f;
    L_0x013e:
        r0 = r4.h;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0154;
    L_0x0146:
        r0 = com.google.bB.b(r5);
        r4.h = r0;
        r0 = r4.u;
        r0 = r0 & -65;
        r4.u = r0;
        if (r2 == 0) goto L_0x0160;
    L_0x0154:
        r4.w();
        r0 = r4.h;
        r3 = com.google.bB.b(r5);
        r0.addAll(r3);
    L_0x0160:
        r4.g();
        if (r2 == 0) goto L_0x019f;
    L_0x0165:
        r0 = com.google.bB.b(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x019f;
    L_0x016f:
        r0 = r4.q;
        r0 = r0.i();
        if (r0 == 0) goto L_0x0196;
    L_0x0177:
        r0 = r4.q;
        r0.b();
        r4.q = r1;
        r0 = com.google.bB.b(r5);
        r4.h = r0;
        r0 = r4.u;
        r0 = r0 & -65;
        r4.u = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x02a3;
    L_0x018e:
        r0 = r4.q();
    L_0x0192:
        r4.q = r0;
        if (r2 == 0) goto L_0x019f;
    L_0x0196:
        r0 = r4.q;
        r3 = com.google.bB.b(r5);
        r0.a(r3);
    L_0x019f:
        r0 = r4.p;
        if (r0 != 0) goto L_0x01d4;
    L_0x01a3:
        r0 = com.google.bB.h(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x020e;
    L_0x01ad:
        r0 = r4.g;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x01c3;
    L_0x01b5:
        r0 = com.google.bB.h(r5);
        r4.g = r0;
        r0 = r4.u;
        r0 = r0 & -129;
        r4.u = r0;
        if (r2 == 0) goto L_0x01cf;
    L_0x01c3:
        r4.p();
        r0 = r4.g;
        r3 = com.google.bB.h(r5);
        r0.addAll(r3);
    L_0x01cf:
        r4.g();
        if (r2 == 0) goto L_0x020e;
    L_0x01d4:
        r0 = com.google.bB.h(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x020e;
    L_0x01de:
        r0 = r4.p;
        r0 = r0.i();
        if (r0 == 0) goto L_0x0205;
    L_0x01e6:
        r0 = r4.p;
        r0.b();
        r4.p = r1;
        r0 = com.google.bB.h(r5);
        r4.g = r0;
        r0 = r4.u;
        r0 = r0 & -129;
        r4.u = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x02a6;
    L_0x01fd:
        r0 = r4.m();
    L_0x0201:
        r4.p = r0;
        if (r2 == 0) goto L_0x020e;
    L_0x0205:
        r0 = r4.p;
        r3 = com.google.bB.h(r5);
        r0.a(r3);
    L_0x020e:
        r0 = r4.m;
        if (r0 != 0) goto L_0x0243;
    L_0x0212:
        r0 = com.google.bB.c(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x027d;
    L_0x021c:
        r0 = r4.i;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0232;
    L_0x0224:
        r0 = com.google.bB.c(r5);
        r4.i = r0;
        r0 = r4.u;
        r0 = r0 & -257;
        r4.u = r0;
        if (r2 == 0) goto L_0x023e;
    L_0x0232:
        r4.j();
        r0 = r4.i;
        r3 = com.google.bB.c(r5);
        r0.addAll(r3);
    L_0x023e:
        r4.g();
        if (r2 == 0) goto L_0x027d;
    L_0x0243:
        r0 = com.google.bB.c(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x027d;
    L_0x024d:
        r0 = r4.m;
        r0 = r0.i();
        if (r0 == 0) goto L_0x0274;
    L_0x0255:
        r0 = r4.m;
        r0.b();
        r4.m = r1;
        r0 = com.google.bB.c(r5);
        r4.i = r0;
        r0 = r4.u;
        r0 = r0 & -257;
        r4.u = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x0270;
    L_0x026c:
        r1 = r4.o();
    L_0x0270:
        r4.m = r1;
        if (r2 == 0) goto L_0x027d;
    L_0x0274:
        r0 = r4.m;
        r1 = com.google.bB.c(r5);
        r0.a(r1);
    L_0x027d:
        r0 = r5.k();
        if (r0 == 0) goto L_0x028a;
    L_0x0283:
        r0 = r5.r();
        r4.a(r0);
    L_0x028a:
        r0 = r5.C();
        if (r0 == 0) goto L_0x0297;
    L_0x0290:
        r0 = r5.j();
        r4.a(r0);
    L_0x0297:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x02a0:
        r0 = r1;
        goto L_0x0123;
    L_0x02a3:
        r0 = r1;
        goto L_0x0192;
    L_0x02a6:
        r0 = r1;
        goto L_0x0201;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cS.a(com.google.bB):com.google.cS");
    }

    public ci build() {
        return a();
    }

    private fv o() {
        if (this.m == null) {
            boolean z;
            List list = this.i;
            if ((this.u & 256) == 256) {
                z = true;
            } else {
                z = false;
            }
            this.m = new fv(list, z, e(), a());
            this.i = null;
        }
        return this.m;
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    static cS z() {
        return A();
    }

    public fO m318buildPartial() {
        return i();
    }

    private void n() {
        if ((this.u & 8) != 8) {
            this.n = new ArrayList(this.n);
            this.u |= 8;
        }
    }
}
