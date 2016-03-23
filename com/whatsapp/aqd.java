package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.DeleteAccountFeedback.ChangeNumberMessageDialogFragment;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aqd implements OnClickListener {
    private static final String z;
    final ChangeNumberMessageDialogFragment a;

    static {
        char[] toCharArray = "\u0003]|`M\u0002\u0015qfZ\bM~q\u0014\u0001]ua[\u0006[{*Z\u000fY~b\\\tM}g\\\u0015".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.g /*1*/:
                    i2 = 56;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = 5;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        this.a.startActivity(new Intent(this.a.getActivity(), ChangeNumberOverview.class));
    }

    aqd(ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment) {
        this.a = changeNumberMessageDialogFragment;
    }
}
