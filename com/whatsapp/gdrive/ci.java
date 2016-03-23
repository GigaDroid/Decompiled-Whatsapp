package com.whatsapp.gdrive;

import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.util.Random;
import org.v;
import org.whispersystems.at;

final class ci {
    private static final Random a;
    private static final String[] z;

    public static void b(int i) {
        int i2 = (1 << i) * 1000;
        i2 = a.nextInt(i2) + (i2 / 2);
        Log.i(z[0] + i2 + z[1]);
        Thread.sleep((long) i2);
    }

    public static boolean a(int i) {
        return i < 12;
    }

    static {
        String[] strArr = new String[2];
        String str = "\u0016^\u001e\u001ek\u0014\u0015\u000e\u0016~\u001aU\n\u00110\u0001U\u0000\u001e~\b\u0015\u000e\u0016~\u001aU\n\u00112";
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
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new Random();
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "QW\u0005\u001bq\u0018I\t\u0014r\u001f^\u001f";
                    obj = null;
            }
        }
    }
}
