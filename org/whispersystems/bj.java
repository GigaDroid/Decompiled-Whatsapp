package org.whispersystems;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public class bj {
    private static final byte[] a;
    private static final byte[] b;
    private static final String[] z;
    private final byte[] c;
    private final int d;

    private byte[] a(byte[] bArr, byte[] bArr2) {
        Object e;
        try {
            Mac instance = Mac.getInstance(z[1]);
            instance.init(new SecretKeySpec(bArr2, z[0]));
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new AssertionError(e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new AssertionError(e);
        }
    }

    public bj(int i, byte[] bArr) {
        this.d = i;
        this.c = bArr;
    }

    public int d() {
        return this.d;
    }

    public bj c() {
        int i = g.a;
        bj bjVar = new bj(this.d + 1, a(b, this.c));
        if (a5.o) {
            g.a = i + 1;
        }
        return bjVar;
    }

    public byte[] b() {
        return this.c;
    }

    public g a() {
        return new g(this.d, a(a, this.c));
    }

    static {
        String[] strArr = new String[2];
        String str = "\u0019K-\u001cy\u0019g~J\u001c";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 81;
                        break;
                    case at.g /*1*/:
                        i4 = 38;
                        break;
                    case at.i /*2*/:
                        i4 = 76;
                        break;
                    case at.o /*3*/:
                        i4 = 127;
                        break;
                    default:
                        i4 = 42;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    a = new byte[]{(byte) 1};
                    b = new byte[]{(byte) 2};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0019K-\u001cy\u0019g~J\u001c";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }
}
