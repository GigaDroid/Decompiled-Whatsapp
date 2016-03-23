package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.DialogToastActivity.LoginFailedDialogFragment;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class wr implements OnClickListener {
    private static final String z;
    final LoginFailedDialogFragment a;

    static {
        char[] toCharArray = "cE;\u001f#yO$\u001fkbY\"\u001f~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 86;
                    break;
                case at.o /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        OverlayAlert.a(this.a.getActivity());
    }

    wr(LoginFailedDialogFragment loginFailedDialogFragment) {
        this.a = loginFailedDialogFragment;
    }
}
