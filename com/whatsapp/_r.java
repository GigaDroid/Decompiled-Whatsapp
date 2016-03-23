package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

class _r implements OnClickListener {
    private static final String z;
    final ContactPicker a;

    static {
        char[] toCharArray = "jA\\kCjZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 9;
                    break;
                case at.g /*1*/:
                    i2 = 46;
                    break;
                case at.i /*2*/:
                    i2 = 50;
                    break;
                case at.o /*3*/:
                    i2 = 31;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    _r(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.putExtra(z, ContactPicker.x(this.a).p);
        this.a.setResult(-1, intent);
        this.a.removeDialog(0);
        this.a.finish();
    }
}
