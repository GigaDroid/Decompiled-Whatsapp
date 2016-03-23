package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

class awz implements OnClickListener {
    private static final String z;
    final LocationPicker a;

    static {
        char[] toCharArray = "1$J@p9.\u0000Az$>G\\x#db}\\\u0011\u001eg}Q\u000f\u0019agM\u0013\u000fqaZ\u0004\u001eg|X\u0003".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivityForResult(new Intent(z), 0);
        this.a.removeDialog(2);
    }

    awz(LocationPicker locationPicker) {
        this.a = locationPicker;
    }
}
