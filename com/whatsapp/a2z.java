package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment;
import org.v;
import org.whispersystems.at;

class a2z implements OnClickListener {
    private static final String z;
    final EncryptionExplanationDialogFragment a;
    final l5 b;

    static {
        char[] toCharArray = "I\u0007\u0007".toCharArray();
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
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 99;
                    break;
                case at.o /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 11;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a2z(EncryptionExplanationDialogFragment encryptionExplanationDialogFragment, l5 l5Var) {
        this.a = encryptionExplanationDialogFragment;
        this.b = l5Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.a.getContext(), IdentityVerificationActivity.class);
        intent.putExtra(z, this.b.p);
        this.a.startActivity(intent);
    }
}
