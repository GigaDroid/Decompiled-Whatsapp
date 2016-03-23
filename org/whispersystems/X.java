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

public final class X extends bL implements bB {
    public static T PARSER = null;
    public static final int PRIVATE_FIELD_NUMBER = 2;
    public static final int PUBLIC_FIELD_NUMBER = 1;
    private static final X j;
    private static final long serialVersionUID = 0;
    private hx e;
    private hx f;
    private byte g;
    private int h;
    private final eV i;
    private int k;

    public il m1162newBuilderForType() {
        return j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.g = r0;
        r5.h = r0;
        r5.e();
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
        r4 = r5.k;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.k = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r5.e = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.k;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.k = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.f = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.d();
        r5.i = r0;
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
        r5.i = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.X.<init>(com.google.ad, com.google.h):void");
    }

    public int getSerializedSize() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.k & PUBLIC_FIELD_NUMBER) == PUBLIC_FIELD_NUMBER) {
            i = 0 + eb.c((int) PUBLIC_FIELD_NUMBER, this.e);
        }
        if ((this.k & PRIVATE_FIELD_NUMBER) == PRIVATE_FIELD_NUMBER) {
            i += eb.c((int) PRIVATE_FIELD_NUMBER, this.f);
        }
        i += getUnknownFields().getSerializedSize();
        this.h = i;
        return i;
    }

    public ci getDefaultInstanceForType() {
        return b();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public ay j() {
        return k();
    }

    public static X a(hx hxVar) {
        return (X) PARSER.a(hxVar);
    }

    public static X a(ad adVar) {
        return (X) PARSER.a(adVar);
    }

    public X b() {
        return j;
    }

    public hx h() {
        return this.e;
    }

    public static X d() {
        return j;
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

    public static X a(byte[] bArr, h hVar) {
        return (X) PARSER.a(bArr, hVar);
    }

    public fl newBuilderForType() {
        return j();
    }

    public static X b(InputStream inputStream) {
        return (X) PARSER.b(inputStream);
    }

    public static X a(InputStream inputStream, h hVar) {
        return (X) PARSER.a(inputStream, hVar);
    }

    static hx b(X x, hx hxVar) {
        x.f = hxVar;
        return hxVar;
    }

    public boolean c() {
        return (this.k & PRIVATE_FIELD_NUMBER) == PRIVATE_FIELD_NUMBER;
    }

    X(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public fO m1160getDefaultInstanceForType() {
        return b();
    }

    private X(cJ cJVar) {
        super(cJVar);
        this.g = (byte) -1;
        this.h = -1;
        this.i = cJVar.getUnknownFields();
    }

    public static X b(InputStream inputStream, h hVar) {
        return (X) PARSER.b(inputStream, hVar);
    }

    static {
        PARSER = new b7();
        j = new X(true);
        j.e();
    }

    public static X a(byte[] bArr) {
        return (X) PARSER.a(bArr);
    }

    public static X a(hx hxVar, h hVar) {
        return (X) PARSER.b(hxVar, hVar);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.k & PUBLIC_FIELD_NUMBER) == PUBLIC_FIELD_NUMBER) {
            ebVar.d((int) PUBLIC_FIELD_NUMBER, this.e);
        }
        if ((this.k & PRIVATE_FIELD_NUMBER) == PRIVATE_FIELD_NUMBER) {
            ebVar.d((int) PRIVATE_FIELD_NUMBER, this.f);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static ay k() {
        return ay.b();
    }

    private void e() {
        this.e = hx.b;
        this.f = hx.b;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.m().a(X.class, ay.class);
    }

    public T getParserForType() {
        return PARSER;
    }

    public fl toBuilder() {
        return a();
    }

    public static X a(InputStream inputStream) {
        return (X) PARSER.a(inputStream);
    }

    static int a(X x, int i) {
        x.k = i;
        return i;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public il m1164toBuilder() {
        return a();
    }

    public ay a() {
        return a(this);
    }

    private X(boolean z) {
        this.g = (byte) -1;
        this.h = -1;
        this.i = eV.h();
    }

    X(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public static X a(ad adVar, h hVar) {
        return (X) PARSER.a(adVar, hVar);
    }

    protected ay a(ec ecVar) {
        return new ay(ecVar, null);
    }

    public final eV getUnknownFields() {
        return this.i;
    }

    static hx a(X x, hx hxVar) {
        x.e = hxVar;
        return hxVar;
    }

    public static ay a(X x) {
        return k().a(x);
    }

    public static final fn l() {
        return a5.u();
    }

    public boolean f() {
        return (this.k & PUBLIC_FIELD_NUMBER) == PUBLIC_FIELD_NUMBER;
    }

    public hx g() {
        return this.f;
    }

    static boolean i() {
        return d;
    }
}
