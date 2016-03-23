package com.whatsapp.util;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.whatsapp.App;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

public class bm {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "GPB\u0003nZV";
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
                        i3 = 52;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 47;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "U_K\u0002t]U\u0001\u0003~W\u001fL\u001crDS@\u0011iP\u001fl\u001crDS@\u0011iPdf=zZPH\u0015i";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "ST[9uGEN\u001exQ";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "d]J\u0011hQ\u0011L\u0018~WZ\u000f\u0019}\u0014EG\u0015b\u0014WF\b~P\u0011[\u0018~\u0014]J\u0011p\u000f\u0011F\u0016;Z^[\\;@YJ\u001e;UUE\u0005h@\u0011|4Pkxa$;FPA\u0017~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean b() {
        return VERSION.SDK_INT < 11;
    }

    public static void a(Context context) {
        try {
            if (z[0].equalsIgnoreCase(Build.MANUFACTURER)) {
                if (VERSION.SDK_INT >= 19) {
                    if (VERSION.SDK_INT <= 22) {
                        try {
                            Method declaredMethod = Class.forName(z[2]).getDeclaredMethod(z[3], new Class[]{Context.class});
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(null, new Object[]{context});
                            return;
                        } catch (Exception e) {
                            try {
                                if (Log.h == 0) {
                                    return;
                                }
                            } catch (Exception e2) {
                                throw e2;
                            } catch (Exception e22) {
                                throw e22;
                            }
                        }
                    }
                }
                if (VERSION.SDK_INT > 22) {
                    try {
                        if (App.am >= 3) {
                            throw new AssertionError(z[1]);
                        }
                    } catch (Exception e222) {
                        throw e222;
                    }
                }
            }
        } catch (Exception e2222) {
            throw e2222;
        } catch (Exception e22222) {
            throw e22222;
        }
    }

    public static boolean a() {
        return VERSION.SDK_INT == 15;
    }
}
