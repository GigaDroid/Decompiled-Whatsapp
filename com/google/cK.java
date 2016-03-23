package com.google;

public final class cK extends cJ implements iu {
    private k e;
    private Object f;
    private int g;
    private Object h;
    private Object i;
    private cI j;

    public cJ m274clone() {
        return f();
    }

    public ci build() {
        return g();
    }

    public fO m272build() {
        return g();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.v().a(bP.class, cK.class);
    }

    private k b() {
        if (this.e == null) {
            this.e = new k(this.j, e(), a());
            this.j = null;
        }
        return this.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.bP h() {
        /*
        r5 = this;
        r0 = 1;
        r2 = new com.google.bP;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.g;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x0055;
    L_0x000e:
        r1 = r5.f;
        com.google.bP.a(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.h;
        com.google.bP.c(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0026;
    L_0x0024:
        r0 = r0 | 4;
    L_0x0026:
        r1 = r5.i;
        com.google.bP.b(r2, r1);
        r1 = r3 & 8;
        r3 = 8;
        if (r1 != r3) goto L_0x0053;
    L_0x0031:
        r0 = r0 | 8;
        r1 = r0;
    L_0x0034:
        r0 = r5.e;
        if (r0 != 0) goto L_0x0041;
    L_0x0038:
        r0 = r5.j;
        com.google.bP.a(r2, r0);
        r0 = com.google.bA.b;
        if (r0 == 0) goto L_0x004c;
    L_0x0041:
        r0 = r5.e;
        r0 = r0.e();
        r0 = (com.google.cI) r0;
        com.google.bP.a(r2, r0);
    L_0x004c:
        com.google.bP.a(r2, r1);
        r5.f();
        return r2;
    L_0x0053:
        r1 = r0;
        goto L_0x0034;
    L_0x0055:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cK.h():com.google.bP");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cK a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.bP.r;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.bP) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.bP) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cK.a(com.google.ad, com.google.h):com.google.cK");
    }

    private cK() {
        this.f = "";
        this.h = "";
        this.i = "";
        this.j = cI.k();
        a();
    }

    public cI c() {
        if (this.e == null) {
            return this.j;
        }
        return (cI) this.e.c();
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    static cK j() {
        return i();
    }

    public fl m279mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fO m277getDefaultInstanceForType() {
        return e();
    }

    public ci buildPartial() {
        return h();
    }

    public bP e() {
        return bP.h();
    }

    public c3 clone() {
        return f();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cK a(com.google.cI r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.e;
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.g;
        r1 = r1 & 8;
        r2 = 8;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.j;
        r2 = com.google.cI.k();
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.j;
        r1 = com.google.cI.b(r1);
        r1 = r1.a(r4);
        r1 = r1.a();
        r3.j = r1;
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.j = r4;
    L_0x002a:
        r3.g();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.e;
        r0.a(r4);
    L_0x0034:
        r0 = r3.g;
        r0 = r0 | 8;
        r3.g = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cK.a(com.google.cI):com.google.cK");
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private cK(ec ecVar) {
        super(ecVar);
        this.f = "";
        this.h = "";
        this.i = "";
        this.j = cI.k();
        a();
    }

    public bP g() {
        Object h = h();
        if (h.isInitialized()) {
            return h;
        }
        throw a((ci) h);
    }

    public fn getDescriptorForType() {
        return bh.D();
    }

    public cK f() {
        return i().a(h());
    }

    public fO m273buildPartial() {
        return h();
    }

    private static cK i() {
        return new cK();
    }

    public ch m275clone() {
        return f();
    }

    public boolean d() {
        return (this.g & 8) == 8;
    }

    cK(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public final boolean isInitialized() {
        if (!d() || c().isInitialized()) {
            return true;
        }
        return false;
    }

    public cK a(ci ciVar) {
        if (ciVar instanceof bP) {
            return a((bP) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public ch m278mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cK a(bP bPVar) {
        if (bPVar != bP.h()) {
            if (bPVar.q()) {
                this.g |= 1;
                this.f = bP.b(bPVar);
                g();
            }
            if (bPVar.o()) {
                this.g |= 2;
                this.h = bP.c(bPVar);
                g();
            }
            if (bPVar.e()) {
                this.g |= 4;
                this.i = bP.d(bPVar);
                g();
            }
            if (bPVar.r()) {
                a(bPVar.k());
            }
            a(bPVar.getUnknownFields());
        }
        return this;
    }

    public Object m276clone() {
        return f();
    }

    private void a() {
        if (bL.d) {
            b();
        }
    }

    public il m280mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }
}
