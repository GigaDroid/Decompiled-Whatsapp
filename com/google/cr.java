package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cr extends c_ implements bI {
    private fv f;
    private List g;
    private int h;

    public fl m368mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.E().a(ca.class, cr.class);
    }

    public il m369mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private void d() {
        if ((this.h & 1) != 1) {
            this.g = new ArrayList(this.g);
            this.h |= 1;
        }
    }

    public ci build() {
        return e();
    }

    public ca e() {
        Object h = h();
        if (h.isInitialized()) {
            return h;
        }
        throw a((ci) h);
    }

    public cr a(ci ciVar) {
        if (ciVar instanceof ca) {
            return a((ca) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public c3 clone() {
        return f();
    }

    private cr(ec ecVar) {
        super(ecVar);
        this.g = Collections.emptyList();
        i();
    }

    public ch m364clone() {
        return f();
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

    public ch m367mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ca l() {
        return ca.d();
    }

    private cr() {
        this.g = Collections.emptyList();
        i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ca h() {
        /*
        r3 = this;
        r0 = new com.google.ca;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.h;
        r1 = r3.f;
        if (r1 != 0) goto L_0x002a;
    L_0x000c:
        r1 = r3.h;
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0021;
    L_0x0013:
        r1 = r3.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r3.g = r1;
        r1 = r3.h;
        r1 = r1 & -2;
        r3.h = r1;
    L_0x0021:
        r1 = r3.g;
        com.google.ca.a(r0, r1);
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.f;
        r1 = r1.f();
        com.google.ca.a(r0, r1);
    L_0x0033:
        r3.f();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cr.h():com.google.ca");
    }

    static cr a() {
        return g();
    }

    public int j() {
        return this.f == null ? this.g.size() : this.f.d();
    }

    public fO m366getDefaultInstanceForType() {
        return l();
    }

    private void i() {
        if (bL.d) {
            k();
        }
    }

    cr(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public cr f() {
        return g().a(h());
    }

    private static cr g() {
        return new cr();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c_ b() {
        return f();
    }

    private fv k() {
        boolean z = true;
        if (this.f == null) {
            List list = this.g;
            if ((this.h & 1) != 1) {
                z = false;
            }
            this.f = new fv(list, z, e(), a());
            this.g = null;
        }
        return this.f;
    }

    public fn getDescriptorForType() {
        return bh.u();
    }

    public cJ m363clone() {
        return f();
    }

    public cj a(int i) {
        return this.f == null ? (cj) this.g.get(i) : (cj) this.f.c(i);
    }

    public fO m361build() {
        return e();
    }

    public fO m362buildPartial() {
        return h();
    }

    public Object m365clone() {
        return f();
    }

    public ci buildPartial() {
        return h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cr a(com.google.ca r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.ca.d();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.f;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.ca.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.g;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.ca.b(r5);
        r4.g = r2;
        r2 = r4.h;
        r2 = r2 & -2;
        r4.h = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.d();
        r2 = r4.g;
        r3 = com.google.ca.b(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.g();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.ca.b(r5);
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
        r2 = com.google.ca.b(r5);
        r4.g = r2;
        r2 = r4.h;
        r2 = r2 & -2;
        r4.h = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.k();
    L_0x006c:
        r4.f = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.f;
        r1 = com.google.ca.b(r5);
        r0.a(r1);
    L_0x0079:
        r4.a(r5);
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cr.a(com.google.ca):com.google.cr");
    }

    public ci getDefaultInstanceForType() {
        return l();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cr a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.ca.g;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.ca) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.ca) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cr.a(com.google.ad, com.google.h):com.google.cr");
    }
}
