package com;

import com.whatsapp.WAAppCompatActivity;
import java.security.Provider;
import org.v;
import org.whispersystems.at;

final class c extends Provider {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = ")8{=\u0003\u001f\u000fy&\u0015\u001506\u001b9;lH\u001a?=";
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
                        i3 = 122;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 24;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "64v=\t*\u000fV\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ")8{=\u0003\u001f\u000fy&\u0015\u001506\u001b9;lH\u001a?=}Q%\u0001\u00168u-\u001f\u000e8|\u0001\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ";}T!\u001f\u000f%5;\u0001\u001f>q.\u0018\u0019}j)\u001f\u001e2uh\u001f\u000f0z-\u0003Z-j'\u0007\u00139}:Q\u000e5y<Q\u000f.};QU9}>^\u000f/y&\u0015\u00150";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")2~<\u0006\u001b/}";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public c() {
        boolean z = false;
        boolean z2 = a.b;
        super(z[2], 1.0d, z[4]);
        put(z[0], b.class.getName());
        put(z[3], z[1]);
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            a.b = z;
        }
    }
}
