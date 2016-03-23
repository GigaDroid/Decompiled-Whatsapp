package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteContactDialogFragment;

class a9w implements OnClickListener {
    final DeleteContactDialogFragment a;

    a9w(DeleteContactDialogFragment deleteContactDialogFragment) {
        this.a = deleteContactDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
