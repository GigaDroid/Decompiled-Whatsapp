package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import org.v;
import org.whispersystems.at;

class du implements OnClickListener {
    private static final String z;
    final NewGroup a;

    static {
        char[] toCharArray = "wd.\u0010~Ag;\u0011bqn".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 10;
                    break;
                case at.i /*2*/:
                    i2 = 94;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    du(NewGroup newGroup) {
        this.a = newGroup;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(NewGroup.c(this.a).getWindowToken(), 0);
        NewGroup.b(this.a).a(this.a.findViewById(2131755630));
    }
}
