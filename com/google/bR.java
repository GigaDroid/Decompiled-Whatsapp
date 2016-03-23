package com.google;

import java.io.InputStream;

public final class bR extends bL implements dP {
    public static final int f = 1;
    public static T j = null;
    public static final int k = 2;
    private static final bR l;
    private static final long serialVersionUID = 0;
    private final eV e;
    private byte g;
    private int h;
    private int i;
    private int m;
    private int n;

    public final eV getUnknownFields() {
        return this.e;
    }

    static {
        j = new gQ();
        l = new bR(true);
        l.c();
    }

    public static final fn h() {
        return bh.g();
    }

    public int l() {
        return this.h;
    }

    public static bR a(ad adVar, h hVar) {
        return (bR) j.a(adVar, hVar);
    }

    protected c4 a(ec ecVar) {
        return new c4(ecVar, null);
    }

    public static bR a(InputStream inputStream) {
        return (bR) j.a(inputStream);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public fl newBuilderForType() {
        return d();
    }

    public c4 m() {
        return a(this);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.m & f) == f) {
            ebVar.a((int) f, this.i);
        }
        if ((this.m & k) == k) {
            ebVar.a((int) k, this.h);
        }
        getUnknownFields().writeTo(ebVar);
    }

    private bR(boolean z) {
        this.g = (byte) -1;
        this.n = -1;
        this.e = eV.h();
    }

    public ci getDefaultInstanceForType() {
        return i();
    }

    bR(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    bR(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static c4 g() {
        return c4.a();
    }

    public fO m158getDefaultInstanceForType() {
        return i();
    }

    public static bR a(InputStream inputStream, h hVar) {
        return (bR) j.b(inputStream, hVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public c4 d() {
        return g();
    }

    public static bR b(InputStream inputStream, h hVar) {
        return (bR) j.a(inputStream, hVar);
    }

    public fl toBuilder() {
        return m();
    }

    public int e() {
        return this.i;
    }

    public static bR a(ad adVar) {
        return (bR) j.a(adVar);
    }

    private bR(cJ cJVar) {
        super(cJVar);
        this.g = (byte) -1;
        this.n = -1;
        this.e = cJVar.getUnknownFields();
    }

    public boolean f() {
        return (this.m & k) == k;
    }

    public boolean k() {
        return (this.m & f) == f;
    }

    public T getParserForType() {
        return j;
    }

    public static bR a(byte[] bArr, h hVar) {
        return (bR) j.a(bArr, hVar);
    }

    public il m160toBuilder() {
        return m();
    }

    public int getSerializedSize() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.m & f) == f) {
            i = 0 + eb.i(f, this.i);
        }
        if ((this.m & k) == k) {
            i += eb.i(k, this.h);
        }
        i += getUnknownFields().getSerializedSize();
        this.n = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bR(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = com.google.bA.b;
        r5.<init>();
        r5.g = r0;
        r5.n = r0;
        r5.c();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0041;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
        switch(r4) {
            case 0: goto L_0x004b;
            case 8: goto L_0x0025;
            case 16: goto L_0x0033;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x004f, IOException -> 0x0066 }
        if (r4 != 0) goto L_0x003f;
    L_0x0022:
        if (r2 == 0) goto L_0x0075;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.m;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.m = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r6.i();	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r5.i = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.m;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.m = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.i();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.h = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.d();
        r5.e = r0;
        r5.b();
        return;
    L_0x004b:
        if (r2 == 0) goto L_0x0075;
    L_0x004d:
        r0 = r1;
        goto L_0x001c;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
    L_0x0051:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        r1 = r3.d();
        r5.e = r1;
        r5.b();
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0057 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0057 }
        r1.<init>(r0);	 Catch:{ all -> 0x0057 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0075:
        r0 = r1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bR.<init>(com.google.ad, com.google.h):void");
    }

    static int a(bR bRVar, int i) {
        bRVar.h = i;
        return i;
    }

    public final boolean isInitialized() {
        byte b = this.g;
        if (b == -1) {
            this.g = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public static bR a(hx hxVar, h hVar) {
        return (bR) j.b(hxVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.k().a(bR.class, c4.class);
    }

    static int c(bR bRVar, int i) {
        bRVar.m = i;
        return i;
    }

    public il m159newBuilderForType() {
        return d();
    }

    public static bR a(byte[] bArr) {
        return (bR) j.a(bArr);
    }

    public static bR b(InputStream inputStream) {
        return (bR) j.b(inputStream);
    }

    public static c4 a(bR bRVar) {
        return g().a(bRVar);
    }

    public static bR a(hx hxVar) {
        return (bR) j.a(hxVar);
    }

    private void c() {
        this.i = 0;
        this.h = 0;
    }

    public static bR j() {
        return l;
    }

    static int b(bR bRVar, int i) {
        bRVar.i = i;
        return i;
    }

    public bR i() {
        return l;
    }
}
