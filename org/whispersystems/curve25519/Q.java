package org.whispersystems.curve25519;

import com.whatsapp.arj;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.v;
import org.whispersystems.at;

public class Q implements M {
    private static final String z;

    static {
        char[] toCharArray = "48E\u0003dVB".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.g /*1*/:
                    i2 = 112;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 46;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(byte[] bArr, byte[] bArr2, long j) {
        int i = d.a;
        try {
            MessageDigest instance = MessageDigest.getInstance(z);
            instance.update(bArr2, 0, (int) j);
            Object digest = instance.digest();
            System.arraycopy(digest, 0, bArr, 0, digest.length);
            try {
                if (Z.a) {
                    d.a = i + 1;
                }
            } catch (NoSuchAlgorithmException e) {
                throw e;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
