package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;
import org.v;

class at extends a {
    private static final String[] z;
    final Runnable a;
    final by b;
    final b5 c;

    static {
        String[] strArr = new String[2];
        String str = "Z\u0018\u001a~\u0014[";
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
                        i3 = 62;
                        break;
                    case org.whispersystems.at.g /*1*/:
                        i3 = 125;
                        break;
                    case org.whispersystems.at.i /*2*/:
                        i3 = 118;
                        break;
                    case org.whispersystems.at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 96;
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
                    str = "Z\u0018\u001a~\u0014[";
                    obj = null;
            }
        }
    }

    public void a(cw cwVar, String str) {
        if (cwVar.f(z[1]) != null) {
            Vector vector = new Vector();
            Hashtable hashtable = new Hashtable();
            by.a(this.b, cwVar, vector, hashtable, z[0]);
            by.b(this.b).a(vector, hashtable);
        }
        if (this.a != null) {
            this.a.run();
        }
    }

    at(by byVar, Runnable runnable, b5 b5Var) {
        this.b = byVar;
        this.a = runnable;
        this.c = b5Var;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
