package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow.OnDismissListener;
import org.v;
import org.whispersystems.at;

class ane implements OnDismissListener {
    private static final String z;
    final k3 a;

    static {
        char[] toCharArray = "<a\u0005l7\nb\u0010m+:k".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 85;
                    break;
                case at.g /*1*/:
                    i2 = 15;
                    break;
                case at.i /*2*/:
                    i2 = 117;
                    break;
                case at.o /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ane(k3 k3Var) {
        this.a = k3Var;
    }

    public void onDismiss() {
        ((InputMethodManager) k3.b(this.a).getSystemService(z)).toggleSoftInput(1, 0);
        k3.a(this.a).b();
    }
}
