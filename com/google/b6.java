package com.google;

import java.io.InputStream;

public final class b6 extends bL implements cQ {
    public static final int g = 7;
    public static final int i = 1;
    public static final int j = 5;
    public static final int m = 8;
    private static final b6 n;
    public static final int r = 2;
    private static final long serialVersionUID = 0;
    public static final int t = 4;
    public static final int u = 3;
    public static final int y = 6;
    public static T z;
    private Object e;
    private cw f;
    private int h;
    private Object k;
    private Object l;
    private final eV o;
    private int p;
    private Object q;
    private cY s;
    private iq v;
    private byte w;
    private int x;

    public iq d() {
        return this.v;
    }

    public T getParserForType() {
        return z;
    }

    public fl newBuilderForType() {
        return j();
    }

    b6(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public boolean y() {
        return (this.p & 16) == 16;
    }

    public cw p() {
        return this.f;
    }

    public cD j() {
        return h();
    }

    static Object a(b6 b6Var, Object obj) {
        b6Var.k = obj;
        return obj;
    }

    public ci getDefaultInstanceForType() {
        return r();
    }

    public il m143toBuilder() {
        return x();
    }

    protected cD a(ec ecVar) {
        return new cD(ecVar, null);
    }

    public final boolean isInitialized() {
        byte b = this.w;
        if (b != -1) {
            if (b == (byte) 1) {
                return true;
            }
            return false;
        } else if (!l() || k().isInitialized()) {
            this.w = (byte) 1;
            return true;
        } else {
            this.w = (byte) 0;
            return false;
        }
    }

    public String i() {
        Object obj = this.k;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.k = e;
        }
        return e;
    }

    public b6 r() {
        return n;
    }

    static Object b(b6 b6Var) {
        return b6Var.k;
    }

    static Object c(b6 b6Var) {
        return b6Var.e;
    }

    public il m142newBuilderForType() {
        return j();
    }

    b6(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static b6 a(ad adVar) {
        return (b6) z.a(adVar);
    }

    public boolean s() {
        return (this.p & r) == r;
    }

    public boolean A() {
        return (this.p & t) == t;
    }

    public fO m141getDefaultInstanceForType() {
        return r();
    }

    public bZ z() {
        return this.s;
    }

    private void u() {
        this.e = "";
        this.h = 0;
        this.f = cw.LABEL_OPTIONAL;
        this.v = iq.TYPE_DOUBLE;
        this.l = "";
        this.q = "";
        this.k = "";
        this.s = cY.w();
    }

    public String a() {
        Object obj = this.l;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.l = e;
        }
        return e;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public cD x() {
        return e(this);
    }

    public boolean c() {
        return (this.p & 32) == 32;
    }

    private b6(cJ cJVar) {
        super(cJVar);
        this.w = (byte) -1;
        this.x = -1;
        this.o = cJVar.getUnknownFields();
    }

    public int g() {
        return this.h;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static cD e(b6 b6Var) {
        return h().a(b6Var);
    }

    public static b6 a(ad adVar, h hVar) {
        return (b6) z.a(adVar, hVar);
    }

    static cw a(b6 b6Var, cw cwVar) {
        b6Var.f = cwVar;
        return cwVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b6(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r1 = 1;
        r0 = -1;
        r4 = com.google.bA.b;
        r7.<init>();
        r7.w = r0;
        r7.x = r0;
        r7.u();
        r5 = com.google.eV.g();
        r2 = 0;
    L_0x0013:
        if (r2 != 0) goto L_0x00d1;
    L_0x0015:
        r3 = r8.z();	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        switch(r3) {
            case 0: goto L_0x00db;
            case 10: goto L_0x012f;
            case 18: goto L_0x012c;
            case 24: goto L_0x0129;
            case 32: goto L_0x0126;
            case 40: goto L_0x0123;
            case 50: goto L_0x0120;
            case 58: goto L_0x011d;
            case 66: goto L_0x00a1;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r2;
    L_0x001d:
        r2 = r7.a(r8, r5, r9, r3);	 Catch:{ fN -> 0x00e0, IOException -> 0x00f9 }
        if (r2 != 0) goto L_0x00cf;
    L_0x0023:
        if (r4 == 0) goto L_0x011b;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r2 = r7.p;	 Catch:{ fN -> 0x00f3, IOException -> 0x00f9 }
        r2 = r2 | 1;
        r7.p = r2;	 Catch:{ fN -> 0x00f3, IOException -> 0x00f9 }
        r2 = r8.q();	 Catch:{ fN -> 0x00f3, IOException -> 0x00f9 }
        r7.e = r2;	 Catch:{ fN -> 0x00f3, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0034:
        r2 = r7.p;	 Catch:{ fN -> 0x00f5, IOException -> 0x00f9 }
        r2 = r2 | 32;
        r7.p = r2;	 Catch:{ fN -> 0x00f5, IOException -> 0x00f9 }
        r2 = r8.q();	 Catch:{ fN -> 0x00f5, IOException -> 0x00f9 }
        r7.q = r2;	 Catch:{ fN -> 0x00f5, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0042:
        r2 = r7.p;	 Catch:{ fN -> 0x00f7, IOException -> 0x00f9 }
        r2 = r2 | 2;
        r7.p = r2;	 Catch:{ fN -> 0x00f7, IOException -> 0x00f9 }
        r2 = r8.i();	 Catch:{ fN -> 0x00f7, IOException -> 0x00f9 }
        r7.h = r2;	 Catch:{ fN -> 0x00f7, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0050:
        r2 = r8.b();	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        r3 = com.google.cw.valueOf(r2);	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        if (r3 != 0) goto L_0x0060;
    L_0x005a:
        r6 = 4;
        r5.a(r6, r2);	 Catch:{ fN -> 0x0108, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0060:
        r2 = r7.p;	 Catch:{ fN -> 0x010a, IOException -> 0x00f9 }
        r2 = r2 | 4;
        r7.p = r2;	 Catch:{ fN -> 0x010a, IOException -> 0x00f9 }
        r7.f = r3;	 Catch:{ fN -> 0x010a, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x006a:
        r2 = r8.b();	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        r3 = com.google.iq.valueOf(r2);	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        if (r3 != 0) goto L_0x007a;
    L_0x0074:
        r6 = 5;
        r5.a(r6, r2);	 Catch:{ fN -> 0x010c, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x007a:
        r2 = r7.p;	 Catch:{ fN -> 0x010e, IOException -> 0x00f9 }
        r2 = r2 | 8;
        r7.p = r2;	 Catch:{ fN -> 0x010e, IOException -> 0x00f9 }
        r7.v = r3;	 Catch:{ fN -> 0x010e, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0084:
        r2 = r7.p;	 Catch:{ fN -> 0x0110, IOException -> 0x00f9 }
        r2 = r2 | 16;
        r7.p = r2;	 Catch:{ fN -> 0x0110, IOException -> 0x00f9 }
        r2 = r8.q();	 Catch:{ fN -> 0x0110, IOException -> 0x00f9 }
        r7.l = r2;	 Catch:{ fN -> 0x0110, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x0092:
        r2 = r7.p;	 Catch:{ fN -> 0x0112, IOException -> 0x00f9 }
        r2 = r2 | 64;
        r7.p = r2;	 Catch:{ fN -> 0x0112, IOException -> 0x00f9 }
        r2 = r8.q();	 Catch:{ fN -> 0x0112, IOException -> 0x00f9 }
        r7.k = r2;	 Catch:{ fN -> 0x0112, IOException -> 0x00f9 }
        if (r4 == 0) goto L_0x00cf;
    L_0x00a0:
        r2 = r0;
    L_0x00a1:
        r0 = 0;
        r3 = r7.p;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        r3 = r3 & 128;
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 != r6) goto L_0x0119;
    L_0x00aa:
        r0 = r7.s;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        r0 = r0.j();	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        r3 = r0;
    L_0x00b1:
        r0 = com.google.cY.n;	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
        r0 = r8.a(r0, r9);	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
        r0 = (com.google.cY) r0;	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
        r7.s = r0;	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
        if (r3 == 0) goto L_0x00c8;
    L_0x00bd:
        r0 = r7.s;	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
        r3.a(r0);	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
        r0 = r3.k();	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
        r7.s = r0;	 Catch:{ fN -> 0x0114, IOException -> 0x00f9 }
    L_0x00c8:
        r0 = r7.p;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        r0 = r0 | 128;
        r7.p = r0;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
        r0 = r2;
    L_0x00cf:
        if (r4 == 0) goto L_0x0116;
    L_0x00d1:
        r0 = r5.d();
        r7.o = r0;
        r7.b();
        return;
    L_0x00db:
        if (r4 == 0) goto L_0x011b;
    L_0x00dd:
        r0 = r1;
        goto L_0x001d;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
    L_0x00e2:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x00e8 }
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        r1 = r5.d();
        r7.o = r1;
        r7.b();
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00f5, IOException -> 0x00f9 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00f7, IOException -> 0x00f9 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x00e8 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00e8 }
        r1.<init>(r0);	 Catch:{ all -> 0x00e8 }
        r0 = r1.a(r7);	 Catch:{ all -> 0x00e8 }
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x010a, IOException -> 0x00f9 }
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x010e, IOException -> 0x00f9 }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0110, IOException -> 0x00f9 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0112, IOException -> 0x00f9 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e2, IOException -> 0x00f9 }
    L_0x0116:
        r2 = r0;
        goto L_0x0013;
    L_0x0119:
        r3 = r0;
        goto L_0x00b1;
    L_0x011b:
        r0 = r1;
        goto L_0x00cf;
    L_0x011d:
        r0 = r2;
        goto L_0x0092;
    L_0x0120:
        r0 = r2;
        goto L_0x0084;
    L_0x0123:
        r0 = r2;
        goto L_0x006a;
    L_0x0126:
        r0 = r2;
        goto L_0x0050;
    L_0x0129:
        r0 = r2;
        goto L_0x0042;
    L_0x012c:
        r0 = r2;
        goto L_0x0034;
    L_0x012f:
        r0 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b6.<init>(com.google.ad, com.google.h):void");
    }

    static cY a(b6 b6Var, cY cYVar) {
        b6Var.s = cYVar;
        return cYVar;
    }

    static Object d(b6 b6Var, Object obj) {
        b6Var.e = obj;
        return obj;
    }

    public static b6 t() {
        return n;
    }

    public boolean f() {
        return (this.p & m) == m;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.p & i) == i) {
            ebVar.d((int) i, m());
        }
        if ((this.p & 32) == 32) {
            ebVar.d((int) r, o());
        }
        if ((this.p & r) == r) {
            ebVar.a((int) u, this.h);
        }
        if ((this.p & t) == t) {
            ebVar.f((int) t, this.f.getNumber());
        }
        if ((this.p & m) == m) {
            ebVar.f((int) j, this.v.getNumber());
        }
        if ((this.p & 16) == 16) {
            ebVar.d((int) y, w());
        }
        if ((this.p & 64) == 64) {
            ebVar.d((int) g, B());
        }
        if ((this.p & 128) == 128) {
            ebVar.e((int) m, this.s);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public hx B() {
        Object obj = this.k;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.k = a;
        return a;
    }

    public cY k() {
        return this.s;
    }

    static int b(b6 b6Var, int i) {
        b6Var.h = i;
        return i;
    }

    static Object c(b6 b6Var, Object obj) {
        b6Var.l = obj;
        return obj;
    }

    public fl toBuilder() {
        return x();
    }

    public static b6 b(InputStream inputStream) {
        return (b6) z.b(inputStream);
    }

    public static b6 a(InputStream inputStream, h hVar) {
        return (b6) z.a(inputStream, hVar);
    }

    public String b() {
        Object obj = this.e;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.e = e;
        }
        return e;
    }

    public boolean n() {
        return (this.p & 64) == 64;
    }

    public static b6 a(InputStream inputStream) {
        return (b6) z.a(inputStream);
    }

    static {
        z = new gJ();
        n = new b6(true);
        n.u();
    }

    public static final fn e() {
        return bh.s();
    }

    private b6(boolean z) {
        this.w = (byte) -1;
        this.x = -1;
        this.o = eV.h();
    }

    public hx m() {
        Object obj = this.e;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.e = a;
        return a;
    }

    public String v() {
        Object obj = this.q;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.q = e;
        }
        return e;
    }

    static int a(b6 b6Var, int i) {
        b6Var.p = i;
        return i;
    }

    public static b6 a(hx hxVar, h hVar) {
        return (b6) z.b(hxVar, hVar);
    }

    static iq a(b6 b6Var, iq iqVar) {
        b6Var.v = iqVar;
        return iqVar;
    }

    public static b6 a(byte[] bArr) {
        return (b6) z.a(bArr);
    }

    public hx w() {
        Object obj = this.l;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.l = a;
        return a;
    }

    public boolean l() {
        return (this.p & 128) == 128;
    }

    public static b6 a(hx hxVar) {
        return (b6) z.a(hxVar);
    }

    public final eV getUnknownFields() {
        return this.o;
    }

    static Object a(b6 b6Var) {
        return b6Var.l;
    }

    public int getSerializedSize() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.p & i) == i) {
            i = 0 + eb.c((int) i, m());
        }
        if ((this.p & 32) == 32) {
            i += eb.c((int) r, o());
        }
        if ((this.p & r) == r) {
            i += eb.i(u, this.h);
        }
        if ((this.p & t) == t) {
            i += eb.b((int) t, this.f.getNumber());
        }
        if ((this.p & m) == m) {
            i += eb.b((int) j, this.v.getNumber());
        }
        if ((this.p & 16) == 16) {
            i += eb.c((int) y, w());
        }
        if ((this.p & 64) == 64) {
            i += eb.c((int) g, B());
        }
        if ((this.p & 128) == 128) {
            i += eb.f((int) m, this.s);
        }
        i += getUnknownFields().getSerializedSize();
        this.x = i;
        return i;
    }

    public static cD h() {
        return cD.e();
    }

    public boolean q() {
        return (this.p & i) == i;
    }

    public static b6 a(byte[] bArr, h hVar) {
        return (b6) z.a(bArr, hVar);
    }

    public hx o() {
        Object obj = this.q;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.q = a;
        return a;
    }

    static Object b(b6 b6Var, Object obj) {
        b6Var.q = obj;
        return obj;
    }

    static Object d(b6 b6Var) {
        return b6Var.q;
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.c().a(b6.class, cD.class);
    }

    public static b6 b(InputStream inputStream, h hVar) {
        return (b6) z.b(inputStream, hVar);
    }
}
