package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class _i implements OnClickListener {
    private static final String z;
    final aqq a;

    static {
        char[] toCharArray = "dVulPk^tbEf\\u`\u0019vZfiYu\u001cdmSqXijDw@sjDw\u001cu`Ef\\u`".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 18;
                    break;
                case at.g /*1*/:
                    i2 = 51;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 5;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    _i(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aqq.b(this.a).removeDialog(arj.Theme_ratingBarStyle);
        Log.i(z);
        this.a.a(true);
    }
}
