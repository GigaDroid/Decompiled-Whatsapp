package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import org.v;
import org.whispersystems.at;

class CompoundButtonCompatDonut {
    private static Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "U]9D#w\u001c$GfaY$Z/vJ5\b+QI$\\)}x\"I1r^<MfuU5D\"";
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
                        i3 = 19;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 80;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "PS=X)fR4j3gH?F\u0005|Q I2WS>]2";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "PS=X)fR4j3gH?F\u0005|Q I2WS>]2";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "~~%\\2|R\u0014Z'd]2D#";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "U]9D#w\u001c$GftY$\b$fH$G(3X\"I1r^<MfeU1\b4vZ<M%gU?F";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof TintableCompoundButton) {
            ((TintableCompoundButton) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    static Drawable getButtonDrawable(CompoundButton compoundButton) {
        try {
            if (!sButtonDrawableFieldFetched) {
                try {
                    sButtonDrawableField = CompoundButton.class.getDeclaredField(z[4]);
                    sButtonDrawableField.setAccessible(true);
                } catch (Throwable e) {
                    Log.i(z[3], z[0], e);
                }
                sButtonDrawableFieldFetched = true;
            }
            try {
                if (sButtonDrawableField != null) {
                    try {
                        return (Drawable) sButtonDrawableField.get(compoundButton);
                    } catch (Throwable e2) {
                        Log.i(z[2], z[1], e2);
                        sButtonDrawableField = null;
                    }
                }
                return null;
            } catch (NoSuchFieldException e3) {
                throw e3;
            }
        } catch (IllegalAccessException e4) {
            throw e4;
        }
    }

    static void setButtonTintMode(CompoundButton compoundButton, Mode mode) {
        if (compoundButton instanceof TintableCompoundButton) {
            ((TintableCompoundButton) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
