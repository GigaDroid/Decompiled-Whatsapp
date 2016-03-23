package com.whatsapp.protocol;

import java.util.Hashtable;
import org.v;
import org.whispersystems.at;

class p extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[7];
        String str = "i4k\u0016^";
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
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 25;
                        break;
                    case at.o /*3*/:
                        i3 = 121;
                        break;
                    default:
                        i3 = 44;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "i4k\u0016^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "o)}\u001c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "z'u\fI";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "|4p\u000fMo?";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "o'm\u001cKc4`";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "b't\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(cw cwVar, String str) {
        boolean z = co.s;
        cw a = cwVar.a(0);
        Hashtable hashtable = new Hashtable();
        cw.a(a, z[5]);
        if (a.d != null) {
            int i = 0;
            while (i < a.d.length) {
                cw cwVar2 = a.d[i];
                cw.a(cwVar2, z[6]);
                String b = cwVar2.b(z[1]);
                Object b2 = cwVar2.b(z[4]);
                if (z[0].equals(b2)) {
                    cw a2 = cwVar2.a(0);
                    cw.a(a2, z[2]);
                    b2 = a2.b(z[3]);
                }
                hashtable.put(b, b2);
                i++;
                if (z) {
                    break;
                }
            }
        }
        by.d(this.a).a(hashtable);
    }

    public void a(int i) {
    }

    p(by byVar) {
        this.a = byVar;
    }
}
