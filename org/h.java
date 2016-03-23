package org;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.whispersystems.at;

public class h {
    public static int b;
    private static final String[] z;
    private byte[] a;

    static {
        String[] strArr = new String[2];
        String str = "\nj\u0003}@l\u0014";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 34;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 114;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\nj\u0003}@l\u0014";
                    obj = null;
            }
        }
    }

    public void a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(z[1]);
            instance.update(this.a);
            this.a = instance.digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public h(byte[] bArr) {
        try {
            if (bArr.length <= 32) {
                this.a = bArr;
                if (b == 0) {
                    return;
                }
            }
            this.a = MessageDigest.getInstance(z[0]).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw e;
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] a() {
        return this.a;
    }
}
