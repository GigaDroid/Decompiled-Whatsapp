package com.google;

import java.io.InputStream;

public final class bP extends bL implements iu {
    public static final int k = 3;
    public static final int l = 1;
    private static final bP m;
    public static final int n = 2;
    public static final int o = 4;
    public static T r;
    private static final long serialVersionUID = 0;
    private cI e;
    private Object f;
    private int g;
    private Object h;
    private byte i;
    private int j;
    private final eV p;
    private Object q;

    static Object a(bP bPVar, Object obj) {
        bPVar.q = obj;
        return obj;
    }

    static int a(bP bPVar, int i) {
        bPVar.g = i;
        return i;
    }

    static Object c(bP bPVar, Object obj) {
        bPVar.f = obj;
        return obj;
    }

    public boolean q() {
        return (this.g & l) == l;
    }

    public String l() {
        Object obj = this.f;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.f = e;
        }
        return e;
    }

    public boolean r() {
        return (this.g & 8) == 8;
    }

    public cK b() {
        return a(this);
    }

    public hx p() {
        Object obj = this.q;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.q = a;
        return a;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public final eV getUnknownFields() {
        return this.p;
    }

    static Object d(bP bPVar) {
        return bPVar.h;
    }

    public hx c() {
        Object obj = this.f;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.f = a;
        return a;
    }

    public fl newBuilderForType() {
        return j();
    }

    public fl toBuilder() {
        return b();
    }

    static Object b(bP bPVar, Object obj) {
        bPVar.h = obj;
        return obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bP(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r1 = 1;
        r0 = -1;
        r4 = com.google.bA.b;
        r7.<init>();
        r7.i = r0;
        r7.j = r0;
        r7.n();
        r5 = com.google.eV.g();
        r2 = 0;
    L_0x0013:
        if (r2 != 0) goto L_0x0081;
    L_0x0015:
        r3 = r8.z();	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
        switch(r3) {
            case 0: goto L_0x008b;
            case 10: goto L_0x00c5;
            case 18: goto L_0x00c2;
            case 26: goto L_0x00c0;
            case 34: goto L_0x0051;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r2;
    L_0x001d:
        r2 = r7.a(r8, r5, r9, r3);	 Catch:{ fN -> 0x008f, IOException -> 0x00a8 }
        if (r2 != 0) goto L_0x007f;
    L_0x0023:
        if (r4 == 0) goto L_0x00be;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r2 = r7.g;	 Catch:{ fN -> 0x00a2, IOException -> 0x00a8 }
        r2 = r2 | 1;
        r7.g = r2;	 Catch:{ fN -> 0x00a2, IOException -> 0x00a8 }
        r2 = r8.q();	 Catch:{ fN -> 0x00a2, IOException -> 0x00a8 }
        r7.q = r2;	 Catch:{ fN -> 0x00a2, IOException -> 0x00a8 }
        if (r4 == 0) goto L_0x007f;
    L_0x0034:
        r2 = r7.g;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a8 }
        r2 = r2 | 2;
        r7.g = r2;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a8 }
        r2 = r8.q();	 Catch:{ fN -> 0x00a4, IOException -> 0x00a8 }
        r7.f = r2;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a8 }
        if (r4 == 0) goto L_0x007f;
    L_0x0042:
        r2 = r7.g;	 Catch:{ fN -> 0x00a6, IOException -> 0x00a8 }
        r2 = r2 | 4;
        r7.g = r2;	 Catch:{ fN -> 0x00a6, IOException -> 0x00a8 }
        r2 = r8.q();	 Catch:{ fN -> 0x00a6, IOException -> 0x00a8 }
        r7.h = r2;	 Catch:{ fN -> 0x00a6, IOException -> 0x00a8 }
        if (r4 == 0) goto L_0x007f;
    L_0x0050:
        r2 = r0;
    L_0x0051:
        r0 = 0;
        r3 = r7.g;	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
        r3 = r3 & 8;
        r6 = 8;
        if (r3 != r6) goto L_0x00bc;
    L_0x005a:
        r0 = r7.e;	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
        r0 = r0.l();	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
        r3 = r0;
    L_0x0061:
        r0 = com.google.cI.h;	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
        r0 = r8.a(r0, r9);	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
        r0 = (com.google.cI) r0;	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
        r7.e = r0;	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
        if (r3 == 0) goto L_0x0078;
    L_0x006d:
        r0 = r7.e;	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
        r3.a(r0);	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
        r0 = r3.a();	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
        r7.e = r0;	 Catch:{ fN -> 0x00b7, IOException -> 0x00a8 }
    L_0x0078:
        r0 = r7.g;	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
        r0 = r0 | 8;
        r7.g = r0;	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
        r0 = r2;
    L_0x007f:
        if (r4 == 0) goto L_0x00b9;
    L_0x0081:
        r0 = r5.d();
        r7.p = r0;
        r7.b();
        return;
    L_0x008b:
        if (r4 == 0) goto L_0x00be;
    L_0x008d:
        r0 = r1;
        goto L_0x001d;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
    L_0x0091:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0097 }
        throw r0;	 Catch:{ all -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        r1 = r5.d();
        r7.p = r1;
        r7.b();
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a8 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a6, IOException -> 0x00a8 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0097 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0097 }
        r1.<init>(r0);	 Catch:{ all -> 0x0097 }
        r0 = r1.a(r7);	 Catch:{ all -> 0x0097 }
        throw r0;	 Catch:{ all -> 0x0097 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0091, IOException -> 0x00a8 }
    L_0x00b9:
        r2 = r0;
        goto L_0x0013;
    L_0x00bc:
        r3 = r0;
        goto L_0x0061;
    L_0x00be:
        r0 = r1;
        goto L_0x007f;
    L_0x00c0:
        r0 = r2;
        goto L_0x0042;
    L_0x00c2:
        r0 = r2;
        goto L_0x0034;
    L_0x00c5:
        r0 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bP.<init>(com.google.ad, com.google.h):void");
    }

    public static bP a(byte[] bArr) {
        return (bP) r.a(bArr);
    }

    public cI k() {
        return this.e;
    }

    public static cK g() {
        return cK.j();
    }

    public boolean o() {
        return (this.g & n) == n;
    }

    public static cK a(bP bPVar) {
        return g().a(bPVar);
    }

    public cK j() {
        return g();
    }

    public String s() {
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

    static cI a(bP bPVar, cI cIVar) {
        bPVar.e = cIVar;
        return cIVar;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static Object b(bP bPVar) {
        return bPVar.q;
    }

    public boolean e() {
        return (this.g & o) == o;
    }

    private bP(boolean z) {
        this.i = (byte) -1;
        this.j = -1;
        this.p = eV.h();
    }

    public static final fn f() {
        return bh.D();
    }

    public il m107newBuilderForType() {
        return j();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.v().a(bP.class, cK.class);
    }

    public static bP a(InputStream inputStream, h hVar) {
        return (bP) r.b(inputStream, hVar);
    }

    public static bP a(hx hxVar, h hVar) {
        return (bP) r.b(hxVar, hVar);
    }

    public static bP a(ad adVar, h hVar) {
        return (bP) r.a(adVar, hVar);
    }

    public static bP h() {
        return m;
    }

    bP(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static bP b(InputStream inputStream) {
        return (bP) r.a(inputStream);
    }

    public bP m() {
        return m;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.g & l) == l) {
            ebVar.d((int) l, p());
        }
        if ((this.g & n) == n) {
            ebVar.d((int) n, c());
        }
        if ((this.g & o) == o) {
            ebVar.d((int) k, d());
        }
        if ((this.g & 8) == 8) {
            ebVar.e((int) o, this.e);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public T getParserForType() {
        return r;
    }

    static {
        r = new gK();
        m = new bP(true);
        m.n();
    }

    static Object c(bP bPVar) {
        return bPVar.f;
    }

    public int getSerializedSize() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.g & l) == l) {
            i = 0 + eb.c((int) l, p());
        }
        if ((this.g & n) == n) {
            i += eb.c((int) n, c());
        }
        if ((this.g & o) == o) {
            i += eb.c((int) k, d());
        }
        if ((this.g & 8) == 8) {
            i += eb.f((int) o, this.e);
        }
        i += getUnknownFields().getSerializedSize();
        this.j = i;
        return i;
    }

    public static bP a(InputStream inputStream) {
        return (bP) r.b(inputStream);
    }

    public ci getDefaultInstanceForType() {
        return m();
    }

    public hx d() {
        Object obj = this.h;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.h = a;
        return a;
    }

    public static bP a(ad adVar) {
        return (bP) r.a(adVar);
    }

    public static bP a(byte[] bArr, h hVar) {
        return (bP) r.a(bArr, hVar);
    }

    public static bP b(InputStream inputStream, h hVar) {
        return (bP) r.a(inputStream, hVar);
    }

    public static bP a(hx hxVar) {
        return (bP) r.a(hxVar);
    }

    private bP(cJ cJVar) {
        super(cJVar);
        this.i = (byte) -1;
        this.j = -1;
        this.p = cJVar.getUnknownFields();
    }

    private void n() {
        this.q = "";
        this.f = "";
        this.h = "";
        this.e = cI.k();
    }

    public final boolean isInitialized() {
        byte b = this.i;
        if (b != -1) {
            if (b == (byte) 1) {
                return true;
            }
            return false;
        } else if (!r() || k().isInitialized()) {
            this.i = (byte) 1;
            return true;
        } else {
            this.i = (byte) 0;
            return false;
        }
    }

    public String a() {
        Object obj = this.h;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.h = e;
        }
        return e;
    }

    protected cK a(ec ecVar) {
        return new cK(ecVar, null);
    }

    public a4 i() {
        return this.e;
    }

    public fO m106getDefaultInstanceForType() {
        return m();
    }

    bP(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public il m108toBuilder() {
        return b();
    }
}
