package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class b2 extends bL implements ej {
    private static final b2 h;
    public static final int j = 1;
    public static T k;
    private static final long serialVersionUID = 0;
    private final eV e;
    private int f;
    private byte g;
    private List i;

    public static b2 a(ad adVar) {
        return (b2) k.a(adVar);
    }

    private b2(cJ cJVar) {
        super(cJVar);
        this.g = (byte) -1;
        this.f = -1;
        this.e = cJVar.getUnknownFields();
    }

    public ci getDefaultInstanceForType() {
        return a();
    }

    public il m126toBuilder() {
        return b();
    }

    public il m125newBuilderForType() {
        return c();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.g;
        if (b == -1) {
            int i = 0;
            while (i < i()) {
                if (b(i).isInitialized()) {
                    i += j;
                    if (z) {
                        break;
                    }
                }
                this.g = (byte) 0;
                return false;
            }
            this.g = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public final eV getUnknownFields() {
        return this.e;
    }

    public static c7 j() {
        return c7.f();
    }

    public int getSerializedSize() {
        boolean z = bA.b;
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.i.size()) {
            i3 += eb.f((int) j, (fO) this.i.get(i));
            i2 = i + j;
            if (z) {
                break;
            }
            i = i2;
        }
        i2 = getUnknownFields().getSerializedSize() + i3;
        this.f = i2;
        return i2;
    }

    public static b2 a(byte[] bArr, h hVar) {
        return (b2) k.a(bArr, hVar);
    }

    public static b2 e() {
        return h;
    }

    public List d() {
        return this.i;
    }

    public fO m124getDefaultInstanceForType() {
        return a();
    }

    public hc a(int i) {
        return (hc) this.i.get(i);
    }

    private void f() {
        this.i = Collections.emptyList();
    }

    public T getParserForType() {
        return k;
    }

    static List b(b2 b2Var) {
        return b2Var.i;
    }

    public static b2 a(InputStream inputStream) {
        return (b2) k.a(inputStream);
    }

    static {
        k = new gD();
        h = new b2(true);
        h.f();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.a().a(b2.class, c7.class);
    }

    public static b2 b(InputStream inputStream) {
        return (b2) k.b(inputStream);
    }

    public c7 c() {
        return j();
    }

    protected c7 a(ec ecVar) {
        return new c7(ecVar, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b2(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.bA.b;
        r7.<init>();
        r7.g = r1;
        r7.f = r1;
        r7.f();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0040;
    L_0x0016:
        r5 = r8.z();	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        switch(r5) {
            case 0: goto L_0x0056;
            case 10: goto L_0x0026;
            default: goto L_0x001d;
        };
    L_0x001d:
        r5 = r7.a(r8, r4, r9, r5);	 Catch:{ fN -> 0x005a, IOException -> 0x007b }
        if (r5 != 0) goto L_0x003e;
    L_0x0023:
        if (r3 == 0) goto L_0x008c;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0033;
    L_0x002a:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r5.<init>();	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r7.i = r5;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.i;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r6 = com.google.bB.y;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r6 = r8.a(r6, r9);	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r5.add(r6);	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.i;	 Catch:{ fN -> 0x0079 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x0079 }
        r7.i = r0;	 Catch:{ fN -> 0x0079 }
    L_0x004c:
        r0 = r4.d();
        r7.e = r0;
        r7.b();
        return;
    L_0x0056:
        if (r3 == 0) goto L_0x008c;
    L_0x0058:
        r0 = r2;
        goto L_0x001d;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
    L_0x005c:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        r1 = r1 & 1;
        if (r1 != r2) goto L_0x006f;
    L_0x0067:
        r1 = r7.i;	 Catch:{ fN -> 0x008a }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x008a }
        r7.i = r1;	 Catch:{ fN -> 0x008a }
    L_0x006f:
        r1 = r4.d();
        r7.e = r1;
        r7.b();
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        r3 = new com.google.fN;	 Catch:{ all -> 0x0062 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0062 }
        r3.<init>(r0);	 Catch:{ all -> 0x0062 }
        r0 = r3.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r2;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b2.<init>(com.google.ad, com.google.h):void");
    }

    public fl newBuilderForType() {
        return c();
    }

    public static b2 a(hx hxVar) {
        return (b2) k.a(hxVar);
    }

    public static b2 a(ad adVar, h hVar) {
        return (b2) k.a(adVar, hVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public bB b(int i) {
        return (bB) this.i.get(i);
    }

    static List a(b2 b2Var, List list) {
        b2Var.i = list;
        return list;
    }

    public static final fn g() {
        return bh.A();
    }

    public c7 b() {
        return a(this);
    }

    public fl toBuilder() {
        return b();
    }

    public b2 a() {
        return h;
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        int i = 0;
        while (i < this.i.size()) {
            ebVar.e((int) j, (fO) this.i.get(i));
            int i2 = i + j;
            if (z) {
                break;
            }
            i = i2;
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static b2 b(InputStream inputStream, h hVar) {
        return (b2) k.a(inputStream, hVar);
    }

    b2(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public List h() {
        return this.i;
    }

    public static c7 a(b2 b2Var) {
        return j().a(b2Var);
    }

    public static b2 a(hx hxVar, h hVar) {
        return (b2) k.b(hxVar, hVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    b2(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public static b2 a(InputStream inputStream, h hVar) {
        return (b2) k.b(inputStream, hVar);
    }

    private b2(boolean z) {
        this.g = (byte) -1;
        this.f = -1;
        this.e = eV.h();
    }

    public static b2 a(byte[] bArr) {
        return (b2) k.a(bArr);
    }

    public int i() {
        return this.i.size();
    }
}
