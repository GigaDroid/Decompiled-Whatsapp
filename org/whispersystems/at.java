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

public final class at extends bL implements x {
    public static final int g = 1;
    public static T h = null;
    public static final int i = 2;
    private static final at k;
    public static final int m = 5;
    public static final int o = 3;
    public static final int p = 4;
    private static final long serialVersionUID = 0;
    private long e;
    private hx f;
    private hx j;
    private int l;
    private hx n;
    private final eV q;
    private int r;
    private byte s;
    private int t;

    public a4 a() {
        return k();
    }

    static {
        h = new b_();
        k = new at(true);
        k.c();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static at a(ad adVar) {
        return (at) h.a(adVar);
    }

    public hx g() {
        return this.n;
    }

    public a4 i() {
        return a(this);
    }

    static hx a(at atVar, hx hxVar) {
        atVar.n = hxVar;
        return hxVar;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.p().a(at.class, a4.class);
    }

    public static at a(InputStream inputStream, h hVar) {
        return (at) h.b(inputStream, hVar);
    }

    private at(cJ cJVar) {
        super(cJVar);
        this.s = (byte) -1;
        this.r = -1;
        this.q = cJVar.getUnknownFields();
    }

    public fl toBuilder() {
        return i();
    }

    public static at a(byte[] bArr, h hVar) {
        return (at) h.a(bArr, hVar);
    }

    public il m1276newBuilderForType() {
        return a();
    }

    public static at a(hx hxVar) {
        return (at) h.a(hxVar);
    }

    public static at a(byte[] bArr) {
        return (at) h.a(bArr);
    }

    public int j() {
        return this.l;
    }

    at(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public hx p() {
        return this.j;
    }

    public fO m1275getDefaultInstanceForType() {
        return f();
    }

    static long a(at atVar, long j) {
        atVar.e = j;
        return j;
    }

    public at f() {
        return k;
    }

    public ci getDefaultInstanceForType() {
        return f();
    }

    static boolean n() {
        return d;
    }

    public static a4 a(at atVar) {
        return k().a(atVar);
    }

    public boolean m() {
        return (this.t & 8) == 8;
    }

    public il m1277toBuilder() {
        return i();
    }

    public int getSerializedSize() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.t & g) == g) {
            i = 0 + eb.c((int) g, this.l);
        }
        if ((this.t & i) == i) {
            i += eb.c((int) i, this.n);
        }
        if ((this.t & p) == p) {
            i += eb.c((int) o, this.j);
        }
        if ((this.t & 8) == 8) {
            i += eb.c((int) p, this.f);
        }
        if ((this.t & 16) == 16) {
            i += eb.e((int) m, this.e);
        }
        i += getUnknownFields().getSerializedSize();
        this.r = i;
        return i;
    }

    private at(boolean z) {
        this.s = (byte) -1;
        this.r = -1;
        this.q = eV.h();
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.t & g) == g) {
            ebVar.e((int) g, this.l);
        }
        if ((this.t & i) == i) {
            ebVar.d((int) i, this.n);
        }
        if ((this.t & p) == p) {
            ebVar.d((int) o, this.j);
        }
        if ((this.t & 8) == 8) {
            ebVar.d((int) p, this.f);
        }
        if ((this.t & 16) == 16) {
            ebVar.a((int) m, this.e);
        }
        getUnknownFields().writeTo(ebVar);
    }

    at(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public long b() {
        return this.e;
    }

    public fl newBuilderForType() {
        return a();
    }

    public hx q() {
        return this.f;
    }

    protected a4 a(ec ecVar) {
        return new a4(ecVar, null);
    }

    public static at b(InputStream inputStream) {
        return (at) h.b(inputStream);
    }

    static hx c(at atVar, hx hxVar) {
        atVar.j = hxVar;
        return hxVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private at(com.google.ad r7, com.google.h r8) {
        /*
        r6 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r6.<init>();
        r6.s = r0;
        r6.r = r0;
        r6.c();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x006b;
    L_0x0015:
        r4 = r7.z();	 Catch:{ fN -> 0x007b, IOException -> 0x0096 }
        switch(r4) {
            case 0: goto L_0x0075;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            case 41: goto L_0x005d;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r6.a(r7, r3, r8, r4);	 Catch:{ fN -> 0x0079, IOException -> 0x0096 }
        if (r4 != 0) goto L_0x0069;
    L_0x0022:
        if (r2 == 0) goto L_0x00a5;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r6.t;	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        r4 = r4 | 1;
        r6.t = r4;	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        r4 = r7.t();	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        r6.l = r4;	 Catch:{ fN -> 0x008c, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x0033:
        r4 = r6.t;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        r4 = r4 | 2;
        r6.t = r4;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        r4 = r7.q();	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        r6.n = r4;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x0041:
        r4 = r6.t;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        r4 = r4 | 4;
        r6.t = r4;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        r4 = r7.q();	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        r6.j = r4;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x004f:
        r4 = r6.t;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        r4 = r4 | 8;
        r6.t = r4;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        r4 = r7.q();	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        r6.f = r4;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
        if (r2 == 0) goto L_0x0069;
    L_0x005d:
        r4 = r6.t;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
        r4 = r4 | 16;
        r6.t = r4;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
        r4 = r7.s();	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
        r6.e = r4;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
    L_0x0069:
        if (r2 == 0) goto L_0x0013;
    L_0x006b:
        r0 = r3.d();
        r6.q = r0;
        r6.b();
        return;
    L_0x0075:
        if (r2 == 0) goto L_0x00a5;
    L_0x0077:
        r0 = r1;
        goto L_0x001c;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x007b, IOException -> 0x0096 }
    L_0x007b:
        r0 = move-exception;
        r0 = r0.a(r6);	 Catch:{ all -> 0x0081 }
        throw r0;	 Catch:{ all -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        r1 = r3.d();
        r6.q = r1;
        r6.b();
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x008e, IOException -> 0x0096 }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0090, IOException -> 0x0096 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0092, IOException -> 0x0096 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0094, IOException -> 0x0096 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x007b, IOException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0081 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0081 }
        r1.<init>(r0);	 Catch:{ all -> 0x0081 }
        r0 = r1.a(r6);	 Catch:{ all -> 0x0081 }
        throw r0;	 Catch:{ all -> 0x0081 }
    L_0x00a5:
        r0 = r1;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.at.<init>(com.google.ad, com.google.h):void");
    }

    public static at b(InputStream inputStream, h hVar) {
        return (at) h.a(inputStream, hVar);
    }

    public final boolean isInitialized() {
        byte b = this.s;
        if (b == -1) {
            this.s = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public static at a(InputStream inputStream) {
        return (at) h.a(inputStream);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static at r() {
        return k;
    }

    static hx b(at atVar, hx hxVar) {
        atVar.f = hxVar;
        return hxVar;
    }

    public static at a(hx hxVar, h hVar) {
        return (at) h.b(hxVar, hVar);
    }

    static int a(at atVar, int i) {
        atVar.l = i;
        return i;
    }

    public static final fn h() {
        return a5.z();
    }

    static int b(at atVar, int i) {
        atVar.t = i;
        return i;
    }

    public boolean e() {
        return (this.t & 16) == 16;
    }

    public T getParserForType() {
        return h;
    }

    public static a4 k() {
        return a4.g();
    }

    public boolean d() {
        return (this.t & i) == i;
    }

    public boolean l() {
        return (this.t & g) == g;
    }

    public boolean o() {
        return (this.t & p) == p;
    }

    public static at a(ad adVar, h hVar) {
        return (at) h.a(adVar, hVar);
    }

    private void c() {
        this.l = 0;
        this.n = hx.b;
        this.j = hx.b;
        this.f = hx.b;
        this.e = 0;
    }

    public final eV getUnknownFields() {
        return this.q;
    }
}
