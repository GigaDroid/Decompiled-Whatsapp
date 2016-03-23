package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class avd implements OnClickListener {
    private static final String z;
    final aqq a;

    static {
        char[] toCharArray = "\u0013Z\u001b\u0016V\u001cR\u001a\u0018C\u0011P\u001b\u001a\u001f\u0001V\b\u0013_\u0002\u0010\u001b\u001aC\u0011P\u001b\u001aT\u0010Z\u001d\u0010U\u0017M\u0006\r\u001f\u0017Z\u001a\u000b_\u0017Z".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.g /*1*/:
                    i2 = 63;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.o /*3*/:
                    i2 = 127;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    avd(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aqq.b(this.a).removeDialog(arj.Theme_radioButtonStyle);
        Log.i(z);
        this.a.a(true);
    }
}
