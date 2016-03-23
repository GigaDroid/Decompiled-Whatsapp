package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cG extends cJ implements ef {
    private fv e;
    private int f;
    private List g;

    private fv g() {
        boolean z = true;
        if (this.e == null) {
            List list = this.g;
            if ((this.f & 1) != 1) {
                z = false;
            }
            this.e = new fv(list, z, e(), a());
            this.g = null;
        }
        return this.e;
    }

    private static cG i() {
        return new cG();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.bg h() {
        /*
        r3 = this;
        r0 = new com.google.bg;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.f;
        r1 = r3.e;
        if (r1 != 0) goto L_0x002a;
    L_0x000c:
        r1 = r3.f;
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0021;
    L_0x0013:
        r1 = r3.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r3.g = r1;
        r1 = r3.f;
        r1 = r1 & -2;
        r3.f = r1;
    L_0x0021:
        r1 = r3.g;
        com.google.bg.a(r0, r1);
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.e;
        r1 = r1.f();
        com.google.bg.a(r0, r1);
    L_0x0033:
        r3.f();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cG.h():com.google.bg");
    }

    public ch m155mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cG a(com.google.bg r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.bg.d();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.e;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.bg.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.g;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.bg.b(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -2;
        r4.f = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.d();
        r2 = r4.g;
        r3 = com.google.bg.b(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.g();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.bg.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0049:
        r2 = r4.e;
        r2 = r2.i();
        if (r2 == 0) goto L_0x0070;
    L_0x0051:
        r2 = r4.e;
        r2.b();
        r4.e = r0;
        r2 = com.google.bg.b(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -2;
        r4.f = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.g();
    L_0x006c:
        r4.e = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.e;
        r1 = com.google.bg.b(r5);
        r0.a(r1);
    L_0x0079:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cG.a(com.google.bg):com.google.cG");
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ch m152clone() {
        return b();
    }

    private cG(ec ecVar) {
        super(ecVar);
        this.g = Collections.emptyList();
        a();
    }

    private void a() {
        if (bL.d) {
            g();
        }
    }

    public cG a(ci ciVar) {
        if (ciVar instanceof bg) {
            return a((bg) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public ci getDefaultInstanceForType() {
        return j();
    }

    public ci build() {
        return f();
    }

    public cJ m151clone() {
        return b();
    }

    private void d() {
        if ((this.f & 1) != 1) {
            this.g = new ArrayList(this.g);
            this.f |= 1;
        }
    }

    public fO m154getDefaultInstanceForType() {
        return j();
    }

    static cG e() {
        return i();
    }

    public c3 clone() {
        return b();
    }

    public fl m156mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public Object m153clone() {
        return b();
    }

    public il m157mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cG a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.bg.g;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.bg) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.bg) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cG.a(com.google.ad, com.google.h):com.google.cG");
    }

    public fn getDescriptorForType() {
        return bh.r();
    }

    public bg j() {
        return bg.d();
    }

    public ci buildPartial() {
        return h();
    }

    cG(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public fO m150buildPartial() {
        return h();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public bg f() {
        Object h = h();
        if (h.isInitialized()) {
            return h;
        }
        throw a((ci) h);
    }

    public final boolean isInitialized() {
        return true;
    }

    public cG b() {
        return i().a(h());
    }

    private cG() {
        this.g = Collections.emptyList();
        a();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.I().a(bg.class, cG.class);
    }

    public fO m149build() {
        return f();
    }
}
