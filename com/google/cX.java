package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cX extends c_ implements i9 {
    private int f;
    private List g;
    private fv h;

    public fO m246getDefaultInstanceForType() {
        return f();
    }

    public ci build() {
        return a();
    }

    public il m249mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private void j() {
        if ((this.f & 1) != 1) {
            this.g = new ArrayList(this.g);
            this.f |= 1;
        }
    }

    public fl m248mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fO m242buildPartial() {
        return h();
    }

    private void d() {
        if (bL.d) {
            b();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cM h() {
        /*
        r3 = this;
        r0 = new com.google.cM;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.f;
        r1 = r3.h;
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
        com.google.cM.a(r0, r1);
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.h;
        r1 = r1.f();
        com.google.cM.a(r0, r1);
    L_0x0033:
        r3.f();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cX.h():com.google.cM");
    }

    public ci buildPartial() {
        return h();
    }

    public fO m241build() {
        return a();
    }

    public cX a(ci ciVar) {
        if (ciVar instanceof cM) {
            return a((cM) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public ch m247mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cM a() {
        Object h = h();
        if (h.isInitialized()) {
            return h;
        }
        throw a((ci) h);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cX a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cM.i;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cM) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cM) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cX.a(com.google.ad, com.google.h):com.google.cX");
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < g()) {
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

    public Object m245clone() {
        return k();
    }

    static cX e() {
        return i();
    }

    private static cX i() {
        return new cX();
    }

    public c_ m240b() {
        return k();
    }

    public cM f() {
        return cM.k();
    }

    public c3 clone() {
        return k();
    }

    public cX k() {
        return i().a(h());
    }

    cX(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    private cX(ec ecVar) {
        super(ecVar);
        this.g = Collections.emptyList();
        d();
    }

    public fn getDescriptorForType() {
        return bh.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cX a(com.google.cM r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.cM.k();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.h;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.cM.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.g;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.cM.a(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -2;
        r4.f = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.j();
        r2 = r4.g;
        r3 = com.google.cM.a(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.g();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.cM.a(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0049:
        r2 = r4.h;
        r2 = r2.i();
        if (r2 == 0) goto L_0x0070;
    L_0x0051:
        r2 = r4.h;
        r2.b();
        r4.h = r0;
        r2 = com.google.cM.a(r5);
        r4.g = r2;
        r2 = r4.f;
        r2 = r2 & -2;
        r4.f = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.b();
    L_0x006c:
        r4.h = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.h;
        r1 = com.google.cM.a(r5);
        r0.a(r1);
    L_0x0079:
        r4.a(r5);
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cX.a(com.google.cM):com.google.cX");
    }

    private fv b() {
        boolean z = true;
        if (this.h == null) {
            List list = this.g;
            if ((this.f & 1) != 1) {
                z = false;
            }
            this.h = new fv(list, z, e(), a());
            this.g = null;
        }
        return this.h;
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.e().a(cM.class, cX.class);
    }

    public cj a(int i) {
        return this.h == null ? (cj) this.g.get(i) : (cj) this.h.c(i);
    }

    public int g() {
        return this.h == null ? this.g.size() : this.h.d();
    }

    public cJ m243clone() {
        return k();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public ch m244clone() {
        return k();
    }

    private cX() {
        this.g = Collections.emptyList();
        d();
    }

    public ci getDefaultInstanceForType() {
        return f();
    }
}
