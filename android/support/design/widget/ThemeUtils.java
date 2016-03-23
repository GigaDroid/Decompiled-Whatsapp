package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.R;
import org.v;
import org.whispersystems.at;

class ThemeUtils {
    private static final int[] APPCOMPAT_CHECK_ATTRS;
    private static final String z;

    static {
        char[] toCharArray = "\\g\u0001RP`m\u0010RJj(\u0001\u0001[%iT&V`e\u0011\\\u007fux7\u001dSui\u0000RJmm\u0019\u0017\u001e-g\u0006RZ`{\u0017\u0017Pai\u001a\u0006\u0017%\u007f\u001d\u0006V%|\u001c\u0017\u001eam\u0007\u001bYk(\u0018\u001b\\wi\u0006\u000b\u0010".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 5;
                    break;
                case at.g /*1*/:
                    i2 = 8;
                    break;
                case at.i /*2*/:
                    i2 = 116;
                    break;
                case at.o /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        APPCOMPAT_CHECK_ATTRS = new int[]{R.attr.colorPrimary};
    }

    static void checkAppCompatTheme(Context context) {
        Object obj = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(APPCOMPAT_CHECK_ATTRS);
        try {
            if (!obtainStyledAttributes.hasValue(0)) {
                obj = 1;
            }
            if (obtainStyledAttributes != null) {
                try {
                    obtainStyledAttributes.recycle();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            if (obj != null) {
                try {
                    throw new IllegalArgumentException(z);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
