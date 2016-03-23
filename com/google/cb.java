package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cb extends c_ implements bQ {
    private boolean f;
    private List g;
    private boolean h;
    private int i;
    private fv j;

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < k()) {
            if (a(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        if (d()) {
            return true;
        }
        return false;
    }

    public fO m384getDefaultInstanceForType() {
        return l();
    }

    public cJ m381clone() {
        return a();
    }

    public ci getDefaultInstanceForType() {
        return l();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cl g() {
        /*
        r5 = this;
        r0 = 1;
        r2 = new com.google.cl;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.i;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x0051;
    L_0x000e:
        r1 = r5.f;
        com.google.cl.a(r2, r1);
        r1 = r3 & 2;
        r3 = 2;
        if (r1 != r3) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.h;
        com.google.cl.b(r2, r1);
        r1 = r5.j;
        if (r1 != 0) goto L_0x0041;
    L_0x0023:
        r1 = r5.i;
        r1 = r1 & 4;
        r3 = 4;
        if (r1 != r3) goto L_0x0038;
    L_0x002a:
        r1 = r5.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r5.g = r1;
        r1 = r5.i;
        r1 = r1 & -5;
        r5.i = r1;
    L_0x0038:
        r1 = r5.g;
        com.google.cl.a(r2, r1);
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x004a;
    L_0x0041:
        r1 = r5.j;
        r1 = r1.f();
        com.google.cl.a(r2, r1);
    L_0x004a:
        com.google.cl.a(r2, r0);
        r5.f();
        return r2;
    L_0x0051:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cb.g():com.google.cl");
    }

    public cb a(ci ciVar) {
        if (ciVar instanceof cl) {
            return a((cl) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public fn getDescriptorForType() {
        return bh.h();
    }

    public cj a(int i) {
        return this.j == null ? (cj) this.g.get(i) : (cj) this.j.c(i);
    }

    public int k() {
        if (this.j == null) {
            return this.g.size();
        }
        return this.j.d();
    }

    static cb f() {
        return j();
    }

    cb(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public fO m379build() {
        return h();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.t().a(cl.class, cb.class);
    }

    public c3 clone() {
        return a();
    }

    private void e() {
        if (bL.d) {
            i();
        }
    }

    public ch m382clone() {
        return a();
    }

    public ci build() {
        return h();
    }

    public ci buildPartial() {
        return g();
    }

    public fO m380buildPartial() {
        return g();
    }

    public cb a(boolean z) {
        this.i |= 1;
        this.f = z;
        g();
        return this;
    }

    public ch m385mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cl h() {
        Object g = g();
        if (g.isInitialized()) {
            return g;
        }
        throw a((ci) g);
    }

    private fv i() {
        if (this.j == null) {
            boolean z;
            List list = this.g;
            if ((this.i & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            this.j = new fv(list, z, e(), a());
            this.g = null;
        }
        return this.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cb a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cl.n;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cl) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cl) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cb.a(com.google.ad, com.google.h):com.google.cb");
    }

    public c_ b() {
        return a();
    }

    public il m387mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cb a(com.google.cl r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.cl.f();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r5.b();
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = r5.i();
        r4.a(r2);
    L_0x0017:
        r2 = r5.n();
        if (r2 == 0) goto L_0x0024;
    L_0x001d:
        r2 = r5.c();
        r4.b(r2);
    L_0x0024:
        r2 = r4.j;
        if (r2 != 0) goto L_0x0059;
    L_0x0028:
        r2 = com.google.cl.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0093;
    L_0x0032:
        r2 = r4.g;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0048;
    L_0x003a:
        r2 = com.google.cl.a(r5);
        r4.g = r2;
        r2 = r4.i;
        r2 = r2 & -5;
        r4.i = r2;
        if (r1 == 0) goto L_0x0054;
    L_0x0048:
        r4.d();
        r2 = r4.g;
        r3 = com.google.cl.a(r5);
        r2.addAll(r3);
    L_0x0054:
        r4.g();
        if (r1 == 0) goto L_0x0093;
    L_0x0059:
        r2 = com.google.cl.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0093;
    L_0x0063:
        r2 = r4.j;
        r2 = r2.i();
        if (r2 == 0) goto L_0x008a;
    L_0x006b:
        r2 = r4.j;
        r2.b();
        r4.j = r0;
        r2 = com.google.cl.a(r5);
        r4.g = r2;
        r2 = r4.i;
        r2 = r2 & -5;
        r4.i = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x0086;
    L_0x0082:
        r0 = r4.i();
    L_0x0086:
        r4.j = r0;
        if (r1 == 0) goto L_0x0093;
    L_0x008a:
        r0 = r4.j;
        r1 = com.google.cl.a(r5);
        r0.a(r1);
    L_0x0093:
        r4.a(r5);
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cb.a(com.google.cl):com.google.cb");
    }

    private cb(ec ecVar) {
        super(ecVar);
        this.g = Collections.emptyList();
        e();
    }

    public cl l() {
        return cl.f();
    }

    private static cb j() {
        return new cb();
    }

    private cb() {
        this.g = Collections.emptyList();
        e();
    }

    public fl m386mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private void d() {
        if ((this.i & 4) != 4) {
            this.g = new ArrayList(this.g);
            this.i |= 4;
        }
    }

    public Object m383clone() {
        return a();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public cb b(boolean z) {
        this.i |= 2;
        this.h = z;
        g();
        return this;
    }

    public cb a() {
        return j().a(g());
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }
}
