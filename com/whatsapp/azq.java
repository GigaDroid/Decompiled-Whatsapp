package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class azq implements OnClickListener {
    private static final String z;
    final MuteDialogFragment a;

    static {
        char[] toCharArray = "?@8".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 85;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 92;
                    break;
                case at.o /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.l(this.a.getArguments().getString(z));
    }

    azq(MuteDialogFragment muteDialogFragment) {
        this.a = muteDialogFragment;
    }
}
