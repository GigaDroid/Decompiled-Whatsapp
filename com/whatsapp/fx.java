package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.ConversationRowDivider.IdentityChangeDialogFragment;
import org.v;
import org.whispersystems.at;

class fx implements OnClickListener {
    private static final String z;
    final String a;
    final IdentityChangeDialogFragment b;

    static {
        char[] toCharArray = "^\u000e\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 52;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    fx(IdentityChangeDialogFragment identityChangeDialogFragment, String str) {
        this.b = identityChangeDialogFragment;
        this.a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.b.getContext(), IdentityVerificationActivity.class);
        intent.putExtra(z, this.a);
        this.b.startActivity(intent);
    }
}
