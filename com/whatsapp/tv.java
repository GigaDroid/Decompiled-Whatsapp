package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class tv implements OnClickListener {
    private static final String z;
    final EnterPhoneNumber a;
    final String b;

    static {
        char[] toCharArray = "E~QSeBv\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 39;
                    break;
                case at.g /*1*/:
                    i2 = 18;
                    break;
                case at.i /*2*/:
                    i2 = 62;
                    break;
                case at.o /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(23);
        UserFeedbackActivity.a(this.a, z + this.b, null, null);
    }

    tv(EnterPhoneNumber enterPhoneNumber, String str) {
        this.a = enterPhoneNumber;
        this.b = str;
    }
}
