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

public final class Q extends bL implements s {
    public static final int i = 2;
    public static T j = null;
    public static final int l = 1;
    private static final Q n;
    private static final long serialVersionUID = 0;
    private int e;
    private int f;
    private byte g;
    private final eV h;
    private hx k;
    private hx m;

    public aq b() {
        return a(this);
    }

    public static Q a(InputStream inputStream) {
        return (Q) j.a(inputStream);
    }

    public ci getDefaultInstanceForType() {
        return c();
    }

    public static Q a(hx hxVar, h hVar) {
        return (Q) j.b(hxVar, hVar);
    }

    public int getSerializedSize() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f & l) == l) {
            i = 0 + eb.c((int) l, this.m);
        }
        if ((this.f & i) == i) {
            i += eb.c((int) i, this.k);
        }
        i += getUnknownFields().getSerializedSize();
        this.e = i;
        return i;
    }

    protected aq a(ec ecVar) {
        return new aq(ecVar, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Q(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.g = r0;
        r5.e = r0;
        r5.k();
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
        r4 = r5.f;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.f = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r5.m = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.f;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.f = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.k = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.d();
        r5.h = r0;
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
        r5.h = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.Q.<init>(com.google.ad, com.google.h):void");
    }

    public static Q a(hx hxVar) {
        return (Q) j.a(hxVar);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.f & l) == l) {
            ebVar.d((int) l, this.m);
        }
        if ((this.f & i) == i) {
            ebVar.d((int) i, this.k);
        }
        getUnknownFields().writeTo(ebVar);
    }

    static boolean i() {
        return d;
    }

    static hx b(Q q, hx hxVar) {
        q.m = hxVar;
        return hxVar;
    }

    public final eV getUnknownFields() {
        return this.h;
    }

    public static final fn e() {
        return a5.k();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    private Q(cJ cJVar) {
        super(cJVar);
        this.g = (byte) -1;
        this.e = -1;
        this.h = cJVar.getUnknownFields();
    }

    Q(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    private void k() {
        this.m = hx.b;
        this.k = hx.b;
    }

    public fl newBuilderForType() {
        return l();
    }

    public aq l() {
        return f();
    }

    public fl toBuilder() {
        return b();
    }

    public hx d() {
        return this.k;
    }

    static int a(Q q, int i) {
        q.f = i;
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

    public hx h() {
        return this.m;
    }

    public T getParserForType() {
        return j;
    }

    private Q(boolean z) {
        this.g = (byte) -1;
        this.e = -1;
        this.h = eV.h();
    }

    public Q c() {
        return n;
    }

    public boolean a() {
        return (this.f & l) == l;
    }

    static hx a(Q q, hx hxVar) {
        q.k = hxVar;
        return hxVar;
    }

    public static Q a(ad adVar) {
        return (Q) j.a(adVar);
    }

    public static Q a(ad adVar, h hVar) {
        return (Q) j.a(adVar, hVar);
    }

    public static Q a(byte[] bArr) {
        return (Q) j.a(bArr);
    }

    public static Q b(InputStream inputStream) {
        return (Q) j.b(inputStream);
    }

    public static aq a(Q q) {
        return f().a(q);
    }

    public il m1114toBuilder() {
        return b();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.h().a(Q.class, aq.class);
    }

    public static Q b(InputStream inputStream, h hVar) {
        return (Q) j.b(inputStream, hVar);
    }

    public boolean g() {
        return (this.f & i) == i;
    }

    public il m1113newBuilderForType() {
        return l();
    }

    static {
        j = new bJ();
        n = new Q(true);
        n.k();
    }

    public static Q a(byte[] bArr, h hVar) {
        return (Q) j.a(bArr, hVar);
    }

    Q(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public static Q j() {
        return n;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public fO m1112getDefaultInstanceForType() {
        return c();
    }

    public static aq f() {
        return aq.c();
    }

    public static Q a(InputStream inputStream, h hVar) {
        return (Q) j.a(inputStream, hVar);
    }
}
