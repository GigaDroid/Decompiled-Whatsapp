package com.whatsapp.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.ViewGroup;
import org.v;
import org.whispersystems.at;

final class e implements Factory {
    private static final String[] z;
    final Activity a;

    static {
        String[] strArr = new String[2];
        String str = "-xi#%%r#\"?<fb#>b`:\u007f#\"bh#$-z#'#)a#</\"c#\u001d#?b@4$9_y4'\u001a\u007fh&";
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
                        i3 = 76;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "/y`\u007f+\"r\u007f>#(8d?>)dc0&b`d4=b{h??bZd\">\u0001sc$\u00038s`\u0007#)a";
                    obj = null;
            }
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        try {
            if (str.equalsIgnoreCase(z[0]) || str.equalsIgnoreCase(z[1])) {
                try {
                    ViewGroup viewGroup = (ViewGroup) context.getClassLoader().loadClass(str).asSubclass(ViewGroup.class).getConstructor(new Class[]{Context.class, AttributeSet.class}).newInstance(new Object[]{context, attributeSet});
                    new Handler(Looper.getMainLooper()).post(new bv(this, viewGroup));
                    return viewGroup;
                } catch (Exception e) {
                }
            }
            return null;
        } catch (Exception e2) {
            throw e2;
        }
    }

    e(Activity activity) {
        this.a = activity;
    }
}
