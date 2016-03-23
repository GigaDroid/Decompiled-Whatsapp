package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.GroupChatInfo.ExitGroupDialogFragment;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ed implements OnClickListener {
    private static final String z;
    final ExitGroupDialogFragment a;

    static {
        char[] toCharArray = "La\u0004F0tz\u0005U/\u0004|\u0005P,Bp\u0000l,Nr\u001dV\u0007Y|\u001eC".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 43;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ed(ExitGroupDialogFragment exitGroupDialogFragment) {
        this.a = exitGroupDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        GroupChatInfo.h((GroupChatInfo) this.a.getActivity());
        this.a.dismiss();
    }
}
