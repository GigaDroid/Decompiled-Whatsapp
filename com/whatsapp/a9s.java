package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bu;
import g;
import org.v;
import org.whispersystems.at;

class a9s implements OnClickListener {
    private static final String z;
    final ViewSharedContactActivity a;
    final g b;

    static {
        char[] toCharArray = ">]IG'\u001fZ\u0014Q?\u000e\u0000\tU;".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 46;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        bu.a(this.b.b + z, this.a);
    }

    a9s(ViewSharedContactActivity viewSharedContactActivity, g gVar) {
        this.a = viewSharedContactActivity;
        this.b = gVar;
    }
}
