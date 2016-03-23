package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

class arh implements OnClickListener {
    private static final String z;
    final Main a;

    static {
        char[] toCharArray = "\f\u0018?Z\u0011\u0004\u0012uA\u0010\u0019\u00135\\P\f\u0015/A\u0011\u0003X\ra;:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.g /*1*/:
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = 91;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    arh(Main main) {
        this.a = main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        auc.f();
        this.a.startActivity(new Intent(z, auc.d()));
        this.a.removeDialog(0);
        this.a.finish();
    }
}
