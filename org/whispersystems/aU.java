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
import com.google.h;
import com.google.il;
import com.google.k;

public final class aU extends cJ implements a {
    private k e;
    private int f;
    private K g;
    private K h;
    private k i;
    private int j;

    public cJ m1069clone() {
        return j();
    }

    public il m1075mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aU a(J j) {
        if (j != J.l()) {
            if (j.m()) {
                a(j.j());
            }
            if (j.c()) {
                a(j.h());
            }
            if (j.g()) {
                b(j.f());
            }
            a(j.getUnknownFields());
        }
        return this;
    }

    public ci buildPartial() {
        return e();
    }

    public J b() {
        return J.l();
    }

    public ch m1073mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.J e() {
        /*
        r8 = this;
        r2 = 0;
        r1 = 1;
        r4 = org.whispersystems.v.e;
        r5 = new org.whispersystems.J;
        r0 = 0;
        r5.<init>(r8, r0);
        r6 = r8.f;
        r0 = r6 & 1;
        if (r0 != r1) goto L_0x0062;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        r3 = r8.j;
        org.whispersystems.J.b(r5, r3);
        r3 = r6 & 2;
        r7 = 2;
        if (r3 != r7) goto L_0x0060;
    L_0x001b:
        r0 = r0 | 2;
        r3 = r0;
    L_0x001e:
        r0 = r8.e;
        if (r0 != 0) goto L_0x002f;
    L_0x0022:
        r0 = r8.g;
        org.whispersystems.J.b(r5, r0);
        if (r4 == 0) goto L_0x003a;
    L_0x0029:
        r0 = org.whispersystems.a5.o;
        if (r0 == 0) goto L_0x005e;
    L_0x002d:
        org.whispersystems.a5.o = r2;
    L_0x002f:
        r0 = r8.e;
        r0 = r0.e();
        r0 = (org.whispersystems.K) r0;
        org.whispersystems.J.b(r5, r0);
    L_0x003a:
        r0 = r6 & 4;
        r1 = 4;
        if (r0 != r1) goto L_0x0041;
    L_0x003f:
        r3 = r3 | 4;
    L_0x0041:
        r0 = r8.i;
        if (r0 != 0) goto L_0x004c;
    L_0x0045:
        r0 = r8.h;
        org.whispersystems.J.a(r5, r0);
        if (r4 == 0) goto L_0x0057;
    L_0x004c:
        r0 = r8.i;
        r0 = r0.e();
        r0 = (org.whispersystems.K) r0;
        org.whispersystems.J.a(r5, r0);
    L_0x0057:
        org.whispersystems.J.a(r5, r3);
        r8.f();
        return r5;
    L_0x005e:
        r2 = r1;
        goto L_0x002d;
    L_0x0060:
        r3 = r0;
        goto L_0x001e;
    L_0x0062:
        r0 = r2;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aU.e():org.whispersystems.J");
    }

    public fl m1074mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return v.b().a(J.class, aU.class);
    }

    public c3 clone() {
        return j();
    }

    public fn getDescriptorForType() {
        return v.c();
    }

    static aU k() {
        return d();
    }

    public Object m1071clone() {
        return j();
    }

    private aU(ec ecVar) {
        super(ecVar);
        this.g = K.l();
        this.h = K.l();
        h();
    }

    private k i() {
        if (this.i == null) {
            this.i = new k(this.h, e(), a());
            this.h = null;
        }
        return this.i;
    }

    public aU a(ci ciVar) {
        if (ciVar instanceof J) {
            return a((J) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private static aU d() {
        return new aU();
    }

    private k a() {
        if (this.e == null) {
            this.e = new k(this.g, e(), a());
            this.g = null;
        }
        return this.e;
    }

    public J c() {
        Object e = e();
        if (e.isInitialized()) {
            return e;
        }
        throw a((ci) e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aU a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.J.l;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.J) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.J) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aU.a(com.google.ad, com.google.h):org.whispersystems.aU");
    }

    public fO m1068buildPartial() {
        return e();
    }

    public ci build() {
        return c();
    }

    public aU j() {
        return d().a(e());
    }

    public final boolean isInitialized() {
        return true;
    }

    private aU() {
        this.g = K.l();
        this.h = K.l();
        h();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fO m1067build() {
        return c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aU a(org.whispersystems.K r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.v.e;
        r1 = r3.e;
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.f;
        r1 = r1 & 2;
        r2 = 2;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.g;
        r2 = org.whispersystems.K.l();
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.g;
        r1 = org.whispersystems.K.a(r1);
        r1 = r1.a(r4);
        r1 = r1.e();
        r3.g = r1;
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.g = r4;
    L_0x0029:
        r3.g();
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.e;
        r0.a(r4);
    L_0x0033:
        r0 = r3.f;
        r0 = r0 | 2;
        r3.f = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aU.a(org.whispersystems.K):org.whispersystems.aU");
    }

    private void h() {
        if (J.k()) {
            a();
            i();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aU b(org.whispersystems.al r3) {
        /*
        r2 = this;
        r0 = r2.i;
        if (r0 != 0) goto L_0x0011;
    L_0x0004:
        r0 = r3.f();
        r2.h = r0;
        r2.g();
        r0 = org.whispersystems.v.e;
        if (r0 == 0) goto L_0x001a;
    L_0x0011:
        r0 = r2.i;
        r1 = r3.f();
        r0.b(r1);
    L_0x001a:
        r0 = r2.f;
        r0 = r0 | 4;
        r2.f = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aU.b(org.whispersystems.al):org.whispersystems.aU");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aU a(org.whispersystems.al r3) {
        /*
        r2 = this;
        r0 = r2.e;
        if (r0 != 0) goto L_0x0011;
    L_0x0004:
        r0 = r3.f();
        r2.g = r0;
        r2.g();
        r0 = org.whispersystems.v.e;
        if (r0 == 0) goto L_0x001a;
    L_0x0011:
        r0 = r2.e;
        r1 = r3.f();
        r0.b(r1);
    L_0x001a:
        r0 = r2.f;
        r0 = r0 | 2;
        r2.f = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aU.a(org.whispersystems.al):org.whispersystems.aU");
    }

    public aU a(int i) {
        this.f |= 1;
        this.j = i;
        g();
        return this;
    }

    public fO m1072getDefaultInstanceForType() {
        return b();
    }

    public ch m1070clone() {
        return j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aU b(org.whispersystems.K r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.v.e;
        r1 = r3.i;
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.f;
        r1 = r1 & 4;
        r2 = 4;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.h;
        r2 = org.whispersystems.K.l();
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.h;
        r1 = org.whispersystems.K.a(r1);
        r1 = r1.a(r4);
        r1 = r1.e();
        r3.h = r1;
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.h = r4;
    L_0x0029:
        r3.g();
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.i;
        r0.a(r4);
    L_0x0033:
        r0 = r3.f;
        r0 = r0 | 4;
        r3.f = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aU.b(org.whispersystems.K):org.whispersystems.aU");
    }

    aU(ec ecVar, a6 a6Var) {
        this(ecVar);
    }

    public ci getDefaultInstanceForType() {
        return b();
    }
}
