package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cL extends c_ implements a4 {
    private fv f;
    private int g;
    private List h;

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cL a(com.google.cI r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.cI.k();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.f;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.cI.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.h;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.cI.a(r5);
        r4.h = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.h();
        r2 = r4.h;
        r3 = com.google.cI.a(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.g();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.cI.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0049:
        r2 = r4.f;
        r2 = r2.i();
        if (r2 == 0) goto L_0x0070;
    L_0x0051:
        r2 = r4.f;
        r2.b();
        r4.f = r0;
        r2 = com.google.cI.a(r5);
        r4.h = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.f();
    L_0x006c:
        r4.f = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.f;
        r1 = com.google.cI.a(r5);
        r0.a(r1);
    L_0x0079:
        r4.a(r5);
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cL.a(com.google.cI):com.google.cL");
    }

    public c_ m250b() {
        return i();
    }

    public fO m252buildPartial() {
        return a();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < j()) {
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

    private cL(ec ecVar) {
        super(ecVar);
        this.h = Collections.emptyList();
        d();
    }

    public cL i() {
        return g().a(a());
    }

    public fO m251build() {
        return b();
    }

    public cJ m253clone() {
        return i();
    }

    public il m259mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cI b() {
        Object a = a();
        if (a.isInitialized()) {
            return a;
        }
        throw a((ci) a);
    }

    static cL k() {
        return g();
    }

    private void d() {
        if (bL.d) {
            f();
        }
    }

    private cL() {
        this.h = Collections.emptyList();
        d();
    }

    public int j() {
        return this.f == null ? this.h.size() : this.f.d();
    }

    public ci build() {
        return b();
    }

    private fv f() {
        boolean z = true;
        if (this.f == null) {
            List list = this.h;
            if ((this.g & 1) != 1) {
                z = false;
            }
            this.f = new fv(list, z, e(), a());
            this.h = null;
        }
        return this.f;
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    public fn getDescriptorForType() {
        return bh.L();
    }

    public cI e() {
        return cI.k();
    }

    public ch m254clone() {
        return i();
    }

    public fO m256getDefaultInstanceForType() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cI a() {
        /*
        r3 = this;
        r0 = new com.google.cI;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.g;
        r1 = r3.f;
        if (r1 != 0) goto L_0x002a;
    L_0x000c:
        r1 = r3.g;
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0021;
    L_0x0013:
        r1 = r3.h;
        r1 = java.util.Collections.unmodifiableList(r1);
        r3.h = r1;
        r1 = r3.g;
        r1 = r1 & -2;
        r3.g = r1;
    L_0x0021:
        r1 = r3.h;
        com.google.cI.a(r0, r1);
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.f;
        r1 = r1.f();
        com.google.cI.a(r0, r1);
    L_0x0033:
        r3.f();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cL.a():com.google.cI");
    }

    public cL a(ci ciVar) {
        if (ciVar instanceof cI) {
            return a((cI) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.i().a(cI.class, cL.class);
    }

    public ch m257mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private static cL g() {
        return new cL();
    }

    private void h() {
        if ((this.g & 1) != 1) {
            this.h = new ArrayList(this.h);
            this.g |= 1;
        }
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fl m258mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cL a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cI.h;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cI) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cI) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cL.a(com.google.ad, com.google.h):com.google.cL");
    }

    public cj a(int i) {
        return this.f == null ? (cj) this.h.get(i) : (cj) this.f.c(i);
    }

    public Object m255clone() {
        return i();
    }

    public ci buildPartial() {
        return a();
    }

    public c3 clone() {
        return i();
    }

    cL(ec ecVar, fm fmVar) {
        this(ecVar);
    }
}
