package org.whispersystems;

import com.google.T;
import com.google.ad;
import com.google.bJ;
import com.google.bL;
import com.google.cJ;
import com.google.ci;
import com.google.eV;
import com.google.eb;
import com.google.ec;
import com.google.fO;
import com.google.fl;
import com.google.fn;
import com.google.h;
import com.google.hx;
import com.google.il;
import java.io.InputStream;

public final class J extends bL implements a {
    public static final int h = 3;
    public static final int j = 1;
    public static T l = null;
    public static final int m = 2;
    private static final J o;
    private static final long serialVersionUID = 0;
    private byte e;
    private int f;
    private int g;
    private K i;
    private int k;
    private final eV n;
    private K p;

    public static J a(InputStream inputStream) {
        return (J) l.a(inputStream);
    }

    protected aU a(ec ecVar) {
        return new aU(ecVar, null);
    }

    static int a(J j, int i) {
        j.f = i;
        return i;
    }

    public int j() {
        return this.g;
    }

    static K a(J j, K k) {
        j.p = k;
        return k;
    }

    public bn p() {
        return this.p;
    }

    public static J l() {
        return o;
    }

    public fO m1049getDefaultInstanceForType() {
        return e();
    }

    public boolean g() {
        return (this.f & 4) == 4;
    }

    public static J b(InputStream inputStream) {
        return (J) l.b(inputStream);
    }

    public static J a(byte[] bArr) {
        return (J) l.a(bArr);
    }

    public final boolean isInitialized() {
        byte b = this.e;
        if (b == -1) {
            this.e = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private J(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r4 = 0;
        r1 = 1;
        r0 = -1;
        r5 = org.whispersystems.v.e;
        r7.<init>();
        r7.e = r0;
        r7.k = r0;
        r7.o();
        r6 = com.google.eV.g();
        r2 = 0;
    L_0x0014:
        if (r2 != 0) goto L_0x0091;
    L_0x0016:
        r3 = r8.z();	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        switch(r3) {
            case 0: goto L_0x009b;
            case 8: goto L_0x00d3;
            case 18: goto L_0x0036;
            case 26: goto L_0x0063;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0 = r2;
    L_0x001e:
        r2 = r7.a(r8, r6, r9, r3);	 Catch:{ fN -> 0x009f, IOException -> 0x00b4 }
        if (r2 != 0) goto L_0x008f;
    L_0x0024:
        if (r5 == 0) goto L_0x00d1;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        r2 = r7.f;	 Catch:{ fN -> 0x00b2, IOException -> 0x00b4 }
        r2 = r2 | 1;
        r7.f = r2;	 Catch:{ fN -> 0x00b2, IOException -> 0x00b4 }
        r2 = r8.t();	 Catch:{ fN -> 0x00b2, IOException -> 0x00b4 }
        r7.g = r2;	 Catch:{ fN -> 0x00b2, IOException -> 0x00b4 }
        if (r5 == 0) goto L_0x008f;
    L_0x0035:
        r2 = r0;
    L_0x0036:
        r0 = r7.f;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r0 = r0 & 2;
        r3 = 2;
        if (r0 != r3) goto L_0x00ce;
    L_0x003d:
        r0 = r7.i;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r0 = r0.f();	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r3 = r0;
    L_0x0044:
        r0 = org.whispersystems.K.i;	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
        r0 = r8.a(r0, r9);	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
        r0 = (org.whispersystems.K) r0;	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
        r7.i = r0;	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
        if (r3 == 0) goto L_0x005b;
    L_0x0050:
        r0 = r7.i;	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
        r3.a(r0);	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
        r0 = r3.e();	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
        r7.i = r0;	 Catch:{ fN -> 0x00c3, IOException -> 0x00b4 }
    L_0x005b:
        r0 = r7.f;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r0 = r0 | 2;
        r7.f = r0;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        if (r5 == 0) goto L_0x00cc;
    L_0x0063:
        r0 = r7.f;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r0 = r0 & 4;
        r3 = 4;
        if (r0 != r3) goto L_0x00ca;
    L_0x006a:
        r0 = r7.p;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r0 = r0.f();	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r3 = r0;
    L_0x0071:
        r0 = org.whispersystems.K.i;	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
        r0 = r8.a(r0, r9);	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
        r0 = (org.whispersystems.K) r0;	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
        r7.p = r0;	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
        if (r3 == 0) goto L_0x0088;
    L_0x007d:
        r0 = r7.p;	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
        r3.a(r0);	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
        r0 = r3.e();	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
        r7.p = r0;	 Catch:{ fN -> 0x00c5, IOException -> 0x00b4 }
    L_0x0088:
        r0 = r7.f;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r0 = r0 | 4;
        r7.f = r0;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
        r0 = r2;
    L_0x008f:
        if (r5 == 0) goto L_0x00c7;
    L_0x0091:
        r0 = r6.d();
        r7.n = r0;
        r7.b();
        return;
    L_0x009b:
        if (r5 == 0) goto L_0x00d1;
    L_0x009d:
        r0 = r1;
        goto L_0x001e;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
    L_0x00a1:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x00a7 }
        throw r0;	 Catch:{ all -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        r1 = r6.d();
        r7.n = r1;
        r7.b();
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x00a7 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00a7 }
        r1.<init>(r0);	 Catch:{ all -> 0x00a7 }
        r0 = r1.a(r7);	 Catch:{ all -> 0x00a7 }
        throw r0;	 Catch:{ all -> 0x00a7 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a1, IOException -> 0x00b4 }
    L_0x00c7:
        r2 = r0;
        goto L_0x0014;
    L_0x00ca:
        r3 = r4;
        goto L_0x0071;
    L_0x00cc:
        r0 = r2;
        goto L_0x008f;
    L_0x00ce:
        r3 = r4;
        goto L_0x0044;
    L_0x00d1:
        r0 = r1;
        goto L_0x008f;
    L_0x00d3:
        r0 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.J.<init>(com.google.ad, com.google.h):void");
    }

    static K b(J j, K k) {
        j.i = k;
        return k;
    }

    public static aU a(J j) {
        return n().a(j);
    }

    public fl newBuilderForType() {
        return i();
    }

    public int getSerializedSize() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f & j) == j) {
            i = 0 + eb.c((int) j, this.g);
        }
        if ((this.f & m) == m) {
            i += eb.f((int) m, this.i);
        }
        if ((this.f & 4) == 4) {
            i += eb.f((int) h, this.p);
        }
        i += getUnknownFields().getSerializedSize();
        this.k = i;
        return i;
    }

    static int b(J j, int i) {
        j.g = i;
        return i;
    }

    J(cJ cJVar, a6 a6Var) {
        this(cJVar);
    }

    private void o() {
        this.g = 0;
        this.i = K.l();
        this.p = K.l();
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    public boolean c() {
        return (this.f & m) == m;
    }

    public K f() {
        return this.p;
    }

    public fl toBuilder() {
        return b();
    }

    public static J a(ad adVar, h hVar) {
        return (J) l.a(adVar, hVar);
    }

    public J e() {
        return o;
    }

    public T getParserForType() {
        return l;
    }

    static boolean k() {
        return d;
    }

    public static J a(hx hxVar, h hVar) {
        return (J) l.b(hxVar, hVar);
    }

    public il m1050newBuilderForType() {
        return i();
    }

    public static aU n() {
        return aU.k();
    }

    public bn a() {
        return this.i;
    }

    public il m1051toBuilder() {
        return b();
    }

    J(ad adVar, h hVar, a6 a6Var) {
        this(adVar, hVar);
    }

    public K h() {
        return this.i;
    }

    public static J a(byte[] bArr, h hVar) {
        return (J) l.a(bArr, hVar);
    }

    public static J a(InputStream inputStream, h hVar) {
        return (J) l.a(inputStream, hVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    protected bJ internalGetFieldAccessorTable() {
        return v.b().a(J.class, aU.class);
    }

    public final eV getUnknownFields() {
        return this.n;
    }

    public aU i() {
        return n();
    }

    public static J a(hx hxVar) {
        return (J) l.a(hxVar);
    }

    public boolean m() {
        return (this.f & j) == j;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static J a(ad adVar) {
        return (J) l.a(adVar);
    }

    private J(cJ cJVar) {
        super(cJVar);
        this.e = (byte) -1;
        this.k = -1;
        this.n = cJVar.getUnknownFields();
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.f & j) == j) {
            ebVar.e((int) j, this.g);
        }
        if ((this.f & m) == m) {
            ebVar.e((int) m, this.i);
        }
        if ((this.f & 4) == 4) {
            ebVar.e((int) h, this.p);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static J b(InputStream inputStream, h hVar) {
        return (J) l.b(inputStream, hVar);
    }

    static {
        l = new bQ();
        o = new J(true);
        o.o();
    }

    public static final fn d() {
        return v.c();
    }

    private J(boolean z) {
        this.e = (byte) -1;
        this.k = -1;
        this.n = eV.h();
    }

    public aU b() {
        return a(this);
    }
}
