package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationRowDivider.EncryptionChangeDialogFragment;

class el implements OnClickListener {
    final EncryptionChangeDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }

    el(EncryptionChangeDialogFragment encryptionChangeDialogFragment) {
        this.a = encryptionChangeDialogFragment;
    }
}
