package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ResetPhoto.ConfirmDialogFragment;

class as5 implements OnClickListener {
    final ConfirmDialogFragment a;

    as5(ConfirmDialogFragment confirmDialogFragment) {
        this.a = confirmDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismissAllowingStateLoss();
    }
}
