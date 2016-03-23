package org;

import org.whispersystems.at;
import org.whispersystems.curve25519.d;

public class a9 {
    public static int b;
    private static final String[] z;
    final byte[] a;

    static {
        String[] strArr = new String[2];
        String str = "'\u001e>P";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 123;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 85;
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
                    str = "\u0012\t\"J2e\u0017(J21\u0013w\u0004";
                    obj = null;
            }
        }
    }

    public a9(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException(z[1] + bArr.length);
        }
        this.a = bArr;
    }

    public boolean a(byte[] bArr, byte[] bArr2) {
        return d.a(z[0]).a(this.a, bArr, bArr2);
    }

    public byte[] a() {
        return this.a;
    }
}
