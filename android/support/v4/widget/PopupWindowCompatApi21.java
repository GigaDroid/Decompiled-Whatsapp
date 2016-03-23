package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.v;
import org.whispersystems.at;

class PopupWindowCompatApi21 {
    private static Field sOverlapAnchorField;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 79;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 61);
        }
        return toCharArray;
    }

    static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
        if (sOverlapAnchorField != null) {
            try {
                sOverlapAnchorField.set(popupWindow, Boolean.valueOf(z));
            } catch (Throwable e) {
                Log.i(z[1], z[0], e);
            }
        }
    }

    static {
        String[] strArr = new String[2];
        String str = "f \u000f*Y\u0005!\u00152\u001dV*\u000efRS*\b*\\Uo\u001b(^M \bf[L*\u0016\"\u001dL!Z\u0016RU:\n\u0011TK+\u00151";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            str = z(z(str));
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        sOverlapAnchorField = PopupWindow.class.getDeclaredField(z(z("H\u0000\f#OI.\n\u0007SF'\u00154")));
                        sOverlapAnchorField.setAccessible(true);
                        return;
                    } catch (Throwable e) {
                        Log.i(z(z("u \n3Mr&\u0014\"RR\f\u0015+MD;;6T\u0017~")), z(z("f \u000f*Y\u0005!\u00152\u001dC*\u000e%U\u0005\"50XW#\u001b6|K,\u0012)O\u0005)\u0013#QAo\u001c4RHo*)MP?-/SA \r")), e);
                        return;
                    }
                default:
                    strArr2[i] = str;
                    str = "u \n3Mr&\u0014\"RR\f\u0015+MD;;6T\u0017~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }
}
