package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.VoipActivity.EndCallConfirmationDialogFragment;

class x0 implements OnClickListener {
    final EndCallConfirmationDialogFragment a;

    x0(EndCallConfirmationDialogFragment endCallConfirmationDialogFragment) {
        this.a = endCallConfirmationDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismissAllowingStateLoss();
    }
}
