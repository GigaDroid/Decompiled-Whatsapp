package org.whispersystems;

import com.google.ad;
import com.google.bJ;
import com.google.c3;
import com.google.cJ;
import com.google.ch;
import com.google.ci;
import com.google.ec;
import com.google.fO;
import com.google.fl;
import com.google.fn;
import com.google.h;
import com.google.hx;
import com.google.il;

public final class aa extends cJ implements bt {
    private int e;
    private int f;
    private hx g;
    private hx h;
    private hx i;
    private int j;
    private int k;

    private void d() {
        if (!M.t()) {
        }
    }

    public aa e() {
        return h().a(f());
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aa b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 8;
        this.g = hxVar;
        g();
        return this;
    }

    public fO m1085build() {
        return b();
    }

    public cJ m1087clone() {
        return e();
    }

    aa(ec ecVar, aK aKVar) {
        this(ecVar);
    }

    public ch m1091mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aa c(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 16;
        this.i = hxVar;
        g();
        return this;
    }

    public c3 clone() {
        return e();
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.h().a(M.class, aa.class);
    }

    public aa a(M m) {
        try {
            if (m != M.j()) {
                try {
                    if (m.q()) {
                        b(m.g());
                    }
                    try {
                        if (m.r()) {
                            a(m.k());
                        }
                        try {
                            if (m.b()) {
                                c(m.s());
                            }
                            try {
                                if (m.h()) {
                                    b(m.e());
                                }
                                try {
                                    if (m.l()) {
                                        c(m.f());
                                    }
                                    try {
                                        if (m.p()) {
                                            a(m.d());
                                        }
                                        a(m.getUnknownFields());
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
            }
            return this;
        } catch (NullPointerException e222222) {
            throw e222222;
        }
    }

    public fl m1092mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public ci getDefaultInstanceForType() {
        return a();
    }

    public ci buildPartial() {
        return f();
    }

    private aa(ec ecVar) {
        super(ecVar);
        this.g = hx.b;
        this.i = hx.b;
        this.h = hx.b;
        d();
    }

    public final boolean isInitialized() {
        return true;
    }

    public M f() {
        int i = 1;
        M m = new M((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        M.b(m, this.j);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        M.a(m, this.f);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        M.d(m, this.k);
        if ((i2 & 8) == 8) {
            i |= 8;
        }
        M.b(m, this.g);
        if ((i2 & 16) == 16) {
            i |= 16;
        }
        M.a(m, this.i);
        if ((i2 & 32) == 32) {
            i |= 32;
        }
        M.c(m, this.h);
        M.c(m, i);
        f();
        return m;
    }

    public fn getDescriptorForType() {
        return aC.a();
    }

    private aa() {
        this.g = hx.b;
        this.i = hx.b;
        this.h = hx.b;
        d();
    }

    public aa a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 32;
        this.h = hxVar;
        g();
        return this;
    }

    static aa g() {
        return h();
    }

    public M b() {
        Object f = f();
        try {
            if (f.isInitialized()) {
                return f;
            }
            throw a((ci) f);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public M a() {
        return M.j();
    }

    public ch m1088clone() {
        return e();
    }

    public fO m1086buildPartial() {
        return f();
    }

    public aa a(int i) {
        this.e |= 2;
        this.f = i;
        g();
        return this;
    }

    public aa c(int i) {
        this.e |= 4;
        this.k = i;
        g();
        return this;
    }

    public il m1093mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fO m1090getDefaultInstanceForType() {
        return a();
    }

    private static aa h() {
        return new aa();
    }

    public aa b(int i) {
        this.e |= 1;
        this.j = i;
        g();
        return this;
    }

    public Object m1089clone() {
        return e();
    }

    public ci build() {
        return b();
    }

    public aa a(ci ciVar) {
        try {
            if (ciVar instanceof M) {
                this = a((M) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aa a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.M.t;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.M) r0;	 Catch:{ fN -> 0x0011 }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x000f }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (org.whispersystems.M) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001e:
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r4.a(r1);	 Catch:{ fN -> 0x0024 }
    L_0x0023:
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aa.a(com.google.ad, com.google.h):org.whispersystems.aa");
    }
}
