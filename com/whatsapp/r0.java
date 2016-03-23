package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class r0 implements OnClickListener {
    private static final String z;
    final VerifySms a;
    final int b;

    static {
        char[] toCharArray = "\u000bw);[\u0004?/?\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 18;
                    break;
                case at.i /*2*/:
                    i2 = 91;
                    break;
                case at.o /*3*/:
                    i2 = 82;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(this.b);
        VerifySms.b(0);
        VerifySms.r(this.a);
        App.d(this.a, 1);
        VerifySms.a(this.a, null);
        this.a.a(z);
    }

    r0(VerifySms verifySms, int i) {
        this.a = verifySms;
        this.b = i;
    }
}
