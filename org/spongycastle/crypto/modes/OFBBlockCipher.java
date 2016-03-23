package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.StreamBlockCipher;
import org.v;
import org.whispersystems.at;

public class OFBBlockCipher extends StreamBlockCipher {
    private static final String z;
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] ofbOutV;
    private byte[] ofbV;

    static {
        char[] toCharArray = "\u0017-2\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 56;
                    break;
                case at.g /*1*/:
                    i2 = 98;
                    break;
                case at.i /*2*/:
                    i2 = 116;
                    break;
                case at.o /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void reset() {
        System.arraycopy(this.IV, 0, this.ofbV, 0, this.IV.length);
        this.byteCount = 0;
        this.cipher.reset();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r9, org.spongycastle.crypto.CipherParameters r10) {
        /*
        r8 = this;
        r7 = 1;
        r2 = 0;
        r3 = org.spongycastle.crypto.modes.GCMBlockCipher.a;
        r0 = r10 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x004e;
    L_0x0008:
        r0 = r10;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;
        r4 = r0.getIV();
        r1 = r4.length;
        r5 = r8.IV;
        r5 = r5.length;
        if (r1 >= r5) goto L_0x0032;
    L_0x0015:
        r1 = r8.IV;
        r5 = r8.IV;
        r5 = r5.length;
        r6 = r4.length;
        r5 = r5 - r6;
        r6 = r4.length;
        java.lang.System.arraycopy(r4, r2, r1, r5, r6);
        r1 = r2;
    L_0x0021:
        r5 = r8.IV;
        r5 = r5.length;
        r6 = r4.length;
        r5 = r5 - r6;
        if (r1 >= r5) goto L_0x0030;
    L_0x0028:
        r5 = r8.IV;
        r5[r1] = r2;
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0021;
    L_0x0030:
        if (r3 == 0) goto L_0x003a;
    L_0x0032:
        r1 = r8.IV;
        r5 = r8.IV;
        r5 = r5.length;
        java.lang.System.arraycopy(r4, r2, r1, r2, r5);
    L_0x003a:
        r8.reset();
        r1 = r0.getParameters();
        if (r1 == 0) goto L_0x004c;
    L_0x0043:
        r1 = r8.cipher;
        r0 = r0.getParameters();
        r1.init(r7, r0);
    L_0x004c:
        if (r3 == 0) goto L_0x0058;
    L_0x004e:
        r8.reset();
        if (r10 == 0) goto L_0x0058;
    L_0x0053:
        r0 = r8.cipher;
        r0.init(r7, r10);
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.OFBBlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    public OFBBlockCipher(BlockCipher blockCipher, int i) {
        super(blockCipher);
        this.cipher = blockCipher;
        this.blockSize = i / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    protected byte calculateByte(byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i = this.byteCount;
        this.byteCount = i + 1;
        byte b2 = (byte) (bArr[i] ^ b);
        if (this.byteCount == this.blockSize) {
            this.byteCount = 0;
            System.arraycopy(this.ofbV, this.blockSize, this.ofbV, 0, this.ofbV.length - this.blockSize);
            System.arraycopy(this.ofbOutV, 0, this.ofbV, this.ofbV.length - this.blockSize, this.blockSize);
        }
        return b2;
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z + (this.blockSize * 8);
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }
}
