package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ava implements OnClickListener {
    private static final String z;
    final aqq a;

    static {
        char[] toCharArray = "X~\u0017{cWv\u0016uvZt\u0017w*Jr\u0004~jI4\u0006z`Mp\u000b}wKh\u0011}wK4\u0016yl^i\u0000aqAi\u0000".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 27;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.o /*3*/:
                    i2 = 18;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aqq.b(this.a).removeDialog(arj.Theme_ratingBarStyle);
        Log.i(z);
        this.a.a(false);
    }

    ava(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }
}
