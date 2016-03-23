package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import org.v;
import org.whispersystems.at;

class ic implements OnClickListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "\u0018\u0019f]P.\u001as\\L\u001e\u0013".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 113;
                    break;
                case at.g /*1*/:
                    i2 = 119;
                    break;
                case at.i /*2*/:
                    i2 = 22;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(RegisterName.i(this.a).getWindowToken(), 0);
        RegisterName.e(this.a).a(this.a.findViewById(2131755630));
    }

    ic(RegisterName registerName) {
        this.a = registerName;
    }
}
