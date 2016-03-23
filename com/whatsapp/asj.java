package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteGroupDialogFragment;

class asj implements OnClickListener {
    final DeleteGroupDialogFragment a;

    asj(DeleteGroupDialogFragment deleteGroupDialogFragment) {
        this.a = deleteGroupDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
