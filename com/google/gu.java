package com.google;

final class gu {
    private final byte[] a;
    private final int b;

    private gu(int i, byte[] bArr) {
        this.b = i;
        this.a = bArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.gu[] a(byte[] r13, com.google.fQ r14, com.google.hP r15) {
        /*
        r7 = com.google.fQ.b;
        r0 = r13.length;	 Catch:{ IllegalArgumentException -> 0x000f }
        r1 = r14.f();	 Catch:{ IllegalArgumentException -> 0x000f }
        if (r0 == r1) goto L_0x0011;
    L_0x0009:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x000f }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x000f }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r4 = r14.a(r15);
        r1 = 0;
        r5 = r4.b();
        r3 = r5.length;
        r0 = 0;
        r2 = r0;
        r0 = r1;
    L_0x001e:
        if (r2 >= r3) goto L_0x0033;
    L_0x0020:
        r1 = r5[r2];
        r1 = r1.b();
        r1 = r1 + r0;
        r0 = r2 + 1;
        if (r7 == 0) goto L_0x00f7;
    L_0x002b:
        r0 = com.google.aK.a;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r0 == 0) goto L_0x00d8;
    L_0x002f:
        r0 = 0;
    L_0x0030:
        com.google.aK.a = r0;
        r0 = r1;
    L_0x0033:
        r8 = new com.google.gu[r0];
        r1 = 0;
        r6 = r5.length;
        r0 = 0;
        r3 = r0;
    L_0x0039:
        if (r3 >= r6) goto L_0x0062;
    L_0x003b:
        r9 = r5[r3];
        r0 = 0;
    L_0x003e:
        r2 = r9.b();
        if (r0 >= r2) goto L_0x005e;
    L_0x0044:
        r10 = r9.a();
        r2 = r4.d();
        r11 = r2 + r10;
        r2 = r1 + 1;
        r12 = new com.google.gu;
        r11 = new byte[r11];
        r12.<init>(r10, r11);
        r8[r1] = r12;
        r0 = r0 + 1;
        if (r7 == 0) goto L_0x00f4;
    L_0x005d:
        r1 = r2;
    L_0x005e:
        r0 = r3 + 1;
        if (r7 == 0) goto L_0x00f1;
    L_0x0062:
        r0 = 0;
        r0 = r8[r0];
        r0 = r0.a;
        r2 = r0.length;
        r0 = r8.length;
        r0 = r0 + -1;
    L_0x006b:
        if (r0 < 0) goto L_0x007a;
    L_0x006d:
        r3 = r8[r0];
        r3 = r3.a;
        r3 = r3.length;
        if (r3 != r2) goto L_0x0076;
    L_0x0074:
        if (r7 == 0) goto L_0x007a;
    L_0x0076:
        r0 = r0 + -1;
        if (r7 == 0) goto L_0x006b;
    L_0x007a:
        r6 = r0 + 1;
        r0 = r4.d();
        r3 = r2 - r0;
        r2 = 0;
        r0 = 0;
        r5 = r0;
        r0 = r2;
    L_0x0086:
        if (r5 >= r3) goto L_0x009f;
    L_0x0088:
        r2 = 0;
        r4 = r2;
        r2 = r0;
    L_0x008b:
        if (r4 >= r1) goto L_0x00ef;
    L_0x008d:
        r0 = r8[r4];
        r9 = r0.a;
        r0 = r2 + 1;
        r2 = r13[r2];
        r9[r5] = r2;
        r2 = r4 + 1;
        if (r7 == 0) goto L_0x00ec;
    L_0x009b:
        r2 = r5 + 1;
        if (r7 == 0) goto L_0x00ea;
    L_0x009f:
        r4 = r6;
        r2 = r0;
    L_0x00a1:
        if (r4 >= r1) goto L_0x00e8;
    L_0x00a3:
        r0 = r8[r4];
        r5 = r0.a;
        r0 = r2 + 1;
        r2 = r13[r2];
        r5[r3] = r2;
        r2 = r4 + 1;
        if (r7 == 0) goto L_0x00e5;
    L_0x00b1:
        r2 = 0;
        r2 = r8[r2];
        r2 = r2.a;
        r9 = r2.length;
        r2 = r3;
        r4 = r0;
    L_0x00b9:
        if (r2 >= r9) goto L_0x00d5;
    L_0x00bb:
        r0 = 0;
        r5 = r0;
    L_0x00bd:
        if (r5 >= r1) goto L_0x00e3;
    L_0x00bf:
        if (r5 >= r6) goto L_0x00db;
    L_0x00c1:
        r0 = r2;
    L_0x00c2:
        r3 = r8[r5];
        r10 = r3.a;
        r3 = r4 + 1;
        r4 = r13[r4];
        r10[r0] = r4;
        r0 = r5 + 1;
        if (r7 == 0) goto L_0x00e0;
    L_0x00d0:
        r0 = r3;
    L_0x00d1:
        r2 = r2 + 1;
        if (r7 == 0) goto L_0x00de;
    L_0x00d5:
        return r8;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = 1;
        goto L_0x0030;
    L_0x00db:
        r0 = r2 + 1;
        goto L_0x00c2;
    L_0x00de:
        r4 = r0;
        goto L_0x00b9;
    L_0x00e0:
        r5 = r0;
        r4 = r3;
        goto L_0x00bd;
    L_0x00e3:
        r0 = r4;
        goto L_0x00d1;
    L_0x00e5:
        r4 = r2;
        r2 = r0;
        goto L_0x00a1;
    L_0x00e8:
        r0 = r2;
        goto L_0x00b1;
    L_0x00ea:
        r5 = r2;
        goto L_0x0086;
    L_0x00ec:
        r4 = r2;
        r2 = r0;
        goto L_0x008b;
    L_0x00ef:
        r0 = r2;
        goto L_0x009b;
    L_0x00f1:
        r3 = r0;
        goto L_0x0039;
    L_0x00f4:
        r1 = r2;
        goto L_0x003e;
    L_0x00f7:
        r2 = r0;
        r0 = r1;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gu.a(byte[], com.google.fQ, com.google.hP):com.google.gu[]");
    }

    byte[] b() {
        return this.a;
    }

    int a() {
        return this.b;
    }
}
