package com.google;

public class k implements ec {
    private boolean a;
    private bL b;
    private ec c;
    private cJ d;

    public bL e() {
        this.a = true;
        return c();
    }

    private void g() {
        try {
            if (this.d != null) {
                this.b = null;
            }
            try {
                if (!this.a) {
                    return;
                }
                if (this.c != null) {
                    this.c.a();
                    this.a = false;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public void a() {
        g();
    }

    public k f() {
        try {
            ci defaultInstanceForType;
            if (this.b != null) {
                defaultInstanceForType = this.b.getDefaultInstanceForType();
            } else {
                defaultInstanceForType = this.d.getDefaultInstanceForType();
            }
            try {
                this.b = (bL) defaultInstanceForType;
                if (this.d != null) {
                    this.d.b();
                    this.d = null;
                }
                g();
                return this;
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public bL c() {
        try {
            if (this.b == null) {
                this.b = (bL) this.d.buildPartial();
            }
            return this.b;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public k(bL bLVar, ec ecVar, boolean z) {
        if (bLVar == null) {
            throw new NullPointerException();
        }
        this.b = bLVar;
        this.c = ecVar;
        this.a = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.k a(com.google.bL r3) {
        /*
        r2 = this;
        r0 = r2.d;	 Catch:{ NullPointerException -> 0x001f }
        if (r0 != 0) goto L_0x0014;
    L_0x0004:
        r0 = r2.b;	 Catch:{ NullPointerException -> 0x0021 }
        r1 = r2.b;	 Catch:{ NullPointerException -> 0x0021 }
        r1 = r1.getDefaultInstanceForType();	 Catch:{ NullPointerException -> 0x0021 }
        if (r0 != r1) goto L_0x0014;
    L_0x000e:
        r2.b = r3;	 Catch:{ NullPointerException -> 0x0023 }
        r0 = com.google.bA.b;	 Catch:{ NullPointerException -> 0x0023 }
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r0 = r2.d();	 Catch:{ NullPointerException -> 0x0023 }
        r0.mergeFrom(r3);	 Catch:{ NullPointerException -> 0x0023 }
    L_0x001b:
        r2.g();
        return r2;
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.k.a(com.google.bL):com.google.k");
    }

    public eY h() {
        try {
            if (this.d != null) {
                return this.d;
            }
            return this.b;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cJ d() {
        try {
            if (this.d == null) {
                this.d = (cJ) this.b.newBuilderForType(this);
                this.d.mergeFrom(this.b);
                this.d.c();
            }
            return this.d;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void b() {
        this.c = null;
    }

    public k b(bL bLVar) {
        if (bLVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            this.b = bLVar;
            if (this.d != null) {
                this.d.b();
                this.d = null;
            }
            g();
            return this;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }
}
