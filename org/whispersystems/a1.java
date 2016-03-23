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

public final class a1 extends cJ implements H {
    private k e;
    private int f;
    private fv g;
    private V h;
    private int i;
    private k j;
    private X k;
    private List l;

    public U g() {
        return U.a();
    }

    private static a1 j() {
        return new a1();
    }

    private k f() {
        try {
            if (this.j == null) {
                this.j = new k(this.k, e(), a());
                this.k = null;
            }
            return this.j;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public a1 a(int i) {
        this.i |= 1;
        this.f = i;
        g();
        return this;
    }

    public il m1233mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private a1(ec ecVar) {
        super(ecVar);
        this.h = V.j();
        this.k = X.d();
        this.l = Collections.emptyList();
        d();
    }

    public a1 a(ci ciVar) {
        try {
            if (ciVar instanceof U) {
                this = a((U) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 a(org.whispersystems.X r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.Y.r;
        r1 = r3.j;	 Catch:{ NullPointerException -> 0x003a }
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.i;	 Catch:{ NullPointerException -> 0x003c }
        r1 = r1 & 4;
        r2 = 4;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.k;	 Catch:{ NullPointerException -> 0x003e }
        r2 = org.whispersystems.X.d();	 Catch:{ NullPointerException -> 0x003e }
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.k;	 Catch:{ NullPointerException -> 0x0040 }
        r1 = org.whispersystems.X.a(r1);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.a();	 Catch:{ NullPointerException -> 0x0040 }
        r3.k = r1;	 Catch:{ NullPointerException -> 0x0040 }
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.k = r4;	 Catch:{ NullPointerException -> 0x0040 }
    L_0x0029:
        r3.g();	 Catch:{ NullPointerException -> 0x0042 }
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.j;	 Catch:{ NullPointerException -> 0x0042 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0042 }
    L_0x0033:
        r0 = r3.i;
        r0 = r0 | 4;
        r3.i = r0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.a(org.whispersystems.X):org.whispersystems.a1");
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    public fO m1230getDefaultInstanceForType() {
        return g();
    }

    public fn getDescriptorForType() {
        return a5.y();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 b(org.whispersystems.V r2) {
        /*
        r1 = this;
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x000e }
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
        r1.h = r2;	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x0025 }
        r0.b(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x001e:
        r0 = r1.i;
        r0 = r0 | 2;
        r1.i = r0;
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.b(org.whispersystems.V):org.whispersystems.a1");
    }

    public a1 i() {
        return j().a(b());
    }

    public ch m1231mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ch m1228clone() {
        return i();
    }

    public ci build() {
        return h();
    }

    a1(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    private k k() {
        try {
            if (this.e == null) {
                this.e = new k(this.h, e(), a());
                this.h = null;
            }
            return this.e;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 e() {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x001d }
        if (r0 != 0) goto L_0x0017;
    L_0x0004:
        r0 = java.util.Collections.emptyList();	 Catch:{ NullPointerException -> 0x001f }
        r1.l = r0;	 Catch:{ NullPointerException -> 0x001f }
        r0 = r1.i;	 Catch:{ NullPointerException -> 0x001f }
        r0 = r0 & -9;
        r1.i = r0;	 Catch:{ NullPointerException -> 0x001f }
        r1.g();	 Catch:{ NullPointerException -> 0x001f }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001f }
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x001f }
        r0.j();	 Catch:{ NullPointerException -> 0x001f }
    L_0x001c:
        return r1;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.e():org.whispersystems.a1");
    }

    static a1 n() {
        return j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 a(org.whispersystems.U r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = org.whispersystems.Y.r;
        r2 = org.whispersystems.U.a();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.l();	 Catch:{ NullPointerException -> 0x00ae }
        if (r2 == 0) goto L_0x0019;
    L_0x0012:
        r2 = r5.c();	 Catch:{ NullPointerException -> 0x00ae }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00ae }
    L_0x0019:
        r2 = r5.r();	 Catch:{ NullPointerException -> 0x00b0 }
        if (r2 == 0) goto L_0x0026;
    L_0x001f:
        r2 = r5.k();	 Catch:{ NullPointerException -> 0x00b0 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00b0 }
    L_0x0026:
        r2 = r5.g();	 Catch:{ NullPointerException -> 0x00b2 }
        if (r2 == 0) goto L_0x0033;
    L_0x002c:
        r2 = r5.n();	 Catch:{ NullPointerException -> 0x00b2 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00b2 }
    L_0x0033:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00b4 }
        if (r2 != 0) goto L_0x0068;
    L_0x0037:
        r2 = org.whispersystems.U.b(r5);	 Catch:{ NullPointerException -> 0x00b6 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00b6 }
        if (r2 != 0) goto L_0x00a5;
    L_0x0041:
        r2 = r4.l;	 Catch:{ NullPointerException -> 0x00b8 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00b8 }
        if (r2 == 0) goto L_0x0057;
    L_0x0049:
        r2 = org.whispersystems.U.b(r5);	 Catch:{ NullPointerException -> 0x00ba }
        r4.l = r2;	 Catch:{ NullPointerException -> 0x00ba }
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x00ba }
        r2 = r2 & -9;
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00ba }
        if (r1 == 0) goto L_0x0063;
    L_0x0057:
        r4.m();	 Catch:{ NullPointerException -> 0x00ba }
        r2 = r4.l;	 Catch:{ NullPointerException -> 0x00ba }
        r3 = org.whispersystems.U.b(r5);	 Catch:{ NullPointerException -> 0x00ba }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x00ba }
    L_0x0063:
        r4.g();	 Catch:{ NullPointerException -> 0x00bc }
        if (r1 == 0) goto L_0x00a5;
    L_0x0068:
        r2 = org.whispersystems.U.b(r5);	 Catch:{ NullPointerException -> 0x00be }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00be }
        if (r2 != 0) goto L_0x00a5;
    L_0x0072:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00c0 }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x00c0 }
        if (r2 == 0) goto L_0x009c;
    L_0x007a:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x00c2 }
        r2.b();	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = 0;
        r4.g = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = org.whispersystems.U.b(r5);	 Catch:{ NullPointerException -> 0x00c2 }
        r4.l = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = r2 & -9;
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = org.whispersystems.U.p();	 Catch:{ NullPointerException -> 0x00c2 }
        if (r2 == 0) goto L_0x0098;
    L_0x0094:
        r0 = r4.a();	 Catch:{ NullPointerException -> 0x00c2 }
    L_0x0098:
        r4.g = r0;	 Catch:{ NullPointerException -> 0x00c4 }
        if (r1 == 0) goto L_0x00a5;
    L_0x009c:
        r0 = r4.g;	 Catch:{ NullPointerException -> 0x00c4 }
        r1 = org.whispersystems.U.b(r5);	 Catch:{ NullPointerException -> 0x00c4 }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x00c4 }
    L_0x00a5:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.a(org.whispersystems.U):org.whispersystems.a1");
    }

    public U h() {
        Object b = b();
        try {
            if (b.isInitialized()) {
                return b;
            }
            throw a((ci) b);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m1229clone() {
        return i();
    }

    public fO m1226buildPartial() {
        return b();
    }

    public final boolean isInitialized() {
        return true;
    }

    public ci buildPartial() {
        return b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.U.n;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.U) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.U) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.a(com.google.ad, com.google.h):org.whispersystems.a1");
    }

    public fl m1232mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public int l() {
        try {
            return this.g == null ? this.l.size() : this.g.d();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 clone() {
        return i();
    }

    private void m() {
        try {
            if ((this.i & 8) != 8) {
                this.l = new ArrayList(this.l);
                this.i |= 8;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void d() {
        try {
            if (U.i()) {
                k();
                f();
                a();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.g().a(U.class, a1.class);
    }

    private a1() {
        this.h = V.j();
        this.k = X.d();
        this.l = Collections.emptyList();
        d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.U b() {
        /*
        r6 = this;
        r0 = 1;
        r2 = org.whispersystems.Y.r;
        r3 = new org.whispersystems.U;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.i;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x0091;
    L_0x0010:
        r1 = r6.f;
        org.whispersystems.U.a(r3, r1);
        r1 = r4 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x008f;
    L_0x001a:
        r1 = r0 | 2;
    L_0x001c:
        r0 = r6.e;	 Catch:{ NullPointerException -> 0x0081 }
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r0 = r6.h;	 Catch:{ NullPointerException -> 0x0083 }
        org.whispersystems.U.a(r3, r0);	 Catch:{ NullPointerException -> 0x0083 }
        if (r2 == 0) goto L_0x0032;
    L_0x0027:
        r0 = r6.e;	 Catch:{ NullPointerException -> 0x0083 }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x0083 }
        r0 = (org.whispersystems.V) r0;	 Catch:{ NullPointerException -> 0x0083 }
        org.whispersystems.U.a(r3, r0);	 Catch:{ NullPointerException -> 0x0083 }
    L_0x0032:
        r0 = r4 & 4;
        r4 = 4;
        if (r0 != r4) goto L_0x003a;
    L_0x0037:
        r0 = r1 | 4;
        r1 = r0;
    L_0x003a:
        r0 = r6.j;	 Catch:{ NullPointerException -> 0x0085 }
        if (r0 != 0) goto L_0x0045;
    L_0x003e:
        r0 = r6.k;	 Catch:{ NullPointerException -> 0x0087 }
        org.whispersystems.U.a(r3, r0);	 Catch:{ NullPointerException -> 0x0087 }
        if (r2 == 0) goto L_0x0050;
    L_0x0045:
        r0 = r6.j;	 Catch:{ NullPointerException -> 0x0087 }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x0087 }
        r0 = (org.whispersystems.X) r0;	 Catch:{ NullPointerException -> 0x0087 }
        org.whispersystems.U.a(r3, r0);	 Catch:{ NullPointerException -> 0x0087 }
    L_0x0050:
        r0 = r6.g;	 Catch:{ NullPointerException -> 0x0089 }
        if (r0 != 0) goto L_0x0071;
    L_0x0054:
        r0 = r6.i;	 Catch:{ NullPointerException -> 0x008b }
        r0 = r0 & 8;
        r4 = 8;
        if (r0 != r4) goto L_0x006a;
    L_0x005c:
        r0 = r6.l;	 Catch:{ NullPointerException -> 0x008b }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ NullPointerException -> 0x008b }
        r6.l = r0;	 Catch:{ NullPointerException -> 0x008b }
        r0 = r6.i;	 Catch:{ NullPointerException -> 0x008b }
        r0 = r0 & -9;
        r6.i = r0;	 Catch:{ NullPointerException -> 0x008b }
    L_0x006a:
        r0 = r6.l;	 Catch:{ NullPointerException -> 0x008d }
        org.whispersystems.U.a(r3, r0);	 Catch:{ NullPointerException -> 0x008d }
        if (r2 == 0) goto L_0x007a;
    L_0x0071:
        r0 = r6.g;	 Catch:{ NullPointerException -> 0x008d }
        r0 = r0.f();	 Catch:{ NullPointerException -> 0x008d }
        org.whispersystems.U.a(r3, r0);	 Catch:{ NullPointerException -> 0x008d }
    L_0x007a:
        org.whispersystems.U.b(r3, r1);
        r6.f();
        return r3;
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r1 = r0;
        goto L_0x001c;
    L_0x0091:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.b():org.whispersystems.U");
    }

    public cJ m1227clone() {
        return i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 b(int r2) {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x0019 }
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r1.m();	 Catch:{ NullPointerException -> 0x001b }
        r0 = r1.l;	 Catch:{ NullPointerException -> 0x001b }
        r0.remove(r2);	 Catch:{ NullPointerException -> 0x001b }
        r1.g();	 Catch:{ NullPointerException -> 0x001b }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001b }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x001b }
        r0.d(r2);	 Catch:{ NullPointerException -> 0x001b }
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.b(int):org.whispersystems.a1");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 a(org.whispersystems.ay r3) {
        /*
        r2 = this;
        r0 = r2.j;	 Catch:{ NullPointerException -> 0x0021 }
        if (r0 != 0) goto L_0x0011;
    L_0x0004:
        r0 = r3.d();	 Catch:{ NullPointerException -> 0x0023 }
        r2.k = r0;	 Catch:{ NullPointerException -> 0x0023 }
        r2.g();	 Catch:{ NullPointerException -> 0x0023 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0023 }
        if (r0 == 0) goto L_0x001a;
    L_0x0011:
        r0 = r2.j;	 Catch:{ NullPointerException -> 0x0023 }
        r1 = r3.d();	 Catch:{ NullPointerException -> 0x0023 }
        r0.b(r1);	 Catch:{ NullPointerException -> 0x0023 }
    L_0x001a:
        r0 = r2.i;
        r0 = r0 | 4;
        r2.i = r0;
        return r2;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.a(org.whispersystems.ay):org.whispersystems.a1");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 a(java.lang.Iterable r2) {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x0019 }
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r1.m();	 Catch:{ NullPointerException -> 0x001b }
        r0 = r1.l;	 Catch:{ NullPointerException -> 0x001b }
        com.google.ch.a(r2, r0);	 Catch:{ NullPointerException -> 0x001b }
        r1.g();	 Catch:{ NullPointerException -> 0x001b }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001b }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.a(java.lang.Iterable):org.whispersystems.a1");
    }

    private fv a() {
        try {
            if (this.g == null) {
                boolean z;
                List list = this.l;
                if ((this.i & 8) == 8) {
                    z = true;
                } else {
                    z = false;
                }
                this.g = new fv(list, z, e(), a());
                this.l = null;
            }
            return this.g;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public fO m1225build() {
        return h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 a(org.whispersystems.V r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.Y.r;
        r1 = r3.e;	 Catch:{ NullPointerException -> 0x003a }
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.i;	 Catch:{ NullPointerException -> 0x003c }
        r1 = r1 & 2;
        r2 = 2;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.h;	 Catch:{ NullPointerException -> 0x003e }
        r2 = org.whispersystems.V.j();	 Catch:{ NullPointerException -> 0x003e }
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.h;	 Catch:{ NullPointerException -> 0x0040 }
        r1 = org.whispersystems.V.a(r1);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.i();	 Catch:{ NullPointerException -> 0x0040 }
        r3.h = r1;	 Catch:{ NullPointerException -> 0x0040 }
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.h = r4;	 Catch:{ NullPointerException -> 0x0040 }
    L_0x0029:
        r3.g();	 Catch:{ NullPointerException -> 0x0042 }
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.e;	 Catch:{ NullPointerException -> 0x0042 }
        r0.a(r4);	 Catch:{ NullPointerException -> 0x0042 }
    L_0x0033:
        r0 = r3.i;
        r0 = r0 | 2;
        r3.i = r0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.a(org.whispersystems.V):org.whispersystems.a1");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a1 a(org.whispersystems.W r2) {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x000e }
        if (r0 != 0) goto L_0x001f;
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
        r1.m();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = r1.l;	 Catch:{ NullPointerException -> 0x0025 }
        r0.add(r2);	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x0025 }
        r0.a(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x0024:
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a1.a(org.whispersystems.W):org.whispersystems.a1");
    }
}
