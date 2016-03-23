package org.spongycastle.crypto.digests;

import com.whatsapp.arj;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;
import org.v;
import org.whispersystems.at;

public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private static final String z;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    static {
        char[] toCharArray = ":\u0002\"$w".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 99;
                    break;
                case at.o /*3*/:
                    i2 = 9;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int getDigestSize() {
        return DIGEST_LENGTH;
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        System.arraycopy(sHA1Digest.X, 0, this.X, 0, sHA1Digest.X.length);
        this.xOff = sHA1Digest.xOff;
    }

    public Memoable copy() {
        return new SHA1Digest(this);
    }

    protected void processBlock() {
        int i;
        boolean z = GeneralDigest.a;
        int i2 = 16;
        while (i2 < 80) {
            i = ((this.X[i2 - 3] ^ this.X[i2 - 8]) ^ this.X[i2 - 14]) ^ this.X[i2 - 16];
            this.X[i2] = (i >>> 31) | (i << 1);
            i2++;
            if (z) {
                break;
            }
        }
        int i3 = this.H1;
        int i4 = this.H2;
        int i5 = this.H3;
        int i6 = this.H4;
        i2 = 0;
        i = this.H5;
        int i7 = i6;
        i6 = i5;
        i5 = i4;
        i4 = i3;
        i3 = 0;
        while (i3 < 4) {
            int i8 = i2 + 1;
            i2 = ((this.X[i2] + (((i4 << 5) | (i4 >>> 27)) + f(i5, i6, i7))) + Y1) + i;
            i5 = (i5 >>> 2) | (i5 << 30);
            int i9 = i8 + 1;
            i7 += ((((i2 << 5) | (i2 >>> 27)) + f(i4, i5, i6)) + this.X[i8]) + Y1;
            i4 = (i4 >>> 2) | (i4 << 30);
            i8 = i9 + 1;
            i6 += ((((i7 << 5) | (i7 >>> 27)) + f(i2, i4, i5)) + this.X[i9]) + Y1;
            i = (i2 << 30) | (i2 >>> 2);
            i9 = i8 + 1;
            i5 += ((((i6 << 5) | (i6 >>> 27)) + f(i7, i, i4)) + this.X[i8]) + Y1;
            i7 = (i7 >>> 2) | (i7 << 30);
            int f = f(i6, i7, i) + ((i5 << 5) | (i5 >>> 27));
            i2 = i9 + 1;
            i4 += (f + this.X[i9]) + Y1;
            i6 = (i6 >>> 2) | (i6 << 30);
            i3++;
            if (z) {
                break;
            }
        }
        i3 = 0;
        while (i3 < 4) {
            i8 = i2 + 1;
            i2 = ((this.X[i2] + (((i4 << 5) | (i4 >>> 27)) + h(i5, i6, i7))) + Y2) + i;
            i5 = (i5 >>> 2) | (i5 << 30);
            i9 = i8 + 1;
            i7 += ((((i2 << 5) | (i2 >>> 27)) + h(i4, i5, i6)) + this.X[i8]) + Y2;
            i4 = (i4 >>> 2) | (i4 << 30);
            i8 = i9 + 1;
            i6 += ((((i7 << 5) | (i7 >>> 27)) + h(i2, i4, i5)) + this.X[i9]) + Y2;
            i = (i2 << 30) | (i2 >>> 2);
            i9 = i8 + 1;
            i5 += ((((i6 << 5) | (i6 >>> 27)) + h(i7, i, i4)) + this.X[i8]) + Y2;
            i7 = (i7 >>> 2) | (i7 << 30);
            f = h(i6, i7, i) + ((i5 << 5) | (i5 >>> 27));
            i2 = i9 + 1;
            i4 += (f + this.X[i9]) + Y2;
            i6 = (i6 >>> 2) | (i6 << 30);
            i3++;
            if (z) {
                break;
            }
        }
        i3 = 0;
        while (i3 < 4) {
            i8 = i2 + 1;
            i2 = ((this.X[i2] + (((i4 << 5) | (i4 >>> 27)) + g(i5, i6, i7))) + Y3) + i;
            i5 = (i5 >>> 2) | (i5 << 30);
            i9 = i8 + 1;
            i7 += ((((i2 << 5) | (i2 >>> 27)) + g(i4, i5, i6)) + this.X[i8]) + Y3;
            i4 = (i4 >>> 2) | (i4 << 30);
            i8 = i9 + 1;
            i6 += ((((i7 << 5) | (i7 >>> 27)) + g(i2, i4, i5)) + this.X[i9]) + Y3;
            i = (i2 << 30) | (i2 >>> 2);
            i9 = i8 + 1;
            i5 += ((((i6 << 5) | (i6 >>> 27)) + g(i7, i, i4)) + this.X[i8]) + Y3;
            i7 = (i7 >>> 2) | (i7 << 30);
            f = g(i6, i7, i) + ((i5 << 5) | (i5 >>> 27));
            i2 = i9 + 1;
            i4 += (f + this.X[i9]) + Y3;
            i6 = (i6 >>> 2) | (i6 << 30);
            i3++;
            if (z) {
                break;
            }
        }
        i3 = i2;
        i2 = i;
        i = i7;
        i7 = i6;
        i6 = i5;
        i5 = i4;
        i4 = 0;
        while (i4 <= 3) {
            i8 = i3 + 1;
            i2 += (this.X[i3] + (((i5 << 5) | (i5 >>> 27)) + h(i6, i7, i))) + Y4;
            i6 = (i6 >>> 2) | (i6 << 30);
            i9 = i8 + 1;
            i += ((((i2 << 5) | (i2 >>> 27)) + h(i5, i6, i7)) + this.X[i8]) + Y4;
            i5 = (i5 >>> 2) | (i5 << 30);
            i8 = i9 + 1;
            i7 += ((((i << 5) | (i >>> 27)) + h(i2, i5, i6)) + this.X[i9]) + Y4;
            i2 = (i2 >>> 2) | (i2 << 30);
            i9 = i8 + 1;
            i6 += ((((i7 << 5) | (i7 >>> 27)) + h(i, i2, i5)) + this.X[i8]) + Y4;
            i = (i >>> 2) | (i << 30);
            f = h(i7, i, i2) + ((i6 << 5) | (i6 >>> 27));
            i3 = i9 + 1;
            i5 += (f + this.X[i9]) + Y4;
            i7 = (i7 >>> 2) | (i7 << 30);
            i4++;
            if (z) {
                break;
            }
        }
        this.H1 = i5 + this.H1;
        this.H2 = i6 + this.H2;
        this.H3 = i7 + this.H3;
        this.H4 = i + this.H4;
        this.H5 = i2 + this.H5;
        this.xOff = 0;
        i2 = 0;
        while (i2 < 16) {
            this.X[i2] = 0;
            i2++;
            if (z) {
                return;
            }
        }
    }

    private int g(int i, int i2, int i3) {
        return ((i & i2) | (i & i3)) | (i2 & i3);
    }

    private int f(int i, int i2, int i3) {
        return (i & i2) | ((i ^ -1) & i3);
    }

    public SHA1Digest(byte[] bArr) {
        boolean z = GeneralDigest.a;
        super(bArr);
        this.X = new int[80];
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, DIGEST_LENGTH);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        int i = 0;
        while (i != this.xOff) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
            i++;
            if (z) {
                return;
            }
        }
    }

    public void reset() {
        boolean z = GeneralDigest.a;
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (i != this.X.length) {
            this.X[i] = 0;
            i++;
            if (z) {
                return;
            }
        }
    }

    protected void processWord(byte[] bArr, int i) {
        int i2 = i + 1;
        i2++;
        this.X[this.xOff] = (((bArr[i] << 24) | ((bArr[i2] & 255) << 16)) | ((bArr[i2] & 255) << 8)) | (bArr[i2 + 1] & 255);
        int i3 = this.xOff + 1;
        this.xOff = i3;
        if (i3 == 16) {
            processBlock();
        }
    }

    public SHA1Digest() {
        this.X = new int[80];
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super((GeneralDigest) sHA1Digest);
        this.X = new int[80];
        copyIn(sHA1Digest);
    }

    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn(sHA1Digest);
        copyIn(sHA1Digest);
    }

    public byte[] getEncodedState() {
        boolean z = GeneralDigest.a;
        byte[] bArr = new byte[((this.xOff * 4) + 40)];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, (int) DIGEST_LENGTH);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        int i = 0;
        while (i != this.xOff) {
            Pack.intToBigEndian(this.X[i], bArr, (i * 4) + 40);
            i++;
            if (z) {
                break;
            }
        }
        return bArr;
    }

    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        this.X[14] = (int) (j >>> 32);
        this.X[15] = (int) (-1 & j);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return DIGEST_LENGTH;
    }

    public String getAlgorithmName() {
        return z;
    }
}
