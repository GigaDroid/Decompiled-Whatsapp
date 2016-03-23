package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ql implements OnClickListener {
    private static final String z;
    final VerifySms a;

    static {
        char[] toCharArray = " T[L;/BDVr3U@Qp7D]J07EL".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 86;
                    break;
                case at.g /*1*/:
                    i2 = 49;
                    break;
                case at.i /*2*/:
                    i2 = 41;
                    break;
                case at.o /*3*/:
                    i2 = 37;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z);
        VerifySms.t(this.a);
    }

    ql(VerifySms verifySms) {
        this.a = verifySms;
    }
}
