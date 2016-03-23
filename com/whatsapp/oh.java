package com.whatsapp;

import android.os.Build;
import android.os.Build.VERSION;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class oh {
    public static boolean b;
    private static final String[] z;
    protected int a;
    protected File c;

    static {
        String[] strArr = new String[10];
        String str = "=:p\ba^G";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = 119;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "=\u00183?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "=:p\ba^G";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "=:p\ba^Gm";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "@\u0018-3+";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000f\u00029/7A\u0018:!cN\u00142\"=\r\u0004`)(\u001b\u0004";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "-Elvl";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "-Elvm";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "-Envm";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001d\u001605-\u0000\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public File a() {
        return this.c;
    }

    public static oh a(String str, String str2) {
        if (z[6].equals(str2)) {
            return new po(str + z[5], 1);
        }
        if (VERSION.SDK_INT >= 16 && Build.MANUFACTURER.equals(z[2]) && !Build.MODEL.equals(z[7]) && !Build.MODEL.equals(z[8]) && !Build.MODEL.equals(z[9])) {
            oh o8Var = new o8(str);
            o8Var.a(5);
            return o8Var;
        } else if (VERSION.SDK_INT < 16 || !Build.MANUFACTURER.equals(z[1]) || !Build.MODEL.contains(z[0]) || Build.MODEL.equals(z[3]) || Build.MODEL.equals(z[4])) {
            return new oy(str, str2);
        } else {
            return new o8(str);
        }
    }
}
