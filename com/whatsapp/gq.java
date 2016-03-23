package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import org.v;
import org.whispersystems.at;

class gq implements OnClickListener {
    private static final String z;
    final aij a;

    static {
        char[] toCharArray = ".J\u000f0\u001c\u0018I\u001a1\u0000(@".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 71;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 127;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = arj.Theme_editTextStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    gq(aij com_whatsapp_aij) {
        this.a = com_whatsapp_aij;
    }

    public void onClick(View view) {
        ((InputMethodManager) aij.d(this.a).getSystemService(z)).hideSoftInputFromWindow(aij.f(this.a).getWindowToken(), 0);
        aij.e(this.a).a(this.a.findViewById(2131755630));
    }
}
