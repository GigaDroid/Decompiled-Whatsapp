package com.google;

public final class ce extends cJ implements f_ {
    private int e;
    private Object f;
    private boolean g;

    public final boolean isInitialized() {
        if (b() && g()) {
            return true;
        }
        return false;
    }

    private ce(ec ecVar) {
        super(ecVar);
        this.f = "";
        d();
    }

    public ch m394clone() {
        return i();
    }

    public fO m392buildPartial() {
        return h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ce a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.cF.j;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.cF) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.cF) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ce.a(com.google.ad, com.google.h):com.google.ce");
    }

    public ce i() {
        return j().a(h());
    }

    public ci buildPartial() {
        return h();
    }

    public fn getDescriptorForType() {
        return bh.f();
    }

    private ce() {
        this.f = "";
        d();
    }

    public fl m398mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public boolean g() {
        return (this.e & 2) == 2;
    }

    public ci build() {
        return a();
    }

    private static ce j() {
        return new ce();
    }

    public ci getDefaultInstanceForType() {
        return f();
    }

    public fO m391build() {
        return a();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cF a() {
        Object h = h();
        if (h.isInitialized()) {
            return h;
        }
        throw a((ci) h);
    }

    private void d() {
        if (!bL.d) {
        }
    }

    public c3 clone() {
        return i();
    }

    public ce a(boolean z) {
        this.e |= 2;
        this.g = z;
        g();
        return this;
    }

    public ch m397mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m395clone() {
        return i();
    }

    public boolean b() {
        return (this.e & 1) == 1;
    }

    public fO m396getDefaultInstanceForType() {
        return f();
    }

    public cF h() {
        int i = 1;
        cF cFVar = new cF((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        cF.a(cFVar, this.f);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        cF.a(cFVar, this.g);
        cF.a(cFVar, i);
        f();
        return cFVar;
    }

    ce(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public ce a(cF cFVar) {
        if (cFVar != cF.e()) {
            if (cFVar.l()) {
                this.e |= 1;
                this.f = cF.b(cFVar);
                g();
            }
            if (cFVar.a()) {
                a(cFVar.k());
            }
            a(cFVar.getUnknownFields());
        }
        return this;
    }

    public ce a(ci ciVar) {
        if (ciVar instanceof cF) {
            return a((cF) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public cJ m393clone() {
        return i();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public il m399mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.p().a(cF.class, ce.class);
    }

    static ce e() {
        return j();
    }

    public cF f() {
        return cF.e();
    }
}
