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

public final class R extends bL implements c {
    public static T f = null;
    public static final int h = 3;
    private static final R k;
    public static final int l = 1;
    public static final int o = 2;
    private static final long serialVersionUID = 0;
    private hx e;
    private byte g;
    private int i;
    private int j;
    private int m;
    private final eV n;
    private hx p;

    public final eV getUnknownFields() {
        return this.n;
    }

    public fl newBuilderForType() {
        return n();
    }

    static hx a(R r, hx hxVar) {
        r.p = hxVar;
        return hxVar;
    }

    private R(cJ cJVar) {
        super(cJVar);
        this.g = (byte) -1;
        this.i = -1;
        this.n = cJVar.getUnknownFields();
    }

    public static R a(ad adVar) {
        return (R) f.a(adVar);
    }

    public static R b(InputStream inputStream, h hVar) {
        return (R) f.a(inputStream, hVar);
    }

    public a0 n() {
        return j();
    }

    static int b(R r, int i) {
        r.m = i;
        return i;
    }

    public boolean e() {
        return (this.m & l) == l;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public boolean b() {
        return (this.m & o) == o;
    }

    public il m1126toBuilder() {
        return h();
    }

    public boolean c() {
        return (this.m & 4) == 4;
    }

    public static R a(hx hxVar, h hVar) {
        return (R) f.b(hxVar, hVar);
    }

    public static a0 a(R r) {
        return j().a(r);
    }

    public static R a(byte[] bArr, h hVar) {
        return (R) f.a(bArr, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private R(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.g = r0;
        r5.i = r0;
        r5.i();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x004f;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x005f, IOException -> 0x0076 }
        switch(r4) {
            case 0: goto L_0x0059;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x005d, IOException -> 0x0076 }
        if (r4 != 0) goto L_0x004d;
    L_0x0022:
        if (r2 == 0) goto L_0x0085;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.m;	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        r4 = r4 | 1;
        r5.m = r4;	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        r4 = r6.t();	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        r5.j = r4;	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0033:
        r4 = r5.m;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r4 = r4 | 2;
        r5.m = r4;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r4 = r6.q();	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r5.e = r4;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r4 = r5.m;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r4 = r4 | 4;
        r5.m = r4;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r4 = r6.q();	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r5.p = r4;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
    L_0x004d:
        if (r2 == 0) goto L_0x0013;
    L_0x004f:
        r0 = r3.d();
        r5.n = r0;
        r5.b();
        return;
    L_0x0059:
        if (r2 == 0) goto L_0x0085;
    L_0x005b:
        r0 = r1;
        goto L_0x001c;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x005f, IOException -> 0x0076 }
    L_0x005f:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0065 }
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        r1 = r3.d();
        r5.n = r1;
        r5.b();
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x005f, IOException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0065 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0065 }
        r1.<init>(r0);	 Catch:{ all -> 0x0065 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0065 }
        throw r0;	 Catch:{ all -> 0x0065 }
    L_0x0085:
        r0 = r1;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.R.<init>(com.google.ad, com.google.h):void");
    }

    protected a0 a(ec ecVar) {
        return new a0(ecVar, null);
    }

    private void i() {
        this.j = 0;
        this.e = hx.b;
        this.p = hx.b;
    }

    static int a(R r, int i) {
        r.j = i;
        return i;
    }

    public hx g() {
        return this.e;
    }

    static hx b(R r, hx hxVar) {
        r.e = hxVar;
        return hxVar;
    }

    private R(boolean z) {
        this.g = (byte) -1;
        this.i = -1;
        this.n = eV.h();
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

    public static R k() {
        return k;
    }

    public fl toBuilder() {
        return h();
    }

    public static R a(InputStream inputStream) {
        return (R) f.a(inputStream);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.m & l) == l) {
            ebVar.e((int) l, this.j);
        }
        if ((this.m & o) == o) {
            ebVar.d((int) o, this.e);
        }
        if ((this.m & 4) == 4) {
            ebVar.d((int) h, this.p);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static a0 j() {
        return a0.f();
    }

    public ci getDefaultInstanceForType() {
        return a();
    }

    public static R b(InputStream inputStream) {
        return (R) f.b(inputStream);
    }

    public int f() {
        return this.j;
    }

    public a0 h() {
        return a(this);
    }

    public fO m1124getDefaultInstanceForType() {
        return a();
    }

    public R a() {
        return k;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.e().a(R.class, a0.class);
    }

    static {
        f = new bo();
        k = new R(true);
        k.i();
    }

    static boolean m() {
        return d;
    }

    public T getParserForType() {
        return f;
    }

    R(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public int getSerializedSize() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.m & l) == l) {
            i = 0 + eb.c((int) l, this.j);
        }
        if ((this.m & o) == o) {
            i += eb.c((int) o, this.e);
        }
        if ((this.m & 4) == 4) {
            i += eb.c((int) h, this.p);
        }
        i += getUnknownFields().getSerializedSize();
        this.i = i;
        return i;
    }

    public static R a(hx hxVar) {
        return (R) f.a(hxVar);
    }

    public hx l() {
        return this.p;
    }

    R(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public il m1125newBuilderForType() {
        return n();
    }

    public static R a(ad adVar, h hVar) {
        return (R) f.a(adVar, hVar);
    }

    public static R a(byte[] bArr) {
        return (R) f.a(bArr);
    }

    public static final fn d() {
        return a5.w();
    }

    public static R a(InputStream inputStream, h hVar) {
        return (R) f.b(inputStream, hVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }
}
