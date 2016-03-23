package org.whispersystems.jobqueue;

class c extends b {
    private static final int[] e;
    private static final int[] f;
    private int c;
    private int d;
    private final int[] g;

    static {
        f = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        e = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(byte[] r12, int r13, int r14, boolean r15) {
        /*
        r11 = this;
        r4 = org.whispersystems.jobqueue.r.a;
        r0 = r11.d;
        r1 = 6;
        if (r0 != r1) goto L_0x0009;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        return r0;
    L_0x0009:
        r5 = r14 + r13;
        r3 = r11.d;
        r1 = r11.c;
        r0 = 0;
        r6 = r11.a;
        r7 = r11.g;
        r2 = r13;
    L_0x0015:
        if (r2 >= r5) goto L_0x015b;
    L_0x0017:
        if (r3 != 0) goto L_0x006b;
    L_0x0019:
        r8 = r2 + 4;
        if (r8 > r5) goto L_0x005d;
    L_0x001d:
        r1 = r12[r2];
        r1 = r1 & 255;
        r1 = r7[r1];
        r1 = r1 << 18;
        r8 = r2 + 1;
        r8 = r12[r8];
        r8 = r8 & 255;
        r8 = r7[r8];
        r8 = r8 << 12;
        r1 = r1 | r8;
        r8 = r2 + 2;
        r8 = r12[r8];
        r8 = r8 & 255;
        r8 = r7[r8];
        r8 = r8 << 6;
        r1 = r1 | r8;
        r8 = r2 + 3;
        r8 = r12[r8];
        r8 = r8 & 255;
        r8 = r7[r8];
        r1 = r1 | r8;
        if (r1 < 0) goto L_0x005d;
    L_0x0046:
        r8 = r0 + 2;
        r9 = (byte) r1;
        r6[r8] = r9;
        r8 = r0 + 1;
        r9 = r1 >> 8;
        r9 = (byte) r9;
        r6[r8] = r9;
        r8 = r1 >> 16;
        r8 = (byte) r8;
        r6[r0] = r8;
        r0 = r0 + 3;
        r2 = r2 + 4;
        if (r4 == 0) goto L_0x0019;
    L_0x005d:
        if (r2 < r5) goto L_0x006b;
    L_0x005f:
        r2 = r1;
        r1 = r0;
    L_0x0061:
        if (r15 != 0) goto L_0x0115;
    L_0x0063:
        r11.d = r3;
        r11.c = r2;
        r11.b = r1;
        r0 = 1;
        goto L_0x0008;
    L_0x006b:
        r13 = r2 + 1;
        r2 = r12[r2];
        r2 = r2 & 255;
        r2 = r7[r2];
        switch(r3) {
            case 0: goto L_0x007d;
            case 1: goto L_0x008d;
            case 2: goto L_0x009f;
            case 3: goto L_0x00c4;
            case 4: goto L_0x00fc;
            case 5: goto L_0x010c;
            default: goto L_0x0076;
        };
    L_0x0076:
        r2 = r3;
    L_0x0077:
        if (r4 == 0) goto L_0x014a;
    L_0x0079:
        r3 = r2;
        r2 = r1;
        r1 = r0;
        goto L_0x0061;
    L_0x007d:
        if (r2 < 0) goto L_0x0084;
    L_0x007f:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0157;
    L_0x0083:
        r1 = r2;
    L_0x0084:
        r8 = -1;
        if (r2 == r8) goto L_0x0076;
    L_0x0087:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x008d:
        if (r2 < 0) goto L_0x0096;
    L_0x008f:
        r1 = r1 << 6;
        r1 = r1 | r2;
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0076;
    L_0x0096:
        r8 = -1;
        if (r2 == r8) goto L_0x0076;
    L_0x0099:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x009f:
        if (r2 < 0) goto L_0x00a8;
    L_0x00a1:
        r1 = r1 << 6;
        r1 = r1 | r2;
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0076;
    L_0x00a8:
        r10 = r1;
        r1 = r3;
        r3 = r10;
        r8 = -2;
        if (r2 != r8) goto L_0x00bb;
    L_0x00ae:
        r1 = r0 + 1;
        r8 = r3 >> 4;
        r8 = (byte) r8;
        r6[r0] = r8;
        r0 = 4;
        if (r4 == 0) goto L_0x0152;
    L_0x00b8:
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x00bb:
        r8 = -1;
        if (r2 == r8) goto L_0x014e;
    L_0x00be:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x00c4:
        if (r2 < 0) goto L_0x00df;
    L_0x00c6:
        r1 = r1 << 6;
        r1 = r1 | r2;
        r3 = r0 + 2;
        r8 = (byte) r1;
        r6[r3] = r8;
        r3 = r0 + 1;
        r8 = r1 >> 8;
        r8 = (byte) r8;
        r6[r3] = r8;
        r3 = r1 >> 16;
        r3 = (byte) r3;
        r6[r0] = r3;
        r0 = r0 + 3;
        r3 = 0;
        if (r4 == 0) goto L_0x0076;
    L_0x00df:
        r8 = -2;
        if (r2 != r8) goto L_0x00f3;
    L_0x00e2:
        r3 = r0 + 1;
        r8 = r1 >> 2;
        r8 = (byte) r8;
        r6[r3] = r8;
        r3 = r1 >> 10;
        r3 = (byte) r3;
        r6[r0] = r3;
        r0 = r0 + 2;
        r3 = 5;
        if (r4 == 0) goto L_0x0076;
    L_0x00f3:
        r8 = -1;
        if (r2 == r8) goto L_0x0076;
    L_0x00f6:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x00fc:
        r8 = -2;
        if (r2 != r8) goto L_0x0103;
    L_0x00ff:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0076;
    L_0x0103:
        r8 = -1;
        if (r2 == r8) goto L_0x0076;
    L_0x0106:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x010c:
        r8 = -1;
        if (r2 == r8) goto L_0x0076;
    L_0x010f:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x0115:
        switch(r3) {
            case 0: goto L_0x011f;
            case 1: goto L_0x0121;
            case 2: goto L_0x0127;
            case 3: goto L_0x0148;
            case 4: goto L_0x0140;
            default: goto L_0x0118;
        };
    L_0x0118:
        r11.d = r3;
        r11.b = r1;
        r0 = 1;
        goto L_0x0008;
    L_0x011f:
        if (r4 == 0) goto L_0x0118;
    L_0x0121:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x0127:
        r0 = r1 + 1;
        r5 = r2 >> 4;
        r5 = (byte) r5;
        r6[r1] = r5;
        if (r4 == 0) goto L_0x0146;
    L_0x0130:
        r5 = r0 + 1;
        r1 = r2 >> 10;
        r1 = (byte) r1;
        r6[r0] = r1;
        r1 = r5 + 1;
        r0 = r2 >> 2;
        r0 = (byte) r0;
        r6[r5] = r0;
        if (r4 == 0) goto L_0x0118;
    L_0x0140:
        r0 = 6;
        r11.d = r0;
        r0 = 0;
        goto L_0x0008;
    L_0x0146:
        r1 = r0;
        goto L_0x0118;
    L_0x0148:
        r0 = r1;
        goto L_0x0130;
    L_0x014a:
        r3 = r2;
        r2 = r13;
        goto L_0x0015;
    L_0x014e:
        r2 = r1;
        r1 = r3;
        goto L_0x0077;
    L_0x0152:
        r2 = r0;
        r0 = r1;
        r1 = r3;
        goto L_0x0077;
    L_0x0157:
        r1 = r2;
        r2 = r3;
        goto L_0x0077;
    L_0x015b:
        r2 = r1;
        r1 = r0;
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.c.a(byte[], int, int, boolean):boolean");
    }

    public c(int i, byte[] bArr) {
        int[] iArr;
        this.a = bArr;
        if ((i & 8) == 0) {
            iArr = f;
        } else {
            iArr = e;
        }
        this.g = iArr;
        this.d = 0;
        this.c = 0;
    }
}
