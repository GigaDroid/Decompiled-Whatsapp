package com.google;

import java.io.InputStream;

public final class cF extends bL implements f_ {
    public static final int f = 1;
    public static T j = null;
    public static final int k = 2;
    private static final cF m;
    private static final long serialVersionUID = 0;
    private final eV e;
    private Object g;
    private int h;
    private boolean i;
    private byte l;
    private int n;

    private cF(boolean z) {
        this.l = (byte) -1;
        this.h = -1;
        this.e = eV.h();
    }

    public static cF a(InputStream inputStream, h hVar) {
        return (cF) j.a(inputStream, hVar);
    }

    public ce f() {
        return a(this);
    }

    public static cF a(hx hxVar) {
        return (cF) j.a(hxVar);
    }

    public il m390toBuilder() {
        return f();
    }

    static Object b(cF cFVar) {
        return cFVar.g;
    }

    public final boolean isInitialized() {
        byte b = this.l;
        if (b != -1) {
            if (b == (byte) 1) {
                return true;
            }
            return false;
        } else if (!l()) {
            this.l = (byte) 0;
            return false;
        } else if (a()) {
            this.l = (byte) 1;
            return true;
        } else {
            this.l = (byte) 0;
            return false;
        }
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.p().a(cF.class, ce.class);
    }

    protected ce a(ec ecVar) {
        return new ce(ecVar, null);
    }

    public ce d() {
        return j();
    }

    static boolean a(cF cFVar, boolean z) {
        cFVar.i = z;
        return z;
    }

    public hx m() {
        Object obj = this.g;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.g = a;
        return a;
    }

    public String h() {
        Object obj = this.g;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.g = e;
        }
        return e;
    }

    public boolean l() {
        return (this.n & f) == f;
    }

    public boolean a() {
        return (this.n & k) == k;
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    private void c() {
        this.g = "";
        this.i = false;
    }

    public cF g() {
        return m;
    }

    public boolean k() {
        return this.i;
    }

    static Object a(cF cFVar, Object obj) {
        cFVar.g = obj;
        return obj;
    }

    public static cF a(ad adVar, h hVar) {
        return (cF) j.a(adVar, hVar);
    }

    public static cF a(byte[] bArr, h hVar) {
        return (cF) j.a(bArr, hVar);
    }

    public static cF b(InputStream inputStream) {
        return (cF) j.b(inputStream);
    }

    public fO m388getDefaultInstanceForType() {
        return g();
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.n & f) == f) {
            ebVar.d((int) f, m());
        }
        if ((this.n & k) == k) {
            ebVar.a((int) k, this.i);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static cF b(InputStream inputStream, h hVar) {
        return (cF) j.b(inputStream, hVar);
    }

    public fl toBuilder() {
        return f();
    }

    public T getParserForType() {
        return j;
    }

    static {
        j = new gX();
        m = new cF(true);
        m.c();
    }

    static int a(cF cFVar, int i) {
        cFVar.n = i;
        return i;
    }

    public int getSerializedSize() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.n & f) == f) {
            i = 0 + eb.c((int) f, m());
        }
        if ((this.n & k) == k) {
            i += eb.b((int) k, this.i);
        }
        i += getUnknownFields().getSerializedSize();
        this.h = i;
        return i;
    }

    cF(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static cF a(hx hxVar, h hVar) {
        return (cF) j.b(hxVar, hVar);
    }

    public fl newBuilderForType() {
        return d();
    }

    public static final fn i() {
        return bh.f();
    }

    public final eV getUnknownFields() {
        return this.e;
    }

    public il m389newBuilderForType() {
        return d();
    }

    public static cF a(ad adVar) {
        return (cF) j.a(adVar);
    }

    public static cF e() {
        return m;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static cF a(byte[] bArr) {
        return (cF) j.a(bArr);
    }

    public static cF a(InputStream inputStream) {
        return (cF) j.a(inputStream);
    }

    public static ce a(cF cFVar) {
        return j().a(cFVar);
    }

    private cF(cJ cJVar) {
        super(cJVar);
        this.l = (byte) -1;
        this.h = -1;
        this.e = cJVar.getUnknownFields();
    }

    cF(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public static ce j() {
        return ce.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cF(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = com.google.bA.b;
        r5.<init>();
        r5.l = r0;
        r5.h = r0;
        r5.c();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0041;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
        switch(r4) {
            case 0: goto L_0x004b;
            case 10: goto L_0x0025;
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
        r4 = r5.n;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.n = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r5.g = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.n;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.n = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.w();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.i = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cF.<init>(com.google.ad, com.google.h):void");
    }
}
