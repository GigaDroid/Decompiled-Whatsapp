package com.whatsapp;

import java.util.List;
import org.v;
import org.whispersystems.at;

public class s8 extends sc {
    private static final String[] z;
    boolean b;
    String c;
    int d;
    String e;
    List f;

    static {
        String[] strArr = new String[3];
        String str = "\u0003\u0011\n\u0003\u0002";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 110;
                        break;
                    case at.o /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0003[\n\\VB\u0011\u0002J\u0018\u0003";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "R\n1KGP\b\u0001WQFX\u001a@RFBN";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean a() {
        return this.b || super.a();
    }

    public void b() {
        App.a(this.e, this.f, this.d, this.b, this.c);
    }

    public s8(String str, List list, int i, boolean z, String str2) {
        this.e = str;
        this.f = list;
        this.d = i;
        this.b = z;
        this.c = str2;
    }

    public String c() {
        return z[1] + this.d + z[0] + this.e + z[2] + (this.f != null ? Integer.valueOf(this.f.size()) : "-");
    }
}
