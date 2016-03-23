package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.ConversationRowDivider.EncryptionChangeDialogFragment;
import org.v;
import org.whispersystems.at;

class nb implements OnClickListener {
    private static final String z;
    final l5 a;
    final EncryptionChangeDialogFragment b;

    static {
        char[] toCharArray = "O\u000fZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 62;
                    break;
                case at.o /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.b.getContext(), IdentityVerificationActivity.class);
        intent.putExtra(z, this.a.p);
        this.b.startActivity(intent);
    }

    nb(EncryptionChangeDialogFragment encryptionChangeDialogFragment, l5 l5Var) {
        this.b = encryptionChangeDialogFragment;
        this.a = l5Var;
    }
}
