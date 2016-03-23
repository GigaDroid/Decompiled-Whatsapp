package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.v;
import org.whispersystems.at;

public class PKCS7Padding implements BlockCipherPadding {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "2\u000b@Y-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0012!g*x\u000e/`a:\u0001/qxo\u00124fn".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public int padCount(byte[] bArr) {
        int i;
        int i2;
        boolean z = PaddedBufferedBlockCipher.a;
        int i3 = bArr[bArr.length - 1] & 255;
        byte b = (byte) i3;
        if (i3 > bArr.length) {
            i = 1;
        } else {
            i = 0;
        }
        if (i3 == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        i = i2 | i;
        i2 = 0;
        while (i2 < bArr.length) {
            i |= (bArr.length - i2 <= i3 ? 1 : 0) & (bArr[i2] != b ? 1 : 0);
            i2++;
            if (z) {
                break;
            }
        }
        if (i == 0) {
            return i3;
        }
        throw new InvalidCipherTextException(z[1]);
    }

    public void init(SecureRandom secureRandom) {
    }

    public int addPadding(byte[] bArr, int i) {
        boolean z = PaddedBufferedBlockCipher.a;
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
            if (z) {
                break;
            }
        }
        return length;
    }

    public String getPaddingName() {
        return z[0];
    }
}
