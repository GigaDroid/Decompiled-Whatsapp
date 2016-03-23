package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public class cx {
    public static float d;
    public static int e;
    public static int j;
    private static final String[] z;
    public double a;
    public double b;
    public int c;
    public String f;
    public long g;
    public int h;
    public float i;

    public String toString() {
        return z[1] + this.f + z[6] + this.a + z[3] + this.b + z[5] + this.c + z[2] + this.i + z[4] + this.h + z[0] + this.g + "]";
    }

    public boolean a() {
        return this.g > 0;
    }

    public cx() {
        this.c = j;
        this.i = d;
        this.h = e;
    }

    static {
        String[] strArr = new String[7];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "xN?\u0017\u001e+N7\u0017\u000be";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 88;
                        break;
                    case at.g /*1*/:
                        i4 = 58;
                        break;
                    case at.i /*2*/:
                        i4 = 86;
                        break;
                    case at.o /*3*/:
                        i4 = 122;
                        break;
                    default:
                        i4 = 123;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "xI&\u001f\u001e<\u0007";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "xV9\u0014\u001c1N#\u001e\u001ee";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "xX3\u001b\t1T1G";
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "x[5\u0019\u000e*[5\u0003F";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "xV7\u000e\u0012,O2\u001fF";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    j = -1;
                    d = -1.0f;
                    e = -1;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0003o%\u001f\t\u0014U5\u001b\u000f1U8Z\u00111^k";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }
}
