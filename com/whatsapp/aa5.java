package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import org.v;
import org.whispersystems.at;

class aa5 implements OnClickListener {
    private static final String z;
    final MultipleContactsSelector a;

    static {
        char[] toCharArray = "2vt;7\u0004ua:+4|".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = 24;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aa5(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    public void onClick(View view) {
        if (this.a.w.size() < this.a.g()) {
            App.b(this.a.getBaseContext(), String.format(App.az.a(2131296293, this.a.g()), new Object[]{Integer.valueOf(this.a.g())}), 0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(this.a.p.getWindowToken(), 0);
        this.a.d();
    }
}
