package com.whatsapp.protocol;

import com.whatsapp.arj;
import java.util.Hashtable;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class ab extends a {
    private static final String[] z;
    final String[] a;
    final by b;

    static {
        String[] strArr = new String[3];
        String str = "f(\\";
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
                        i3 = 65;
                        break;
                    case at.i /*2*/:
                        i3 = 56;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 74;
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
                    str = "y2]\u0019";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "z T\u001e/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ab(by byVar, String[] strArr) {
        this.b = byVar;
        this.a = strArr;
    }

    public void a(int i) {
        by.d(this.b).d(i);
    }

    public void a(cw cwVar, String str) {
        boolean z = co.s;
        Hashtable hashtable = new Hashtable(this.a.length);
        int i = 0;
        while (i < this.a.length) {
            hashtable.put(this.a[i], new Vector());
            i++;
            if (z) {
                break;
            }
        }
        cw a = cwVar.a(0);
        if (!(a == null || a.d == null || a.d.length <= 0)) {
            int i2 = 0;
            while (i2 < a.d.length) {
                cw cwVar2 = a.d[i2];
                cw.a(cwVar2, z[2]);
                String d = cwVar2.d(z[0]);
                if (hashtable.containsKey(d)) {
                    Vector vector = (Vector) hashtable.get(d);
                    int i3 = 0;
                    while (i3 < cwVar2.d.length) {
                        vector.addElement(new ce(cwVar2.d[i3].c, cwVar2.d[i3].d(z[1])));
                        i3++;
                        if (z) {
                            break;
                        }
                    }
                }
                i = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i;
            }
        }
        by.d(this.b).c(hashtable);
    }

    public void a(Exception exception) {
        by.d(this.b).a(exception);
    }
}
