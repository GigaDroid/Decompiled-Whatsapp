package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class aak {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "D$\u001f\u0002-Z9\u001d\u000e-F9\u0004\u0005$Gc\u0004\u001e!Yc\u0015\u001e:[>";
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
                        i3 = 52;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 112;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0001~";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0006\u007fG";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0001y";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0001x";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static boolean a(String str, String str2, String str3, String str4, int i) {
        if (str.length() >= i) {
            String str5 = i;
            if (str5.equals(str2) || str5.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str, String str2, String str3, String str4, String str5, int i) {
        String str6 = str4 + str2;
        return a(str, str2, str6, str5, i) || a(str3, str2, str6, str5, i) || a(str2, str, str3, str5, i - str4.length()) || a(str6, str, str3, str5, i) || a(str, str2, str6, str5, i - str4.length()) || a(str3, str2, str6, str5, i - str4.length());
    }

    public static String a(String str, String str2) {
        try {
            str2 = u0.a(Integer.parseInt(str), str2);
        } catch (Throwable e) {
            Log.b(z[0], e);
        }
        return str2;
    }

    public static boolean a(String str, String str2, String str3, String str4) {
        if (str4.equals(z[4])) {
            return a(str, str2, str3, str4, "9", 4);
        } else if (str4.equals(z[1])) {
            return a(str, str2, str3, str4, "9", 2);
        } else if (str4.equals(z[2])) {
            return a(str, str2, str3, str4, "1", 2);
        } else if (!str4.equals(z[3])) {
            return false;
        } else {
            return a(str, str2, str3, str4, "6", 3);
        }
    }
}
