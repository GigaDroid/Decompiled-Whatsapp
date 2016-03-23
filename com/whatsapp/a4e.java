package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment;

class a4e implements OnClickListener {
    final EncryptionExplanationDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }

    a4e(EncryptionExplanationDialogFragment encryptionExplanationDialogFragment) {
        this.a = encryptionExplanationDialogFragment;
    }
}
