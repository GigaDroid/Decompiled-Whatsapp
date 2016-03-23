package com.whatsapp.protocol;

import java.util.Hashtable;
import org.v;
import org.whispersystems.at;

class q extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[7];
        String str = "b.~p\u007f";
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
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = 79;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "d={s{w6";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "w.f`}{=k";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "z.\u007f`";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "q=`jh";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "q=`jh";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "w v`";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
    }

    q(by byVar) {
        this.a = byVar;
    }

    public void a(cw cwVar, String str) {
        boolean z = co.s;
        cw a = cwVar.a(0);
        Hashtable hashtable = new Hashtable();
        cw.a(a, z[2]);
        if (a.d != null) {
            int i = 0;
            while (i < a.d.length) {
                cw cwVar2 = a.d[i];
                cw.a(cwVar2, z[3]);
                String b = cwVar2.b(z[4]);
                Object b2 = cwVar2.b(z[0]);
                if (z[6].equals(b2)) {
                    cw a2 = cwVar2.a(0);
                    cw.a(a2, z[5]);
                    b2 = a2.b(z[1]);
                }
                hashtable.put(b, b2);
                i++;
                if (z) {
                    break;
                }
            }
        }
        by.d(this.a).d(hashtable);
    }
}
