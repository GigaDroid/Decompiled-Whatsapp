package com.whatsapp.util.dns;

import com.whatsapp.arj;
import java.net.InetAddress;
import org.v;
import org.whispersystems.at;

final class d {
    private static final String[] z;
    final InetAddress a;
    final long b;

    static {
        String[] strArr = new String[2];
        String str = "P_\u007fh\u0017\u0015\r\u007fD\u000e\u0011\u001aWy\u000b\u0010\u0016i-";
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
                        i3 = 124;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = arj.Theme_checkedTextViewStyle;
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
                    str = "5\u0011\u007fd&\u0018\u001bhu\u0014\u000f(sd\u000f9\u0007jy\u0015\u0005\u0004{t\u0003\u000e\u001aicZ";
                    obj = null;
            }
        }
    }

    public String toString() {
        return z[1] + this.a + z[0] + this.b + '}';
    }

    d(InetAddress inetAddress, long j) {
        this.a = inetAddress;
        this.b = j;
    }
}
