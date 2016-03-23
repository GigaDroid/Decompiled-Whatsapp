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

public final class O extends bL implements ba {
    public static final int e = 2;
    public static T h = null;
    private static final O m;
    public static final int o = 3;
    public static final int p = 1;
    private static final long serialVersionUID = 0;
    private byte f;
    private final eV g;
    private int i;
    private int j;
    private int k;
    private int l;
    private hx n;

    public O n() {
        return m;
    }

    public fl newBuilderForType() {
        return h();
    }

    public static O c() {
        return m;
    }

    public il m1081toBuilder() {
        return m();
    }

    O(ad adVar, h hVar, aK aKVar) {
        this(adVar, hVar);
    }

    private O(boolean z) {
        this.f = (byte) -1;
        this.i = -1;
        this.g = eV.h();
    }

    static int a(O o, int i) {
        o.l = i;
        return i;
    }

    public static O a(ad adVar) {
        return (O) h.a(adVar);
    }

    public static O a(hx hxVar, h hVar) {
        return (O) h.b(hxVar, hVar);
    }

    static int b(O o, int i) {
        o.j = i;
        return i;
    }

    public static final fn d() {
        return aC.c();
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.j & p) == p) {
            ebVar.e((int) p, this.k);
        }
        if ((this.j & e) == e) {
            ebVar.e((int) e, this.l);
        }
        if ((this.j & 4) == 4) {
            ebVar.d((int) o, this.n);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public int j() {
        return this.k;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private O(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.aC.d;
        r5.<init>();
        r5.f = r0;
        r5.i = r0;
        r5.g();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x004f;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x005f, IOException -> 0x0076 }
        switch(r4) {
            case 0: goto L_0x0059;
            case 8: goto L_0x0025;
            case 16: goto L_0x0033;
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
        r4 = r5.j;	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        r4 = r4 | 1;
        r5.j = r4;	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        r4 = r6.t();	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        r5.k = r4;	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0033:
        r4 = r5.j;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r4 = r4 | 2;
        r5.j = r4;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r4 = r6.t();	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r5.l = r4;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r4 = r5.j;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r4 = r4 | 4;
        r5.j = r4;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r4 = r6.q();	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r5.n = r4;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
    L_0x004d:
        if (r2 == 0) goto L_0x0013;
    L_0x004f:
        r0 = r3.d();
        r5.g = r0;
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
        r5.g = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.O.<init>(com.google.ad, com.google.h):void");
    }

    public au m() {
        return a(this);
    }

    public au h() {
        return f();
    }

    static hx a(O o, hx hxVar) {
        o.n = hxVar;
        return hxVar;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public T getParserForType() {
        return h;
    }

    public fO m1079getDefaultInstanceForType() {
        return n();
    }

    public ci getDefaultInstanceForType() {
        return n();
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.b().a(O.class, au.class);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static O a(ad adVar, h hVar) {
        return (O) h.a(adVar, hVar);
    }

    private void g() {
        this.k = 0;
        this.l = 0;
        this.n = hx.b;
    }

    public boolean a() {
        return (this.j & e) == e;
    }

    static int c(O o, int i) {
        o.k = i;
        return i;
    }

    public static O a(byte[] bArr, h hVar) {
        return (O) h.a(bArr, hVar);
    }

    public final boolean isInitialized() {
        byte b = this.f;
        if (b == -1) {
            this.f = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public static au a(O o) {
        return f().a(o);
    }

    public boolean k() {
        return (this.j & 4) == 4;
    }

    public static O a(InputStream inputStream, h hVar) {
        return (O) h.b(inputStream, hVar);
    }

    public final eV getUnknownFields() {
        return this.g;
    }

    protected au a(ec ecVar) {
        return new au(ecVar, null);
    }

    public static O a(byte[] bArr) {
        return (O) h.a(bArr);
    }

    static {
        h = new b3();
        m = new O(true);
        m.g();
    }

    public hx b() {
        return this.n;
    }

    public static O b(InputStream inputStream, h hVar) {
        return (O) h.a(inputStream, hVar);
    }

    public int i() {
        return this.l;
    }

    public static O b(InputStream inputStream) {
        return (O) h.a(inputStream);
    }

    public int getSerializedSize() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.j & p) == p) {
            i = 0 + eb.c((int) p, this.k);
        }
        if ((this.j & e) == e) {
            i += eb.c((int) e, this.l);
        }
        if ((this.j & 4) == 4) {
            i += eb.c((int) o, this.n);
        }
        i += getUnknownFields().getSerializedSize();
        this.i = i;
        return i;
    }

    public static O a(InputStream inputStream) {
        return (O) h.b(inputStream);
    }

    public il m1080newBuilderForType() {
        return h();
    }

    public boolean l() {
        return (this.j & p) == p;
    }

    private O(cJ cJVar) {
        super(cJVar);
        this.f = (byte) -1;
        this.i = -1;
        this.g = cJVar.getUnknownFields();
    }

    static boolean e() {
        return d;
    }

    public static O a(hx hxVar) {
        return (O) h.a(hxVar);
    }

    public fl toBuilder() {
        return m();
    }

    public static au f() {
        return au.d();
    }

    O(cJ cJVar, aK aKVar) {
        this(cJVar);
    }
}
