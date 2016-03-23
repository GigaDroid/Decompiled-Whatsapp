package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aey implements OnClickListener {
    private static final String z;
    final aqq a;

    static {
        char[] toCharArray = "cAd\u0005*lIe\u000b?aKd\tcqMw\u0000#r\u000bd\t?aKd\t(`Ab\u0003)gVy\u001ecfO\u007f\u001c>pWb\u0003>p".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 21;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = 22;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aey(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aqq.b(this.a).removeDialog(arj.Theme_radioButtonStyle);
        Log.i(z);
        aqq.b(this.a).showDialog(arj.Theme_ratingBarStyle);
    }
}
