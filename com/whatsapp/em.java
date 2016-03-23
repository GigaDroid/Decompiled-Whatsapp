package com.whatsapp;

import android.text.ClipboardManager;
import android.view.View;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class em implements Runnable {
    private static final String[] z;
    final View a;
    final g3 b;

    static {
        String[] strArr = new String[2];
        String str = "b'\\+Hn*G?";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 75;
                        break;
                    case at.i /*2*/:
                        i3 = 53;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 42;
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
                    str = "m\"[0^n>V3Kc'P(Z`%\u001a8Eq2\u001a5Zd";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    public void run() {
        try {
            ((ClipboardManager) this.a.getContext().getSystemService(z[0])).setText(g3.a(this.b).toString());
            this.b.b = false;
            this.a.invalidate();
            App.a(this.a.getContext(), 2131231393, 0);
        } catch (NullPointerException e) {
            Log.e(z[1]);
        }
    }

    em(g3 g3Var, View view) {
        this.b = g3Var;
        this.a = view;
    }
}
