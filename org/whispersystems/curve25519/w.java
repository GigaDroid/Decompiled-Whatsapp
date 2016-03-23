package org.whispersystems.curve25519;

import org.v;
import org.whispersystems.at;

abstract class w implements K {
    private static final String z;
    private X a;
    private final M b;

    static {
        char[] toCharArray = "\u00125}Ef85.S\u007f<5kRt\u007f=oN'35`Qs7q".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 95;
                    break;
                case at.g /*1*/:
                    i2 = 80;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract boolean b();

    protected w(M m, X x) {
        this.b = m;
        this.a = x;
    }

    public byte[] a() {
        return generatePrivateKey(a(32));
    }

    public void a(X x) {
        this.a = x;
    }

    public byte[] generatePublicKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        R.a(bArr2, bArr);
        return bArr2;
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        s.a(bArr3, bArr, bArr2);
        return bArr3;
    }

    public byte[] a(int i) {
        byte[] bArr = new byte[i];
        this.a.a(bArr);
        return bArr;
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return R.a(this.b, bArr3, bArr, bArr2, bArr2.length) == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[64];
        try {
            if (R.a(this.b, bArr4, bArr2, bArr3, bArr3.length, bArr) == 0) {
                return bArr4;
            }
            throw new IllegalArgumentException(z);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public byte[] generatePrivateKey(byte[] bArr) {
        boolean z = false;
        int i = d.a;
        Object obj = new byte[32];
        try {
            System.arraycopy(bArr, 0, obj, 0, 32);
            obj[0] = (byte) (obj[0] & 248);
            obj[31] = (byte) (obj[31] & 127);
            obj[31] = (byte) (obj[31] | 64);
            if (i != 0) {
                if (!Z.a) {
                    z = true;
                }
                Z.a = z;
            }
            return obj;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
