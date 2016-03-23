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

public final class L extends bL implements bL {
    public static final int f = 2;
    public static final int i = 1;
    private static final L j;
    public static final int l = 4;
    public static final int m = 3;
    public static final int q = 5;
    public static T s;
    private static final long serialVersionUID = 0;
    private hx e;
    private hx g;
    private hx h;
    private byte k;
    private int n;
    private hx o;
    private int p;
    private final eV r;
    private int t;

    public ci getDefaultInstanceForType() {
        return q();
    }

    public static aI a(L l) {
        return a().a(l);
    }

    private void c() {
        this.n = 0;
        this.o = hx.b;
        this.g = hx.b;
        this.h = hx.b;
        this.e = hx.b;
    }

    private L(cJ cJVar) {
        super(cJVar);
        this.k = (byte) -1;
        this.t = -1;
        this.r = cJVar.getUnknownFields();
    }

    static hx b(L l, hx hxVar) {
        l.o = hxVar;
        return hxVar;
    }

    public hx i() {
        return this.g;
    }

    public aI e() {
        return a();
    }

    public int getSerializedSize() {
        int i = this.t;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.p & i) == i) {
            i = 0 + eb.c((int) i, this.n);
        }
        if ((this.p & f) == f) {
            i += eb.c((int) f, this.o);
        }
        if ((this.p & l) == l) {
            i += eb.c((int) m, this.g);
        }
        if ((this.p & 8) == 8) {
            i += eb.c((int) l, this.h);
        }
        if ((this.p & 16) == 16) {
            i += eb.c((int) q, this.e);
        }
        i += getUnknownFields().getSerializedSize();
        this.t = i;
        return i;
    }

    L(cJ cJVar, aK aKVar) {
        this(cJVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.d().a(L.class, aI.class);
    }

    public fO m1061getDefaultInstanceForType() {
        return q();
    }

    public hx j() {
        return this.h;
    }

    public T getParserForType() {
        return s;
    }

    public hx l() {
        return this.o;
    }

    public static L b(InputStream inputStream, h hVar) {
        return (L) s.b(inputStream, hVar);
    }

    public boolean r() {
        return (this.p & 16) == 16;
    }

    public static L a(byte[] bArr, h hVar) {
        return (L) s.a(bArr, hVar);
    }

    public L q() {
        return j;
    }

    static {
        s = new by();
        j = new L(true);
        j.c();
    }

    public static L a(ad adVar) {
        return (L) s.a(adVar);
    }

    public fl newBuilderForType() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private L(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.aC.d;
        r5.<init>();
        r5.k = r0;
        r5.t = r0;
        r5.c();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x006b;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x007b, IOException -> 0x0096 }
        switch(r4) {
            case 0: goto L_0x0075;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            case 42: goto L_0x005d;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x0079, IOException -> 0x0096 }
        if (r4 != 0) goto L_0x0069;
    L_0x0022:
        if (r2 == 0) goto L_0x00a5;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.p;	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        r4 = r4 | 1;
        r5.p = r4;	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        r4 = r6.t();	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        r5.n = r4;	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x0033:
        r4 = r5.p;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        r4 = r4 | 2;
        r5.p = r4;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        r4 = r6.q();	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        r5.o = r4;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x0041:
        r4 = r5.p;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        r4 = r4 | 4;
        r5.p = r4;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        r4 = r6.q();	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        r5.g = r4;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x004f:
        r4 = r5.p;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        r4 = r4 | 8;
        r5.p = r4;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        r4 = r6.q();	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        r5.h = r4;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x005d:
        r4 = r5.p;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
        r4 = r4 | 16;
        r5.p = r4;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
        r4 = r6.q();	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
        r5.e = r4;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
    L_0x0069:
        if (r2 == 0) goto L_0x0013;
    L_0x006b:
        r0 = r3.d();
        r5.r = r0;
        r5.b();
        return;
    L_0x0075:
        if (r2 == 0) goto L_0x00a5;
    L_0x0077:
        r0 = r1;
        goto L_0x001c;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x007b, IOException -> 0x0096 }
    L_0x007b:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0081 }
        throw r0;	 Catch:{ all -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        r1 = r3.d();
        r5.r = r1;
        r5.b();
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x007b, IOException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0081 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0081 }
        r1.<init>(r0);	 Catch:{ all -> 0x0081 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0081 }
        throw r0;	 Catch:{ all -> 0x0081 }
    L_0x00a5:
        r0 = r1;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.L.<init>(com.google.ad, com.google.h):void");
    }

    protected aI a(ec ecVar) {
        return new aI(ecVar, null);
    }

    public static L a(ad adVar, h hVar) {
        return (L) s.a(adVar, hVar);
    }

    public static L k() {
        return j;
    }

    public static L a(hx hxVar) {
        return (L) s.a(hxVar);
    }

    static hx a(L l, hx hxVar) {
        l.e = hxVar;
        return hxVar;
    }

    L(ad adVar, h hVar, aK aKVar) {
        this(adVar, hVar);
    }

    static int b(L l, int i) {
        l.p = i;
        return i;
    }

    public static L a(InputStream inputStream, h hVar) {
        return (L) s.a(inputStream, hVar);
    }

    public fl toBuilder() {
        return d();
    }

    public il m1062newBuilderForType() {
        return e();
    }

    public boolean m() {
        return (this.p & f) == f;
    }

    static boolean o() {
        return d;
    }

    public static L a(byte[] bArr) {
        return (L) s.a(bArr);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static aI a() {
        return aI.g();
    }

    static hx c(L l, hx hxVar) {
        l.g = hxVar;
        return hxVar;
    }

    public aI d() {
        return a(this);
    }

    public boolean h() {
        return (this.p & i) == i;
    }

    public static final fn s() {
        return aC.f();
    }

    public int n() {
        return this.n;
    }

    public boolean f() {
        return (this.p & l) == l;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.p & i) == i) {
            ebVar.e((int) i, this.n);
        }
        if ((this.p & f) == f) {
            ebVar.d((int) f, this.o);
        }
        if ((this.p & l) == l) {
            ebVar.d((int) m, this.g);
        }
        if ((this.p & 8) == 8) {
            ebVar.d((int) l, this.h);
        }
        if ((this.p & 16) == 16) {
            ebVar.d((int) q, this.e);
        }
        getUnknownFields().writeTo(ebVar);
    }

    static int a(L l, int i) {
        l.n = i;
        return i;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static L a(hx hxVar, h hVar) {
        return (L) s.b(hxVar, hVar);
    }

    private L(boolean z) {
        this.k = (byte) -1;
        this.t = -1;
        this.r = eV.h();
    }

    public static L a(InputStream inputStream) {
        return (L) s.a(inputStream);
    }

    public hx g() {
        return this.e;
    }

    public final boolean isInitialized() {
        byte b = this.k;
        if (b == -1) {
            this.k = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean p() {
        return (this.p & 8) == 8;
    }

    public il m1063toBuilder() {
        return d();
    }

    static hx d(L l, hx hxVar) {
        l.h = hxVar;
        return hxVar;
    }

    public static L b(InputStream inputStream) {
        return (L) s.b(inputStream);
    }

    public final eV getUnknownFields() {
        return this.r;
    }
}
