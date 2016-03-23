package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class xt implements OnClickListener {
    private static final String z;
    final String a;
    final RegisterPhone b;

    static {
        char[] toCharArray = "\u0006$HHh\u0001,\u0007".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 100;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 39;
                    break;
                case at.o /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(23);
        UserFeedbackActivity.a(this.b, z + this.a, null, null);
    }

    xt(RegisterPhone registerPhone, String str) {
        this.b = registerPhone;
        this.a = str;
    }
}
