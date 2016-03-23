package com.google;

public final class eM {
    public static boolean a;
    private final y b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte[] r9, int r10, int r11, int r12, int r13) {
        /*
        r8 = this;
        r1 = 0;
        r3 = a;
        r4 = r11 + r12;
        if (r13 != 0) goto L_0x0044;
    L_0x0007:
        r0 = 1;
    L_0x0008:
        r2 = r4 / r0;
        r5 = new int[r2];
        r2 = r1;
    L_0x000d:
        if (r2 >= r4) goto L_0x0025;
    L_0x000f:
        if (r13 == 0) goto L_0x0017;
    L_0x0011:
        r6 = r2 % 2;
        r7 = r13 + -1;
        if (r6 != r7) goto L_0x0021;
    L_0x0017:
        r6 = r2 / r0;
        r7 = r2 + r10;
        r7 = r9[r7];	 Catch:{ em -> 0x0048 }
        r7 = r7 & 255;
        r5[r6] = r7;	 Catch:{ em -> 0x0048 }
    L_0x0021:
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x000d;
    L_0x0025:
        r2 = r8.b;	 Catch:{ em -> 0x004a }
        r4 = r12 / r0;
        r2.a(r5, r4);	 Catch:{ em -> 0x004a }
    L_0x002c:
        if (r1 >= r11) goto L_0x0043;
    L_0x002e:
        if (r13 == 0) goto L_0x0036;
    L_0x0030:
        r2 = r1 % 2;
        r4 = r13 + -1;
        if (r2 != r4) goto L_0x003f;
    L_0x0036:
        r2 = r1 + r10;
        r4 = r1 / r0;
        r4 = r5[r4];	 Catch:{ em -> 0x0050 }
        r4 = (byte) r4;	 Catch:{ em -> 0x0050 }
        r9[r2] = r4;	 Catch:{ em -> 0x0050 }
    L_0x003f:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x002c;
    L_0x0043:
        return;
    L_0x0044:
        r0 = 2;
        goto L_0x0008;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ em -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        r0 = com.google.aC.a();
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eM.a(byte[], int, int, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.am a(com.google.hX r9, java.util.Map r10) {
        /*
        r8 = this;
        r6 = a;
        r0 = new com.google.V;
        r0.<init>(r9);
        r1 = r0.a();
        r2 = 0;
        r3 = 10;
        r4 = 10;
        r5 = 0;
        r0 = r8;
        r0.a(r1, r2, r3, r4, r5);
        r0 = 0;
        r0 = r1[r0];
        r7 = r0 & 15;
        switch(r7) {
            case 2: goto L_0x0022;
            case 3: goto L_0x0022;
            case 4: goto L_0x0022;
            case 5: goto L_0x0045;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0022:
        r2 = 20;
        r3 = 84;
        r4 = 40;
        r5 = 1;
        r0 = r8;
        r0.a(r1, r2, r3, r4, r5);
        r2 = 20;
        r3 = 84;
        r4 = 40;
        r5 = 2;
        r0 = r8;
        r0.a(r1, r2, r3, r4, r5);
        r0 = 94;
        r0 = new byte[r0];
        if (r6 == 0) goto L_0x0061;
    L_0x003e:
        r0 = com.google.aK.a;
        if (r0 == 0) goto L_0x0077;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        com.google.aK.a = r0;
    L_0x0045:
        r2 = 20;
        r3 = 68;
        r4 = 56;
        r5 = 1;
        r0 = r8;
        r0.a(r1, r2, r3, r4, r5);
        r2 = 20;
        r3 = 68;
        r4 = 56;
        r5 = 2;
        r0 = r8;
        r0.a(r1, r2, r3, r4, r5);
        r0 = 78;
        r0 = new byte[r0];
        if (r6 != 0) goto L_0x001d;
    L_0x0061:
        r2 = 0;
        r3 = 0;
        r4 = 10;
        java.lang.System.arraycopy(r1, r2, r0, r3, r4);
        r2 = 20;
        r3 = 10;
        r4 = r0.length;
        r4 = r4 + -10;
        java.lang.System.arraycopy(r1, r2, r0, r3, r4);
        r0 = com.google.fk.a(r0, r7);
        return r0;
    L_0x0077:
        r0 = 1;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eM.a(com.google.hX, java.util.Map):com.google.am");
    }

    public eM() {
        this.b = new y(aj.i);
    }
}
