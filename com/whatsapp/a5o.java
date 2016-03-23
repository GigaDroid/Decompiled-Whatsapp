package com.whatsapp;

import java.util.Arrays;
import org.v;
import org.whispersystems.at;

public class a5o {
    private static final String[] z;
    public int a;
    public byte[] b;
    public byte[] c;

    static {
        String[] strArr = new String[3];
        String str = "\b#:~ZKv5iqEp3 ";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 3;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\b#0x@\u0019";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "cf/^PTk>orAz\txJQo/=bGl?x\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public a5o(int i, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = bArr;
        this.c = bArr2;
    }

    public String toString() {
        return z[1] + this.a + z[2] + Arrays.toString(this.b) + z[0] + Arrays.toString(this.c) + "]";
    }
}
