package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.DialogToastActivity.MessageDialogFragment;

class qv implements OnClickListener {
    final MessageDialogFragment a;

    qv(MessageDialogFragment messageDialogFragment) {
        this.a = messageDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
