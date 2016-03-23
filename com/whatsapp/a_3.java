package com.whatsapp;

import android.net.NetworkInfo;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

public final class a_3 {
    private static final String[] z;
    public final boolean a;
    public final int b;
    public final long c;
    public final boolean d;

    static {
        String[] strArr = new String[4];
        String str = "@Z5\u001b)`A2\u0003%wL \u0016#m[>\u00168fQf";
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
                        i3 = 3;
                        break;
                    case at.g /*1*/:
                        i3 = 53;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "/\u00155\u0001<FC>\u001b8W\\6\u0010\u0001jY7\u001c?>";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "/\u0015/\f<f\b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "/\u0015)\u001a-n\\5\u0012q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private a_3(boolean z, boolean z2, int i, long j) {
        this.a = z;
        this.d = z2;
        this.b = i;
        this.c = j;
    }

    public static a_3 a(NetworkInfo networkInfo) {
        long a = ((amm) h.b().b(amm.class)).a();
        if (networkInfo != null) {
            return new a_3(networkInfo.isConnected(), networkInfo.isRoaming(), networkInfo.getType(), a);
        }
        return new a_3(false, false, -1, a);
    }

    public String toString() {
        return z[0] + this.a + z[1] + this.d + z[3] + this.b + z[2] + this.c + '}';
    }
}
