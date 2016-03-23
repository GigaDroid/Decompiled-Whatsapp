package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

final class aw6 implements OnClickListener {
    private static final String z;
    final Activity a;

    static {
        char[] toCharArray = "lyg\u0017\"ds-\f#yrm\u0011cltw\f\"c9U,\bZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 23;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aw6(Activity activity) {
        this.a = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(115);
        Intent intent = new Intent(z);
        intent.setData(auc.g());
        this.a.startActivity(intent);
    }
}
