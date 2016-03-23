package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class aso implements OnClickListener {
    private static final String z;
    final String a;
    final VerifySms b;

    static {
        char[] toCharArray = "Z_WgW]W\u0018".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 56;
                    break;
                case at.g /*1*/:
                    i2 = 51;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 60;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(37);
        VerifySms.t(this.b);
        UserFeedbackActivity.a(this.b, z + this.a, null, null);
    }

    aso(VerifySms verifySms, String str) {
        this.b = verifySms;
        this.a = str;
    }
}
