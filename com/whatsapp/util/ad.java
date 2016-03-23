package com.whatsapp.util;

import com.whatsapp.arj;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.at;

class ad implements cd {
    private static Pattern a;
    private static cj[] b;
    private static final String[] z;

    public double a(String str) {
        int i = Log.h;
        cj[] cjVarArr = b;
        int length = cjVarArr.length;
        int i2 = 0;
        double d = 0.0d;
        while (i2 < length) {
            cj cjVar = cjVarArr[i2];
            if (cjVar.a.matcher(str).find()) {
                d = cjVar.b;
                if (i == 0) {
                    break;
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        if (d == 0.0d) {
            return d;
        }
        if (str.indexOf(34) >= 0 || str.indexOf(58) >= 0) {
            return 0.0d;
        }
        return d;
    }

    public String a(double d, String str) {
        if (d > 8.0d) {
            return a.matcher(str).replaceAll("\u0430");
        }
        if (d < -8.0d) {
            return a.matcher(str).replaceAll("");
        }
        return str;
    }

    private ad() {
    }

    static {
        String[] strArr = new String[4];
        String str = "]~\u0424>\u000b*@8H\u0443\u0431\u045d\u0427>\u001a";
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
                        i4 = 1;
                        break;
                    case at.g /*1*/:
                        i4 = 28;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_seekBarStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 98;
                        break;
                    default:
                        i4 = 120;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "]~\u0424>\u000b*@8H\u0443\u0440\u04537\u0000";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "]~\u0424>\u000b*@8H\u0443]~";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = new cj[]{new cj(Pattern.compile(z[1], 2), 1.0d), new cj(Pattern.compile(z[0], 2), 1.5d), new cj(Pattern.compile(z[3], 2), -1.0d), new cj(Pattern.compile(z[2], 2), -1.5d)};
                    char[] toCharArray2 = "]4F]\u0448]5".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i4 = 0; length2 > i4; i4++) {
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i = 1;
                                break;
                            case at.g /*1*/:
                                i = 28;
                                break;
                            case at.i /*2*/:
                                i = arj.Theme_seekBarStyle;
                                break;
                            case at.o /*3*/:
                                i = 98;
                                break;
                            default:
                                i = 120;
                                break;
                        }
                        cArr2[i4] = (char) (i ^ c2);
                    }
                    a = Pattern.compile(new String(cArr2).intern());
                    return;
                default:
                    strArr2[i2] = str;
                    str = "]~\u0424>\u000b*@8H\u0443\u0431@\t";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    ad(cr crVar) {
        this();
    }
}
