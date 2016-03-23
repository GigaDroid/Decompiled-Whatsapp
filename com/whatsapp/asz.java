package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class asz implements OnClickListener {
    final DeleteAccountConfirmation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
    }

    asz(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.a = deleteAccountConfirmation;
    }
}
