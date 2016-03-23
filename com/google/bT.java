package com.google;

import java.io.InputStream;

public final class bT extends bL implements f1 {
    public static final int e = 1;
    public static final int h = 2;
    private static final bT j;
    public static final int n = 3;
    public static T o;
    private static final long serialVersionUID = 0;
    private Object f;
    private final eV g;
    private int i;
    private byte k;
    private int l;
    private cM m;
    private int p;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bT(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r1 = 1;
        r0 = -1;
        r4 = com.google.bA.b;
        r7.<init>();
        r7.k = r0;
        r7.i = r0;
        r7.c();
        r5 = com.google.eV.g();
        r2 = 0;
    L_0x0013:
        if (r2 != 0) goto L_0x0072;
    L_0x0015:
        r3 = r8.z();	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
        switch(r3) {
            case 0: goto L_0x007c;
            case 10: goto L_0x00b1;
            case 16: goto L_0x00af;
            case 26: goto L_0x0043;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r2;
    L_0x001d:
        r2 = r7.a(r8, r5, r9, r3);	 Catch:{ fN -> 0x0080, IOException -> 0x0097 }
        if (r2 != 0) goto L_0x0070;
    L_0x0023:
        if (r4 == 0) goto L_0x00ad;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r2 = r7.l;	 Catch:{ fN -> 0x0093, IOException -> 0x0097 }
        r2 = r2 | 1;
        r7.l = r2;	 Catch:{ fN -> 0x0093, IOException -> 0x0097 }
        r2 = r8.q();	 Catch:{ fN -> 0x0093, IOException -> 0x0097 }
        r7.f = r2;	 Catch:{ fN -> 0x0093, IOException -> 0x0097 }
        if (r4 == 0) goto L_0x0070;
    L_0x0034:
        r2 = r7.l;	 Catch:{ fN -> 0x0095, IOException -> 0x0097 }
        r2 = r2 | 2;
        r7.l = r2;	 Catch:{ fN -> 0x0095, IOException -> 0x0097 }
        r2 = r8.i();	 Catch:{ fN -> 0x0095, IOException -> 0x0097 }
        r7.p = r2;	 Catch:{ fN -> 0x0095, IOException -> 0x0097 }
        if (r4 == 0) goto L_0x0070;
    L_0x0042:
        r2 = r0;
    L_0x0043:
        r0 = 0;
        r3 = r7.l;	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
        r3 = r3 & 4;
        r6 = 4;
        if (r3 != r6) goto L_0x00ab;
    L_0x004b:
        r0 = r7.m;	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
        r0 = r0.a();	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
        r3 = r0;
    L_0x0052:
        r0 = com.google.cM.i;	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
        r0 = r8.a(r0, r9);	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
        r0 = (com.google.cM) r0;	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
        r7.m = r0;	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
        if (r3 == 0) goto L_0x0069;
    L_0x005e:
        r0 = r7.m;	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
        r3.a(r0);	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
        r0 = r3.h();	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
        r7.m = r0;	 Catch:{ fN -> 0x00a6, IOException -> 0x0097 }
    L_0x0069:
        r0 = r7.l;	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
        r0 = r0 | 4;
        r7.l = r0;	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
        r0 = r2;
    L_0x0070:
        if (r4 == 0) goto L_0x00a8;
    L_0x0072:
        r0 = r5.d();
        r7.g = r0;
        r7.b();
        return;
    L_0x007c:
        if (r4 == 0) goto L_0x00ad;
    L_0x007e:
        r0 = r1;
        goto L_0x001d;
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
    L_0x0082:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0088 }
        throw r0;	 Catch:{ all -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        r1 = r5.d();
        r7.g = r1;
        r7.b();
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0095, IOException -> 0x0097 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0088 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0088 }
        r1.<init>(r0);	 Catch:{ all -> 0x0088 }
        r0 = r1.a(r7);	 Catch:{ all -> 0x0088 }
        throw r0;	 Catch:{ all -> 0x0088 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0082, IOException -> 0x0097 }
    L_0x00a8:
        r2 = r0;
        goto L_0x0013;
    L_0x00ab:
        r3 = r0;
        goto L_0x0052;
    L_0x00ad:
        r0 = r1;
        goto L_0x0070;
    L_0x00af:
        r0 = r2;
        goto L_0x0034;
    L_0x00b1:
        r0 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bT.<init>(com.google.ad, com.google.h):void");
    }

    public il m185toBuilder() {
        return f();
    }

    static cM a(bT bTVar, cM cMVar) {
        bTVar.m = cMVar;
        return cMVar;
    }

    public fl toBuilder() {
        return f();
    }

    public fl newBuilderForType() {
        return d();
    }

    public static bT o() {
        return j;
    }

    public T getParserForType() {
        return o;
    }

    public static bT b(InputStream inputStream, h hVar) {
        return (bT) o.a(inputStream, hVar);
    }

    public static bT a(ad adVar, h hVar) {
        return (bT) o.a(adVar, hVar);
    }

    static int a(bT bTVar, int i) {
        bTVar.l = i;
        return i;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static cZ g() {
        return cZ.a();
    }

    public static bT a(byte[] bArr, h hVar) {
        return (bT) o.a(bArr, hVar);
    }

    public bT j() {
        return j;
    }

    bT(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public fO m183getDefaultInstanceForType() {
        return j();
    }

    public boolean n() {
        return (this.l & e) == e;
    }

    public int e() {
        return this.p;
    }

    static Object b(bT bTVar) {
        return bTVar.f;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.l & e) == e) {
            ebVar.d((int) e, b());
        }
        if ((this.l & h) == h) {
            ebVar.a((int) h, this.p);
        }
        if ((this.l & 4) == 4) {
            ebVar.e((int) n, this.m);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public boolean k() {
        return (this.l & h) == h;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public hx b() {
        Object obj = this.f;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.f = a;
        return a;
    }

    protected cZ a(ec ecVar) {
        return new cZ(ecVar, null);
    }

    public static bT a(hx hxVar) {
        return (bT) o.a(hxVar);
    }

    public il m184newBuilderForType() {
        return d();
    }

    private void c() {
        this.f = "";
        this.p = 0;
        this.m = cM.k();
    }

    public cZ d() {
        return g();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.d().a(bT.class, cZ.class);
    }

    public final eV getUnknownFields() {
        return this.g;
    }

    private bT(cJ cJVar) {
        super(cJVar);
        this.k = (byte) -1;
        this.i = -1;
        this.g = cJVar.getUnknownFields();
    }

    private bT(boolean z) {
        this.k = (byte) -1;
        this.i = -1;
        this.g = eV.h();
    }

    public static cZ a(bT bTVar) {
        return g().a(bTVar);
    }

    public static bT a(ad adVar) {
        return (bT) o.a(adVar);
    }

    public final boolean isInitialized() {
        byte b = this.k;
        if (b != -1) {
            if (b == (byte) 1) {
                return true;
            }
            return false;
        } else if (!h() || p().isInitialized()) {
            this.k = (byte) 1;
            return true;
        } else {
            this.k = (byte) 0;
            return false;
        }
    }

    public cM p() {
        return this.m;
    }

    public static bT a(byte[] bArr) {
        return (bT) o.a(bArr);
    }

    public static bT a(InputStream inputStream, h hVar) {
        return (bT) o.b(inputStream, hVar);
    }

    static int b(bT bTVar, int i) {
        bTVar.p = i;
        return i;
    }

    bT(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public i9 m() {
        return this.m;
    }

    public static bT a(hx hxVar, h hVar) {
        return (bT) o.b(hxVar, hVar);
    }

    public static bT a(InputStream inputStream) {
        return (bT) o.a(inputStream);
    }

    public String i() {
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

    static Object a(bT bTVar, Object obj) {
        bTVar.f = obj;
        return obj;
    }

    static {
        o = new g3();
        j = new bT(true);
        j.c();
    }

    public static final fn l() {
        return bh.w();
    }

    public int getSerializedSize() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.l & e) == e) {
            i = 0 + eb.c((int) e, b());
        }
        if ((this.l & h) == h) {
            i += eb.i(h, this.p);
        }
        if ((this.l & 4) == 4) {
            i += eb.f((int) n, this.m);
        }
        i += getUnknownFields().getSerializedSize();
        this.i = i;
        return i;
    }

    public ci getDefaultInstanceForType() {
        return j();
    }

    public boolean h() {
        return (this.l & 4) == 4;
    }

    public cZ f() {
        return a(this);
    }

    public static bT b(InputStream inputStream) {
        return (bT) o.b(inputStream);
    }
}
