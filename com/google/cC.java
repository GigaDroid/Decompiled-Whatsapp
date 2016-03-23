package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class cC extends cJ implements bD {
    private int e;
    private k f;
    private ca g;
    private fv h;
    private Object i;
    private List j;

    protected bJ internalGetFieldAccessorTable() {
        return bh.B().a(bx.class, cC.class);
    }

    private cC() {
        this.i = "";
        this.j = Collections.emptyList();
        this.g = ca.d();
        i();
    }

    public c3 clone() {
        return m();
    }

    public Object m346clone() {
        return m();
    }

    public bx g() {
        return bx.h();
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    public fO m343buildPartial() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cC a(com.google.ca r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.f;
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.e;
        r1 = r1 & 4;
        r2 = 4;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.g;
        r2 = com.google.ca.d();
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.g;
        r1 = com.google.ca.a(r1);
        r1 = r1.a(r4);
        r1 = r1.h();
        r3.g = r1;
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.g = r4;
    L_0x0029:
        r3.g();
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.f;
        r0.a(r4);
    L_0x0033:
        r0 = r3.e;
        r0 = r0 | 4;
        r3.e = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cC.a(com.google.ca):com.google.cC");
    }

    public bP a(int i) {
        return this.h == null ? (bP) this.j.get(i) : (bP) this.h.c(i);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cC a(com.google.bx r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.bx.h();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r5.e();
        if (r2 == 0) goto L_0x001f;
    L_0x0010:
        r2 = r4.e;
        r2 = r2 | 1;
        r4.e = r2;
        r2 = com.google.bx.a(r5);
        r4.i = r2;
        r4.g();
    L_0x001f:
        r2 = r4.h;
        if (r2 != 0) goto L_0x0054;
    L_0x0023:
        r2 = com.google.bx.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x008e;
    L_0x002d:
        r2 = r4.j;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0043;
    L_0x0035:
        r2 = com.google.bx.b(r5);
        r4.j = r2;
        r2 = r4.e;
        r2 = r2 & -3;
        r4.e = r2;
        if (r1 == 0) goto L_0x004f;
    L_0x0043:
        r4.j();
        r2 = r4.j;
        r3 = com.google.bx.b(r5);
        r2.addAll(r3);
    L_0x004f:
        r4.g();
        if (r1 == 0) goto L_0x008e;
    L_0x0054:
        r2 = com.google.bx.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x008e;
    L_0x005e:
        r2 = r4.h;
        r2 = r2.i();
        if (r2 == 0) goto L_0x0085;
    L_0x0066:
        r2 = r4.h;
        r2.b();
        r4.h = r0;
        r2 = com.google.bx.b(r5);
        r4.j = r2;
        r2 = r4.e;
        r2 = r2 & -3;
        r4.e = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x0081;
    L_0x007d:
        r0 = r4.f();
    L_0x0081:
        r4.h = r0;
        if (r1 == 0) goto L_0x008e;
    L_0x0085:
        r0 = r4.h;
        r1 = com.google.bx.b(r5);
        r0.a(r1);
    L_0x008e:
        r0 = r5.l();
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r0 = r5.o();
        r4.a(r0);
    L_0x009b:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cC.a(com.google.bx):com.google.cC");
    }

    private void j() {
        if ((this.e & 2) != 2) {
            this.j = new ArrayList(this.j);
            this.e |= 2;
        }
    }

    private fv f() {
        if (this.h == null) {
            boolean z;
            List list = this.j;
            if ((this.e & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            this.h = new fv(list, z, e(), a());
            this.j = null;
        }
        return this.h;
    }

    public ci build() {
        return k();
    }

    public fl m349mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private cC(ec ecVar) {
        super(ecVar);
        this.i = "";
        this.j = Collections.emptyList();
        this.g = ca.d();
        i();
    }

    public fO m342build() {
        return k();
    }

    public fO m347getDefaultInstanceForType() {
        return g();
    }

    public il m350mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cJ m344clone() {
        return m();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.bx e() {
        /*
        r6 = this;
        r0 = 1;
        r2 = com.google.bA.b;
        r3 = new com.google.bx;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.e;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x0065;
    L_0x0010:
        r1 = r6.i;
        com.google.bx.a(r3, r1);
        r1 = r6.h;
        if (r1 != 0) goto L_0x0035;
    L_0x0019:
        r1 = r6.e;
        r1 = r1 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x002e;
    L_0x0020:
        r1 = r6.j;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.j = r1;
        r1 = r6.e;
        r1 = r1 & -3;
        r6.e = r1;
    L_0x002e:
        r1 = r6.j;
        com.google.bx.a(r3, r1);
        if (r2 == 0) goto L_0x003e;
    L_0x0035:
        r1 = r6.h;
        r1 = r1.f();
        com.google.bx.a(r3, r1);
    L_0x003e:
        r1 = r4 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0063;
    L_0x0043:
        r0 = r0 | 2;
        r1 = r0;
    L_0x0046:
        r0 = r6.f;
        if (r0 != 0) goto L_0x0051;
    L_0x004a:
        r0 = r6.g;
        com.google.bx.a(r3, r0);
        if (r2 == 0) goto L_0x005c;
    L_0x0051:
        r0 = r6.f;
        r0 = r0.e();
        r0 = (com.google.ca) r0;
        com.google.bx.a(r3, r0);
    L_0x005c:
        com.google.bx.a(r3, r1);
        r6.f();
        return r3;
    L_0x0063:
        r1 = r0;
        goto L_0x0046;
    L_0x0065:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cC.e():com.google.bx");
    }

    public bx k() {
        Object e = e();
        if (e.isInitialized()) {
            return e;
        }
        throw a((ci) e);
    }

    public boolean h() {
        return (this.e & 4) == 4;
    }

    public fn getDescriptorForType() {
        return bh.C();
    }

    public ca l() {
        if (this.f == null) {
            return this.g;
        }
        return (ca) this.f.c();
    }

    public ci buildPartial() {
        return e();
    }

    cC(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public cC a(ci ciVar) {
        if (ciVar instanceof bx) {
            return a((bx) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    private k d() {
        if (this.f == null) {
            this.f = new k(this.g, e(), a());
            this.g = null;
        }
        return this.f;
    }

    private static cC a() {
        return new cC();
    }

    private void i() {
        if (bL.d) {
            f();
            d();
        }
    }

    public ch m348mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ch m345clone() {
        return m();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < b()) {
            if (a(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        if (!h() || l().isInitialized()) {
            return true;
        }
        return false;
    }

    static cC c() {
        return a();
    }

    public cC m() {
        return a().a(e());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cC a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.bx.f;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.bx) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.bx) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cC.a(com.google.ad, com.google.h):com.google.cC");
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public int b() {
        return this.h == null ? this.j.size() : this.h.d();
    }
}
