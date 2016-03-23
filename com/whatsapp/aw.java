package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class aw implements OnClickListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "F`Pt^@`EsLY`\u0018yDUiXz\u0002WdYi\u0000WjYsHWq\u0018\u007fX@qXs\u0002WmR~FGqViXG".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 52;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 55;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        this.a.removeDialog(arj.Theme_switchStyle);
        bq.a(new m5(this.a, this.a, true, true, ""), new String[0]);
    }

    aw(RegisterName registerName) {
        this.a = registerName;
    }
}
