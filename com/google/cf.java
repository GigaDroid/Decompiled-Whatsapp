package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cf extends c_ implements f0 {
    private List f;
    private fv g;
    private boolean h;
    private int i;

    private void h() {
        if (bL.d) {
            i();
        }
    }

    public fO m284build() {
        return k();
    }

    private void d() {
        if ((this.i & 2) != 2) {
            this.f = new ArrayList(this.f);
            this.i |= 2;
        }
    }

    public cf a(ci ciVar) {
        if (ciVar instanceof ct) {
            return a((ct) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public cf m() {
        return n().a(e());
    }

    public c_ b() {
        return m();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.J().a(ct.class, cf.class);
    }

    public ct l() {
        return ct.h();
    }

    public fn getDescriptorForType() {
        return bh.z();
    }

    public Object m288clone() {
        return m();
    }

    cf(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cf a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.ct.g;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.ct) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.ct) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cf.a(com.google.ad, com.google.h):com.google.cf");
    }

    public cJ m286clone() {
        return m();
    }

    public fl m291mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public il m292mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cf a(com.google.ct r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.ct.h();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r5.l();
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = r5.g();
        r4.a(r2);
    L_0x0017:
        r2 = r4.g;
        if (r2 != 0) goto L_0x004c;
    L_0x001b:
        r2 = com.google.ct.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0086;
    L_0x0025:
        r2 = r4.f;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x003b;
    L_0x002d:
        r2 = com.google.ct.b(r5);
        r4.f = r2;
        r2 = r4.i;
        r2 = r2 & -3;
        r4.i = r2;
        if (r1 == 0) goto L_0x0047;
    L_0x003b:
        r4.d();
        r2 = r4.f;
        r3 = com.google.ct.b(r5);
        r2.addAll(r3);
    L_0x0047:
        r4.g();
        if (r1 == 0) goto L_0x0086;
    L_0x004c:
        r2 = com.google.ct.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0086;
    L_0x0056:
        r2 = r4.g;
        r2 = r2.i();
        if (r2 == 0) goto L_0x007d;
    L_0x005e:
        r2 = r4.g;
        r2.b();
        r4.g = r0;
        r2 = com.google.ct.b(r5);
        r4.f = r2;
        r2 = r4.i;
        r2 = r2 & -3;
        r4.i = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x0079;
    L_0x0075:
        r0 = r4.i();
    L_0x0079:
        r4.g = r0;
        if (r1 == 0) goto L_0x0086;
    L_0x007d:
        r0 = r4.g;
        r1 = com.google.ct.b(r5);
        r0.a(r1);
    L_0x0086:
        r4.a(r5);
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cf.a(com.google.ct):com.google.cf");
    }

    private fv i() {
        if (this.g == null) {
            boolean z;
            List list = this.f;
            if ((this.i & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            this.g = new fv(list, z, e(), a());
            this.f = null;
        }
        return this.g;
    }

    private cf(ec ecVar) {
        super(ecVar);
        this.h = true;
        this.f = Collections.emptyList();
        h();
    }

    public int o() {
        return this.g == null ? this.f.size() : this.g.d();
    }

    public ct k() {
        Object e = e();
        if (e.isInitialized()) {
            return e;
        }
        throw a((ci) e);
    }

    public ci getDefaultInstanceForType() {
        return l();
    }

    public ci build() {
        return k();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < o()) {
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

    private cf() {
        this.h = true;
        this.f = Collections.emptyList();
        h();
    }

    public cj a(int i) {
        return this.g == null ? (cj) this.f.get(i) : (cj) this.g.c(i);
    }

    public ch m287clone() {
        return m();
    }

    public fO m289getDefaultInstanceForType() {
        return l();
    }

    public ch m290mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cf a(boolean z) {
        this.i |= 1;
        this.h = z;
        g();
        return this;
    }

    public fO m285buildPartial() {
        return e();
    }

    public c3 clone() {
        return m();
    }

    private static cf n() {
        return new cf();
    }

    public ci buildPartial() {
        return e();
    }

    static cf j() {
        return n();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ct e() {
        /*
        r4 = this;
        r0 = 1;
        r2 = new com.google.ct;
        r1 = 0;
        r2.<init>(r4, r1);
        r3 = r4.i;
        r1 = 0;
        r3 = r3 & 1;
        if (r3 != r0) goto L_0x0045;
    L_0x000e:
        r1 = r4.h;
        com.google.ct.a(r2, r1);
        r1 = r4.g;
        if (r1 != 0) goto L_0x0035;
    L_0x0017:
        r1 = r4.i;
        r1 = r1 & 2;
        r3 = 2;
        if (r1 != r3) goto L_0x002c;
    L_0x001e:
        r1 = r4.f;
        r1 = java.util.Collections.unmodifiableList(r1);
        r4.f = r1;
        r1 = r4.i;
        r1 = r1 & -3;
        r4.i = r1;
    L_0x002c:
        r1 = r4.f;
        com.google.ct.a(r2, r1);
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x003e;
    L_0x0035:
        r1 = r4.g;
        r1 = r1.f();
        com.google.ct.a(r2, r1);
    L_0x003e:
        com.google.ct.a(r2, r0);
        r4.f();
        return r2;
    L_0x0045:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cf.e():com.google.ct");
    }
}
