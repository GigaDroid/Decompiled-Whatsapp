package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.VoipActivity.MessageDialogFragment;

class ao2 implements OnClickListener {
    final MessageDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismissAllowingStateLoss();
    }

    ao2(MessageDialogFragment messageDialogFragment) {
        this.a = messageDialogFragment;
    }
}
