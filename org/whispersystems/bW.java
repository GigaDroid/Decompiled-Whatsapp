package org.whispersystems;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.v;

public class bW implements aY {
    private static final String[] z;
    private final long a;

    static {
        String[] strArr = new String[2];
        String str = "/b\u0014b";
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
                        i3 = 10;
                        break;
                    case at.g /*1*/:
                        i3 = 82;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 69;
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
                    str = "Y\u001a`+p;`";
                    obj = null;
            }
        }
    }

    public bW(long j) {
        this.a = j;
    }

    public af a(String str, bp bpVar, String str2, bp bpVar2) {
        return new af(new b6(a(str, bpVar), a(str2, bpVar2)), new B(0, str, bpVar, str2, bpVar2));
    }

    private String a(byte[] bArr, int i) {
        long c = aw.c(bArr, i) % 100000;
        return String.format(z[0], new Object[]{Long.valueOf(c)});
    }

    private String a(String str, bp bpVar) {
        int i = v.e;
        try {
            MessageDigest instance = MessageDigest.getInstance(z[1]);
            byte[] a = aw.a(new byte[][]{aw.a(0), bpVar.a().a(), str.getBytes()});
            int i2 = 0;
            while (((long) i2) < this.a) {
                instance.update(a);
                a = instance.digest(r4);
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return a(a, 0) + a(a, 5) + a(a, 10) + a(a, 15) + a(a, 20) + a(a, 25);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
