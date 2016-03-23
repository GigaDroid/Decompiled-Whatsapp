package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteGroupDialogFragment;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class _b implements OnClickListener {
    private static final String z;
    final DeleteGroupDialogFragment a;
    final l5 b;

    static {
        char[] toCharArray = "<$Oqb-8@sn0%R(r,.S*c:'Dsb\u00189Nrw".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 95;
                    break;
                case at.g /*1*/:
                    i2 = 75;
                    break;
                case at.i /*2*/:
                    i2 = 33;
                    break;
                case at.o /*3*/:
                    i2 = 7;
                    break;
                default:
                    i2 = 7;
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

    _b(DeleteGroupDialogFragment deleteGroupDialogFragment, l5 l5Var) {
        this.a = deleteGroupDialogFragment;
        this.b = l5Var;
    }
}
