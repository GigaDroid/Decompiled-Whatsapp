package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class fk implements OnClickListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = ")$r\u001c\u0017/$g\u001b\u00056$:\u0011\r:-z\u0012K8 {\u0001I8.{\u001b\u000185:\u0017\u0011/5z\u001bK8 {\u0016\u00017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    fk(RegisterName registerName) {
        this.a = registerName;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        this.a.removeDialog(arj.Theme_switchStyle);
    }
}
