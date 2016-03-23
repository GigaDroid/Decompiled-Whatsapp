package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cm extends cJ implements gY {
    private k e;
    private int f;
    private List g;
    private ct h;
    private Object i;
    private fv j;

    public ci getDefaultInstanceForType() {
        return h();
    }

    public fn getDescriptorForType() {
        return bh.m();
    }

    private static cm f() {
        return new cm();
    }

    public il m304mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public int n() {
        return this.j == null ? this.g.size() : this.j.d();
    }

    public ci buildPartial() {
        return l();
    }

    public c3 clone() {
        return i();
    }

    private fv g() {
        if (this.j == null) {
            boolean z;
            List list = this.g;
            if ((this.f & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            this.j = new fv(list, z, e(), a());
            this.g = null;
        }
        return this.j;
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private k m() {
        if (this.e == null) {
            this.e = new k(this.h, e(), a());
            this.h = null;
        }
        return this.e;
    }

    public ch m299clone() {
        return i();
    }

    public fO m297buildPartial() {
        return l();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.bv l() {
        /*
        r6 = this;
        r0 = 1;
        r2 = com.google.bA.b;
        r3 = new com.google.bv;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.f;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x0065;
    L_0x0010:
        r1 = r6.i;
        com.google.bv.a(r3, r1);
        r1 = r6.j;
        if (r1 != 0) goto L_0x0035;
    L_0x0019:
        r1 = r6.f;
        r1 = r1 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x002e;
    L_0x0020:
        r1 = r6.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.g = r1;
        r1 = r6.f;
        r1 = r1 & -3;
        r6.f = r1;
    L_0x002e:
        r1 = r6.g;
        com.google.bv.a(r3, r1);
        if (r2 == 0) goto L_0x003e;
    L_0x0035:
        r1 = r6.j;
        r1 = r1.f();
        com.google.bv.a(r3, r1);
    L_0x003e:
        r1 = r4 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0063;
    L_0x0043:
        r0 = r0 | 2;
        r1 = r0;
    L_0x0046:
        r0 = r6.e;
        if (r0 != 0) goto L_0x0051;
    L_0x004a:
        r0 = r6.h;
        com.google.bv.a(r3, r0);
        if (r2 == 0) goto L_0x005c;
    L_0x0051:
        r0 = r6.e;
        r0 = r0.e();
        r0 = (com.google.ct) r0;
        com.google.bv.a(r3, r0);
    L_0x005c:
        com.google.bv.a(r3, r1);
        r6.f();
        return r3;
    L_0x0063:
        r1 = r0;
        goto L_0x0046;
    L_0x0065:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cm.l():com.google.bv");
    }

    private void j() {
        if (bL.d) {
            g();
            m();
        }
    }

    cm(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public fO m296build() {
        return a();
    }

    public cm i() {
        return f().a(l());
    }

    public bv h() {
        return bv.c();
    }

    public boolean o() {
        return (this.f & 4) == 4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cm a(com.google.ct r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.e;
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.f;
        r1 = r1 & 4;
        r2 = 4;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.h;
        r2 = com.google.ct.h();
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.h;
        r1 = com.google.ct.a(r1);
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
        r0 = r3.e;
        r0.a(r4);
    L_0x0033:
        r0 = r3.f;
        r0 = r0 | 4;
        r3.f = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cm.a(com.google.ct):com.google.cm");
    }

    public cJ m298clone() {
        return i();
    }

    public fO m301getDefaultInstanceForType() {
        return h();
    }

    public ci build() {
        return a();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.q().a(bv.class, cm.class);
    }

    public fl m303mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public cm a(ci ciVar) {
        if (ciVar instanceof bv) {
            return a((bv) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    private cm() {
        this.i = "";
        this.g = Collections.emptyList();
        this.h = ct.h();
        j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cm a(com.google.bv r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.bv.c();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r5.d();
        if (r2 == 0) goto L_0x001f;
    L_0x0010:
        r2 = r4.f;
        r2 = r2 | 1;
        r4.f = r2;
        r2 = com.google.bv.a(r5);
        r4.i = r2;
        r4.g();
    L_0x001f:
        r2 = r4.j;
        if (r2 != 0) goto L_0x0054;
    L_0x0023:
        r2 = com.google.bv.c(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x008e;
    L_0x002d:
        r2 = r4.g;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0043;
    L_0x0035:
        r2 = com.google.bv.c(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -3;
        r4.f = r2;
        if (r1 == 0) goto L_0x004f;
    L_0x0043:
        r4.d();
        r2 = r4.g;
        r3 = com.google.bv.c(r5);
        r2.addAll(r3);
    L_0x004f:
        r4.g();
        if (r1 == 0) goto L_0x008e;
    L_0x0054:
        r2 = com.google.bv.c(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x008e;
    L_0x005e:
        r2 = r4.j;
        r2 = r2.i();
        if (r2 == 0) goto L_0x0085;
    L_0x0066:
        r2 = r4.j;
        r2.b();
        r4.j = r0;
        r2 = com.google.bv.c(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -3;
        r4.f = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x0081;
    L_0x007d:
        r0 = r4.g();
    L_0x0081:
        r4.j = r0;
        if (r1 == 0) goto L_0x008e;
    L_0x0085:
        r0 = r4.j;
        r1 = com.google.bv.c(r5);
        r0.a(r1);
    L_0x008e:
        r0 = r5.q();
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r0 = r5.n();
        r4.a(r0);
    L_0x009b:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cm.a(com.google.bv):com.google.cm");
    }

    private cm(ec ecVar) {
        super(ecVar);
        this.i = "";
        this.g = Collections.emptyList();
        this.h = ct.h();
        j();
    }

    public bT a(int i) {
        return this.j == null ? (bT) this.g.get(i) : (bT) this.j.c(i);
    }

    public ch m302mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    static cm k() {
        return f();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < n()) {
            if (a(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        if (!o() || e().isInitialized()) {
            return true;
        }
        return false;
    }

    private void d() {
        if ((this.f & 2) != 2) {
            this.g = new ArrayList(this.g);
            this.f |= 2;
        }
    }

    public bv a() {
        Object l = l();
        if (l.isInitialized()) {
            return l;
        }
        throw a((ci) l);
    }

    public ct e() {
        if (this.e == null) {
            return this.h;
        }
        return (ct) this.e.c();
    }

    public Object m300clone() {
        return i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cm a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.bv.k;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.bv) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.bv) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cm.a(com.google.ad, com.google.h):com.google.cm");
    }
}
