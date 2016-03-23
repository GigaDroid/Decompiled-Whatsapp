package com.whatsapp;

import com.whatsapp.protocol.bf;
import org.v;
import org.whispersystems.at;

public class s0 extends sc {
    private static final String[] z;
    bf b;

    static {
        String[] strArr = new String[3];
        String str = "b%\u0012+\u001c";
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
                        i3 = 66;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 97;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 60;
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
                    str = "b>\u0011+\u001c";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "3#>rT#%>dL&0\u0015t\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String c() {
        return z[1] + this.b.d + z[2] + this.b.b + z[0] + this.b.e;
    }

    public void b() {
        App.a(this.b.b, this.b.d, this.b.e, 0);
    }

    public s0(bf bfVar) {
        this.b = bfVar;
    }
}
