package org.whispersystems;

import com.google.ad;
import com.google.bJ;
import com.google.c3;
import com.google.cJ;
import com.google.ch;
import com.google.ci;
import com.google.ec;
import com.google.fO;
import com.google.fl;
import com.google.fn;
import com.google.fv;
import com.google.h;
import com.google.hx;
import com.google.il;
import com.google.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aO extends cJ implements bA {
    private k e;
    private int f;
    private fv g;
    private List h;
    private a8 i;
    private hx j;
    private int k;
    private int l;
    private hx m;
    private k n;
    private int o;
    private hx p;
    private aF q;
    private int r;
    private Z s;
    private k t;
    private boolean u;
    private hx v;

    public Y j() {
        Object a = a();
        try {
            if (a.isInitialized()) {
                return a;
            }
            throw a((ci) a);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Y e() {
        return Y.M();
    }

    public aO c(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.o |= 2;
        this.v = hxVar;
        g();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO a(int r2, org.whispersystems.Z r3) {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x000e }
        if (r0 != 0) goto L_0x001f;
    L_0x0004:
        if (r3 != 0) goto L_0x0010;
    L_0x0006:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x000c }
        r0.<init>();	 Catch:{ NullPointerException -> 0x000c }
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x0010:
        r1.m();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x0025 }
        r0.set(r2, r3);	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x0025 }
        r0.a(r2, r3);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x0024:
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.a(int, org.whispersystems.Z):org.whispersystems.aO");
    }

    public aO b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.o |= 4;
        this.j = hxVar;
        g();
        return this;
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fO m1267buildPartial() {
        return a();
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO d(int r2) {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x0019 }
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r1.m();	 Catch:{ NullPointerException -> 0x001b }
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x001b }
        r0.remove(r2);	 Catch:{ NullPointerException -> 0x001b }
        r1.g();	 Catch:{ NullPointerException -> 0x001b }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001b }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x001b }
        r0.d(r2);	 Catch:{ NullPointerException -> 0x001b }
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.d(int):org.whispersystems.aO");
    }

    static aO k() {
        return b();
    }

    private aO(ec ecVar) {
        super(ecVar);
        this.v = hx.b;
        this.j = hx.b;
        this.m = hx.b;
        this.s = Z.a();
        this.h = Collections.emptyList();
        this.q = aF.f();
        this.i = a8.n();
        this.p = hx.b;
        h();
    }

    public aO a(int i) {
        this.o |= 1;
        this.r = i;
        g();
        return this;
    }

    private aO() {
        this.v = hx.b;
        this.j = hx.b;
        this.m = hx.b;
        this.s = Z.a();
        this.h = Collections.emptyList();
        this.q = aF.f();
        this.i = a8.n();
        this.p = hx.b;
        h();
    }

    public ci buildPartial() {
        return a();
    }

    public aO b(int i) {
        this.o |= 1024;
        this.k = i;
        g();
        return this;
    }

    private fv n() {
        try {
            if (this.g == null) {
                boolean z;
                List list = this.h;
                if ((this.o & 64) == 64) {
                    z = true;
                } else {
                    z = false;
                }
                this.g = new fv(list, z, e(), a());
                this.h = null;
            }
            return this.g;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public fn getDescriptorForType() {
        return a5.A();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.Y a() {
        /*
        r6 = this;
        r0 = 1;
        r2 = org.whispersystems.Y.r;
        r3 = new org.whispersystems.Y;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.o;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x0127;
    L_0x0010:
        r1 = r6.r;
        org.whispersystems.Y.c(r3, r1);
        r1 = r4 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x001c;
    L_0x001a:
        r0 = r0 | 2;
    L_0x001c:
        r1 = r6.v;
        org.whispersystems.Y.d(r3, r1);
        r1 = r4 & 4;
        r5 = 4;
        if (r1 != r5) goto L_0x0028;
    L_0x0026:
        r0 = r0 | 4;
    L_0x0028:
        r1 = r6.j;
        org.whispersystems.Y.c(r3, r1);
        r1 = r4 & 8;
        r5 = 8;
        if (r1 != r5) goto L_0x0035;
    L_0x0033:
        r0 = r0 | 8;
    L_0x0035:
        r1 = r6.m;
        org.whispersystems.Y.b(r3, r1);
        r1 = r4 & 16;
        r5 = 16;
        if (r1 != r5) goto L_0x0042;
    L_0x0040:
        r0 = r0 | 16;
    L_0x0042:
        r1 = r6.f;
        org.whispersystems.Y.e(r3, r1);
        r1 = r4 & 32;
        r5 = 32;
        if (r1 != r5) goto L_0x0124;
    L_0x004d:
        r1 = r0 | 32;
    L_0x004f:
        r0 = r6.t;	 Catch:{ NullPointerException -> 0x010e }
        if (r0 != 0) goto L_0x005a;
    L_0x0053:
        r0 = r6.s;	 Catch:{ NullPointerException -> 0x0110 }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x0110 }
        if (r2 == 0) goto L_0x0065;
    L_0x005a:
        r0 = r6.t;	 Catch:{ NullPointerException -> 0x0110 }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x0110 }
        r0 = (org.whispersystems.Z) r0;	 Catch:{ NullPointerException -> 0x0110 }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x0110 }
    L_0x0065:
        r0 = r6.g;	 Catch:{ NullPointerException -> 0x0112 }
        if (r0 != 0) goto L_0x0086;
    L_0x0069:
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x0114 }
        r0 = r0 & 64;
        r5 = 64;
        if (r0 != r5) goto L_0x007f;
    L_0x0071:
        r0 = r6.h;	 Catch:{ NullPointerException -> 0x0114 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ NullPointerException -> 0x0114 }
        r6.h = r0;	 Catch:{ NullPointerException -> 0x0114 }
        r0 = r6.o;	 Catch:{ NullPointerException -> 0x0114 }
        r0 = r0 & -65;
        r6.o = r0;	 Catch:{ NullPointerException -> 0x0114 }
    L_0x007f:
        r0 = r6.h;	 Catch:{ NullPointerException -> 0x0116 }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x0116 }
        if (r2 == 0) goto L_0x008f;
    L_0x0086:
        r0 = r6.g;	 Catch:{ NullPointerException -> 0x0116 }
        r0 = r0.f();	 Catch:{ NullPointerException -> 0x0116 }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x0116 }
    L_0x008f:
        r0 = r4 & 128;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 != r5) goto L_0x0097;
    L_0x0095:
        r1 = r1 | 64;
    L_0x0097:
        r0 = r6.n;	 Catch:{ NullPointerException -> 0x0118 }
        if (r0 != 0) goto L_0x00a2;
    L_0x009b:
        r0 = r6.q;	 Catch:{ NullPointerException -> 0x011a }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x011a }
        if (r2 == 0) goto L_0x00ad;
    L_0x00a2:
        r0 = r6.n;	 Catch:{ NullPointerException -> 0x011a }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x011a }
        r0 = (org.whispersystems.aF) r0;	 Catch:{ NullPointerException -> 0x011a }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x011a }
    L_0x00ad:
        r0 = r4 & 256;
        r5 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 != r5) goto L_0x00b5;
    L_0x00b3:
        r1 = r1 | 128;
    L_0x00b5:
        r0 = r6.e;	 Catch:{ NullPointerException -> 0x011c }
        if (r0 != 0) goto L_0x00c0;
    L_0x00b9:
        r0 = r6.i;	 Catch:{ NullPointerException -> 0x011e }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x011e }
        if (r2 == 0) goto L_0x00cb;
    L_0x00c0:
        r0 = r6.e;	 Catch:{ NullPointerException -> 0x011e }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x011e }
        r0 = (org.whispersystems.a8) r0;	 Catch:{ NullPointerException -> 0x011e }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x011e }
    L_0x00cb:
        r0 = r4 & 512;
        r5 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        if (r0 != r5) goto L_0x0122;
    L_0x00d1:
        r0 = r1 | 256;
    L_0x00d3:
        r1 = r6.l;
        org.whispersystems.Y.b(r3, r1);
        r1 = r4 & 1024;
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r1 != r5) goto L_0x00e0;
    L_0x00de:
        r0 = r0 | 512;
    L_0x00e0:
        r1 = r6.k;
        org.whispersystems.Y.d(r3, r1);
        r1 = r4 & 2048;
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r1 != r5) goto L_0x00ed;
    L_0x00eb:
        r0 = r0 | 1024;
    L_0x00ed:
        r1 = r6.u;
        org.whispersystems.Y.a(r3, r1);
        r1 = r4 & 4096;
        r4 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r1 != r4) goto L_0x00fa;
    L_0x00f8:
        r0 = r0 | 2048;
    L_0x00fa:
        r1 = r6.p;	 Catch:{ NullPointerException -> 0x0120 }
        org.whispersystems.Y.a(r3, r1);	 Catch:{ NullPointerException -> 0x0120 }
        org.whispersystems.Y.a(r3, r0);	 Catch:{ NullPointerException -> 0x0120 }
        r6.f();	 Catch:{ NullPointerException -> 0x0120 }
        r0 = org.whispersystems.a5.o;	 Catch:{ NullPointerException -> 0x0120 }
        if (r0 == 0) goto L_0x010d;
    L_0x0109:
        r0 = r2 + 1;
        org.whispersystems.Y.r = r0;	 Catch:{ NullPointerException -> 0x0120 }
    L_0x010d:
        return r3;
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;
    L_0x0116:
        r0 = move-exception;
        throw r0;
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x011a }
    L_0x011a:
        r0 = move-exception;
        throw r0;
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x011e }
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = r1;
        goto L_0x00d3;
    L_0x0124:
        r1 = r0;
        goto L_0x004f;
    L_0x0127:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.a():org.whispersystems.Y");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO b(org.whispersystems.Z r2) {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x000e }
        if (r0 != 0) goto L_0x001f;
    L_0x0004:
        if (r2 != 0) goto L_0x0010;
    L_0x0006:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x000c }
        r0.<init>();	 Catch:{ NullPointerException -> 0x000c }
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x0010:
        r1.m();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x0025 }
        r0.add(r2);	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x0025 }
        r0.a(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x0024:
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.b(org.whispersystems.Z):org.whispersystems.aO");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.Y.o;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.Y) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.Y) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.a(com.google.ad, com.google.h):org.whispersystems.aO");
    }

    public fl m1273mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public aO a(boolean z) {
        this.o |= 2048;
        this.u = z;
        g();
        return this;
    }

    public ci build() {
        return j();
    }

    private k l() {
        try {
            if (this.n == null) {
                this.n = new k(this.q, e(), a());
                this.q = null;
            }
            return this.n;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO a(org.whispersystems.Z r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.Y.r;
        r1 = r3.t;	 Catch:{ NullPointerException -> 0x003b }
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.o;	 Catch:{ NullPointerException -> 0x003d }
        r1 = r1 & 32;
        r2 = 32;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.s;	 Catch:{ NullPointerException -> 0x003f }
        r2 = org.whispersystems.Z.a();	 Catch:{ NullPointerException -> 0x003f }
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.s;	 Catch:{ NullPointerException -> 0x0041 }
        r1 = org.whispersystems.Z.b(r1);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.g();	 Catch:{ NullPointerException -> 0x0041 }
        r3.s = r1;	 Catch:{ NullPointerException -> 0x0041 }
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.s = r4;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x002a:
        r3.g();	 Catch:{ NullPointerException -> 0x0043 }
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.t;	 Catch:{ NullPointerException -> 0x0043 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0043 }
    L_0x0034:
        r0 = r3.o;
        r0 = r0 | 32;
        r3.o = r0;
        return r3;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.a(org.whispersystems.Z):org.whispersystems.aO");
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.c().a(Y.class, aO.class);
    }

    private void m() {
        try {
            if ((this.o & 64) != 64) {
                this.h = new ArrayList(this.h);
                this.o |= 64;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private k o() {
        try {
            if (this.e == null) {
                this.e = new k(this.i, e(), a());
                this.i = null;
            }
            return this.e;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO d() {
        /*
        r1 = this;
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x001d }
        if (r0 != 0) goto L_0x0011;
    L_0x0004:
        r0 = org.whispersystems.a8.n();	 Catch:{ NullPointerException -> 0x001f }
        r1.i = r0;	 Catch:{ NullPointerException -> 0x001f }
        r1.g();	 Catch:{ NullPointerException -> 0x001f }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001f }
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x001f }
        r0.f();	 Catch:{ NullPointerException -> 0x001f }
    L_0x0016:
        r0 = r1.o;
        r0 = r0 & -257;
        r1.o = r0;
        return r1;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.d():org.whispersystems.aO");
    }

    public final boolean isInitialized() {
        return true;
    }

    public aO a(ci ciVar) {
        try {
            if (ciVar instanceof Y) {
                this = a((Y) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    aO(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    private void h() {
        try {
            if (Y.b()) {
                i();
                n();
                l();
                o();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Object m1270clone() {
        return c();
    }

    private static aO b() {
        return new aO();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO a(org.whispersystems.a8 r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.Y.r;
        r1 = r3.e;	 Catch:{ NullPointerException -> 0x003b }
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.o;	 Catch:{ NullPointerException -> 0x003d }
        r1 = r1 & 256;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.i;	 Catch:{ NullPointerException -> 0x003f }
        r2 = org.whispersystems.a8.n();	 Catch:{ NullPointerException -> 0x003f }
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.i;	 Catch:{ NullPointerException -> 0x0041 }
        r1 = org.whispersystems.a8.a(r1);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.a();	 Catch:{ NullPointerException -> 0x0041 }
        r3.i = r1;	 Catch:{ NullPointerException -> 0x0041 }
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.i = r4;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x002a:
        r3.g();	 Catch:{ NullPointerException -> 0x0043 }
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.e;	 Catch:{ NullPointerException -> 0x0043 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0043 }
    L_0x0034:
        r0 = r3.o;
        r0 = r0 | 256;
        r3.o = r0;
        return r3;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.a(org.whispersystems.a8):org.whispersystems.aO");
    }

    public aO c() {
        return b().a(a());
    }

    public il m1274mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aO a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.o |= 8;
        this.m = hxVar;
        g();
        return this;
    }

    public ch m1269clone() {
        return c();
    }

    public cJ m1268clone() {
        return c();
    }

    public fO m1271getDefaultInstanceForType() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO c(org.whispersystems.Z r2) {
        /*
        r1 = this;
        r0 = r1.t;	 Catch:{ NullPointerException -> 0x000e }
        if (r0 != 0) goto L_0x0019;
    L_0x0004:
        if (r2 != 0) goto L_0x0010;
    L_0x0006:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x000c }
        r0.<init>();	 Catch:{ NullPointerException -> 0x000c }
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x0010:
        r1.s = r2;	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r1.t;	 Catch:{ NullPointerException -> 0x0025 }
        r0.b(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x001e:
        r0 = r1.o;
        r0 = r0 | 32;
        r1.o = r0;
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.c(org.whispersystems.Z):org.whispersystems.aO");
    }

    public c3 clone() {
        return c();
    }

    private k i() {
        try {
            if (this.t == null) {
                this.t = new k(this.s, e(), a());
                this.s = null;
            }
            return this.t;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO a(org.whispersystems.aF r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.Y.r;
        r1 = r3.n;	 Catch:{ NullPointerException -> 0x003b }
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.o;	 Catch:{ NullPointerException -> 0x003d }
        r1 = r1 & 128;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.q;	 Catch:{ NullPointerException -> 0x003f }
        r2 = org.whispersystems.aF.f();	 Catch:{ NullPointerException -> 0x003f }
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.q;	 Catch:{ NullPointerException -> 0x0041 }
        r1 = org.whispersystems.aF.a(r1);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.f();	 Catch:{ NullPointerException -> 0x0041 }
        r3.q = r1;	 Catch:{ NullPointerException -> 0x0041 }
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.q = r4;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x002a:
        r3.g();	 Catch:{ NullPointerException -> 0x0043 }
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.n;	 Catch:{ NullPointerException -> 0x0043 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0043 }
    L_0x0034:
        r0 = r3.o;
        r0 = r0 | 128;
        r3.o = r0;
        return r3;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.a(org.whispersystems.aF):org.whispersystems.aO");
    }

    public ch m1272mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fO m1266build() {
        return j();
    }

    public aO e(int i) {
        this.o |= 16;
        this.f = i;
        g();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO a(org.whispersystems.Y r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = org.whispersystems.Y.r;
        r2 = org.whispersystems.Y.M();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.x();	 Catch:{ NullPointerException -> 0x0123 }
        if (r2 == 0) goto L_0x0019;
    L_0x0012:
        r2 = r5.m();	 Catch:{ NullPointerException -> 0x0123 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x0123 }
    L_0x0019:
        r2 = r5.r();	 Catch:{ NullPointerException -> 0x0125 }
        if (r2 == 0) goto L_0x0026;
    L_0x001f:
        r2 = r5.d();	 Catch:{ NullPointerException -> 0x0125 }
        r4.c(r2);	 Catch:{ NullPointerException -> 0x0125 }
    L_0x0026:
        r2 = r5.c();	 Catch:{ NullPointerException -> 0x0127 }
        if (r2 == 0) goto L_0x0033;
    L_0x002c:
        r2 = r5.K();	 Catch:{ NullPointerException -> 0x0127 }
        r4.b(r2);	 Catch:{ NullPointerException -> 0x0127 }
    L_0x0033:
        r2 = r5.s();	 Catch:{ NullPointerException -> 0x0129 }
        if (r2 == 0) goto L_0x0040;
    L_0x0039:
        r2 = r5.o();	 Catch:{ NullPointerException -> 0x0129 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x0129 }
    L_0x0040:
        r2 = r5.z();	 Catch:{ NullPointerException -> 0x012b }
        if (r2 == 0) goto L_0x004d;
    L_0x0046:
        r2 = r5.D();	 Catch:{ NullPointerException -> 0x012b }
        r4.e(r2);	 Catch:{ NullPointerException -> 0x012b }
    L_0x004d:
        r2 = r5.G();	 Catch:{ NullPointerException -> 0x012d }
        if (r2 == 0) goto L_0x005a;
    L_0x0053:
        r2 = r5.k();	 Catch:{ NullPointerException -> 0x012d }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x012d }
    L_0x005a:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x012f }
        if (r2 != 0) goto L_0x008f;
    L_0x005e:
        r2 = org.whispersystems.Y.b(r5);	 Catch:{ NullPointerException -> 0x0131 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0131 }
        if (r2 != 0) goto L_0x00cc;
    L_0x0068:
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x0133 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0133 }
        if (r2 == 0) goto L_0x007e;
    L_0x0070:
        r2 = org.whispersystems.Y.b(r5);	 Catch:{ NullPointerException -> 0x0135 }
        r4.h = r2;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = r4.o;	 Catch:{ NullPointerException -> 0x0135 }
        r2 = r2 & -65;
        r4.o = r2;	 Catch:{ NullPointerException -> 0x0135 }
        if (r1 == 0) goto L_0x008a;
    L_0x007e:
        r4.m();	 Catch:{ NullPointerException -> 0x0135 }
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x0135 }
        r3 = org.whispersystems.Y.b(r5);	 Catch:{ NullPointerException -> 0x0135 }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x0135 }
    L_0x008a:
        r4.g();	 Catch:{ NullPointerException -> 0x0137 }
        if (r1 == 0) goto L_0x00cc;
    L_0x008f:
        r2 = org.whispersystems.Y.b(r5);	 Catch:{ NullPointerException -> 0x0139 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0139 }
        if (r2 != 0) goto L_0x00cc;
    L_0x0099:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x013b }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x013b }
        if (r2 == 0) goto L_0x00c3;
    L_0x00a1:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x013d }
        r2.b();	 Catch:{ NullPointerException -> 0x013d }
        r2 = 0;
        r4.g = r2;	 Catch:{ NullPointerException -> 0x013d }
        r2 = org.whispersystems.Y.b(r5);	 Catch:{ NullPointerException -> 0x013d }
        r4.h = r2;	 Catch:{ NullPointerException -> 0x013d }
        r2 = r4.o;	 Catch:{ NullPointerException -> 0x013d }
        r2 = r2 & -65;
        r4.o = r2;	 Catch:{ NullPointerException -> 0x013d }
        r2 = org.whispersystems.Y.j();	 Catch:{ NullPointerException -> 0x013d }
        if (r2 == 0) goto L_0x00bf;
    L_0x00bb:
        r0 = r4.n();	 Catch:{ NullPointerException -> 0x013d }
    L_0x00bf:
        r4.g = r0;	 Catch:{ NullPointerException -> 0x013f }
        if (r1 == 0) goto L_0x00cc;
    L_0x00c3:
        r0 = r4.g;	 Catch:{ NullPointerException -> 0x013f }
        r1 = org.whispersystems.Y.b(r5);	 Catch:{ NullPointerException -> 0x013f }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x013f }
    L_0x00cc:
        r0 = r5.i();	 Catch:{ NullPointerException -> 0x0141 }
        if (r0 == 0) goto L_0x00d9;
    L_0x00d2:
        r0 = r5.L();	 Catch:{ NullPointerException -> 0x0141 }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x0141 }
    L_0x00d9:
        r0 = r5.B();	 Catch:{ NullPointerException -> 0x0143 }
        if (r0 == 0) goto L_0x00e6;
    L_0x00df:
        r0 = r5.y();	 Catch:{ NullPointerException -> 0x0143 }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x0143 }
    L_0x00e6:
        r0 = r5.p();	 Catch:{ NullPointerException -> 0x0145 }
        if (r0 == 0) goto L_0x00f3;
    L_0x00ec:
        r0 = r5.h();	 Catch:{ NullPointerException -> 0x0145 }
        r4.c(r0);	 Catch:{ NullPointerException -> 0x0145 }
    L_0x00f3:
        r0 = r5.C();	 Catch:{ NullPointerException -> 0x0147 }
        if (r0 == 0) goto L_0x0100;
    L_0x00f9:
        r0 = r5.F();	 Catch:{ NullPointerException -> 0x0147 }
        r4.b(r0);	 Catch:{ NullPointerException -> 0x0147 }
    L_0x0100:
        r0 = r5.q();	 Catch:{ NullPointerException -> 0x0149 }
        if (r0 == 0) goto L_0x010d;
    L_0x0106:
        r0 = r5.t();	 Catch:{ NullPointerException -> 0x0149 }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x0149 }
    L_0x010d:
        r0 = r5.g();	 Catch:{ NullPointerException -> 0x014b }
        if (r0 == 0) goto L_0x011a;
    L_0x0113:
        r0 = r5.f();	 Catch:{ NullPointerException -> 0x014b }
        r4.d(r0);	 Catch:{ NullPointerException -> 0x014b }
    L_0x011a:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x0123:
        r0 = move-exception;
        throw r0;
    L_0x0125:
        r0 = move-exception;
        throw r0;
    L_0x0127:
        r0 = move-exception;
        throw r0;
    L_0x0129:
        r0 = move-exception;
        throw r0;
    L_0x012b:
        r0 = move-exception;
        throw r0;
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
        throw r0;	 Catch:{ NullPointerException -> 0x0139 }
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x013b }
    L_0x013b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x013d }
    L_0x013d:
        r0 = move-exception;
        throw r0;
    L_0x013f:
        r0 = move-exception;
        throw r0;
    L_0x0141:
        r0 = move-exception;
        throw r0;
    L_0x0143:
        r0 = move-exception;
        throw r0;
    L_0x0145:
        r0 = move-exception;
        throw r0;
    L_0x0147:
        r0 = move-exception;
        throw r0;
    L_0x0149:
        r0 = move-exception;
        throw r0;
    L_0x014b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.a(org.whispersystems.Y):org.whispersystems.aO");
    }

    public aO d(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.o |= 4096;
        this.p = hxVar;
        g();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aO b(org.whispersystems.a8 r2) {
        /*
        r1 = this;
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x000e }
        if (r0 != 0) goto L_0x0019;
    L_0x0004:
        if (r2 != 0) goto L_0x0010;
    L_0x0006:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x000c }
        r0.<init>();	 Catch:{ NullPointerException -> 0x000c }
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x0010:
        r1.i = r2;	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x0025 }
        r0.b(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x001e:
        r0 = r1.o;
        r0 = r0 | 256;
        r1.o = r0;
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aO.b(org.whispersystems.a8):org.whispersystems.aO");
    }

    public aO c(int i) {
        this.o |= 512;
        this.l = i;
        g();
        return this;
    }
}
