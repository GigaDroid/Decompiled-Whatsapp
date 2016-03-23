package com.whatsapp;

import org.v;
import org.whispersystems.at;

public class bv {
    private static final String[] z;
    public int a;
    public byte[] b;
    public int c;
    public String d;

    static {
        String[] strArr = new String[3];
        String str = "*:Y,\"??";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 72;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = 75;
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
                    str = "3%]=.";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "3%]=.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String a() {
        if (this.c == 1) {
            return z[2];
        }
        if (this.c == 2) {
            return z[0];
        }
        return z[1];
    }

    public bv(String str, int i, int i2) {
        this.d = str;
        this.a = i;
        this.c = i2;
    }

    public bv(String str, byte[] bArr, int i, int i2) {
        this.d = str;
        this.b = bArr;
        this.a = i;
        this.c = i2;
    }
}
