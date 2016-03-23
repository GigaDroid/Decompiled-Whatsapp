package com.whatsapp.gdrive;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class c1 implements d9 {
    private static final String[] z;
    final bc a;

    static {
        String[] strArr = new String[3];
        String str = "<\u001c\u0014\f5$\u0004\u0004N7*\u001b\nQ|(\u0004\u000e";
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
                        i3 = 75;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 99;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 82;
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
                    str = "<\u001c\u0014\f5$\u0004\u0004N7*\u001b\nQ|(\u0004\u000e";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001e\u0005\u0006Z\".\b\u0017G6k\n\u0011E'&\u000e\rVh";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    c1(bc bcVar) {
        this.a = bcVar;
    }

    public Object a(Object obj) {
        return a((String) obj);
    }

    public String a(String str) {
        try {
            if (bc.b(this.a).contains(str)) {
                return z[2];
            }
            try {
                if (bc.b(this.a).contains("[" + str + "]")) {
                    return z[0];
                }
                throw new IllegalStateException(z[1] + str);
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
