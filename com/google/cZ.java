package com.google;

public final class cZ extends cJ implements f1 {
    private Object e;
    private k f;
    private cM g;
    private int h;
    private int i;

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public bT b() {
        return bT.o();
    }

    private cZ() {
        this.e = "";
        this.g = cM.k();
        h();
    }

    static cZ a() {
        return i();
    }

    private static cZ i() {
        return new cZ();
    }

    private void h() {
        if (bL.d) {
            c();
        }
    }

    public final boolean isInitialized() {
        if (!d() || e().isInitialized()) {
            return true;
        }
        return false;
    }

    public fO m231build() {
        return g();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fn getDescriptorForType() {
        return bh.w();
    }

    public ci getDefaultInstanceForType() {
        return b();
    }

    private cZ(ec ecVar) {
        super(ecVar);
        this.e = "";
        this.g = cM.k();
        h();
    }

    public cZ a(bT bTVar) {
        if (bTVar != bT.o()) {
            if (bTVar.n()) {
                this.i |= 1;
                this.e = bT.b(bTVar);
                g();
            }
            if (bTVar.k()) {
                a(bTVar.e());
            }
            if (bTVar.h()) {
                a(bTVar.p());
            }
            a(bTVar.getUnknownFields());
        }
        return this;
    }

    public il m239mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cM e() {
        if (this.f == null) {
            return this.g;
        }
        return (cM) this.f.c();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.d().a(bT.class, cZ.class);
    }

    public cZ a(ci ciVar) {
        if (ciVar instanceof bT) {
            return a((bT) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public Object m235clone() {
        return f();
    }

    public bT g() {
        Object j = j();
        if (j.isInitialized()) {
            return j;
        }
        throw a((ci) j);
    }

    public fO m232buildPartial() {
        return j();
    }

    public fO m236getDefaultInstanceForType() {
        return b();
    }

    cZ(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public c3 clone() {
        return f();
    }

    public cZ f() {
        return i().a(j());
    }

    public ch m234clone() {
        return f();
    }

    public boolean d() {
        return (this.i & 4) == 4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cZ a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.bT.o;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.bT) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.bT) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cZ.a(com.google.ad, com.google.h):com.google.cZ");
    }

    public ch m237mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private k c() {
        if (this.f == null) {
            this.f = new k(this.g, e(), a());
            this.g = null;
        }
        return this.f;
    }

    public ci build() {
        return g();
    }

    public fl m238mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public cJ m233clone() {
        return f();
    }

    public cZ a(int i) {
        this.i |= 2;
        this.h = i;
        g();
        return this;
    }

    public ci buildPartial() {
        return j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.bT j() {
        /*
        r5 = this;
        r0 = 1;
        r2 = new com.google.bT;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.i;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x0048;
    L_0x000e:
        r1 = r5.e;
        com.google.bT.a(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.h;
        com.google.bT.b(r2, r1);
        r1 = r3 & 4;
        r3 = 4;
        if (r1 != r3) goto L_0x0046;
    L_0x0024:
        r0 = r0 | 4;
        r1 = r0;
    L_0x0027:
        r0 = r5.f;
        if (r0 != 0) goto L_0x0034;
    L_0x002b:
        r0 = r5.g;
        com.google.bT.a(r2, r0);
        r0 = com.google.bA.b;
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r5.f;
        r0 = r0.e();
        r0 = (com.google.cM) r0;
        com.google.bT.a(r2, r0);
    L_0x003f:
        com.google.bT.a(r2, r1);
        r5.f();
        return r2;
    L_0x0046:
        r1 = r0;
        goto L_0x0027;
    L_0x0048:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cZ.j():com.google.bT");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cZ a(com.google.cM r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.f;
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.i;
        r1 = r1 & 4;
        r2 = 4;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.g;
        r2 = com.google.cM.k();
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.g;
        r1 = com.google.cM.b(r1);
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
        r0 = r3.i;
        r0 = r0 | 4;
        r3.i = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cZ.a(com.google.cM):com.google.cZ");
    }
}
