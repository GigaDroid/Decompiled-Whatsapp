package com.google;

public final class cD extends cJ implements cQ {
    private cY e;
    private iq f;
    private k g;
    private Object h;
    private int i;
    private Object j;
    private Object k;
    private cw l;
    private Object m;
    private int n;

    public fn getDescriptorForType() {
        return bh.s();
    }

    public cJ m310clone() {
        return f();
    }

    public c3 clone() {
        return f();
    }

    public ci buildPartial() {
        return k();
    }

    public final boolean isInitialized() {
        try {
            if (b()) {
                if (!j().isInitialized()) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public cD a(b6 b6Var) {
        try {
            if (b6Var != b6.t()) {
                try {
                    if (b6Var.q()) {
                        this.n |= 1;
                        this.m = b6.c(b6Var);
                        g();
                    }
                    try {
                        if (b6Var.s()) {
                            a(b6Var.g());
                        }
                        try {
                            if (b6Var.A()) {
                                a(b6Var.p());
                            }
                            try {
                                if (b6Var.f()) {
                                    a(b6Var.d());
                                }
                                try {
                                    if (b6Var.y()) {
                                        this.n |= 16;
                                        this.j = b6.a(b6Var);
                                        g();
                                    }
                                    try {
                                        if (b6Var.c()) {
                                            this.n |= 32;
                                            this.k = b6.d(b6Var);
                                            g();
                                        }
                                        try {
                                            if (b6Var.n()) {
                                                this.n |= 64;
                                                this.h = b6.b(b6Var);
                                                g();
                                            }
                                            try {
                                                if (b6Var.l()) {
                                                    a(b6Var.k());
                                                }
                                                a(b6Var.getUnknownFields());
                                            } catch (NullPointerException e) {
                                                throw e;
                                            }
                                        } catch (NullPointerException e2) {
                                            throw e2;
                                        }
                                    } catch (NullPointerException e22) {
                                        throw e22;
                                    }
                                } catch (NullPointerException e222) {
                                    throw e222;
                                }
                            } catch (NullPointerException e2222) {
                                throw e2222;
                            }
                        } catch (NullPointerException e22222) {
                            throw e22222;
                        }
                    } catch (NullPointerException e222222) {
                        throw e222222;
                    }
                } catch (NullPointerException e2222222) {
                    throw e2222222;
                }
            }
            return this;
        } catch (NullPointerException e22222222) {
            throw e22222222;
        }
    }

    public cD f() {
        return d().a(k());
    }

    public il m316mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fO m313getDefaultInstanceForType() {
        return i();
    }

    private void h() {
        try {
            if (bL.d) {
                c();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ci getDefaultInstanceForType() {
        return i();
    }

    public b6 i() {
        return b6.t();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.c().a(b6.class, cD.class);
    }

    public b6 g() {
        Object k = k();
        try {
            if (k.isInitialized()) {
                return k;
            }
            throw a((ci) k);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean b() {
        try {
            return (this.n & 128) == 128;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.b6 k() {
        /*
        r5 = this;
        r0 = 1;
        r2 = new com.google.b6;
        r1 = 0;
        r2.<init>(r5, r1);
        r3 = r5.n;
        r1 = 0;
        r4 = r3 & 1;
        if (r4 != r0) goto L_0x008d;
    L_0x000e:
        r1 = r5.m;
        com.google.b6.d(r2, r1);
        r1 = r3 & 2;
        r4 = 2;
        if (r1 != r4) goto L_0x001a;
    L_0x0018:
        r0 = r0 | 2;
    L_0x001a:
        r1 = r5.i;
        com.google.b6.b(r2, r1);
        r1 = r3 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x0026;
    L_0x0024:
        r0 = r0 | 4;
    L_0x0026:
        r1 = r5.l;
        com.google.b6.a(r2, r1);
        r1 = r3 & 8;
        r4 = 8;
        if (r1 != r4) goto L_0x0033;
    L_0x0031:
        r0 = r0 | 8;
    L_0x0033:
        r1 = r5.f;
        com.google.b6.a(r2, r1);
        r1 = r3 & 16;
        r4 = 16;
        if (r1 != r4) goto L_0x0040;
    L_0x003e:
        r0 = r0 | 16;
    L_0x0040:
        r1 = r5.j;
        com.google.b6.c(r2, r1);
        r1 = r3 & 32;
        r4 = 32;
        if (r1 != r4) goto L_0x004d;
    L_0x004b:
        r0 = r0 | 32;
    L_0x004d:
        r1 = r5.k;
        com.google.b6.b(r2, r1);
        r1 = r3 & 64;
        r4 = 64;
        if (r1 != r4) goto L_0x005a;
    L_0x0058:
        r0 = r0 | 64;
    L_0x005a:
        r1 = r5.h;
        com.google.b6.a(r2, r1);
        r1 = r3 & 128;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r3) goto L_0x008b;
    L_0x0065:
        r0 = r0 | 128;
        r1 = r0;
    L_0x0068:
        r0 = r5.g;	 Catch:{ NullPointerException -> 0x0087 }
        if (r0 != 0) goto L_0x0075;
    L_0x006c:
        r0 = r5.e;	 Catch:{ NullPointerException -> 0x0089 }
        com.google.b6.a(r2, r0);	 Catch:{ NullPointerException -> 0x0089 }
        r0 = com.google.bA.b;	 Catch:{ NullPointerException -> 0x0089 }
        if (r0 == 0) goto L_0x0080;
    L_0x0075:
        r0 = r5.g;	 Catch:{ NullPointerException -> 0x0089 }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x0089 }
        r0 = (com.google.cY) r0;	 Catch:{ NullPointerException -> 0x0089 }
        com.google.b6.a(r2, r0);	 Catch:{ NullPointerException -> 0x0089 }
    L_0x0080:
        com.google.b6.a(r2, r1);
        r5.f();
        return r2;
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r1 = r0;
        goto L_0x0068;
    L_0x008d:
        r0 = r1;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cD.k():com.google.b6");
    }

    static cD e() {
        return d();
    }

    public cD a(cw cwVar) {
        if (cwVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.n |= 4;
        this.l = cwVar;
        g();
        return this;
    }

    public cD a(ci ciVar) {
        try {
            if (ciVar instanceof b6) {
                this = a((b6) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ch m314mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cD a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.b6.z;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.b6) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.b6) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cD.a(com.google.ad, com.google.h):com.google.cD");
    }

    public fO m308build() {
        return g();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private static cD d() {
        return new cD();
    }

    public cD a(iq iqVar) {
        if (iqVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.n |= 8;
        this.f = iqVar;
        g();
        return this;
    }

    public ch m311clone() {
        return f();
    }

    public fO m309buildPartial() {
        return k();
    }

    cD(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public cY j() {
        try {
            if (this.g == null) {
                return this.e;
            }
            return (cY) this.g.c();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public Object m312clone() {
        return f();
    }

    public fl m315mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cD a(com.google.cY r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x003b }
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.n;	 Catch:{ NullPointerException -> 0x003d }
        r1 = r1 & 128;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.e;	 Catch:{ NullPointerException -> 0x003f }
        r2 = com.google.cY.w();	 Catch:{ NullPointerException -> 0x003f }
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.e;	 Catch:{ NullPointerException -> 0x0041 }
        r1 = com.google.cY.a(r1);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0041 }
        r1 = r1.k();	 Catch:{ NullPointerException -> 0x0041 }
        r3.e = r1;	 Catch:{ NullPointerException -> 0x0041 }
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.e = r4;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x002a:
        r3.g();	 Catch:{ NullPointerException -> 0x0043 }
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.g;	 Catch:{ NullPointerException -> 0x0043 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0043 }
    L_0x0034:
        r0 = r3.n;
        r0 = r0 | 128;
        r3.n = r0;
        return r3;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cD.a(com.google.cY):com.google.cD");
    }

    public cD a(int i) {
        this.n |= 2;
        this.i = i;
        g();
        return this;
    }

    public ci build() {
        return g();
    }

    private cD() {
        this.m = "";
        this.l = cw.LABEL_OPTIONAL;
        this.f = iq.TYPE_DOUBLE;
        this.j = "";
        this.k = "";
        this.h = "";
        this.e = cY.w();
        h();
    }

    private k c() {
        try {
            if (this.g == null) {
                this.g = new k(this.e, e(), a());
                this.e = null;
            }
            return this.g;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private cD(ec ecVar) {
        super(ecVar);
        this.m = "";
        this.l = cw.LABEL_OPTIONAL;
        this.f = iq.TYPE_DOUBLE;
        this.j = "";
        this.k = "";
        this.h = "";
        this.e = cY.w();
        h();
    }
}
