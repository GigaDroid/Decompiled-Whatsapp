package org.whispersystems;

import com.google.bJ;
import com.google.fn;
import com.google.gB;
import com.google.hh;
import com.google.i;
import org.v;

final class a6 implements gB {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "b\u0010zQoh\u0016wWf\\\u000fkYmZ";
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 25;
                        break;
                    case at.o /*3*/:
                        i3 = 48;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~\n{\\jM4|I";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "g\u001b|^wG\u0019pUq";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "x\u001akCjA\u0011";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "|\u001at_wK9p^dK\riBj@\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public i assignDescriptors(hh hhVar) {
        int i = v.e;
        v.a(hhVar);
        v.a((fn) v.a().a().get(0));
        v.a(new bJ(v.d(), new String[]{z[2], z[3]}));
        v.b((fn) v.a().a().get(1));
        v.b(new bJ(v.c(), new String[]{z[4], z[0], z[1]}));
        if (a5.o) {
            v.e = i + 1;
        }
        return null;
    }

    a6() {
    }
}
