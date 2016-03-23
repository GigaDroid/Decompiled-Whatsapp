package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ck extends cJ implements es {
    private Object e;
    private double f;
    private long g;
    private List h;
    private Object i;
    private hx j;
    private fv k;
    private int l;
    private long m;

    public int a() {
        try {
            return this.k == null ? this.h.size() : this.k.d();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void d() {
        try {
            if (bL.d) {
                b();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cj c() {
        return cj.l();
    }

    public fO m419build() {
        return k();
    }

    public ch m422clone() {
        return i();
    }

    public ch m425mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private ck(ec ecVar) {
        super(ecVar);
        this.h = Collections.emptyList();
        this.e = "";
        this.j = hx.b;
        this.i = "";
        d();
    }

    private ck() {
        this.h = Collections.emptyList();
        this.e = "";
        this.j = hx.b;
        this.i = "";
        d();
    }

    public ck a(long j) {
        this.l |= 8;
        this.g = j;
        g();
        return this;
    }

    public ck a(ci ciVar) {
        try {
            if (ciVar instanceof cj) {
                this = a((cj) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ck a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.l |= 32;
        this.j = hxVar;
        g();
        return this;
    }

    public ci buildPartial() {
        return e();
    }

    public fO m424getDefaultInstanceForType() {
        return c();
    }

    public fl m426mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private void h() {
        try {
            if ((this.l & 1) != 1) {
                this.h = new ArrayList(this.h);
                this.l |= 1;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cJ m421clone() {
        return i();
    }

    public cj k() {
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

    private fv b() {
        boolean z = true;
        try {
            if (this.k == null) {
                List list = this.h;
                if ((this.l & 1) != 1) {
                    z = false;
                }
                this.k = new fv(list, z, e(), a());
                this.h = null;
            }
            return this.k;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public ci build() {
        return k();
    }

    public ck i() {
        return f().a(e());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cj e() {
        /*
        r6 = this;
        r0 = 1;
        r2 = new com.google.cj;
        r1 = 0;
        r2.<init>(r6, r1);
        r3 = r6.l;
        r1 = 0;
        r4 = r6.k;	 Catch:{ NullPointerException -> 0x0085 }
        if (r4 != 0) goto L_0x002b;
    L_0x000e:
        r4 = r6.l;	 Catch:{ NullPointerException -> 0x0087 }
        r4 = r4 & 1;
        if (r4 != r0) goto L_0x0022;
    L_0x0014:
        r4 = r6.h;	 Catch:{ NullPointerException -> 0x0087 }
        r4 = java.util.Collections.unmodifiableList(r4);	 Catch:{ NullPointerException -> 0x0087 }
        r6.h = r4;	 Catch:{ NullPointerException -> 0x0087 }
        r4 = r6.l;	 Catch:{ NullPointerException -> 0x0087 }
        r4 = r4 & -2;
        r6.l = r4;	 Catch:{ NullPointerException -> 0x0087 }
    L_0x0022:
        r4 = r6.h;	 Catch:{ NullPointerException -> 0x0089 }
        com.google.cj.a(r2, r4);	 Catch:{ NullPointerException -> 0x0089 }
        r4 = com.google.bA.b;	 Catch:{ NullPointerException -> 0x0089 }
        if (r4 == 0) goto L_0x0034;
    L_0x002b:
        r4 = r6.k;	 Catch:{ NullPointerException -> 0x0089 }
        r4 = r4.f();	 Catch:{ NullPointerException -> 0x0089 }
        com.google.cj.a(r2, r4);	 Catch:{ NullPointerException -> 0x0089 }
    L_0x0034:
        r4 = r3 & 2;
        r5 = 2;
        if (r4 != r5) goto L_0x008b;
    L_0x0039:
        r1 = r6.e;
        com.google.cj.a(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0045;
    L_0x0043:
        r0 = r0 | 2;
    L_0x0045:
        r4 = r6.m;
        com.google.cj.b(r2, r4);
        r1 = r3 & 8;
        r4 = 8;
        if (r1 != r4) goto L_0x0052;
    L_0x0050:
        r0 = r0 | 4;
    L_0x0052:
        r4 = r6.g;
        com.google.cj.a(r2, r4);
        r1 = r3 & 16;
        r4 = 16;
        if (r1 != r4) goto L_0x005f;
    L_0x005d:
        r0 = r0 | 8;
    L_0x005f:
        r4 = r6.f;
        com.google.cj.a(r2, r4);
        r1 = r3 & 32;
        r4 = 32;
        if (r1 != r4) goto L_0x006c;
    L_0x006a:
        r0 = r0 | 16;
    L_0x006c:
        r1 = r6.j;
        com.google.cj.a(r2, r1);
        r1 = r3 & 64;
        r3 = 64;
        if (r1 != r3) goto L_0x0079;
    L_0x0077:
        r0 = r0 | 32;
    L_0x0079:
        r1 = r6.i;
        com.google.cj.b(r2, r1);
        com.google.cj.a(r2, r0);
        r6.f();
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
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ck.e():com.google.cj");
    }

    public Object m423clone() {
        return i();
    }

    public ck a(double d) {
        this.l |= 16;
        this.f = d;
        g();
        return this;
    }

    public cF a(int i) {
        try {
            return this.k == null ? (cF) this.h.get(i) : (cF) this.k.c(i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public fn getDescriptorForType() {
        return bh.O();
    }

    ck(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < a()) {
            try {
                if (a(i).isInitialized()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return true;
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ck a(com.google.cj r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.cj.l();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r4.k;	 Catch:{ NullPointerException -> 0x00e3 }
        if (r2 != 0) goto L_0x0041;
    L_0x0010:
        r2 = com.google.cj.d(r5);	 Catch:{ NullPointerException -> 0x00e5 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00e5 }
        if (r2 != 0) goto L_0x007c;
    L_0x001a:
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00e7 }
        if (r2 == 0) goto L_0x0030;
    L_0x0022:
        r2 = com.google.cj.d(r5);	 Catch:{ NullPointerException -> 0x00e9 }
        r4.h = r2;	 Catch:{ NullPointerException -> 0x00e9 }
        r2 = r4.l;	 Catch:{ NullPointerException -> 0x00e9 }
        r2 = r2 & -2;
        r4.l = r2;	 Catch:{ NullPointerException -> 0x00e9 }
        if (r1 == 0) goto L_0x003c;
    L_0x0030:
        r4.h();	 Catch:{ NullPointerException -> 0x00e9 }
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x00e9 }
        r3 = com.google.cj.d(r5);	 Catch:{ NullPointerException -> 0x00e9 }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x00e9 }
    L_0x003c:
        r4.g();	 Catch:{ NullPointerException -> 0x00eb }
        if (r1 == 0) goto L_0x007c;
    L_0x0041:
        r2 = com.google.cj.d(r5);	 Catch:{ NullPointerException -> 0x00ed }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00ed }
        if (r2 != 0) goto L_0x007c;
    L_0x004b:
        r2 = r4.k;	 Catch:{ NullPointerException -> 0x00ef }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x00ef }
        if (r2 == 0) goto L_0x0073;
    L_0x0053:
        r2 = r4.k;	 Catch:{ NullPointerException -> 0x00f1 }
        r2.b();	 Catch:{ NullPointerException -> 0x00f1 }
        r2 = 0;
        r4.k = r2;	 Catch:{ NullPointerException -> 0x00f1 }
        r2 = com.google.cj.d(r5);	 Catch:{ NullPointerException -> 0x00f1 }
        r4.h = r2;	 Catch:{ NullPointerException -> 0x00f1 }
        r2 = r4.l;	 Catch:{ NullPointerException -> 0x00f1 }
        r2 = r2 & -2;
        r4.l = r2;	 Catch:{ NullPointerException -> 0x00f1 }
        r2 = com.google.bL.d;	 Catch:{ NullPointerException -> 0x00f1 }
        if (r2 == 0) goto L_0x006f;
    L_0x006b:
        r0 = r4.b();	 Catch:{ NullPointerException -> 0x00f1 }
    L_0x006f:
        r4.k = r0;	 Catch:{ NullPointerException -> 0x00f3 }
        if (r1 == 0) goto L_0x007c;
    L_0x0073:
        r0 = r4.k;	 Catch:{ NullPointerException -> 0x00f3 }
        r1 = com.google.cj.d(r5);	 Catch:{ NullPointerException -> 0x00f3 }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x00f3 }
    L_0x007c:
        r0 = r5.h();	 Catch:{ NullPointerException -> 0x00f5 }
        if (r0 == 0) goto L_0x0091;
    L_0x0082:
        r0 = r4.l;	 Catch:{ NullPointerException -> 0x00f5 }
        r0 = r0 | 2;
        r4.l = r0;	 Catch:{ NullPointerException -> 0x00f5 }
        r0 = com.google.cj.c(r5);	 Catch:{ NullPointerException -> 0x00f5 }
        r4.e = r0;	 Catch:{ NullPointerException -> 0x00f5 }
        r4.g();	 Catch:{ NullPointerException -> 0x00f5 }
    L_0x0091:
        r0 = r5.u();	 Catch:{ NullPointerException -> 0x00f7 }
        if (r0 == 0) goto L_0x009e;
    L_0x0097:
        r0 = r5.p();	 Catch:{ NullPointerException -> 0x00f7 }
        r4.b(r0);	 Catch:{ NullPointerException -> 0x00f7 }
    L_0x009e:
        r0 = r5.q();	 Catch:{ NullPointerException -> 0x00f9 }
        if (r0 == 0) goto L_0x00ab;
    L_0x00a4:
        r0 = r5.f();	 Catch:{ NullPointerException -> 0x00f9 }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x00f9 }
    L_0x00ab:
        r0 = r5.a();	 Catch:{ NullPointerException -> 0x00fb }
        if (r0 == 0) goto L_0x00b8;
    L_0x00b1:
        r0 = r5.r();	 Catch:{ NullPointerException -> 0x00fb }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x00fb }
    L_0x00b8:
        r0 = r5.t();	 Catch:{ NullPointerException -> 0x00fd }
        if (r0 == 0) goto L_0x00c5;
    L_0x00be:
        r0 = r5.v();	 Catch:{ NullPointerException -> 0x00fd }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x00fd }
    L_0x00c5:
        r0 = r5.o();	 Catch:{ NullPointerException -> 0x00ff }
        if (r0 == 0) goto L_0x00da;
    L_0x00cb:
        r0 = r4.l;	 Catch:{ NullPointerException -> 0x00ff }
        r0 = r0 | 64;
        r4.l = r0;	 Catch:{ NullPointerException -> 0x00ff }
        r0 = com.google.cj.b(r5);	 Catch:{ NullPointerException -> 0x00ff }
        r4.i = r0;	 Catch:{ NullPointerException -> 0x00ff }
        r4.g();	 Catch:{ NullPointerException -> 0x00ff }
    L_0x00da:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ck.a(com.google.cj):com.google.ck");
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.n().a(cj.class, ck.class);
    }

    private static ck f() {
        return new ck();
    }

    public ck b(long j) {
        this.l |= 4;
        this.m = j;
        g();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ck a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cj.u;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cj) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cj) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ck.a(com.google.ad, com.google.h):com.google.ck");
    }

    public il m427mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci getDefaultInstanceForType() {
        return c();
    }

    static ck j() {
        return f();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 clone() {
        return i();
    }

    public fO m420buildPartial() {
        return e();
    }
}
