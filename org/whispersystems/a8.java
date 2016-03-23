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

public final class a8 extends bL implements bv {
    public static final int BASEKEY_FIELD_NUMBER = 2;
    public static T PARSER = null;
    public static final int PREKEYID_FIELD_NUMBER = 1;
    public static final int SIGNEDPREKEYID_FIELD_NUMBER = 3;
    private static final a8 e;
    private static final long serialVersionUID = 0;
    private final eV f;
    private int g;
    private hx h;
    private int i;
    private int j;
    private byte k;
    private int l;

    public il m1203toBuilder() {
        return a();
    }

    public int i() {
        return this.g;
    }

    public static a8 n() {
        return e;
    }

    public fl toBuilder() {
        return a();
    }

    public static a8 b(InputStream inputStream, h hVar) {
        return (a8) PARSER.b(inputStream, hVar);
    }

    public hx e() {
        return this.h;
    }

    public il m1202newBuilderForType() {
        return j();
    }

    public static a8 a(InputStream inputStream) {
        return (a8) PARSER.a(inputStream);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public boolean m() {
        return (this.j & PREKEYID_FIELD_NUMBER) == PREKEYID_FIELD_NUMBER;
    }

    public int f() {
        return this.i;
    }

    private void l() {
        this.i = 0;
        this.g = 0;
        this.h = hx.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a8(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.k = r0;
        r5.l = r0;
        r5.l();
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
            case 24: goto L_0x0041;
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
        r5.i = r4;	 Catch:{ fN -> 0x0070, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0033:
        r4 = r5.j;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r4 = r4 | 4;
        r5.j = r4;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r4 = r6.q();	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        r5.h = r4;	 Catch:{ fN -> 0x0072, IOException -> 0x0076 }
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r4 = r5.j;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r4 = r4 | 2;
        r5.j = r4;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r4 = r6.i();	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
        r5.g = r4;	 Catch:{ fN -> 0x0074, IOException -> 0x0076 }
    L_0x004d:
        if (r2 == 0) goto L_0x0013;
    L_0x004f:
        r0 = r3.d();
        r5.f = r0;
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
        r5.f = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a8.<init>(com.google.ad, com.google.h):void");
    }

    a8(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public fl newBuilderForType() {
        return j();
    }

    public static a8 a(InputStream inputStream, h hVar) {
        return (a8) PARSER.a(inputStream, hVar);
    }

    public static a8 a(hx hxVar) {
        return (a8) PARSER.a(hxVar);
    }

    protected ao a(ec ecVar) {
        return new ao(ecVar, null);
    }

    static int b(a8 a8Var, int i) {
        a8Var.j = i;
        return i;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.n().a(a8.class, ao.class);
    }

    public static a8 a(ad adVar) {
        return (a8) PARSER.a(adVar);
    }

    static int c(a8 a8Var, int i) {
        a8Var.g = i;
        return i;
    }

    public static a8 b(InputStream inputStream) {
        return (a8) PARSER.b(inputStream);
    }

    public static a8 a(hx hxVar, h hVar) {
        return (a8) PARSER.b(hxVar, hVar);
    }

    public ci getDefaultInstanceForType() {
        return k();
    }

    public final eV getUnknownFields() {
        return this.f;
    }

    public final boolean isInitialized() {
        byte b = this.k;
        if (b == -1) {
            this.k = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public static ao g() {
        return ao.c();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public ao j() {
        return g();
    }

    public a8 k() {
        return e;
    }

    private a8(cJ cJVar) {
        super(cJVar);
        this.k = (byte) -1;
        this.l = -1;
        this.f = cJVar.getUnknownFields();
    }

    static hx a(a8 a8Var, hx hxVar) {
        a8Var.h = hxVar;
        return hxVar;
    }

    public T getParserForType() {
        return PARSER;
    }

    public boolean b() {
        return (this.j & 4) == 4;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.j & PREKEYID_FIELD_NUMBER) == PREKEYID_FIELD_NUMBER) {
            ebVar.e((int) PREKEYID_FIELD_NUMBER, this.i);
        }
        if ((this.j & 4) == 4) {
            ebVar.d((int) BASEKEY_FIELD_NUMBER, this.h);
        }
        if ((this.j & BASEKEY_FIELD_NUMBER) == BASEKEY_FIELD_NUMBER) {
            ebVar.a((int) SIGNEDPREKEYID_FIELD_NUMBER, this.g);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public ao a() {
        return a(this);
    }

    public static a8 a(byte[] bArr) {
        return (a8) PARSER.a(bArr);
    }

    a8(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public static a8 a(ad adVar, h hVar) {
        return (a8) PARSER.a(adVar, hVar);
    }

    static int a(a8 a8Var, int i) {
        a8Var.i = i;
        return i;
    }

    public boolean h() {
        return (this.j & BASEKEY_FIELD_NUMBER) == BASEKEY_FIELD_NUMBER;
    }

    public static a8 a(byte[] bArr, h hVar) {
        return (a8) PARSER.a(bArr, hVar);
    }

    public fO m1201getDefaultInstanceForType() {
        return k();
    }

    static boolean c() {
        return d;
    }

    static {
        PARSER = new be();
        e = new a8(true);
        e.l();
    }

    public static ao a(a8 a8Var) {
        return g().a(a8Var);
    }

    public int getSerializedSize() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.j & PREKEYID_FIELD_NUMBER) == PREKEYID_FIELD_NUMBER) {
            i = 0 + eb.c((int) PREKEYID_FIELD_NUMBER, this.i);
        }
        if ((this.j & 4) == 4) {
            i += eb.c((int) BASEKEY_FIELD_NUMBER, this.h);
        }
        if ((this.j & BASEKEY_FIELD_NUMBER) == BASEKEY_FIELD_NUMBER) {
            i += eb.i(SIGNEDPREKEYID_FIELD_NUMBER, this.g);
        }
        i += getUnknownFields().getSerializedSize();
        this.l = i;
        return i;
    }

    private a8(boolean z) {
        this.k = (byte) -1;
        this.l = -1;
        this.f = eV.h();
    }

    public static final fn d() {
        return a5.b();
    }
}
