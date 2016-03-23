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
import com.google.hx;
import com.google.il;
import com.google.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ah extends cJ implements bg {
    private List e;
    private k f;
    private ad g;
    private fv h;
    private int i;
    private hx j;
    private hx k;

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Z j() {
        Object g = g();
        try {
            if (g.isInitialized()) {
                return g;
            }
            throw a((ci) g);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah a(org.whispersystems.ad r4) {
        /*
        r3 = this;
        r0 = org.whispersystems.Y.r;
        r1 = r3.f;	 Catch:{ NullPointerException -> 0x003a }
        if (r1 != 0) goto L_0x002e;
    L_0x0006:
        r1 = r3.i;	 Catch:{ NullPointerException -> 0x003c }
        r1 = r1 & 4;
        r2 = 4;
        if (r1 != r2) goto L_0x0027;
    L_0x000d:
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x003e }
        r2 = org.whispersystems.ad.l();	 Catch:{ NullPointerException -> 0x003e }
        if (r1 == r2) goto L_0x0027;
    L_0x0015:
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x0040 }
        r1 = org.whispersystems.ad.a(r1);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.a(r4);	 Catch:{ NullPointerException -> 0x0040 }
        r1 = r1.b();	 Catch:{ NullPointerException -> 0x0040 }
        r3.g = r1;	 Catch:{ NullPointerException -> 0x0040 }
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r3.g = r4;	 Catch:{ NullPointerException -> 0x0040 }
    L_0x0029:
        r3.g();	 Catch:{ NullPointerException -> 0x0042 }
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r3.f;	 Catch:{ NullPointerException -> 0x0042 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.a(org.whispersystems.ad):org.whispersystems.ah");
    }

    public cJ m1304clone() {
        return m();
    }

    public ch m1305clone() {
        return m();
    }

    public ah a(ci ciVar) {
        try {
            if (ciVar instanceof Z) {
                this = a((Z) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static ah n() {
        return i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.Z g() {
        /*
        r6 = this;
        r0 = 1;
        r2 = org.whispersystems.Y.r;
        r3 = new org.whispersystems.Z;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.i;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x007c;
    L_0x0010:
        r1 = r6.j;
        org.whispersystems.Z.b(r3, r1);
        r1 = r4 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x001c;
    L_0x001a:
        r0 = r0 | 2;
    L_0x001c:
        r1 = r6.k;
        org.whispersystems.Z.a(r3, r1);
        r1 = r4 & 4;
        r4 = 4;
        if (r1 != r4) goto L_0x007a;
    L_0x0026:
        r0 = r0 | 4;
        r1 = r0;
    L_0x0029:
        r0 = r6.f;	 Catch:{ NullPointerException -> 0x0070 }
        if (r0 != 0) goto L_0x0034;
    L_0x002d:
        r0 = r6.g;	 Catch:{ NullPointerException -> 0x0072 }
        org.whispersystems.Z.a(r3, r0);	 Catch:{ NullPointerException -> 0x0072 }
        if (r2 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r6.f;	 Catch:{ NullPointerException -> 0x0072 }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x0072 }
        r0 = (org.whispersystems.ad) r0;	 Catch:{ NullPointerException -> 0x0072 }
        org.whispersystems.Z.a(r3, r0);	 Catch:{ NullPointerException -> 0x0072 }
    L_0x003f:
        r0 = r6.h;	 Catch:{ NullPointerException -> 0x0074 }
        if (r0 != 0) goto L_0x0060;
    L_0x0043:
        r0 = r6.i;	 Catch:{ NullPointerException -> 0x0076 }
        r0 = r0 & 8;
        r4 = 8;
        if (r0 != r4) goto L_0x0059;
    L_0x004b:
        r0 = r6.e;	 Catch:{ NullPointerException -> 0x0076 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ NullPointerException -> 0x0076 }
        r6.e = r0;	 Catch:{ NullPointerException -> 0x0076 }
        r0 = r6.i;	 Catch:{ NullPointerException -> 0x0076 }
        r0 = r0 & -9;
        r6.i = r0;	 Catch:{ NullPointerException -> 0x0076 }
    L_0x0059:
        r0 = r6.e;	 Catch:{ NullPointerException -> 0x0078 }
        org.whispersystems.Z.a(r3, r0);	 Catch:{ NullPointerException -> 0x0078 }
        if (r2 == 0) goto L_0x0069;
    L_0x0060:
        r0 = r6.h;	 Catch:{ NullPointerException -> 0x0078 }
        r0 = r0.f();	 Catch:{ NullPointerException -> 0x0078 }
        org.whispersystems.Z.a(r3, r0);	 Catch:{ NullPointerException -> 0x0078 }
    L_0x0069:
        org.whispersystems.Z.a(r3, r1);
        r6.f();
        return r3;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r1 = r0;
        goto L_0x0029;
    L_0x007c:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.g():org.whispersystems.Z");
    }

    private void a() {
        try {
            if ((this.i & 8) != 8) {
                this.e = new ArrayList(this.e);
                this.i |= 8;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah a(org.whispersystems.aj r2) {
        /*
        r1 = this;
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x000e }
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
        r1.a();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x0025 }
        r0.add(r2);	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x0025 }
        r0.a(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x0024:
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.a(org.whispersystems.aj):org.whispersystems.ah");
    }

    public fl m1309mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private k l() {
        try {
            if (this.f == null) {
                this.f = new k(this.g, e(), a());
                this.g = null;
            }
            return this.f;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ci getDefaultInstanceForType() {
        return k();
    }

    private fv h() {
        try {
            if (this.h == null) {
                boolean z;
                List list = this.e;
                if ((this.i & 8) == 8) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = new fv(list, z, e(), a());
                this.e = null;
            }
            return this.h;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public ah b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 2;
        this.k = hxVar;
        g();
        return this;
    }

    public c3 clone() {
        return m();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah a(java.lang.Iterable r2) {
        /*
        r1 = this;
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x0019 }
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r1.a();	 Catch:{ NullPointerException -> 0x001b }
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x001b }
        com.google.ch.a(r2, r0);	 Catch:{ NullPointerException -> 0x001b }
        r1.g();	 Catch:{ NullPointerException -> 0x001b }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001b }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.a(java.lang.Iterable):org.whispersystems.ah");
    }

    private static ah i() {
        return new ah();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah a(org.whispersystems.Z r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = org.whispersystems.Y.r;
        r2 = org.whispersystems.Z.a();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r5.d();	 Catch:{ NullPointerException -> 0x00ae }
        if (r2 == 0) goto L_0x0019;
    L_0x0012:
        r2 = r5.f();	 Catch:{ NullPointerException -> 0x00ae }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00ae }
    L_0x0019:
        r2 = r5.l();	 Catch:{ NullPointerException -> 0x00b0 }
        if (r2 == 0) goto L_0x0026;
    L_0x001f:
        r2 = r5.e();	 Catch:{ NullPointerException -> 0x00b0 }
        r4.b(r2);	 Catch:{ NullPointerException -> 0x00b0 }
    L_0x0026:
        r2 = r5.s();	 Catch:{ NullPointerException -> 0x00b2 }
        if (r2 == 0) goto L_0x0033;
    L_0x002c:
        r2 = r5.q();	 Catch:{ NullPointerException -> 0x00b2 }
        r4.a(r2);	 Catch:{ NullPointerException -> 0x00b2 }
    L_0x0033:
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x00b4 }
        if (r2 != 0) goto L_0x0068;
    L_0x0037:
        r2 = org.whispersystems.Z.a(r5);	 Catch:{ NullPointerException -> 0x00b6 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00b6 }
        if (r2 != 0) goto L_0x00a5;
    L_0x0041:
        r2 = r4.e;	 Catch:{ NullPointerException -> 0x00b8 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00b8 }
        if (r2 == 0) goto L_0x0057;
    L_0x0049:
        r2 = org.whispersystems.Z.a(r5);	 Catch:{ NullPointerException -> 0x00ba }
        r4.e = r2;	 Catch:{ NullPointerException -> 0x00ba }
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x00ba }
        r2 = r2 & -9;
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00ba }
        if (r1 == 0) goto L_0x0063;
    L_0x0057:
        r4.a();	 Catch:{ NullPointerException -> 0x00ba }
        r2 = r4.e;	 Catch:{ NullPointerException -> 0x00ba }
        r3 = org.whispersystems.Z.a(r5);	 Catch:{ NullPointerException -> 0x00ba }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x00ba }
    L_0x0063:
        r4.g();	 Catch:{ NullPointerException -> 0x00bc }
        if (r1 == 0) goto L_0x00a5;
    L_0x0068:
        r2 = org.whispersystems.Z.a(r5);	 Catch:{ NullPointerException -> 0x00be }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x00be }
        if (r2 != 0) goto L_0x00a5;
    L_0x0072:
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x00c0 }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x00c0 }
        if (r2 == 0) goto L_0x009c;
    L_0x007a:
        r2 = r4.h;	 Catch:{ NullPointerException -> 0x00c2 }
        r2.b();	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = 0;
        r4.h = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = org.whispersystems.Z.a(r5);	 Catch:{ NullPointerException -> 0x00c2 }
        r4.e = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = r4.i;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = r2 & -9;
        r4.i = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = org.whispersystems.Z.g();	 Catch:{ NullPointerException -> 0x00c2 }
        if (r2 == 0) goto L_0x0098;
    L_0x0094:
        r0 = r4.h();	 Catch:{ NullPointerException -> 0x00c2 }
    L_0x0098:
        r4.h = r0;	 Catch:{ NullPointerException -> 0x00c4 }
        if (r1 == 0) goto L_0x00a5;
    L_0x009c:
        r0 = r4.h;	 Catch:{ NullPointerException -> 0x00c4 }
        r1 = org.whispersystems.Z.a(r5);	 Catch:{ NullPointerException -> 0x00c4 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.a(org.whispersystems.Z):org.whispersystems.ah");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah a(int r2) {
        /*
        r1 = this;
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x0019 }
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r1.a();	 Catch:{ NullPointerException -> 0x001b }
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x001b }
        r0.remove(r2);	 Catch:{ NullPointerException -> 0x001b }
        r1.g();	 Catch:{ NullPointerException -> 0x001b }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001b }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.a(int):org.whispersystems.ah");
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.f().a(Z.class, ah.class);
    }

    public Z k() {
        return Z.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.Z.j;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.Z) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.Z) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.a(com.google.ad, com.google.h):org.whispersystems.ah");
    }

    public ch m1308mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private void d() {
        try {
            if (Z.b()) {
                l();
                h();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah f() {
        /*
        r1 = this;
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x001d }
        if (r0 != 0) goto L_0x0017;
    L_0x0004:
        r0 = java.util.Collections.emptyList();	 Catch:{ NullPointerException -> 0x001f }
        r1.e = r0;	 Catch:{ NullPointerException -> 0x001f }
        r0 = r1.i;	 Catch:{ NullPointerException -> 0x001f }
        r0 = r0 & -9;
        r1.i = r0;	 Catch:{ NullPointerException -> 0x001f }
        r1.g();	 Catch:{ NullPointerException -> 0x001f }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x001f }
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r0 = r1.h;	 Catch:{ NullPointerException -> 0x001f }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.f():org.whispersystems.ah");
    }

    public fO m1307getDefaultInstanceForType() {
        return k();
    }

    private ah(ec ecVar) {
        super(ecVar);
        this.j = hx.b;
        this.k = hx.b;
        this.g = ad.l();
        this.e = Collections.emptyList();
        d();
    }

    public ci build() {
        return j();
    }

    public fO m1303buildPartial() {
        return g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ah b(org.whispersystems.ad r2) {
        /*
        r1 = this;
        r0 = r1.f;	 Catch:{ NullPointerException -> 0x000e }
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
        r0 = r1.f;	 Catch:{ NullPointerException -> 0x0025 }
        r0.b(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x001e:
        r0 = r1.i;
        r0 = r0 | 4;
        r1.i = r0;
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ah.b(org.whispersystems.ad):org.whispersystems.ah");
    }

    public fO m1302build() {
        return j();
    }

    public fn getDescriptorForType() {
        return a5.t();
    }

    public ah a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 1;
        this.j = hxVar;
        g();
        return this;
    }

    ah(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public ci buildPartial() {
        return g();
    }

    public Object m1306clone() {
        return m();
    }

    private ah() {
        this.j = hx.b;
        this.k = hx.b;
        this.g = ad.l();
        this.e = Collections.emptyList();
        d();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public final boolean isInitialized() {
        return true;
    }

    public il m1310mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ah m() {
        return i().a(g());
    }

    public int e() {
        try {
            return this.h == null ? this.e.size() : this.h.d();
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
