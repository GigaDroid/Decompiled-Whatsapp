package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteContactDialogFragment;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a9k implements OnClickListener {
    private static final String z;
    final DeleteContactDialogFragment a;
    final l5 b;

    static {
        char[] toCharArray = "pbd1^a~k3R|cyh_vao3^>ne)Orn~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 19;
                    break;
                case at.g /*1*/:
                    i2 = 13;
                    break;
                case at.i /*2*/:
                    i2 = 10;
                    break;
                case at.o /*3*/:
                    i2 = 71;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        App.k(this.b.p);
        ConversationsFragment.d(ConversationsFragment.h() + 1);
        this.a.dismiss();
    }

    a9k(DeleteContactDialogFragment deleteContactDialogFragment, l5 l5Var) {
        this.a = deleteContactDialogFragment;
        this.b = l5Var;
    }
}
