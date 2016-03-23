package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;
import org.v;
import org.whispersystems.at;

public class SHA384Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 48;
    private static final String z;

    static {
        char[] toCharArray = "ngF9Q\u0005\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 61;
                    break;
                case at.g /*1*/:
                    i2 = 47;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void reset(Memoable memoable) {
        super.copyIn((SHA384Digest) memoable);
    }

    public Memoable copy() {
        return new SHA384Digest(this);
    }

    public String getAlgorithmName() {
        return z;
    }

    public SHA384Digest(SHA384Digest sHA384Digest) {
        super(sHA384Digest);
    }

    public int getDigestSize() {
        return DIGEST_LENGTH;
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this.H1, bArr, i);
        Pack.longToBigEndian(this.H2, bArr, i + 8);
        Pack.longToBigEndian(this.H3, bArr, i + 16);
        Pack.longToBigEndian(this.H4, bArr, i + 24);
        Pack.longToBigEndian(this.H5, bArr, i + 32);
        Pack.longToBigEndian(this.H6, bArr, i + 40);
        reset();
        return DIGEST_LENGTH;
    }

    public void reset() {
        super.reset();
        this.H1 = -3766243637369397544L;
        this.H2 = 7105036623409894663L;
        this.H3 = -7973340178411365097L;
        this.H4 = 1526699215303891257L;
        this.H5 = 7436329637833083697L;
        this.H6 = -8163818279084223215L;
        this.H7 = -2662702644619276377L;
        this.H8 = 5167115440072839076L;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    public SHA384Digest(byte[] bArr) {
        restoreState(bArr);
    }
}
