package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.util.Arrays;
import org.v;
import org.whispersystems.at;

public class CBCBlockCipher implements BlockCipher {
    private static final String[] z;
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;

    static {
        int i;
        int i2;
        String[] strArr = new String[6];
        char[] toCharArray = "Z`8o@\u0013l=|RV|hn[\\.;r[Az".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 51;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001cM\nY".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 51;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "Z`8o@\u0013l=|RV|hn[\\.;r[Az".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 51;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "Z`!n]Rb!iUGg't\u0014Ek+n[A.%oGG.*\u007f\u0014Gf-:GRc-:XV`/n\\\u0013o;:V_a+q\u0014@g2\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 51;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "Po&t[G.+rU]i-:Q]m:cDGg&}\u0014@z)nQ\u0013y!n\\\\{<:DAa>sPZ`/:_Vwf".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 51;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "Po&t[G.+rU]i-:Q]m:cDGg&}\u0014@z)nQ\u0013y!n\\\\{<:DAa>sPZ`/:_Vwf".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 51;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        z = strArr;
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        boolean z = GCMBlockCipher.a;
        try {
            if (this.blockSize + i > bArr.length) {
                throw new DataLengthException(z[0]);
            }
            System.arraycopy(bArr, i, this.cbcNextV, 0, this.blockSize);
            int processBlock = this.cipher.processBlock(bArr, i, bArr2, i2);
            while (i3 < this.blockSize) {
                int i4 = i2 + i3;
                bArr2[i4] = (byte) (bArr2[i4] ^ this.cbcV[i3]);
                i3++;
                if (z) {
                    break;
                }
            }
            byte[] bArr3 = this.cbcV;
            this.cbcV = this.cbcNextV;
            this.cbcNextV = bArr3;
            return processBlock;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z[1];
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void reset() {
        System.arraycopy(this.IV, 0, this.cbcV, 0, this.IV.length);
        Arrays.fill(this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        try {
            return this.encrypting ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        boolean z = GCMBlockCipher.a;
        try {
            if (this.blockSize + i > bArr.length) {
                throw new DataLengthException(z[2]);
            }
            int i3 = 0;
            while (i3 < this.blockSize) {
                byte[] bArr3 = this.cbcV;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
                i3++;
                if (z) {
                    break;
                }
            }
            i3 = this.cipher.processBlock(this.cbcV, 0, bArr2, i2);
            System.arraycopy(bArr2, i2, this.cbcV, 0, this.cbcV.length);
            return i3;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r9, org.spongycastle.crypto.CipherParameters r10) {
        /*
        r8 = this;
        r1 = org.spongycastle.crypto.modes.GCMBlockCipher.a;
        r2 = r8.encrypting;
        r8.encrypting = r9;
        r0 = r10 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x0054;
    L_0x000a:
        r0 = r10;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;
        r3 = r0.getIV();
        r4 = r3.length;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r5 = r8.blockSize;	 Catch:{ IllegalArgumentException -> 0x0021 }
        if (r4 == r5) goto L_0x0023;
    L_0x0016:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0021 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0021 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r4 = 0;
        r5 = r8.IV;	 Catch:{ IllegalArgumentException -> 0x004e }
        r6 = 0;
        r7 = r3.length;	 Catch:{ IllegalArgumentException -> 0x004e }
        java.lang.System.arraycopy(r3, r4, r5, r6, r7);	 Catch:{ IllegalArgumentException -> 0x004e }
        r8.reset();	 Catch:{ IllegalArgumentException -> 0x004e }
        r3 = r0.getParameters();	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r3 == 0) goto L_0x003f;
    L_0x0034:
        r3 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = r0.getParameters();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r3.init(r9, r0);	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r1 == 0) goto L_0x0052;
    L_0x003f:
        if (r2 == r9) goto L_0x0052;
    L_0x0041:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004c }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x004c }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004c }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x0052:
        if (r1 == 0) goto L_0x0073;
    L_0x0054:
        r8.reset();	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r10 == 0) goto L_0x0060;
    L_0x0059:
        r0 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x0071 }
        r0.init(r9, r10);	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r1 == 0) goto L_0x0073;
    L_0x0060:
        if (r2 == r9) goto L_0x0073;
    L_0x0062:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x006d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x006d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.CBCBlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.cipher = null;
        this.cipher = blockCipher;
        this.blockSize = blockCipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.cbcV = new byte[this.blockSize];
        this.cbcNextV = new byte[this.blockSize];
    }
}
