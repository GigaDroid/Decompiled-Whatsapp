package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

class PopupWindowCompatGingerbread {
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;
    private static final String z;

    static {
        char[] toCharArray = "5+Y\u0006C(*B&f'7B$^\u00127]4".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 70;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static void setWindowLayoutType(PopupWindow popupWindow, int i) {
        if (!sSetWindowLayoutTypeMethodAttempted) {
            try {
                sSetWindowLayoutTypeMethod = PopupWindow.class.getDeclaredMethod(z, new Class[]{Integer.TYPE});
                sSetWindowLayoutTypeMethod.setAccessible(true);
            } catch (Exception e) {
            }
            sSetWindowLayoutTypeMethodAttempted = true;
        }
        if (sSetWindowLayoutTypeMethod != null) {
            try {
                sSetWindowLayoutTypeMethod.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
            }
        }
    }
}
