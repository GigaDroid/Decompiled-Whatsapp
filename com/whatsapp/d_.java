package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class d_ {
    private static final String[] z;
    public String a;
    public boolean b;

    static {
        String[] strArr = new String[2];
        String str = "@Iq,\u0014EI|>\u0013YDa.\u0012EDw?\u0005_V}#\u0013INs#\u0004@C`b\u0013YEq(\u0013_\u0006";
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
                        i3 = 44;
                        break;
                    case at.g /*1*/:
                        i3 = 38;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 77;
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
                    str = "@Iq,\u0014EI|>\u0013YDa.\u0012EDw?\u0005_V}#\u0013INs#\u0004@C`b\u0005^T}?@";
                    obj = null;
            }
        }
    }

    d_(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public void b(int i) {
        Log.i(z[0] + i);
    }

    public void a(int i) {
        Log.e(z[1] + i);
    }
}
