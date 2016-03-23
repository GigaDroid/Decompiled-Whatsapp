package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;
import org.v;
import org.whispersystems.at;

public class SHA512Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 64;
    private static final String z;

    static {
        char[] toCharArray = "':\u001cL;E@".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 114;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this.H1, bArr, i);
        Pack.longToBigEndian(this.H2, bArr, i + 8);
        Pack.longToBigEndian(this.H3, bArr, i + 16);
        Pack.longToBigEndian(this.H4, bArr, i + 24);
        Pack.longToBigEndian(this.H5, bArr, i + 32);
        Pack.longToBigEndian(this.H6, bArr, i + 40);
        Pack.longToBigEndian(this.H7, bArr, i + 48);
        Pack.longToBigEndian(this.H8, bArr, i + 56);
        reset();
        return DIGEST_LENGTH;
    }

    public Memoable copy() {
        return new SHA512Digest(this);
    }

    public SHA512Digest(SHA512Digest sHA512Digest) {
        super(sHA512Digest);
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    public void reset(Memoable memoable) {
        copyIn((SHA512Digest) memoable);
    }

    public void reset() {
        super.reset();
        this.H1 = 7640891576956012808L;
        this.H2 = -4942790177534073029L;
        this.H3 = 4354685564936845355L;
        this.H4 = -6534734903238641935L;
        this.H5 = 5840696475078001361L;
        this.H6 = -7276294671716946913L;
        this.H7 = 2270897969802886507L;
        this.H8 = 6620516959819538809L;
    }

    public String getAlgorithmName() {
        return z;
    }

    public SHA512Digest(byte[] bArr) {
        restoreState(bArr);
    }

    public int getDigestSize() {
        return DIGEST_LENGTH;
    }
}
