package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.ResetPhoto.ConfirmDialogFragment;
import org.v;
import org.whispersystems.at;

class a5d implements OnClickListener {
    private static final String z;
    final ConfirmDialogFragment a;

    static {
        char[] toCharArray = "}`\u0014+9gv?".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 20;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 75;
                    break;
                case at.o /*3*/:
                    i2 = 89;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a5d(ConfirmDialogFragment confirmDialogFragment) {
        this.a = confirmDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.a.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra(z, true);
            activity.setResult(-1, intent);
        }
        this.a.dismissAllowingStateLoss();
    }
}
