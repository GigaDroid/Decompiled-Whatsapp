package com.whatsapp.util;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import java.util.HashSet;
import org.v;
import org.whispersystems.at;

public class b7 {
    private static final HashSet a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "0C\u000549";
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
                        i3 = 7;
                        break;
                    case at.g /*1*/:
                        i3 = 114;
                        break;
                    case at.i /*2*/:
                        i3 = 55;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "4C\u00075?7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "4C\u00070;7";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashSet();
                    a();
                    return;
                default:
                    strArr2[i] = str;
                    str = "0C\u0005497";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static void a() {
        a.add(Pair.create(z[3], z[2]));
        a.add(Pair.create(z[0], z[1]));
    }

    public static boolean a(@NonNull String str, @NonNull String str2) {
        return a.contains(Pair.create(str, str2));
    }
}
