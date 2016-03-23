package org.whispersystems.curve25519;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.v;
import org.whispersystems.at;

public class ad implements X {
    private static final String z;

    static {
        char[] toCharArray = "\u000eCc4)\u000fEe".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 93;
                    break;
                case at.g /*1*/:
                    i2 = 11;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 5;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(byte[] bArr) {
        try {
            SecureRandom.getInstance(z).nextBytes(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
