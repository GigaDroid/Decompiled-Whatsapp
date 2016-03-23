package org.whispersystems;

import com.google.T;
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

public final class ad extends bL implements bV {
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 2;
    public static T PARSER;
    private static final ad f;
    private static final long serialVersionUID = 0;
    private int e;
    private int g;
    private int h;
    private byte i;
    private final eV j;
    private hx k;

    protected a3 a(ec ecVar) {
        return new a3(ecVar, null);
    }

    public final boolean isInitialized() {
        byte b = this.i;
        if (b == -1) {
            this.i = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public fl toBuilder() {
        return i();
    }

    public static ad a(byte[] bArr) {
        return (ad) PARSER.a(bArr);
    }

    public static ad a(hx hxVar) {
        return (ad) PARSER.a(hxVar);
    }

    public static ad l() {
        return f;
    }

    public static ad a(com.google.ad adVar, h hVar) {
        return (ad) PARSER.a(adVar, hVar);
    }

    public static ad a(byte[] bArr, h hVar) {
        return (ad) PARSER.a(bArr, hVar);
    }

    public T getParserForType() {
        return PARSER;
    }

    public a3 h() {
        return k();
    }

    public final eV getUnknownFields() {
        return this.j;
    }

    static int a(ad adVar, int i) {
        adVar.g = i;
        return i;
    }

    public a3 i() {
        return a(this);
    }

    static int b(ad adVar, int i) {
        adVar.e = i;
        return i;
    }

    static boolean j() {
        return d;
    }

    public fO m1222getDefaultInstanceForType() {
        return b();
    }

    public il m1223newBuilderForType() {
        return h();
    }

    public static ad a(hx hxVar, h hVar) {
        return (ad) PARSER.b(hxVar, hVar);
    }

    public static final fn d() {
        return a5.l();
    }

    public fl newBuilderForType() {
        return h();
    }

    public static ad a(InputStream inputStream, h hVar) {
        return (ad) PARSER.a(inputStream, hVar);
    }

    public static a3 a(ad adVar) {
        return k().a(adVar);
    }

    public static ad a(InputStream inputStream) {
        return (ad) PARSER.a(inputStream);
    }

    public static a3 k() {
        return a3.c();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.j().a(ad.class, a3.class);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.g & INDEX_FIELD_NUMBER) == INDEX_FIELD_NUMBER) {
            ebVar.e((int) INDEX_FIELD_NUMBER, this.e);
        }
        if ((this.g & KEY_FIELD_NUMBER) == KEY_FIELD_NUMBER) {
            ebVar.d((int) KEY_FIELD_NUMBER, this.k);
        }
        getUnknownFields().writeTo(ebVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ad(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.i = r0;
        r5.h = r0;
        r5.g();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0041;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
        switch(r4) {
            case 0: goto L_0x004b;
            case 8: goto L_0x0025;
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
        r4 = r5.g;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.g = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r6.t();	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r5.e = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.g;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.g = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.k = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.d();
        r5.j = r0;
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
        r5.j = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ad.<init>(com.google.ad, com.google.h):void");
    }

    static {
        PARSER = new bG();
        f = new ad(true);
        f.g();
    }

    public static ad b(InputStream inputStream, h hVar) {
        return (ad) PARSER.b(inputStream, hVar);
    }

    public static ad a(com.google.ad adVar) {
        return (ad) PARSER.a(adVar);
    }

    public boolean e() {
        return (this.g & INDEX_FIELD_NUMBER) == INDEX_FIELD_NUMBER;
    }

    ad(com.google.ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public il m1224toBuilder() {
        return i();
    }

    public hx f() {
        return this.k;
    }

    private ad(cJ cJVar) {
        super(cJVar);
        this.i = (byte) -1;
        this.h = -1;
        this.j = cJVar.getUnknownFields();
    }

    public int c() {
        return this.e;
    }

    public int getSerializedSize() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.g & INDEX_FIELD_NUMBER) == INDEX_FIELD_NUMBER) {
            i = 0 + eb.c((int) INDEX_FIELD_NUMBER, this.e);
        }
        if ((this.g & KEY_FIELD_NUMBER) == KEY_FIELD_NUMBER) {
            i += eb.c((int) KEY_FIELD_NUMBER, this.k);
        }
        i += getUnknownFields().getSerializedSize();
        this.h = i;
        return i;
    }

    static hx a(ad adVar, hx hxVar) {
        adVar.k = hxVar;
        return hxVar;
    }

    public ad b() {
        return f;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    ad(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    private void g() {
        this.e = 0;
        this.k = hx.b;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static ad b(InputStream inputStream) {
        return (ad) PARSER.b(inputStream);
    }

    public boolean a() {
        return (this.g & KEY_FIELD_NUMBER) == KEY_FIELD_NUMBER;
    }

    public ci getDefaultInstanceForType() {
        return b();
    }

    private ad(boolean z) {
        this.i = (byte) -1;
        this.h = -1;
        this.j = eV.h();
    }
}
