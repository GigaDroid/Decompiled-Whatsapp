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
import com.google.fv;
import com.google.h;
import com.google.il;
import com.google.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ap extends cJ implements bY {
    private int e;
    private fv f;
    private Y g;
    private k h;
    private List i;

    public fO m1183build() {
        return j();
    }

    public fO m1188getDefaultInstanceForType() {
        return f();
    }

    public ch m1189mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private fv h() {
        try {
            if (this.f == null) {
                boolean z;
                List list = this.i;
                if ((this.e & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.f = new fv(list, z, e(), a());
                this.i = null;
            }
            return this.f;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public il m1191mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m1187clone() {
        return k();
    }

    public ci build() {
        return j();
    }

    public fO m1184buildPartial() {
        return l();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ap b(org.whispersystems.Y r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.Y.r;
        r1 = r3.h;	 Catch:{ NullPointerException -> 0x003a }
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.e;	 Catch:{ NullPointerException -> 0x003c }
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x003e }
        r2 = org.whispersystems.Y.M();	 Catch:{ NullPointerException -> 0x003e }
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x0040 }
        r1 = org.whispersystems.Y.a(r1);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.a();	 Catch:{ NullPointerException -> 0x0040 }
        r3.g = r1;	 Catch:{ NullPointerException -> 0x0040 }
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.g = r4;	 Catch:{ NullPointerException -> 0x0040 }
    L_0x0029:
        r3.g();	 Catch:{ NullPointerException -> 0x0042 }
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.h;	 Catch:{ NullPointerException -> 0x0042 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0042 }
    L_0x0033:
        r0 = r3.e;
        r0 = r0 | 1;
        r3.e = r0;
        return r3;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ap.b(org.whispersystems.Y):org.whispersystems.ap");
    }

    private k g() {
        try {
            if (this.h == null) {
                this.h = new k(this.g, e(), a());
                this.g = null;
            }
            return this.h;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private ap() {
        this.g = Y.M();
        this.i = Collections.emptyList();
        d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.S l() {
        /*
        r5 = this;
        r0 = 1;
        r2 = org.whispersystems.Y.r;
        r3 = new org.whispersystems.S;
        r1 = 0;
        r3.<init>(r5, r1);
        r4 = r5.e;
        r1 = 0;
        r4 = r4 & 1;
        if (r4 != r0) goto L_0x0011;
    L_0x0010:
        r1 = r0;
    L_0x0011:
        r0 = r5.h;	 Catch:{ NullPointerException -> 0x0057 }
        if (r0 != 0) goto L_0x001c;
    L_0x0015:
        r0 = r5.g;	 Catch:{ NullPointerException -> 0x0059 }
        org.whispersystems.S.a(r3, r0);	 Catch:{ NullPointerException -> 0x0059 }
        if (r2 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r5.h;	 Catch:{ NullPointerException -> 0x0059 }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x0059 }
        r0 = (org.whispersystems.Y) r0;	 Catch:{ NullPointerException -> 0x0059 }
        org.whispersystems.S.a(r3, r0);	 Catch:{ NullPointerException -> 0x0059 }
    L_0x0027:
        r0 = r5.f;	 Catch:{ NullPointerException -> 0x005b }
        if (r0 != 0) goto L_0x0047;
    L_0x002b:
        r0 = r5.e;	 Catch:{ NullPointerException -> 0x005d }
        r0 = r0 & 2;
        r4 = 2;
        if (r0 != r4) goto L_0x0040;
    L_0x0032:
        r0 = r5.i;	 Catch:{ NullPointerException -> 0x005d }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ NullPointerException -> 0x005d }
        r5.i = r0;	 Catch:{ NullPointerException -> 0x005d }
        r0 = r5.e;	 Catch:{ NullPointerException -> 0x005d }
        r0 = r0 & -3;
        r5.e = r0;	 Catch:{ NullPointerException -> 0x005d }
    L_0x0040:
        r0 = r5.i;	 Catch:{ NullPointerException -> 0x005f }
        org.whispersystems.S.a(r3, r0);	 Catch:{ NullPointerException -> 0x005f }
        if (r2 == 0) goto L_0x0050;
    L_0x0047:
        r0 = r5.f;	 Catch:{ NullPointerException -> 0x005f }
        r0 = r0.f();	 Catch:{ NullPointerException -> 0x005f }
        org.whispersystems.S.a(r3, r0);	 Catch:{ NullPointerException -> 0x005f }
    L_0x0050:
        org.whispersystems.S.a(r3, r1);
        r5.f();
        return r3;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ap.l():org.whispersystems.S");
    }

    public ci getDefaultInstanceForType() {
        return f();
    }

    public ap k() {
        return i().a(l());
    }

    public S f() {
        return S.l();
    }

    private void d() {
        try {
            if (S.e()) {
                g();
                h();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a() {
        try {
            if ((this.e & 2) != 2) {
                this.i = new ArrayList(this.i);
                this.e |= 2;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.o().a(S.class, ap.class);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cJ m1185clone() {
        return k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ap a(org.whispersystems.S r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = org.whispersystems.Y.r;
        r2 = org.whispersystems.S.l();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.n();	 Catch:{ NullPointerException -> 0x0094 }
        if (r2 == 0) goto L_0x0019;
    L_0x0012:
        r2 = r5.k();	 Catch:{ NullPointerException -> 0x0094 }
        r4.b(r2);	 Catch:{ NullPointerException -> 0x0094 }
    L_0x0019:
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x0096 }
        if (r2 != 0) goto L_0x004e;
    L_0x001d:
        r2 = org.whispersystems.S.b(r5);	 Catch:{ NullPointerException -> 0x0098 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0098 }
        if (r2 != 0) goto L_0x008b;
    L_0x0027:
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x009a }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x009a }
        if (r2 == 0) goto L_0x003d;
    L_0x002f:
        r2 = org.whispersystems.S.b(r5);	 Catch:{ NullPointerException -> 0x009c }
        r4.i = r2;	 Catch:{ NullPointerException -> 0x009c }
        r2 = r4.e;	 Catch:{ NullPointerException -> 0x009c }
        r2 = r2 & -3;
        r4.e = r2;	 Catch:{ NullPointerException -> 0x009c }
        if (r1 == 0) goto L_0x0049;
    L_0x003d:
        r4.a();	 Catch:{ NullPointerException -> 0x009c }
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x009c }
        r3 = org.whispersystems.S.b(r5);	 Catch:{ NullPointerException -> 0x009c }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x009c }
    L_0x0049:
        r4.g();	 Catch:{ NullPointerException -> 0x009e }
        if (r1 == 0) goto L_0x008b;
    L_0x004e:
        r2 = org.whispersystems.S.b(r5);	 Catch:{ NullPointerException -> 0x00a0 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00a0 }
        if (r2 != 0) goto L_0x008b;
    L_0x0058:
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x00a2 }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x00a2 }
        if (r2 == 0) goto L_0x0082;
    L_0x0060:
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x00a4 }
        r2.b();	 Catch:{ NullPointerException -> 0x00a4 }
        r2 = 0;
        r4.f = r2;	 Catch:{ NullPointerException -> 0x00a4 }
        r2 = org.whispersystems.S.b(r5);	 Catch:{ NullPointerException -> 0x00a4 }
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00a4 }
        r2 = r4.e;	 Catch:{ NullPointerException -> 0x00a4 }
        r2 = r2 & -3;
        r4.e = r2;	 Catch:{ NullPointerException -> 0x00a4 }
        r2 = org.whispersystems.S.j();	 Catch:{ NullPointerException -> 0x00a4 }
        if (r2 == 0) goto L_0x007e;
    L_0x007a:
        r0 = r4.h();	 Catch:{ NullPointerException -> 0x00a4 }
    L_0x007e:
        r4.f = r0;	 Catch:{ NullPointerException -> 0x00a6 }
        if (r1 == 0) goto L_0x008b;
    L_0x0082:
        r0 = r4.f;	 Catch:{ NullPointerException -> 0x00a6 }
        r1 = org.whispersystems.S.b(r5);	 Catch:{ NullPointerException -> 0x00a6 }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x00a6 }
    L_0x008b:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ap.a(org.whispersystems.S):org.whispersystems.ap");
    }

    public final boolean isInitialized() {
        return true;
    }

    public fn getDescriptorForType() {
        return a5.B();
    }

    ap(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public ch m1186clone() {
        return k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ap a(java.lang.Iterable r2) {
        /*
        r1 = this;
        r0 = r1.f;	 Catch:{ NullPointerException -> 0x0019 }
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r1.a();	 Catch:{ NullPointerException -> 0x001b }
        r0 = r1.i;	 Catch:{ NullPointerException -> 0x001b }
        com.google.ch.a(r2, r0);	 Catch:{ NullPointerException -> 0x001b }
        r1.g();	 Catch:{ NullPointerException -> 0x001b }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001b }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.f;	 Catch:{ NullPointerException -> 0x001b }
        r0.a(r2);	 Catch:{ NullPointerException -> 0x001b }
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ap.a(java.lang.Iterable):org.whispersystems.ap");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ap a(org.whispersystems.Y r2) {
        /*
        r1 = this;
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x000e }
        if (r0 != 0) goto L_0x0019;
    L_0x0004:
        if (r2 != 0) goto L_0x0010;
    L_0x0006:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x000c }
        r0.<init>();	 Catch:{ NullPointerException -> 0x000c }
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x0010:
        r1.g = r2;	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x0025 }
        r0.b(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x001e:
        r0 = r1.e;
        r0 = r0 | 1;
        r1.e = r0;
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ap.a(org.whispersystems.Y):org.whispersystems.ap");
    }

    public ap a(ci ciVar) {
        try {
            if (ciVar instanceof S) {
                this = a((S) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static ap e() {
        return i();
    }

    public fl m1190mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ap a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.S.j;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.S) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.S) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ap.a(com.google.ad, com.google.h):org.whispersystems.ap");
    }

    private ap(ec ecVar) {
        super(ecVar);
        this.g = Y.M();
        this.i = Collections.emptyList();
        d();
    }

    private static ap i() {
        return new ap();
    }

    public S j() {
        Object l = l();
        try {
            if (l.isInitialized()) {
                return l;
            }
            throw a((ci) l);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ci buildPartial() {
        return l();
    }

    public c3 clone() {
        return k();
    }
}
