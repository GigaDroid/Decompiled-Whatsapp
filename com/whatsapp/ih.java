package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.VoipActivity.EndCallConfirmationDialogFragment;
import org.v;
import org.whispersystems.at;

class ih implements OnClickListener {
    private static final String z;
    final EndCallConfirmationDialogFragment a;

    static {
        char[] toCharArray = "#&\u001afM((\u0003;[09Y!T4,\u0019<\u0014!*\u0003!U.g2\u0006~\u001f\n6\u0004v\u001f\b1\u001c\u007f\u0012\u00164\u0007t\u0006\u0000%\u0005{\u0014\u00008\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 64;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = 119;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 58;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(App.z(), VoipActivity.class);
        intent.setAction(z);
        intent.setFlags(268435456);
        App.z().startActivity(intent);
        this.a.dismissAllowingStateLoss();
    }

    ih(EndCallConfirmationDialogFragment endCallConfirmationDialogFragment) {
        this.a = endCallConfirmationDialogFragment;
    }
}
