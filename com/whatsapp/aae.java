package com.whatsapp;

import java.util.Arrays;
import org.v;
import org.whispersystems.at;

public class aae {
    private static final String[] z;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public String e;

    static {
        String[] strArr = new String[5];
        String str = "\f}5'z>_?<g+nv\u0017l'l>)}\u0018y$?f!rk";
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
                        i3 = 78;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 86;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "nw35Y+n%%` !";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "b<1#`)p3\u0005k\u001d}:82";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "b<%)}8y$\u001fn\"hk";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "b<3\"l<e&8f!r\u001f:2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[0] + Arrays.toString(this.c) + z[2] + this.e + z[4] + Arrays.toString(this.a) + z[3] + Arrays.toString(this.b) + z[1] + Arrays.toString(this.d) + "]";
    }

    public aae(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = bArr;
        this.e = str;
        this.a = bArr2;
        this.b = bArr3;
        this.d = bArr4;
    }
}
