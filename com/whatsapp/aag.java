package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aag implements OnCancelListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "T1r<3R1g;!K1:1)G8z2oE5{!mE;{;%E :6!H7p9".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 38;
                    break;
                case at.g /*1*/:
                    i2 = 84;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.i(z);
    }

    aag(RegisterName registerName) {
        this.a = registerName;
    }
}
