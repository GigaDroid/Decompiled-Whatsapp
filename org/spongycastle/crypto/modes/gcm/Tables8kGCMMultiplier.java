package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Pack;

public class Tables8kGCMMultiplier {
    private byte[] H;
    private int[][][] M;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(byte[] r12) {
        /*
        r11 = this;
        r10 = 16;
        r2 = 8;
        r4 = 4;
        r1 = 0;
        r3 = 1;
        r5 = org.spongycastle.crypto.modes.gcm.GCMUtil.a;
        r0 = r11.M;
        if (r0 != 0) goto L_0x001f;
    L_0x000d:
        r0 = 32;
        r0 = new int[]{r0, r10, r4};
        r6 = java.lang.Integer.TYPE;
        r0 = java.lang.reflect.Array.newInstance(r6, r0);
        r0 = (int[][][]) r0;
        r11.M = r0;
        if (r5 == 0) goto L_0x0028;
    L_0x001f:
        r0 = r11.H;
        r0 = org.spongycastle.util.Arrays.areEqual(r0, r12);
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return;
    L_0x0028:
        r0 = org.spongycastle.util.Arrays.clone(r12);
        r11.H = r0;
        r0 = r11.M;
        r0 = r0[r3];
        r0 = r0[r2];
        org.spongycastle.crypto.modes.gcm.GCMUtil.asInts(r12, r0);
        r0 = r4;
    L_0x0038:
        if (r0 < r3) goto L_0x004f;
    L_0x003a:
        r6 = r11.M;
        r6 = r6[r3];
        r7 = r0 + r0;
        r6 = r6[r7];
        r7 = r11.M;
        r7 = r7[r3];
        r7 = r7[r0];
        org.spongycastle.crypto.modes.gcm.GCMUtil.multiplyP(r6, r7);
        r0 = r0 >> 1;
        if (r5 == 0) goto L_0x0038;
    L_0x004f:
        r0 = r11.M;
        r0 = r0[r3];
        r0 = r0[r3];
        r6 = r11.M;
        r6 = r6[r1];
        r6 = r6[r2];
        org.spongycastle.crypto.modes.gcm.GCMUtil.multiplyP(r0, r6);
        r0 = r4;
    L_0x005f:
        if (r0 < r3) goto L_0x0076;
    L_0x0061:
        r4 = r11.M;
        r4 = r4[r1];
        r6 = r0 + r0;
        r4 = r4[r6];
        r6 = r11.M;
        r6 = r6[r1];
        r6 = r6[r0];
        org.spongycastle.crypto.modes.gcm.GCMUtil.multiplyP(r4, r6);
        r0 = r0 >> 1;
        if (r5 == 0) goto L_0x005f;
    L_0x0076:
        r0 = r1;
    L_0x0077:
        r1 = 2;
        r4 = r1;
    L_0x0079:
        if (r4 >= r10) goto L_0x009d;
    L_0x007b:
        r1 = r3;
    L_0x007c:
        if (r1 >= r4) goto L_0x0099;
    L_0x007e:
        r6 = r11.M;
        r6 = r6[r0];
        r6 = r6[r4];
        r7 = r11.M;
        r7 = r7[r0];
        r7 = r7[r1];
        r8 = r11.M;
        r8 = r8[r0];
        r9 = r4 + r1;
        r8 = r8[r9];
        org.spongycastle.crypto.modes.gcm.GCMUtil.xor(r6, r7, r8);
        r1 = r1 + 1;
        if (r5 == 0) goto L_0x007c;
    L_0x0099:
        r1 = r4 + r4;
        if (r5 == 0) goto L_0x00be;
    L_0x009d:
        r0 = r0 + 1;
        r1 = 32;
        if (r0 == r1) goto L_0x0027;
    L_0x00a3:
        if (r0 <= r3) goto L_0x0077;
    L_0x00a5:
        r1 = r2;
    L_0x00a6:
        if (r1 <= 0) goto L_0x0077;
    L_0x00a8:
        r4 = r11.M;
        r6 = r0 + -2;
        r4 = r4[r6];
        r4 = r4[r1];
        r6 = r11.M;
        r6 = r6[r0];
        r6 = r6[r1];
        org.spongycastle.crypto.modes.gcm.GCMUtil.multiplyP8(r4, r6);
        r1 = r1 >> 1;
        if (r5 == 0) goto L_0x00a6;
    L_0x00bd:
        goto L_0x0077;
    L_0x00be:
        r4 = r1;
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier.init(byte[]):void");
    }

    public void multiplyH(byte[] bArr) {
        int i = GCMUtil.a;
        int[] iArr = new int[4];
        int i2 = 15;
        while (i2 >= 0) {
            int[] iArr2 = this.M[i2 + i2][bArr[i2] & 15];
            iArr[0] = iArr[0] ^ iArr2[0];
            iArr[1] = iArr[1] ^ iArr2[1];
            iArr[2] = iArr[2] ^ iArr2[2];
            iArr[3] = iArr2[3] ^ iArr[3];
            iArr2 = this.M[(i2 + i2) + 1][(bArr[i2] & 240) >>> 4];
            iArr[0] = iArr[0] ^ iArr2[0];
            iArr[1] = iArr[1] ^ iArr2[1];
            iArr[2] = iArr[2] ^ iArr2[2];
            iArr[3] = iArr2[3] ^ iArr[3];
            i2--;
            if (i != 0) {
                break;
            }
        }
        Pack.intToBigEndian(iArr, bArr, 0);
    }
}
