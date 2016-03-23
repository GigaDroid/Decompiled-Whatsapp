package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteBroadcastListDialogFragment;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class adt implements OnClickListener {
    private static final String z;
    final DeleteBroadcastListDialogFragment a;
    final l5 b;

    static {
        char[] toCharArray = "@{ph\u0001Qg\u007fj\rLzm1\u0000Fx{j\u0001\u000ewqp\u0010Bwj".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 35;
                    break;
                case at.g /*1*/:
                    i2 = 20;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    adt(DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment, l5 l5Var) {
        this.a = deleteBroadcastListDialogFragment;
        this.b = l5Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        App.k(this.b.p);
        App.e(this.b.p);
        ConversationsFragment.d(ConversationsFragment.h() + 1);
        this.a.dismiss();
    }
}
