package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

class a9r implements OnClickListener {
    private static final String z;
    final LocationPicker2 a;

    static {
        char[] toCharArray = "5pn;|=z$:v jc't'0F\u0006P\u0015JC\u0006]\u000bME\u001cA\u0017[U\u001aV\u0000JC\u0007T\u0007".toCharArray();
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
                    i2 = 30;
                    break;
                case at.i /*2*/:
                    i2 = 10;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = 19;
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

    a9r(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
