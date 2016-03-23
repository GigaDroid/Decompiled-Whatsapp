package com.whatsapp.memory;

import android.os.Build;
import org.v;
import org.whispersystems.at;

public class a {
    private static Boolean a;
    private static final String[] b;

    static {
        String[] strArr = new String[2];
        String str = "[\u001b\u0017\t'-\u007f\n";
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
                        i3 = 28;
                        break;
                    case at.g /*1*/:
                        i3 = 79;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 16;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    b = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "[\u001b\u0017\u000e)/\u007f\u000f";
                    obj = null;
            }
        }
    }

    public static boolean a() {
        boolean z = true;
        int i = c.a;
        if (a == null) {
            String[] strArr = b;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!Build.MODEL.equals(strArr[i2])) {
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
                a = Boolean.valueOf(true);
                return a.booleanValue();
            }
            long a = c.a();
            if (a < 0) {
                return false;
            }
            if (a > 48) {
                z = false;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }
}
