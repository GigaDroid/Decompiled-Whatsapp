package com.google;

public final class c4 extends cJ implements dP {
    private int e;
    private int f;
    private int g;

    public c4 b(int i) {
        this.f |= 2;
        this.g = i;
        g();
        return this;
    }

    private static c4 e() {
        return new c4();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.k().a(bR.class, c4.class);
    }

    public fl m168mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private c4(ec ecVar) {
        super(ecVar);
        d();
    }

    public ch m167mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public il m169mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m165clone() {
        return b();
    }

    private void d() {
        if (!bL.d) {
        }
    }

    public cJ m163clone() {
        return b();
    }

    public final boolean isInitialized() {
        return true;
    }

    public c4 a(bR bRVar) {
        if (bRVar != bR.j()) {
            if (bRVar.k()) {
                a(bRVar.e());
            }
            if (bRVar.f()) {
                b(bRVar.l());
            }
            a(bRVar.getUnknownFields());
        }
        return this;
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    public ci buildPartial() {
        return f();
    }

    static c4 a() {
        return e();
    }

    c4(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public ch m164clone() {
        return b();
    }

    public ci build() {
        return h();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c3 clone() {
        return b();
    }

    public fO m161build() {
        return h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.c4 a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.bR.j;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.bR) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.bR) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.c4.a(com.google.ad, com.google.h):com.google.c4");
    }

    public fO m166getDefaultInstanceForType() {
        return g();
    }

    public c4 a(ci ciVar) {
        if (ciVar instanceof bR) {
            return a((bR) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public bR f() {
        int i = 1;
        bR bRVar = new bR((cJ) this, null);
        int i2 = this.f;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        bR.b(bRVar, this.e);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        bR.a(bRVar, this.g);
        bR.c(bRVar, i);
        f();
        return bRVar;
    }

    public fn getDescriptorForType() {
        return bh.g();
    }

    public c4 b() {
        return e().a(f());
    }

    public fO m162buildPartial() {
        return f();
    }

    public bR g() {
        return bR.j();
    }

    public c4 a(int i) {
        this.f |= 1;
        this.e = i;
        g();
        return this;
    }

    public bR h() {
        Object f = f();
        if (f.isInitialized()) {
            return f;
        }
        throw a((ci) f);
    }

    private c4() {
        d();
    }
}
