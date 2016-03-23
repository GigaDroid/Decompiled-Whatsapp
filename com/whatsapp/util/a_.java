package com.whatsapp.util;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.at;

public final class a_ {
    private static final Pattern c;
    private static final String[] z;
    private final String a;
    private final String b;

    public static a_ a(String str) {
        return a(str, z[3], z[4]);
    }

    public String b() {
        return this.a;
    }

    private a_(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    static {
        String[] strArr = new String[5];
        String str = "7\u0015?g<\u0019J";
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
                        i3 = 122;
                        break;
                    case at.g /*1*/:
                        i3 = 118;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0017\u0015?G<\u0019Y,K \t\u0013|G<\u0019V2E&Z\u0006=X!\u001f\u0017>F7Z\u0017/\n;\u0014\u00029M7\bL|";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "JFl";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "JFl";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "R*8Qa\u0007_tv6\u0001Dp\u0019/S".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 122;
                                break;
                            case at.g /*1*/:
                                i5 = 118;
                                break;
                            case at.i /*2*/:
                                i5 = 92;
                                break;
                            case at.o /*3*/:
                                i5 = 42;
                                break;
                            default:
                                i5 = 82;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    c = Pattern.compile(new String(cArr2).intern());
                    return;
                default:
                    strArr2[i] = str;
                    str = "_FoN";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[0] + this.b + "," + this.a + ">";
    }

    public static a_ a(String str, String str2, String str3) {
        if (str == null) {
            try {
                return new a_(str2, str3);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        Matcher matcher = c.matcher(str);
        try {
            if (!matcher.matches()) {
                return new a_(str2, str3);
            }
            String group = matcher.group(1);
            try {
                str3 = String.format(Locale.US, z[1], new Object[]{Integer.valueOf(Integer.valueOf(matcher.group(2)).intValue())});
            } catch (NumberFormatException e2) {
                Log.e(z[2] + matcher.group(2));
            }
            return new a_(group, str3);
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (getClass() != obj.getClass()) {
                return false;
            }
            a_ a_Var = (a_) obj;
            try {
                if (TextUtils.equals(this.b, a_Var.b)) {
                    if (TextUtils.equals(this.a, a_Var.a)) {
                        return true;
                    }
                }
                return false;
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static String a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        Matcher matcher = c.matcher(str);
        try {
            if (!matcher.matches()) {
                return str2;
            }
            String group = matcher.group(1);
            return group + "-" + matcher.group(2);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public String a() {
        return this.b;
    }

    public int hashCode() {
        int i = 0;
        try {
            int hashCode = this.b == null ? 0 : this.b.hashCode();
            try {
                if (this.a != null) {
                    i = this.a.hashCode();
                }
                return (hashCode * 31) + i;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }
}
