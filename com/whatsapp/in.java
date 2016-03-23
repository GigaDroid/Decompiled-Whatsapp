package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class in implements Runnable {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "?\u0015\u001byk:\u0015=+a>]d";
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
                        i3 = 78;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 68;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 14;
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
                    str = "?\u0015\u001byk:\u0015=+g \u0011%gg*G+{.*\u0015+{~'\t#1.";
                    obj = null;
            }
        }
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        synchronized (wn.m) {
            for (sc scVar : wn.m) {
                if (scVar.a()) {
                    Log.i(z[0] + scVar.toString());
                    scVar.b();
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                }
                Log.i(z[1] + scVar.toString());
                continue;
                if (z) {
                    break;
                }
            }
            wn.m.clear();
        }
    }

    in() {
    }
}
