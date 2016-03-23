package org.spongycastle.crypto;

import org.v;
import org.whispersystems.at;

public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private static final String[] z;
    private final BlockCipher cipher;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "\u0000}\r=,\u001b(\u001b8?\tm\u000bm-\u0000gY>1\u0000z\r".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 111;
                    break;
                case at.g /*1*/:
                    i2 = 8;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0006f\t8-Oj\f+?\nzY96\u0000(\n 8\u0003d".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 111;
                    break;
                case at.g /*1*/:
                    i2 = 8;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    protected abstract byte calculateByte(byte b);

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z = DataLengthException.a;
        try {
            if (i3 + i2 > bArr2.length) {
                throw new DataLengthException(z[0]);
            }
            try {
                if (i + i2 > bArr.length) {
                    throw new DataLengthException(z[1]);
                }
                int i4 = i + i2;
                while (i < i4) {
                    int i5 = i3 + 1;
                    int i6 = i + 1;
                    bArr2[i3] = calculateByte(bArr[i]);
                    if (z) {
                        break;
                    }
                    i3 = i5;
                    i = i6;
                }
                return i2;
            } catch (DataLengthException e) {
                throw e;
            }
        } catch (DataLengthException e2) {
            throw e2;
        }
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    protected StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public final byte returnByte(byte b) {
        return calculateByte(b);
    }
}
