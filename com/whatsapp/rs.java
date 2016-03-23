package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.gdrive.cw;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class rs extends cw {
    private static final String[] z;
    final ConditionVariable a;

    static {
        String[] strArr = new String[3];
        String str = "El\u0006\u0007\u0010G";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 13;
                        break;
                    case at.i /*2*/:
                        i3 = 111;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 117;
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
                    str = "Px\f\b\u0010P~";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Gh\u0003\u000e\u0001Fl\f\b\u0001@b\u0001\r\u001cQ`@\f\u0011Qd\u0019\u000eXLo\u001c\u000e\u0007Uh\u001dD\u0011Fa\n\u001f\u001cLcB\r\u001cMd\u001c\u0003\u0010G\"";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b(boolean z) {
        Log.i(z[1] + (z ? z[2] : z[0]));
        this.a.open();
    }

    rs(ConditionVariable conditionVariable) {
        this.a = conditionVariable;
    }
}
