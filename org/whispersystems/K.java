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

public final class K extends bL implements bn {
    public static final int g = 1;
    private static final K h;
    public static T i = null;
    public static final int k = 2;
    private static final long serialVersionUID = 0;
    private byte e;
    private hx f;
    private hx j;
    private final eV l;
    private int m;
    private int n;

    public hx j() {
        return this.f;
    }

    public K a() {
        return h;
    }

    public final eV getUnknownFields() {
        return this.l;
    }

    public hx i() {
        return this.j;
    }

    protected bJ internalGetFieldAccessorTable() {
        return v.e().a(K.class, al.class);
    }

    public int getSerializedSize() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.n & g) == g) {
            i = 0 + eb.c((int) g, this.j);
        }
        if ((this.n & k) == k) {
            i += eb.c((int) k, this.f);
        }
        i += getUnknownFields().getSerializedSize();
        this.m = i;
        return i;
    }

    public il m1047newBuilderForType() {
        return g();
    }

    public static K b(InputStream inputStream, h hVar) {
        return (K) i.b(inputStream, hVar);
    }

    public static K l() {
        return h;
    }

    public static K a(ad adVar, h hVar) {
        return (K) i.a(adVar, hVar);
    }

    public boolean h() {
        return (this.n & g) == g;
    }

    public static K a(InputStream inputStream, h hVar) {
        return (K) i.a(inputStream, hVar);
    }

    public fl toBuilder() {
        return f();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private K(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.v.e;
        r5.<init>();
        r5.e = r0;
        r5.m = r0;
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
            case 18: goto L_0x0033;
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
        r5.j = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.n;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.n = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.f = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.d();
        r5.l = r0;
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
        r5.l = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.K.<init>(com.google.ad, com.google.h):void");
    }

    public static K a(hx hxVar) {
        return (K) i.a(hxVar);
    }

    public al g() {
        return d();
    }

    static hx a(K k, hx hxVar) {
        k.f = hxVar;
        return hxVar;
    }

    public static K a(hx hxVar, h hVar) {
        return (K) i.b(hxVar, hVar);
    }

    static boolean e() {
        return d;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    K(cJ cJVar, a6 a6Var) {
        this(cJVar);
    }

    public T getParserForType() {
        return i;
    }

    public fO m1046getDefaultInstanceForType() {
        return a();
    }

    static hx b(K k, hx hxVar) {
        k.j = hxVar;
        return hxVar;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static final fn b() {
        return v.d();
    }

    public static K b(InputStream inputStream) {
        return (K) i.a(inputStream);
    }

    public fl newBuilderForType() {
        return g();
    }

    public static K a(byte[] bArr) {
        return (K) i.a(bArr);
    }

    private void c() {
        this.j = hx.b;
        this.f = hx.b;
    }

    static int a(K k, int i) {
        k.n = i;
        return i;
    }

    public il m1048toBuilder() {
        return f();
    }

    protected al a(ec ecVar) {
        return new al(ecVar, null);
    }

    public static K a(ad adVar) {
        return (K) i.a(adVar);
    }

    public static al d() {
        return al.b();
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

    static {
        i = new bE();
        h = new K(true);
        h.c();
    }

    public static K a(InputStream inputStream) {
        return (K) i.b(inputStream);
    }

    public ci getDefaultInstanceForType() {
        return a();
    }

    public static K a(byte[] bArr, h hVar) {
        return (K) i.a(bArr, hVar);
    }

    public al f() {
        return a(this);
    }

    public static al a(K k) {
        return d().a(k);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.n & g) == g) {
            ebVar.d((int) g, this.j);
        }
        if ((this.n & k) == k) {
            ebVar.d((int) k, this.f);
        }
        getUnknownFields().writeTo(ebVar);
    }

    K(ad adVar, h hVar, a6 a6Var) {
        this(adVar, hVar);
    }

    public boolean k() {
        return (this.n & k) == k;
    }

    private K(cJ cJVar) {
        super(cJVar);
        this.e = (byte) -1;
        this.m = -1;
        this.l = cJVar.getUnknownFields();
    }

    private K(boolean z) {
        this.e = (byte) -1;
        this.m = -1;
        this.l = eV.h();
    }
}
