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

public final class M extends bL implements bt {
    private static final M e;
    public static final int f = 3;
    public static final int g = 1;
    public static final int h = 5;
    public static final int n = 2;
    private static final long serialVersionUID = 0;
    public static T t = null;
    public static final int u = 6;
    public static final int v = 4;
    private hx i;
    private int j;
    private hx k;
    private int l;
    private hx m;
    private int o;
    private byte p;
    private int q;
    private final eV r;
    private int s;

    public boolean p() {
        return (this.q & 32) == 32;
    }

    public int g() {
        return this.j;
    }

    private M(boolean z) {
        this.p = (byte) -1;
        this.l = -1;
        this.r = eV.h();
    }

    public static M a(byte[] bArr, h hVar) {
        return (M) t.a(bArr, hVar);
    }

    M(ad adVar, h hVar, aK aKVar) {
        this(adVar, hVar);
    }

    protected aa a(ec ecVar) {
        return new aa(ecVar, null);
    }

    public aa a() {
        return c();
    }

    static {
        t = new bO();
        e = new M(true);
        e.o();
    }

    public static M a(InputStream inputStream) {
        return (M) t.b(inputStream);
    }

    static hx c(M m, hx hxVar) {
        m.k = hxVar;
        return hxVar;
    }

    public fl toBuilder() {
        return n();
    }

    public hx d() {
        return this.k;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private M(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.aC.d;
        r5.<init>();
        r5.p = r0;
        r5.l = r0;
        r5.o();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0079;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x0089, IOException -> 0x00a6 }
        switch(r4) {
            case 0: goto L_0x0083;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            case 40: goto L_0x005d;
            case 48: goto L_0x006b;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x0087, IOException -> 0x00a6 }
        if (r4 != 0) goto L_0x0077;
    L_0x0022:
        if (r2 == 0) goto L_0x00b5;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.q;	 Catch:{ fN -> 0x009a, IOException -> 0x00a6 }
        r4 = r4 | 2;
        r5.q = r4;	 Catch:{ fN -> 0x009a, IOException -> 0x00a6 }
        r4 = r6.t();	 Catch:{ fN -> 0x009a, IOException -> 0x00a6 }
        r5.s = r4;	 Catch:{ fN -> 0x009a, IOException -> 0x00a6 }
        if (r2 == 0) goto L_0x0077;
    L_0x0033:
        r4 = r5.q;	 Catch:{ fN -> 0x009c, IOException -> 0x00a6 }
        r4 = r4 | 8;
        r5.q = r4;	 Catch:{ fN -> 0x009c, IOException -> 0x00a6 }
        r4 = r6.q();	 Catch:{ fN -> 0x009c, IOException -> 0x00a6 }
        r5.i = r4;	 Catch:{ fN -> 0x009c, IOException -> 0x00a6 }
        if (r2 == 0) goto L_0x0077;
    L_0x0041:
        r4 = r5.q;	 Catch:{ fN -> 0x009e, IOException -> 0x00a6 }
        r4 = r4 | 16;
        r5.q = r4;	 Catch:{ fN -> 0x009e, IOException -> 0x00a6 }
        r4 = r6.q();	 Catch:{ fN -> 0x009e, IOException -> 0x00a6 }
        r5.m = r4;	 Catch:{ fN -> 0x009e, IOException -> 0x00a6 }
        if (r2 == 0) goto L_0x0077;
    L_0x004f:
        r4 = r5.q;	 Catch:{ fN -> 0x00a0, IOException -> 0x00a6 }
        r4 = r4 | 32;
        r5.q = r4;	 Catch:{ fN -> 0x00a0, IOException -> 0x00a6 }
        r4 = r6.q();	 Catch:{ fN -> 0x00a0, IOException -> 0x00a6 }
        r5.k = r4;	 Catch:{ fN -> 0x00a0, IOException -> 0x00a6 }
        if (r2 == 0) goto L_0x0077;
    L_0x005d:
        r4 = r5.q;	 Catch:{ fN -> 0x00a2, IOException -> 0x00a6 }
        r4 = r4 | 1;
        r5.q = r4;	 Catch:{ fN -> 0x00a2, IOException -> 0x00a6 }
        r4 = r6.t();	 Catch:{ fN -> 0x00a2, IOException -> 0x00a6 }
        r5.j = r4;	 Catch:{ fN -> 0x00a2, IOException -> 0x00a6 }
        if (r2 == 0) goto L_0x0077;
    L_0x006b:
        r4 = r5.q;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a6 }
        r4 = r4 | 4;
        r5.q = r4;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a6 }
        r4 = r6.t();	 Catch:{ fN -> 0x00a4, IOException -> 0x00a6 }
        r5.o = r4;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a6 }
    L_0x0077:
        if (r2 == 0) goto L_0x0013;
    L_0x0079:
        r0 = r3.d();
        r5.r = r0;
        r5.b();
        return;
    L_0x0083:
        if (r2 == 0) goto L_0x00b5;
    L_0x0085:
        r0 = r1;
        goto L_0x001c;
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0089, IOException -> 0x00a6 }
    L_0x0089:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x008f }
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        r1 = r3.d();
        r5.r = r1;
        r5.b();
        throw r0;
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009c, IOException -> 0x00a6 }
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009e, IOException -> 0x00a6 }
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a0, IOException -> 0x00a6 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a2, IOException -> 0x00a6 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00a4, IOException -> 0x00a6 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0089, IOException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x008f }
        r0 = r0.getMessage();	 Catch:{ all -> 0x008f }
        r1.<init>(r0);	 Catch:{ all -> 0x008f }
        r0 = r1.a(r5);	 Catch:{ all -> 0x008f }
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x00b5:
        r0 = r1;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.M.<init>(com.google.ad, com.google.h):void");
    }

    public static M b(InputStream inputStream, h hVar) {
        return (M) t.b(inputStream, hVar);
    }

    public il m1078toBuilder() {
        return n();
    }

    public static aa a(M m) {
        return c().a(m);
    }

    public boolean b() {
        return (this.q & v) == v;
    }

    public int s() {
        return this.o;
    }

    static hx a(M m, hx hxVar) {
        m.m = hxVar;
        return hxVar;
    }

    public static M a(hx hxVar, h hVar) {
        return (M) t.b(hxVar, hVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public final eV getUnknownFields() {
        return this.r;
    }

    public il m1077newBuilderForType() {
        return a();
    }

    public static M a(hx hxVar) {
        return (M) t.a(hxVar);
    }

    public int getSerializedSize() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.q & n) == n) {
            i = 0 + eb.c((int) g, this.s);
        }
        if ((this.q & 8) == 8) {
            i += eb.c((int) n, this.i);
        }
        if ((this.q & 16) == 16) {
            i += eb.c((int) f, this.m);
        }
        if ((this.q & 32) == 32) {
            i += eb.c((int) v, this.k);
        }
        if ((this.q & g) == g) {
            i += eb.c((int) h, this.j);
        }
        if ((this.q & v) == v) {
            i += eb.c((int) u, this.o);
        }
        i += getUnknownFields().getSerializedSize();
        this.l = i;
        return i;
    }

    public boolean h() {
        return (this.q & 8) == 8;
    }

    public boolean r() {
        return (this.q & n) == n;
    }

    static hx b(M m, hx hxVar) {
        m.i = hxVar;
        return hxVar;
    }

    static int a(M m, int i) {
        m.s = i;
        return i;
    }

    public final boolean isInitialized() {
        byte b = this.p;
        if (b == -1) {
            this.p = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public aa n() {
        return a(this);
    }

    public M i() {
        return e;
    }

    private void o() {
        this.j = 0;
        this.s = 0;
        this.o = 0;
        this.i = hx.b;
        this.m = hx.b;
        this.k = hx.b;
    }

    public static M j() {
        return e;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.q & n) == n) {
            ebVar.e((int) g, this.s);
        }
        if ((this.q & 8) == 8) {
            ebVar.d((int) n, this.i);
        }
        if ((this.q & 16) == 16) {
            ebVar.d((int) f, this.m);
        }
        if ((this.q & 32) == 32) {
            ebVar.d((int) v, this.k);
        }
        if ((this.q & g) == g) {
            ebVar.e((int) h, this.j);
        }
        if ((this.q & v) == v) {
            ebVar.e((int) u, this.o);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public hx e() {
        return this.i;
    }

    public hx f() {
        return this.m;
    }

    public static M a(ad adVar, h hVar) {
        return (M) t.a(adVar, hVar);
    }

    public ci getDefaultInstanceForType() {
        return i();
    }

    public int k() {
        return this.s;
    }

    public boolean l() {
        return (this.q & 16) == 16;
    }

    public boolean q() {
        return (this.q & g) == g;
    }

    public fO m1076getDefaultInstanceForType() {
        return i();
    }

    public static M a(ad adVar) {
        return (M) t.a(adVar);
    }

    public static M a(InputStream inputStream, h hVar) {
        return (M) t.a(inputStream, hVar);
    }

    public T getParserForType() {
        return t;
    }

    static int b(M m, int i) {
        m.j = i;
        return i;
    }

    static int d(M m, int i) {
        m.o = i;
        return i;
    }

    public fl newBuilderForType() {
        return a();
    }

    static int c(M m, int i) {
        m.q = i;
        return i;
    }

    public static M a(byte[] bArr) {
        return (M) t.a(bArr);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static M b(InputStream inputStream) {
        return (M) t.a(inputStream);
    }

    static boolean t() {
        return d;
    }

    public static final fn m() {
        return aC.a();
    }

    M(cJ cJVar, aK aKVar) {
        this(cJVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.h().a(M.class, aa.class);
    }

    private M(cJ cJVar) {
        super(cJVar);
        this.p = (byte) -1;
        this.l = -1;
        this.r = cJVar.getUnknownFields();
    }

    public static aa c() {
        return aa.g();
    }
}
