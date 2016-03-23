package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class z extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[5];
        String str = "\u0004ZI$K";
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
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = 40;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0004ZI$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001aIK1";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0002MT'Q\u001bF";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002IJ!]";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    z(by byVar) {
        this.a = byVar;
    }

    public void a(cw cwVar, String str) {
        int i = 0;
        boolean z = co.s;
        cw f = cwVar.f(z[0]);
        if (f != null) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(f.b(z[4]));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            Vector c = f.c(z[2]);
            Hashtable hashtable = new Hashtable();
            while (i < c.size()) {
                cw cwVar2 = (cw) c.elementAt(i);
                hashtable.put(cwVar2.b(z[3]), cwVar2.b(z[1]));
                i++;
                if (z) {
                    break;
                }
            }
            by.d(this.a).a(parseInt, hashtable);
        }
    }
}
