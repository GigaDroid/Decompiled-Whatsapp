package com.whatsapp;

import java.util.List;
import org.v;
import org.whispersystems.at;

public class sh extends sc {
    private static final String[] z;
    List b;
    String c;
    int d;
    boolean e;
    int f;

    static {
        String[] strArr = new String[6];
        String str = "j(3/vr>&v'n?n/";
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
                        i3 = 7;
                        break;
                    case at.g /*1*/:
                        i3 = 91;
                        break;
                    case at.i /*2*/:
                        i3 = 84;
                        break;
                    case at.o /*3*/:
                        i3 = 15;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "'=#kS~+15'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "v)\u000bbt`(t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "'*&vS~+15'";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "j4'{'u>7jis{9|`t";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'x9|`tat";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public sh(String str, List list, int i, boolean z, int i2) {
        this.c = str;
        this.b = list;
        this.d = i;
        this.e = z;
        this.f = i2;
    }

    public String c() {
        return z[3] + (this.c == null ? z[5] : z[0] + this.c) + z[2] + this.d + z[4] + this.f + z[1] + this.b.size();
    }

    public boolean a() {
        return this.e || super.a();
    }

    public void b() {
        App.a(this.c, this.b, this.d, false, this.e, null, null, this.f);
    }
}
