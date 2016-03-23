package com.whatsapp;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class vn {
    private static String a;
    private static final Pattern b;
    private static final String[] z;

    public static String a() {
        return a;
    }

    static void a(Context context) {
        a = a(context, z[0]);
    }

    public static String a(Context context, String str) {
        String replace = str.replace(' ', '_');
        String replace2 = z[1].replace(' ', '_');
        String replace3 = context.getString(2131232306).replace(' ', '_');
        String str2 = z[3];
        String str3 = z[5];
        String str4 = z[4];
        try {
            str2 = b.matcher(VERSION.RELEASE).replaceAll("_");
        } catch (Throwable e) {
            Log.b(z[6], e);
        }
        try {
            str3 = b.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (Throwable e2) {
            Log.b(z[8], e2);
        }
        try {
            str4 = b.matcher(Build.MODEL).replaceAll("_");
        } catch (Throwable e22) {
            Log.b(z[7], e22);
        }
        return replace3 + "/" + replace + " " + replace2 + "/" + str2 + z[2] + str3 + "-" + str4;
    }

    static {
        String[] strArr = new String[9];
        String str = "\u000e=\f\u0013Y\t&\r";
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
                        i3 = 60;
                        break;
                    case at.g /*1*/:
                        i3 = 19;
                        break;
                    case at.i /*2*/:
                        i3 = 61;
                        break;
                    case at.o /*3*/:
                        i3 = 33;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001cWXW\u001e_v\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "I}VO\u0018K}";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "I}VO\u0018K}";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "I}VO\u0018K}";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "]cM\u000e\u0002OvO\f\u0016[vSUXNvQD\u0016Ov";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "]cM\u000e\u0002OvO\f\u0016[vSUXQ|YD\u001b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "]cM\u000e\u0002OvO\f\u0016[vSUXQrST\u0011]pIT\u0005Ya";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "gM\u0011}Y`da\f+\u0014O\u0014|".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 60;
                                break;
                            case at.g /*1*/:
                                i5 = 19;
                                break;
                            case at.i /*2*/:
                                i5 = 61;
                                break;
                            case at.o /*3*/:
                                i5 = 33;
                                break;
                            default:
                                i5 = 119;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    b = Pattern.compile(new String(cArr2).intern());
                    return;
                default:
                    strArr2[i] = str;
                    str = "}}YS\u0018Uw";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
