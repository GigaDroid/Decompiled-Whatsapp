package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class t5 implements OnClickListener {
    private static final String z;
    final VerifySms a;

    static {
        char[] toCharArray = "\u0004Ej9\t\u000bVw9\f\u0017\u000fj5\u001b\u0000Yn5\u001d\u001bFa".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 114;
                    break;
                case at.g /*1*/:
                    i2 = 32;
                    break;
                case at.i /*2*/:
                    i2 = 24;
                    break;
                case at.o /*3*/:
                    i2 = 80;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    t5(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onClick(View view) {
        Log.i(z);
        String b = VerifySms.p(this.a).b();
        VerifySms.q(this.a).setVisibility(4);
        this.a.l(b);
    }
}
