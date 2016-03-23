package com.whatsapp.protocol;

import java.util.Hashtable;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class ao extends a {
    private static final String[] z;
    final ay a;
    final by b;
    final b5 c;

    static {
        String[] strArr = new String[10];
        String str = "\u0017K\u0007cS\u0010D\u001f+R\u001bW\u0005cSS@\u0001tN\f";
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
                        i3 = 126;
                        break;
                    case at.g /*1*/:
                        i3 = 37;
                        break;
                    case at.i /*2*/:
                        i3 = 115;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0017A";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\n\\\u0003c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0019W\u001csQ";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\rP\u0011lD\u001dQ";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "\rz\u001c";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "\u001dW\u0016gU\u0017J\u001d";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\rz\u0007";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0019W\u001csQ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001dW\u0016gU\u0011W";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(cw cwVar, String str) {
        cw a = cwVar.a(0);
        cw.a(a, z[4]);
        String a2 = by.a(this.b, a.b(z[2]));
        String b = a.b(z[1]);
        long j = 0;
        try {
            j = Long.parseLong(a.b(z[7])) * 1000;
        } catch (NumberFormatException e) {
        }
        String b2 = a.b(z[5]);
        long j2 = 0;
        try {
            j2 = Long.parseLong(a.b(z[8])) * 1000;
        } catch (NumberFormatException e2) {
        }
        String b3 = a.b(z[6]);
        String b4 = a.b(z[3]);
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        try {
            by.a(this.b, cwVar, hashtable, hashtable2, z[9]);
            by.b(this.b).a(a2, b, j, b2, j2, b3, b4, hashtable, hashtable2);
            if (this.a != null) {
                this.a.a(a2);
            }
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    public void a(int i, String str) {
        try {
            if (this.c != null) {
                if (i == 500 && str != null) {
                    try {
                        if (str.equals(z[0])) {
                            i = -500;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                this.c.a(i);
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    ao(by byVar, ay ayVar, b5 b5Var) {
        this.b = byVar;
        this.a = ayVar;
        this.c = b5Var;
    }
}
