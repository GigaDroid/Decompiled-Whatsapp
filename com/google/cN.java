package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cN extends cJ implements d1 {
    private List e;
    private Object f;
    private Object g;
    private List h;
    private int i;

    public fn getDescriptorForType() {
        return bh.H();
    }

    private cN(ec ecVar) {
        super(ecVar);
        this.e = Collections.emptyList();
        this.h = Collections.emptyList();
        this.f = "";
        this.g = "";
        d();
    }

    public cd k() {
        return cd.e();
    }

    private static cN f() {
        return new cN();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cN a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cd.e;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cd) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cd) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cN.a(com.google.ad, com.google.h):com.google.cN");
    }

    public il m412mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public final boolean isInitialized() {
        return true;
    }

    private void i() {
        if ((this.i & 2) != 2) {
            this.h = new ArrayList(this.h);
            this.i |= 2;
        }
    }

    cN(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public fO m404build() {
        return l();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    static cN a() {
        return f();
    }

    public Object m408clone() {
        return j();
    }

    public cN a(ci ciVar) {
        if (ciVar instanceof cd) {
            return a((cd) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cN a(com.google.cd r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = com.google.cd.e();
        if (r4 != r1) goto L_0x0009;
    L_0x0008:
        return r3;
    L_0x0009:
        r1 = com.google.cd.d(r4);
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0038;
    L_0x0013:
        r1 = r3.e;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0029;
    L_0x001b:
        r1 = com.google.cd.d(r4);
        r3.e = r1;
        r1 = r3.i;
        r1 = r1 & -2;
        r3.i = r1;
        if (r0 == 0) goto L_0x0035;
    L_0x0029:
        r3.h();
        r1 = r3.e;
        r2 = com.google.cd.d(r4);
        r1.addAll(r2);
    L_0x0035:
        r3.g();
    L_0x0038:
        r1 = com.google.cd.e(r4);
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0067;
    L_0x0042:
        r1 = r3.h;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0058;
    L_0x004a:
        r1 = com.google.cd.e(r4);
        r3.h = r1;
        r1 = r3.i;
        r1 = r1 & -3;
        r3.i = r1;
        if (r0 == 0) goto L_0x0064;
    L_0x0058:
        r3.i();
        r0 = r3.h;
        r1 = com.google.cd.e(r4);
        r0.addAll(r1);
    L_0x0064:
        r3.g();
    L_0x0067:
        r0 = r4.a();
        if (r0 == 0) goto L_0x007c;
    L_0x006d:
        r0 = r3.i;
        r0 = r0 | 4;
        r3.i = r0;
        r0 = com.google.cd.b(r4);
        r3.f = r0;
        r3.g();
    L_0x007c:
        r0 = r4.j();
        if (r0 == 0) goto L_0x0091;
    L_0x0082:
        r0 = r3.i;
        r0 = r0 | 8;
        r3.i = r0;
        r0 = com.google.cd.c(r4);
        r3.g = r0;
        r3.g();
    L_0x0091:
        r0 = r4.getUnknownFields();
        r3.a(r0);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cN.a(com.google.cd):com.google.cN");
    }

    public fO m409getDefaultInstanceForType() {
        return k();
    }

    public fO m405buildPartial() {
        return e();
    }

    public cJ m406clone() {
        return j();
    }

    public c3 clone() {
        return j();
    }

    public cd l() {
        Object e = e();
        if (e.isInitialized()) {
            return e;
        }
        throw a((ci) e);
    }

    public cN j() {
        return f().a(e());
    }

    private cN() {
        this.e = Collections.emptyList();
        this.h = Collections.emptyList();
        this.f = "";
        this.g = "";
        d();
    }

    public ci buildPartial() {
        return e();
    }

    private void d() {
        if (!bL.d) {
        }
    }

    public fl m411mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public cd e() {
        int i = 1;
        cd cdVar = new cd((cJ) this, null);
        int i2 = this.i;
        if ((this.i & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
            this.i &= -2;
        }
        cd.b(cdVar, this.e);
        if ((this.i & 2) == 2) {
            this.h = Collections.unmodifiableList(this.h);
            this.i &= -3;
        }
        cd.a(cdVar, this.h);
        if ((i2 & 4) != 4) {
            i = 0;
        }
        cd.b(cdVar, this.f);
        if ((i2 & 8) == 8) {
            i |= 2;
        }
        cd.a(cdVar, this.g);
        cd.a(cdVar, i);
        f();
        return cdVar;
    }

    private void h() {
        if ((this.i & 1) != 1) {
            this.e = new ArrayList(this.e);
            this.i |= 1;
        }
    }

    public ci build() {
        return l();
    }

    public ch m407clone() {
        return j();
    }

    public ch m410mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.N().a(cd.class, cN.class);
    }

    public ci getDefaultInstanceForType() {
        return k();
    }
}
