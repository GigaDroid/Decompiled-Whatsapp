package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public class b_ extends RuntimeException {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    String a;
    Throwable b;

    static {
        String[] strArr = new String[2];
        String str = "ME{v\u0007sY}<W";
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
                        i3 = 26;
                        break;
                    case at.g /*1*/:
                        i3 = 55;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 119;
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
                    str = "\u0010qoh%oYno\u001a\u007frbe\u0012jCsi\u0019:[{u\u0003:Dng\u0019`V &";
                    obj = null;
            }
        }
    }

    public b_(Throwable th, String str) {
        this.a = str;
        this.b = th;
    }

    public Throwable a() {
        return this.b;
    }

    public String getMessage() {
        return z[0] + this.b + z[1] + this.a;
    }
}
