package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class bg extends bL implements ef {
    private static final bg e;
    public static final int f = 1;
    public static T g;
    private static final long serialVersionUID = 0;
    private List h;
    private byte i;
    private final eV j;
    private int k;

    private bg(cJ cJVar) {
        super(cJVar);
        this.i = (byte) -1;
        this.k = -1;
        this.j = cJVar.getUnknownFields();
    }

    public static bg a(ad adVar) {
        return (bg) g.a(adVar);
    }

    private void e() {
        this.h = Collections.emptyList();
    }

    public fl newBuilderForType() {
        return c();
    }

    public final eV getUnknownFields() {
        return this.j;
    }

    public static bg a(ad adVar, h hVar) {
        return (bg) g.a(adVar, hVar);
    }

    public cG j() {
        return a(this);
    }

    public static bg a(byte[] bArr) {
        return (bg) g.a(bArr);
    }

    public List g() {
        return this.h;
    }

    bg(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public static bg a(InputStream inputStream) {
        return (bg) g.b(inputStream);
    }

    public ci getDefaultInstanceForType() {
        return f();
    }

    private bg(boolean z) {
        this.i = (byte) -1;
        this.k = -1;
        this.j = eV.h();
    }

    public cd a(int i) {
        return (cd) this.h.get(i);
    }

    public fl toBuilder() {
        return j();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bg(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.bA.b;
        r7.<init>();
        r7.i = r1;
        r7.k = r1;
        r7.e();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0040;
    L_0x0016:
        r5 = r8.z();	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        switch(r5) {
            case 0: goto L_0x0056;
            case 10: goto L_0x0026;
            default: goto L_0x001d;
        };
    L_0x001d:
        r5 = r7.a(r8, r4, r9, r5);	 Catch:{ fN -> 0x005a, IOException -> 0x0079 }
        if (r5 != 0) goto L_0x003e;
    L_0x0023:
        if (r3 == 0) goto L_0x008c;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0033;
    L_0x002a:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r5.<init>();	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r7.h = r5;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.h;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r6 = com.google.cd.e;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r6 = r8.a(r6, r9);	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r5.add(r6);	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.h;	 Catch:{ fN -> 0x008a }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x008a }
        r7.h = r0;	 Catch:{ fN -> 0x008a }
    L_0x004c:
        r0 = r4.d();
        r7.j = r0;
        r7.b();
        return;
    L_0x0056:
        if (r3 == 0) goto L_0x008c;
    L_0x0058:
        r0 = r2;
        goto L_0x001d;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
    L_0x005c:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        r1 = r1 & 1;
        if (r1 != r2) goto L_0x006f;
    L_0x0067:
        r1 = r7.h;	 Catch:{ fN -> 0x0088 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x0088 }
        r7.h = r1;	 Catch:{ fN -> 0x0088 }
    L_0x006f:
        r1 = r4.d();
        r7.j = r1;
        r7.b();
        throw r0;
    L_0x0079:
        r0 = move-exception;
        r3 = new com.google.fN;	 Catch:{ all -> 0x0062 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0062 }
        r3.<init>(r0);	 Catch:{ all -> 0x0062 }
        r0 = r3.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r2;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bg.<init>(com.google.ad, com.google.h):void");
    }

    public static bg b(InputStream inputStream, h hVar) {
        return (bg) g.b(inputStream, hVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static bg a(byte[] bArr, h hVar) {
        return (bg) g.a(bArr, hVar);
    }

    static {
        g = new gk();
        e = new bg(true);
        e.e();
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

    public static cG a(bg bgVar) {
        return h().a(bgVar);
    }

    public bg f() {
        return e;
    }

    protected cG a(ec ecVar) {
        return new cG(ecVar, null);
    }

    public il m217newBuilderForType() {
        return c();
    }

    public fO m216getDefaultInstanceForType() {
        return f();
    }

    public il m218toBuilder() {
        return j();
    }

    public List i() {
        return this.h;
    }

    public static bg d() {
        return e;
    }

    public static final fn a() {
        return bh.r();
    }

    public static cG h() {
        return cG.e();
    }

    public static bg a(hx hxVar, h hVar) {
        return (bg) g.b(hxVar, hVar);
    }

    static List a(bg bgVar, List list) {
        bgVar.h = list;
        return list;
    }

    public static bg a(InputStream inputStream, h hVar) {
        return (bg) g.a(inputStream, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.I().a(bg.class, cG.class);
    }

    public cG c() {
        return h();
    }

    public static bg b(InputStream inputStream) {
        return (bg) g.a(inputStream);
    }

    public d1 b(int i) {
        return (d1) this.h.get(i);
    }

    public int getSerializedSize() {
        boolean z = bA.b;
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.h.size()) {
            i3 += eb.f((int) f, (fO) this.h.get(i));
            i2 = i + f;
            if (z) {
                break;
            }
            i = i2;
        }
        i2 = getUnknownFields().getSerializedSize() + i3;
        this.k = i2;
        return i2;
    }

    public T getParserForType() {
        return g;
    }

    public int b() {
        return this.h.size();
    }

    public static bg a(hx hxVar) {
        return (bg) g.a(hxVar);
    }

    static List b(bg bgVar) {
        return bgVar.h;
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        int i = 0;
        while (i < this.h.size()) {
            ebVar.e((int) f, (fO) this.h.get(i));
            int i2 = i + f;
            if (z) {
                break;
            }
            i = i2;
        }
        getUnknownFields().writeTo(ebVar);
    }

    bg(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }
}
