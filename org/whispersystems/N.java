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

public final class N extends bL implements D {
    public static final int f = 2;
    private static final N g;
    public static T i = null;
    public static final int n = 4;
    public static final int p = 3;
    public static final int q = 1;
    private static final long serialVersionUID = 0;
    private final eV e;
    private int h;
    private int j;
    private int k;
    private byte l;
    private hx m;
    private hx o;
    private int r;

    protected aV a(ec ecVar) {
        return new aV(ecVar, null);
    }

    public static N a(hx hxVar, h hVar) {
        return (N) i.b(hxVar, hVar);
    }

    public int getSerializedSize() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.j & q) == q) {
            i = 0 + eb.c((int) q, this.h);
        }
        if ((this.j & f) == f) {
            i += eb.c((int) f, this.r);
        }
        if ((this.j & n) == n) {
            i += eb.c((int) p, this.o);
        }
        if ((this.j & 8) == 8) {
            i += eb.c((int) n, this.m);
        }
        i += getUnknownFields().getSerializedSize();
        this.k = i;
        return i;
    }

    public fl toBuilder() {
        return e();
    }

    private N(cJ cJVar) {
        super(cJVar);
        this.l = (byte) -1;
        this.k = -1;
        this.e = cJVar.getUnknownFields();
    }

    public static N a(byte[] bArr) {
        return (N) i.a(bArr);
    }

    private N(boolean z) {
        this.l = (byte) -1;
        this.k = -1;
        this.e = eV.h();
    }

    public boolean b() {
        return (this.j & 8) == 8;
    }

    public boolean g() {
        return (this.j & n) == n;
    }

    static int a(N n, int i) {
        n.r = i;
        return i;
    }

    static boolean c() {
        return d;
    }

    public boolean p() {
        return (this.j & f) == f;
    }

    public T getParserForType() {
        return i;
    }

    private void o() {
        this.h = 0;
        this.r = 0;
        this.o = hx.b;
        this.m = hx.b;
    }

    public boolean n() {
        return (this.j & q) == q;
    }

    public static N a(InputStream inputStream) {
        return (N) i.a(inputStream);
    }

    public il m1065newBuilderForType() {
        return l();
    }

    N(cJ cJVar, aK aKVar) {
        this(cJVar);
    }

    static {
        i = new bh();
        g = new N(true);
        g.o();
    }

    N(ad adVar, h hVar, aK aKVar) {
        this(adVar, hVar);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.j & q) == q) {
            ebVar.e((int) q, this.h);
        }
        if ((this.j & f) == f) {
            ebVar.e((int) f, this.r);
        }
        if ((this.j & n) == n) {
            ebVar.d((int) p, this.o);
        }
        if ((this.j & 8) == 8) {
            ebVar.d((int) n, this.m);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static aV m() {
        return aV.b();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static N a(ad adVar, h hVar) {
        return (N) i.a(adVar, hVar);
    }

    public static N a(ad adVar) {
        return (N) i.a(adVar);
    }

    static hx a(N n, hx hxVar) {
        n.o = hxVar;
        return hxVar;
    }

    public fl newBuilderForType() {
        return l();
    }

    public static N a() {
        return g;
    }

    public static N a(InputStream inputStream, h hVar) {
        return (N) i.a(inputStream, hVar);
    }

    public int f() {
        return this.r;
    }

    public hx h() {
        return this.o;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public int i() {
        return this.h;
    }

    public final boolean isInitialized() {
        byte b = this.l;
        if (b == -1) {
            this.l = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public aV l() {
        return m();
    }

    public static N a(hx hxVar) {
        return (N) i.a(hxVar);
    }

    public static N a(byte[] bArr, h hVar) {
        return (N) i.a(bArr, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.g().a(N.class, aV.class);
    }

    public il m1066toBuilder() {
        return e();
    }

    public N j() {
        return g;
    }

    public final eV getUnknownFields() {
        return this.e;
    }

    public static aV a(N n) {
        return m().a(n);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private N(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.aC.d;
        r5.<init>();
        r5.l = r0;
        r5.k = r0;
        r5.o();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x005d;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x006d, IOException -> 0x0086 }
        switch(r4) {
            case 0: goto L_0x0067;
            case 8: goto L_0x0025;
            case 16: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x006b, IOException -> 0x0086 }
        if (r4 != 0) goto L_0x005b;
    L_0x0022:
        if (r2 == 0) goto L_0x0095;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.j;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r4 = r4 | 1;
        r5.j = r4;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r4 = r6.t();	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r5.h = r4;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0033:
        r4 = r5.j;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r4 = r4 | 2;
        r5.j = r4;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r4 = r6.t();	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r5.r = r4;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r4 = r5.j;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r4 = r4 | 4;
        r5.j = r4;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r4 = r6.q();	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r5.o = r4;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x004f:
        r4 = r5.j;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r4 = r4 | 8;
        r5.j = r4;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r4 = r6.q();	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r5.m = r4;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
    L_0x005b:
        if (r2 == 0) goto L_0x0013;
    L_0x005d:
        r0 = r3.d();
        r5.e = r0;
        r5.b();
        return;
    L_0x0067:
        if (r2 == 0) goto L_0x0095;
    L_0x0069:
        r0 = r1;
        goto L_0x001c;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x006d, IOException -> 0x0086 }
    L_0x006d:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        r1 = r3.d();
        r5.e = r1;
        r5.b();
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x006d, IOException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0073 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0073 }
        r1.<init>(r0);	 Catch:{ all -> 0x0073 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0095:
        r0 = r1;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.N.<init>(com.google.ad, com.google.h):void");
    }

    public static N b(InputStream inputStream) {
        return (N) i.b(inputStream);
    }

    static hx b(N n, hx hxVar) {
        n.m = hxVar;
        return hxVar;
    }

    public ci getDefaultInstanceForType() {
        return j();
    }

    public hx k() {
        return this.m;
    }

    public fO m1064getDefaultInstanceForType() {
        return j();
    }

    public aV e() {
        return a(this);
    }

    static int b(N n, int i) {
        n.j = i;
        return i;
    }

    public static final fn d() {
        return aC.e();
    }

    static int c(N n, int i) {
        n.h = i;
        return i;
    }

    public static N b(InputStream inputStream, h hVar) {
        return (N) i.b(inputStream, hVar);
    }
}
