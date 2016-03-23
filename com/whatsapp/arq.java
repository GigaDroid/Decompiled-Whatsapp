package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class arq implements OnClickListener {
    private static final String z;
    final int a;
    final VerifySms b;

    static {
        char[] toCharArray = "\"z\u0015\u000fR-2\u0013\u000bS".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case at.g /*1*/:
                    i2 = 31;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(this.a);
        VerifySms.b(0);
        VerifySms.r(this.b);
        App.d(this.b, 1);
        VerifySms.a(this.b, null);
        this.b.a(z);
    }

    arq(VerifySms verifySms, int i) {
        this.b = verifySms;
        this.a = i;
    }
}
