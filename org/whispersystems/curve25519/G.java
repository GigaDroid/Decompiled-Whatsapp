package org.whispersystems.curve25519;

public class G {
    public static void a(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = iArr2[8];
        int i21 = iArr2[9];
        int i22 = -i;
        int i23 = (i2 ^ i12) & i22;
        int i24 = (i3 ^ i13) & i22;
        int i25 = (i4 ^ i14) & i22;
        int i26 = (i5 ^ i15) & i22;
        int i27 = (i6 ^ i16) & i22;
        int i28 = (i7 ^ i17) & i22;
        int i29 = (i8 ^ i18) & i22;
        int i30 = (i9 ^ i19) & i22;
        int i31 = (i10 ^ i20) & i22;
        int i32 = (i11 ^ i21) & i22;
        iArr[0] = i2 ^ i23;
        iArr[1] = i3 ^ i24;
        iArr[2] = i4 ^ i25;
        iArr[3] = i5 ^ i26;
        iArr[4] = i6 ^ i27;
        iArr[5] = i7 ^ i28;
        iArr[6] = i8 ^ i29;
        iArr[7] = i9 ^ i30;
        iArr[8] = i10 ^ i31;
        iArr[9] = i11 ^ i32;
        iArr2[0] = i12 ^ i23;
        iArr2[1] = i13 ^ i24;
        iArr2[2] = i14 ^ i25;
        iArr2[3] = i15 ^ i26;
        iArr2[4] = i16 ^ i27;
        iArr2[5] = i17 ^ i28;
        iArr2[6] = i18 ^ i29;
        iArr2[7] = i19 ^ i30;
        iArr2[8] = i20 ^ i31;
        iArr2[9] = i21 ^ i32;
    }
}
