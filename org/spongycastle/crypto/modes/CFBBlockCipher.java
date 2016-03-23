package org.spongycastle.crypto.modes;

import com.whatsapp.arj;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.util.Arrays;
import org.v;
import org.whispersystems.at;

public class CFBBlockCipher extends StreamBlockCipher {
    private static final String z;
    private byte[] IV;
    private int blockSize;
    private int byteCount;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;
    private boolean encrypting;
    private byte[] inBuf;

    static {
        char[] toCharArray = "k.3\b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 68;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.i /*2*/:
                    i2 = 117;
                    break;
                case at.o /*3*/:
                    i2 = 74;
                    break;
                default:
                    i2 = arj.Theme_switchStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    private byte decryptByte(byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        this.inBuf[this.byteCount] = b;
        byte[] bArr = this.cfbOutV;
        int i = this.byteCount;
        this.byteCount = i + 1;
        byte b2 = (byte) (bArr[i] ^ b);
        if (this.byteCount == this.blockSize) {
            this.byteCount = 0;
            System.arraycopy(this.cfbV, this.blockSize, this.cfbV, 0, this.cfbV.length - this.blockSize);
            System.arraycopy(this.inBuf, 0, this.cfbV, this.cfbV.length - this.blockSize, this.blockSize);
        }
        return b2;
    }

    public void reset() {
        System.arraycopy(this.IV, 0, this.cfbV, 0, this.IV.length);
        Arrays.fill(this.inBuf, (byte) 0);
        this.byteCount = 0;
        this.cipher.reset();
    }

    protected byte calculateByte(byte b) {
        return this.encrypting ? encryptByte(b) : decryptByte(b);
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r9, org.spongycastle.crypto.CipherParameters r10) {
        /*
        r8 = this;
        r7 = 1;
        r2 = 0;
        r3 = org.spongycastle.crypto.modes.GCMBlockCipher.a;
        r8.encrypting = r9;
        r0 = r10 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x0050;
    L_0x000a:
        r0 = r10;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;
        r4 = r0.getIV();
        r1 = r4.length;
        r5 = r8.IV;
        r5 = r5.length;
        if (r1 >= r5) goto L_0x0034;
    L_0x0017:
        r1 = r8.IV;
        r5 = r8.IV;
        r5 = r5.length;
        r6 = r4.length;
        r5 = r5 - r6;
        r6 = r4.length;
        java.lang.System.arraycopy(r4, r2, r1, r5, r6);
        r1 = r2;
    L_0x0023:
        r5 = r8.IV;
        r5 = r5.length;
        r6 = r4.length;
        r5 = r5 - r6;
        if (r1 >= r5) goto L_0x0032;
    L_0x002a:
        r5 = r8.IV;
        r5[r1] = r2;
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0023;
    L_0x0032:
        if (r3 == 0) goto L_0x003c;
    L_0x0034:
        r1 = r8.IV;
        r5 = r8.IV;
        r5 = r5.length;
        java.lang.System.arraycopy(r4, r2, r1, r2, r5);
    L_0x003c:
        r8.reset();
        r1 = r0.getParameters();
        if (r1 == 0) goto L_0x004e;
    L_0x0045:
        r1 = r8.cipher;
        r0 = r0.getParameters();
        r1.init(r7, r0);
    L_0x004e:
        if (r3 == 0) goto L_0x005a;
    L_0x0050:
        r8.reset();
        if (r10 == 0) goto L_0x005a;
    L_0x0055:
        r0 = r8.cipher;
        r0.init(r7, r10);
    L_0x005a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.CFBBlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z + (this.blockSize * 8);
    }

    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    public byte[] getCurrentIV() {
        return Arrays.clone(this.cfbV);
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    public CFBBlockCipher(BlockCipher blockCipher, int i) {
        super(blockCipher);
        this.cipher = null;
        this.cipher = blockCipher;
        this.blockSize = i / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
        this.inBuf = new byte[this.blockSize];
    }

    private byte encryptByte(byte b) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte b2 = (byte) (this.cfbOutV[this.byteCount] ^ b);
        byte[] bArr = this.inBuf;
        int i = this.byteCount;
        this.byteCount = i + 1;
        bArr[i] = b2;
        if (this.byteCount == this.blockSize) {
            this.byteCount = 0;
            System.arraycopy(this.cfbV, this.blockSize, this.cfbV, 0, this.cfbV.length - this.blockSize);
            System.arraycopy(this.inBuf, 0, this.cfbV, this.cfbV.length - this.blockSize, this.blockSize);
        }
        return b2;
    }
}
