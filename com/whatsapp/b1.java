package com.whatsapp;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public class b1 {
    private static final String[] z;
    private Method a;
    private lp b;
    private Resources c;
    private String d;

    static {
        String[] strArr = new String[4];
        String str = "|7wEM(/v]\u001e";
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
                        i3 = 92;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 2;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "|/vANa";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ";#vvF/)wV@9\u0004cCw9>v";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\f*wVB0fpAP33pGF|\u000fF\u0004\u0000l>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String a(int i, int i2, Object[] objArr) {
        return String.format(this.c.getConfiguration().locale, a(i, i2), objArr);
    }

    public b1(Resources resources) {
        this.c = resources;
        if (VERSION.SDK_INT < 11) {
            try {
                this.a = resources.getAssets().getClass().getDeclaredMethod(z[3], new Class[]{Integer.TYPE, Integer.TYPE});
                this.a.setAccessible(true);
            } catch (Throwable e) {
                Log.a(e);
            } catch (Throwable e2) {
                Log.a(e2);
            }
        }
    }

    public String a(int i, int i2) {
        try {
            if (VERSION.SDK_INT >= 11) {
                return this.c.getQuantityString(i, i2);
            }
            try {
                if (this.a == null) {
                    return this.c.getQuantityString(i, i2);
                }
                Locale locale = this.c.getConfiguration().locale;
                try {
                    if (!locale.getLanguage().equals(this.d)) {
                        this.d = locale.getLanguage();
                        this.b = lp.a(locale);
                    }
                    try {
                        if (this.b == null) {
                            return this.c.getQuantityString(i, i2);
                        }
                        Object obj = null;
                        if (null == null) {
                            try {
                                obj = this.a.invoke(this.c.getAssets(), new Object[]{Integer.valueOf(i), Integer.valueOf(lp.b(this.b.c(i2)))});
                            } catch (IllegalArgumentException e) {
                                throw new NotFoundException(e.getMessage());
                            } catch (IllegalAccessException e2) {
                                throw new NotFoundException(e2.getMessage());
                            } catch (InvocationTargetException e3) {
                                throw new NotFoundException(e3.getMessage());
                            }
                        }
                        if (obj == null) {
                            obj = this.a.invoke(this.c.getAssets(), new Object[]{Integer.valueOf(i), Integer.valueOf(16777220)});
                        }
                        if (obj != null) {
                            return obj.toString();
                        }
                        try {
                            throw new NotFoundException(z[1] + Integer.toHexString(i) + z[0] + i2 + z[2] + lp.a(this.b.c(i2)));
                        } catch (IllegalArgumentException e4) {
                            throw e4;
                        }
                    } catch (IllegalArgumentException e42) {
                        throw e42;
                    }
                } catch (IllegalArgumentException e422) {
                    throw e422;
                }
            } catch (IllegalArgumentException e4222) {
                throw e4222;
            }
        } catch (IllegalArgumentException e42222) {
            throw e42222;
        }
    }
}
