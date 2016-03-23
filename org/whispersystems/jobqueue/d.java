package org.whispersystems.jobqueue;

class d extends b {
    private static final byte[] c;
    private static final byte[] d;
    static final boolean l;
    private int e;
    public final boolean f;
    public final boolean g;
    private final byte[] h;
    public final boolean i;
    int j;
    private final byte[] k;

    static {
        boolean z;
        if (r.class.desiredAssertionStatus()) {
            z = false;
        } else {
            z = true;
        }
        l = z;
        c = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        d = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(byte[] r13, int r14, int r15, boolean r16) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r12 = this;
        r6 = org.whispersystems.jobqueue.r.a;
        r7 = r12.k;
        r8 = r12.a;
        r4 = 0;
        r0 = r12.e;
        r9 = r15 + r14;
        r1 = -1;
        r2 = r12.j;
        switch(r2) {
            case 0: goto L_0x0198;
            case 1: goto L_0x019a;
            case 2: goto L_0x01bc;
            default: goto L_0x0011;
        };
    L_0x0011:
        r2 = r1;
        r3 = r14;
    L_0x0013:
        r1 = -1;
        if (r2 == r1) goto L_0x004d;
    L_0x0016:
        r1 = 1;
        r5 = r2 >> 18;
        r5 = r5 & 63;
        r5 = r7[r5];
        r8[r4] = r5;
        r4 = 2;
        r5 = r2 >> 12;
        r5 = r5 & 63;
        r5 = r7[r5];
        r8[r1] = r5;
        r5 = 3;
        r1 = r2 >> 6;
        r1 = r1 & 63;
        r1 = r7[r1];
        r8[r4] = r1;
        r1 = 4;
        r2 = r2 & 63;
        r2 = r7[r2];
        r8[r5] = r2;
        r0 = r0 + -1;
        if (r0 != 0) goto L_0x0253;
    L_0x003c:
        r0 = r12.i;
        if (r0 == 0) goto L_0x0256;
    L_0x0040:
        r0 = 5;
        r2 = 13;
        r8[r1] = r2;
    L_0x0045:
        r4 = r0 + 1;
        r1 = 10;
        r8[r0] = r1;
        r0 = 19;
    L_0x004d:
        r1 = r3 + 3;
        if (r1 > r9) goto L_0x00a7;
    L_0x0051:
        r1 = r13[r3];
        r1 = r1 & 255;
        r1 = r1 << 16;
        r2 = r3 + 1;
        r2 = r13[r2];
        r2 = r2 & 255;
        r2 = r2 << 8;
        r1 = r1 | r2;
        r2 = r3 + 2;
        r2 = r13[r2];
        r2 = r2 & 255;
        r1 = r1 | r2;
        r2 = r1 >> 18;
        r2 = r2 & 63;
        r2 = r7[r2];
        r8[r4] = r2;
        r2 = r4 + 1;
        r5 = r1 >> 12;
        r5 = r5 & 63;
        r5 = r7[r5];
        r8[r2] = r5;
        r2 = r4 + 2;
        r5 = r1 >> 6;
        r5 = r5 & 63;
        r5 = r7[r5];
        r8[r2] = r5;
        r2 = r4 + 3;
        r1 = r1 & 63;
        r1 = r7[r1];
        r8[r2] = r1;
        r3 = r3 + 3;
        r1 = r4 + 4;
        r0 = r0 + -1;
        if (r0 != 0) goto L_0x0253;
    L_0x0093:
        r0 = r12.i;
        if (r0 == 0) goto L_0x0250;
    L_0x0097:
        r0 = r1 + 1;
        r2 = 13;
        r8[r1] = r2;
    L_0x009d:
        r4 = r0 + 1;
        r1 = 10;
        r8[r0] = r1;
        r0 = 19;
        if (r6 == 0) goto L_0x004d;
    L_0x00a7:
        r5 = r0;
        if (r16 == 0) goto L_0x0203;
    L_0x00aa:
        r0 = r12.j;
        r0 = r3 - r0;
        r1 = r9 + -1;
        if (r0 != r1) goto L_0x024c;
    L_0x00b2:
        r2 = 0;
        r0 = r12.j;
        if (r0 <= 0) goto L_0x01e0;
    L_0x00b7:
        r0 = r12.h;
        r1 = 1;
        r0 = r0[r2];
        r2 = r3;
    L_0x00bd:
        r0 = r0 & 255;
        r3 = r0 << 4;
        r0 = r12.j;
        r0 = r0 - r1;
        r12.j = r0;
        r1 = r4 + 1;
        r0 = r3 >> 6;
        r0 = r0 & 63;
        r0 = r7[r0];
        r8[r4] = r0;
        r0 = r1 + 1;
        r3 = r3 & 63;
        r3 = r7[r3];
        r8[r1] = r3;
        r1 = r12.f;
        if (r1 == 0) goto L_0x00e8;
    L_0x00dc:
        r1 = r0 + 1;
        r3 = 61;
        r8[r0] = r3;
        r0 = r1 + 1;
        r3 = 61;
        r8[r1] = r3;
    L_0x00e8:
        r1 = r12.g;
        if (r1 == 0) goto L_0x00fe;
    L_0x00ec:
        r1 = r12.i;
        if (r1 == 0) goto L_0x00f7;
    L_0x00f0:
        r1 = r0 + 1;
        r3 = 13;
        r8[r0] = r3;
        r0 = r1;
    L_0x00f7:
        r1 = r0 + 1;
        r3 = 10;
        r8[r0] = r3;
        r0 = r1;
    L_0x00fe:
        if (r6 == 0) goto L_0x0249;
    L_0x0100:
        r1 = r12.j;
        r1 = r2 - r1;
        r3 = r9 + -2;
        if (r1 != r3) goto L_0x0246;
    L_0x0108:
        r4 = 0;
        r1 = r12.j;
        r3 = 1;
        if (r1 <= r3) goto L_0x01e9;
    L_0x010e:
        r1 = r12.h;
        r3 = 1;
        r1 = r1[r4];
        r11 = r3;
        r3 = r2;
        r2 = r11;
    L_0x0116:
        r1 = r1 & 255;
        r10 = r1 << 10;
        r1 = r12.j;
        if (r1 <= 0) goto L_0x01f0;
    L_0x011e:
        r1 = r12.h;
        r4 = r2 + 1;
        r1 = r1[r2];
        r2 = r4;
    L_0x0125:
        r1 = r1 & 255;
        r1 = r1 << 2;
        r4 = r10 | r1;
        r1 = r12.j;
        r1 = r1 - r2;
        r12.j = r1;
        r1 = r0 + 1;
        r2 = r4 >> 12;
        r2 = r2 & 63;
        r2 = r7[r2];
        r8[r0] = r2;
        r0 = r1 + 1;
        r2 = r4 >> 6;
        r2 = r2 & 63;
        r2 = r7[r2];
        r8[r1] = r2;
        r1 = r0 + 1;
        r2 = r4 & 63;
        r2 = r7[r2];
        r8[r0] = r2;
        r0 = r12.f;
        if (r0 == 0) goto L_0x0243;
    L_0x0150:
        r0 = r1 + 1;
        r2 = 61;
        r8[r1] = r2;
    L_0x0156:
        r1 = r12.g;
        if (r1 == 0) goto L_0x016c;
    L_0x015a:
        r1 = r12.i;
        if (r1 == 0) goto L_0x0165;
    L_0x015e:
        r1 = r0 + 1;
        r2 = 13;
        r8[r0] = r2;
        r0 = r1;
    L_0x0165:
        r1 = r0 + 1;
        r2 = 10;
        r8[r0] = r2;
        r0 = r1;
    L_0x016c:
        if (r6 == 0) goto L_0x018a;
    L_0x016e:
        r1 = r12.g;
        if (r1 == 0) goto L_0x018a;
    L_0x0172:
        if (r0 <= 0) goto L_0x018a;
    L_0x0174:
        r1 = 19;
        if (r5 == r1) goto L_0x018a;
    L_0x0178:
        r1 = r12.i;
        if (r1 == 0) goto L_0x0183;
    L_0x017c:
        r1 = r0 + 1;
        r2 = 13;
        r8[r0] = r2;
        r0 = r1;
    L_0x0183:
        r1 = r0 + 1;
        r2 = 10;
        r8[r0] = r2;
        r0 = r1;
    L_0x018a:
        r1 = l;
        if (r1 != 0) goto L_0x01f7;
    L_0x018e:
        r1 = r12.j;
        if (r1 == 0) goto L_0x01f7;
    L_0x0192:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
    L_0x0198:
        if (r6 == 0) goto L_0x0011;
    L_0x019a:
        r2 = r14 + 2;
        if (r2 > r9) goto L_0x0011;
    L_0x019e:
        r1 = r12.h;
        r2 = 0;
        r1 = r1[r2];
        r1 = r1 & 255;
        r1 = r1 << 16;
        r2 = r14 + 1;
        r3 = r13[r14];
        r3 = r3 & 255;
        r3 = r3 << 8;
        r1 = r1 | r3;
        r14 = r2 + 1;
        r2 = r13[r2];
        r2 = r2 & 255;
        r1 = r1 | r2;
        r2 = 0;
        r12.j = r2;
        if (r6 == 0) goto L_0x0011;
    L_0x01bc:
        r3 = r14;
        r2 = r3 + 1;
        if (r2 > r9) goto L_0x0259;
    L_0x01c1:
        r1 = r12.h;
        r2 = 0;
        r1 = r1[r2];
        r1 = r1 & 255;
        r1 = r1 << 16;
        r2 = r12.h;
        r5 = 1;
        r2 = r2[r5];
        r2 = r2 & 255;
        r2 = r2 << 8;
        r1 = r1 | r2;
        r14 = r3 + 1;
        r2 = r13[r3];
        r2 = r2 & 255;
        r1 = r1 | r2;
        r2 = 0;
        r12.j = r2;
        goto L_0x0011;
    L_0x01e0:
        r1 = r3 + 1;
        r0 = r13[r3];
        r11 = r2;
        r2 = r1;
        r1 = r11;
        goto L_0x00bd;
    L_0x01e9:
        r3 = r2 + 1;
        r1 = r13[r2];
        r2 = r4;
        goto L_0x0116;
    L_0x01f0:
        r4 = r3 + 1;
        r1 = r13[r3];
        r3 = r4;
        goto L_0x0125;
    L_0x01f7:
        r1 = l;
        if (r1 != 0) goto L_0x0241;
    L_0x01fb:
        if (r3 == r9) goto L_0x0241;
    L_0x01fd:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
    L_0x0203:
        r0 = r9 + -1;
        if (r3 != r0) goto L_0x0215;
    L_0x0207:
        r0 = r12.h;
        r1 = r12.j;
        r2 = r1 + 1;
        r12.j = r2;
        r2 = r13[r3];
        r0[r1] = r2;
        if (r6 == 0) goto L_0x0233;
    L_0x0215:
        r0 = r9 + -2;
        if (r3 != r0) goto L_0x0233;
    L_0x0219:
        r0 = r12.h;
        r1 = r12.j;
        r2 = r1 + 1;
        r12.j = r2;
        r2 = r13[r3];
        r0[r1] = r2;
        r0 = r12.h;
        r1 = r12.j;
        r2 = r1 + 1;
        r12.j = r2;
        r2 = r3 + 1;
        r2 = r13[r2];
        r0[r1] = r2;
    L_0x0233:
        r12.b = r4;
        r12.e = r5;
        r0 = 1;
        r1 = org.whispersystems.jobqueue.v.d;
        if (r1 == 0) goto L_0x0240;
    L_0x023c:
        r1 = r6 + 1;
        org.whispersystems.jobqueue.r.a = r1;
    L_0x0240:
        return r0;
    L_0x0241:
        r4 = r0;
        goto L_0x0233;
    L_0x0243:
        r0 = r1;
        goto L_0x0156;
    L_0x0246:
        r3 = r2;
        goto L_0x016e;
    L_0x0249:
        r3 = r2;
        goto L_0x018a;
    L_0x024c:
        r2 = r3;
        r0 = r4;
        goto L_0x0100;
    L_0x0250:
        r0 = r1;
        goto L_0x009d;
    L_0x0253:
        r4 = r1;
        goto L_0x004d;
    L_0x0256:
        r0 = r1;
        goto L_0x0045;
    L_0x0259:
        r2 = r1;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.d.a(byte[], int, int, boolean):boolean");
    }

    public d(int i, byte[] bArr) {
        boolean z;
        byte[] bArr2;
        int i2;
        boolean z2 = true;
        int i3 = r.a;
        this.a = bArr;
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        if ((i & 2) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if ((i & 4) == 0) {
            z2 = false;
        }
        this.i = z2;
        if ((i & 8) == 0) {
            bArr2 = c;
        } else {
            bArr2 = d;
        }
        this.k = bArr2;
        this.h = new byte[2];
        this.j = 0;
        if (this.g) {
            i2 = 19;
        } else {
            i2 = -1;
        }
        this.e = i2;
        if (i3 != 0) {
            v.d++;
        }
    }
}
