package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class m7 implements OnClickListener {
    final DeleteAccountConfirmation a;

    m7(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.a = deleteAccountConfirmation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }
}
