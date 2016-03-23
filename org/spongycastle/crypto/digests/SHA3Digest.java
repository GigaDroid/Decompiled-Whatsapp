package org.spongycastle.crypto.digests;

import org.v;
import org.whispersystems.at;

public class SHA3Digest extends KeccakDigest {
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[4];
        char[] toCharArray = "D\u0001~c{".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 63;
                    break;
                case at.o /*3*/:
                    i2 = 80;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "7'P$vd<O 9e=Z4vq&Mp\u0005_\b\u0012c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 63;
                    break;
                case at.o /*3*/:
                    i2 = 80;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "0+V$\u001ar'X$>0i".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 63;
                    break;
                case at.o /*3*/:
                    i2 = 80;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "09^\"\"~(S\u0012?c:\u0018p;b:Kp4riV>vc!Zp$v'X5vLy\u0013g\u000b".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 63;
                    break;
                case at.o /*3*/:
                    i2 = 80;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    public SHA3Digest() {
        this(256);
    }

    private static int checkBitLength(int i) {
        switch (i) {
            case 224:
            case 256:
            case 384:
            case 512:
                return i;
            default:
                throw new IllegalArgumentException(z[2] + i + z[1]);
        }
    }

    public String getAlgorithmName() {
        return z[0] + this.fixedOutputLength;
    }

    public int doFinal(byte[] bArr, int i) {
        absorb(new byte[]{(byte) 2}, 0, 2);
        return super.doFinal(bArr, i);
    }

    public SHA3Digest(int i) {
        super(checkBitLength(i));
    }

    protected int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 < 0 || i2 > 7) {
            try {
                throw new IllegalArgumentException(z[3]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i3 = (2 << i2) | (((1 << i2) - 1) & b);
        int i4 = i2 + 2;
        if (i4 >= 8) {
            this.oneByte[0] = (byte) i3;
            absorb(this.oneByte, 0, 8);
            i4 -= 8;
            i3 >>>= 8;
        }
        return super.doFinal(bArr, i, (byte) i3, i4);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super((KeccakDigest) sHA3Digest);
    }
}
