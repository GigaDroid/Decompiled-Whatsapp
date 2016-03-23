package com.whatsapp.protocol;

import java.util.Vector;
import org.v;
import org.whispersystems.at;

public abstract class a {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "62M*";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 41;
                        break;
                    case at.o /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 15;
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
                    str = "!8Q;";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "0/[ }";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract void a(cw cwVar, String str);

    public void a(Exception exception) {
    }

    public void a(int i, String str) {
        a(i);
    }

    public void a(cw cwVar) {
        boolean z = co.s;
        Vector c = cwVar.c(z[1]);
        int i = 0;
        while (i < c.size()) {
            cw cwVar2 = (cw) c.elementAt(i);
            if (cwVar2 != null) {
                String b = cwVar2.b(z[0]);
                String b2 = cwVar2.b(z[2]);
                if (b != null) {
                    a(Integer.parseInt(b), b2);
                }
            }
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    public void a(int i) {
    }
}
