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

public final class aF extends bL implements as {
    public static T f = null;
    public static final int i = 5;
    public static final int j = 4;
    public static final int n = 1;
    private static final long serialVersionUID = 0;
    private static final aF t;
    public static final int u = 8;
    public static final int v = 7;
    public static final int w = 2;
    public static final int x = 3;
    private int e;
    private int g;
    private hx h;
    private hx k;
    private hx l;
    private hx m;
    private int o;
    private hx p;
    private byte q;
    private final eV r;
    private hx s;

    public aJ i() {
        return a(this);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public fl newBuilderForType() {
        return l();
    }

    public hx j() {
        return this.s;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    private void v() {
        this.o = 0;
        this.h = hx.b;
        this.s = hx.b;
        this.p = hx.b;
        this.l = hx.b;
        this.k = hx.b;
        this.m = hx.b;
    }

    public hx s() {
        return this.l;
    }

    public int a() {
        return this.o;
    }

    static hx f(aF aFVar, hx hxVar) {
        aFVar.h = hxVar;
        return hxVar;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.e & n) == n) {
            ebVar.e((int) n, this.o);
        }
        if ((this.e & w) == w) {
            ebVar.d((int) w, this.h);
        }
        if ((this.e & j) == j) {
            ebVar.d((int) x, this.s);
        }
        if ((this.e & u) == u) {
            ebVar.d((int) j, this.p);
        }
        if ((this.e & 16) == 16) {
            ebVar.d((int) i, this.l);
        }
        if ((this.e & 32) == 32) {
            ebVar.d((int) v, this.k);
        }
        if ((this.e & 64) == 64) {
            ebVar.d((int) u, this.m);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public aF o() {
        return t;
    }

    public hx m() {
        return this.k;
    }

    public int getSerializedSize() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.e & n) == n) {
            i = 0 + eb.c((int) n, this.o);
        }
        if ((this.e & w) == w) {
            i += eb.c((int) w, this.h);
        }
        if ((this.e & j) == j) {
            i += eb.c((int) x, this.s);
        }
        if ((this.e & u) == u) {
            i += eb.c((int) j, this.p);
        }
        if ((this.e & 16) == 16) {
            i += eb.c((int) i, this.l);
        }
        if ((this.e & 32) == 32) {
            i += eb.c((int) v, this.k);
        }
        if ((this.e & 64) == 64) {
            i += eb.c((int) u, this.m);
        }
        i += getUnknownFields().getSerializedSize();
        this.g = i;
        return i;
    }

    public static aF a(hx hxVar) {
        return (aF) f.a(hxVar);
    }

    public static aF a(ad adVar) {
        return (aF) f.a(adVar);
    }

    public ci getDefaultInstanceForType() {
        return o();
    }

    public static aF a(byte[] bArr) {
        return (aF) f.a(bArr);
    }

    aF(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    private aF(cJ cJVar) {
        super(cJVar);
        this.q = (byte) -1;
        this.g = -1;
        this.r = cJVar.getUnknownFields();
    }

    public T getParserForType() {
        return f;
    }

    static int b(aF aFVar, int i) {
        aFVar.o = i;
        return i;
    }

    static hx a(aF aFVar, hx hxVar) {
        aFVar.p = hxVar;
        return hxVar;
    }

    public boolean t() {
        return (this.e & 64) == 64;
    }

    public il m1264newBuilderForType() {
        return l();
    }

    public static aF a(InputStream inputStream) {
        return (aF) f.a(inputStream);
    }

    public fO m1263getDefaultInstanceForType() {
        return o();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.D().a(aF.class, aJ.class);
    }

    public static aF b(InputStream inputStream) {
        return (aF) f.b(inputStream);
    }

    public static aJ u() {
        return aJ.b();
    }

    public aJ l() {
        return u();
    }

    public fl toBuilder() {
        return i();
    }

    static hx c(aF aFVar, hx hxVar) {
        aFVar.s = hxVar;
        return hxVar;
    }

    static {
        f = new bk();
        t = new aF(true);
        t.v();
    }

    public boolean p() {
        return (this.e & 16) == 16;
    }

    aF(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    static hx e(aF aFVar, hx hxVar) {
        aFVar.l = hxVar;
        return hxVar;
    }

    public hx n() {
        return this.m;
    }

    static boolean q() {
        return d;
    }

    public boolean d() {
        return (this.e & 32) == 32;
    }

    public static aJ a(aF aFVar) {
        return u().a(aFVar);
    }

    public final eV getUnknownFields() {
        return this.r;
    }

    static hx d(aF aFVar, hx hxVar) {
        aFVar.k = hxVar;
        return hxVar;
    }

    public boolean g() {
        return (this.e & w) == w;
    }

    static hx b(aF aFVar, hx hxVar) {
        aFVar.m = hxVar;
        return hxVar;
    }

    public final boolean isInitialized() {
        byte b = this.q;
        if (b == -1) {
            this.q = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public static aF a(hx hxVar, h hVar) {
        return (aF) f.b(hxVar, hVar);
    }

    public boolean k() {
        return (this.e & u) == u;
    }

    static int a(aF aFVar, int i) {
        aFVar.e = i;
        return i;
    }

    protected aJ a(ec ecVar) {
        return new aJ(ecVar, null);
    }

    public static aF b(InputStream inputStream, h hVar) {
        return (aF) f.a(inputStream, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private aF(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.q = r0;
        r5.g = r0;
        r5.v();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0087;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x0097, IOException -> 0x00b6 }
        switch(r4) {
            case 0: goto L_0x0091;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            case 42: goto L_0x005d;
            case 58: goto L_0x006b;
            case 66: goto L_0x0079;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x0095, IOException -> 0x00b6 }
        if (r4 != 0) goto L_0x0085;
    L_0x0022:
        if (r2 == 0) goto L_0x00c5;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.e;	 Catch:{ fN -> 0x00a8, IOException -> 0x00b6 }
        r4 = r4 | 1;
        r5.e = r4;	 Catch:{ fN -> 0x00a8, IOException -> 0x00b6 }
        r4 = r6.t();	 Catch:{ fN -> 0x00a8, IOException -> 0x00b6 }
        r5.o = r4;	 Catch:{ fN -> 0x00a8, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x0033:
        r4 = r5.e;	 Catch:{ fN -> 0x00aa, IOException -> 0x00b6 }
        r4 = r4 | 2;
        r5.e = r4;	 Catch:{ fN -> 0x00aa, IOException -> 0x00b6 }
        r4 = r6.q();	 Catch:{ fN -> 0x00aa, IOException -> 0x00b6 }
        r5.h = r4;	 Catch:{ fN -> 0x00aa, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x0041:
        r4 = r5.e;	 Catch:{ fN -> 0x00ac, IOException -> 0x00b6 }
        r4 = r4 | 4;
        r5.e = r4;	 Catch:{ fN -> 0x00ac, IOException -> 0x00b6 }
        r4 = r6.q();	 Catch:{ fN -> 0x00ac, IOException -> 0x00b6 }
        r5.s = r4;	 Catch:{ fN -> 0x00ac, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x004f:
        r4 = r5.e;	 Catch:{ fN -> 0x00ae, IOException -> 0x00b6 }
        r4 = r4 | 8;
        r5.e = r4;	 Catch:{ fN -> 0x00ae, IOException -> 0x00b6 }
        r4 = r6.q();	 Catch:{ fN -> 0x00ae, IOException -> 0x00b6 }
        r5.p = r4;	 Catch:{ fN -> 0x00ae, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x005d:
        r4 = r5.e;	 Catch:{ fN -> 0x00b0, IOException -> 0x00b6 }
        r4 = r4 | 16;
        r5.e = r4;	 Catch:{ fN -> 0x00b0, IOException -> 0x00b6 }
        r4 = r6.q();	 Catch:{ fN -> 0x00b0, IOException -> 0x00b6 }
        r5.l = r4;	 Catch:{ fN -> 0x00b0, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x006b:
        r4 = r5.e;	 Catch:{ fN -> 0x00b2, IOException -> 0x00b6 }
        r4 = r4 | 32;
        r5.e = r4;	 Catch:{ fN -> 0x00b2, IOException -> 0x00b6 }
        r4 = r6.q();	 Catch:{ fN -> 0x00b2, IOException -> 0x00b6 }
        r5.k = r4;	 Catch:{ fN -> 0x00b2, IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x0085;
    L_0x0079:
        r4 = r5.e;	 Catch:{ fN -> 0x00b4, IOException -> 0x00b6 }
        r4 = r4 | 64;
        r5.e = r4;	 Catch:{ fN -> 0x00b4, IOException -> 0x00b6 }
        r4 = r6.q();	 Catch:{ fN -> 0x00b4, IOException -> 0x00b6 }
        r5.m = r4;	 Catch:{ fN -> 0x00b4, IOException -> 0x00b6 }
    L_0x0085:
        if (r2 == 0) goto L_0x0013;
    L_0x0087:
        r0 = r3.d();
        r5.r = r0;
        r5.b();
        return;
    L_0x0091:
        if (r2 == 0) goto L_0x00c5;
    L_0x0093:
        r0 = r1;
        goto L_0x001c;
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0097, IOException -> 0x00b6 }
    L_0x0097:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x009d }
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        r1 = r3.d();
        r5.r = r1;
        r5.b();
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00aa, IOException -> 0x00b6 }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ac, IOException -> 0x00b6 }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ae, IOException -> 0x00b6 }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00b0, IOException -> 0x00b6 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00b2, IOException -> 0x00b6 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00b4, IOException -> 0x00b6 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0097, IOException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x009d }
        r0 = r0.getMessage();	 Catch:{ all -> 0x009d }
        r1.<init>(r0);	 Catch:{ all -> 0x009d }
        r0 = r1.a(r5);	 Catch:{ all -> 0x009d }
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x00c5:
        r0 = r1;
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aF.<init>(com.google.ad, com.google.h):void");
    }

    public static final fn b() {
        return a5.r();
    }

    public boolean c() {
        return (this.e & j) == j;
    }

    public hx r() {
        return this.h;
    }

    public static aF f() {
        return t;
    }

    public static aF a(byte[] bArr, h hVar) {
        return (aF) f.a(bArr, hVar);
    }

    public boolean h() {
        return (this.e & n) == n;
    }

    public static aF a(ad adVar, h hVar) {
        return (aF) f.a(adVar, hVar);
    }

    public il m1265toBuilder() {
        return i();
    }

    private aF(boolean z) {
        this.q = (byte) -1;
        this.g = -1;
        this.r = eV.h();
    }

    public static aF a(InputStream inputStream, h hVar) {
        return (aF) f.b(inputStream, hVar);
    }

    public hx e() {
        return this.p;
    }
}
