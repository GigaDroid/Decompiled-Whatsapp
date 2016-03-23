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

public final class P extends bL implements bT {
    public static final int f = 4;
    public static final int i = 1;
    public static T k = null;
    private static final P l;
    public static final int o = 2;
    public static final int q = 3;
    private static final long serialVersionUID = 0;
    private final eV e;
    private byte g;
    private hx h;
    private hx j;
    private int m;
    private int n;
    private int p;
    private int r;

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

    P(ad adVar, h hVar, aK aKVar) {
        this(adVar, hVar);
    }

    public fl toBuilder() {
        return d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private P(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.aC.d;
        r5.<init>();
        r5.g = r0;
        r5.r = r0;
        r5.o();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x005d;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x006d, IOException -> 0x0086 }
        switch(r4) {
            case 0: goto L_0x0067;
            case 10: goto L_0x0025;
            case 16: goto L_0x0033;
            case 24: goto L_0x0041;
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
        r4 = r5.m;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r4 = r4 | 1;
        r5.m = r4;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r4 = r6.q();	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r5.j = r4;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0033:
        r4 = r5.m;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r4 = r4 | 2;
        r5.m = r4;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r4 = r6.t();	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r5.n = r4;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r4 = r5.m;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r4 = r4 | 4;
        r5.m = r4;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r4 = r6.t();	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r5.p = r4;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x004f:
        r4 = r5.m;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r4 = r4 | 8;
        r5.m = r4;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r4 = r6.q();	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r5.h = r4;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.P.<init>(com.google.ad, com.google.h):void");
    }

    public boolean b() {
        return (this.m & o) == o;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.m & i) == i) {
            ebVar.d((int) i, this.j);
        }
        if ((this.m & o) == o) {
            ebVar.e((int) o, this.n);
        }
        if ((this.m & f) == f) {
            ebVar.e((int) q, this.p);
        }
        if ((this.m & 8) == 8) {
            ebVar.d((int) f, this.h);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public fO m1082getDefaultInstanceForType() {
        return k();
    }

    public boolean h() {
        return (this.m & 8) == 8;
    }

    public static P a(InputStream inputStream, h hVar) {
        return (P) k.b(inputStream, hVar);
    }

    public boolean p() {
        return (this.m & i) == i;
    }

    public int getSerializedSize() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.m & i) == i) {
            i = 0 + eb.c((int) i, this.j);
        }
        if ((this.m & o) == o) {
            i += eb.c((int) o, this.n);
        }
        if ((this.m & f) == f) {
            i += eb.c((int) q, this.p);
        }
        if ((this.m & 8) == 8) {
            i += eb.c((int) f, this.h);
        }
        i += getUnknownFields().getSerializedSize();
        this.r = i;
        return i;
    }

    public fl newBuilderForType() {
        return n();
    }

    public hx m() {
        return this.h;
    }

    private void o() {
        this.j = hx.b;
        this.n = 0;
        this.p = 0;
        this.h = hx.b;
    }

    private P(boolean z) {
        this.g = (byte) -1;
        this.r = -1;
        this.e = eV.h();
    }

    public static P b(InputStream inputStream, h hVar) {
        return (P) k.a(inputStream, hVar);
    }

    private P(cJ cJVar) {
        super(cJVar);
        this.g = (byte) -1;
        this.r = -1;
        this.e = cJVar.getUnknownFields();
    }

    public static P a(ad adVar, h hVar) {
        return (P) k.a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.i().a(P.class, a9.class);
    }

    static int a(P p, int i) {
        p.n = i;
        return i;
    }

    public static P a(hx hxVar, h hVar) {
        return (P) k.b(hxVar, hVar);
    }

    public T getParserForType() {
        return k;
    }

    public ci getDefaultInstanceForType() {
        return k();
    }

    public il m1084toBuilder() {
        return d();
    }

    public static P a(byte[] bArr, h hVar) {
        return (P) k.a(bArr, hVar);
    }

    public static P a(hx hxVar) {
        return (P) k.a(hxVar);
    }

    static boolean c() {
        return d;
    }

    public hx e() {
        return this.j;
    }

    public final eV getUnknownFields() {
        return this.e;
    }

    public static P f() {
        return l;
    }

    public static a9 a(P p) {
        return g().a(p);
    }

    public static final fn a() {
        return aC.j();
    }

    public static P a(byte[] bArr) {
        return (P) k.a(bArr);
    }

    static hx b(P p, hx hxVar) {
        p.h = hxVar;
        return hxVar;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    static int c(P p, int i) {
        p.p = i;
        return i;
    }

    public int l() {
        return this.n;
    }

    public static P a(InputStream inputStream) {
        return (P) k.b(inputStream);
    }

    public static P b(InputStream inputStream) {
        return (P) k.a(inputStream);
    }

    public boolean j() {
        return (this.m & f) == f;
    }

    static hx a(P p, hx hxVar) {
        p.j = hxVar;
        return hxVar;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public il m1083newBuilderForType() {
        return n();
    }

    public static a9 g() {
        return a9.e();
    }

    static {
        k = new bc();
        l = new P(true);
        l.o();
    }

    P(cJ cJVar, aK aKVar) {
        this(cJVar);
    }

    public a9 d() {
        return a(this);
    }

    public a9 n() {
        return g();
    }

    public int i() {
        return this.p;
    }

    public static P a(ad adVar) {
        return (P) k.a(adVar);
    }

    static int b(P p, int i) {
        p.m = i;
        return i;
    }

    public P k() {
        return l;
    }

    protected a9 a(ec ecVar) {
        return new a9(ecVar, null);
    }
}
