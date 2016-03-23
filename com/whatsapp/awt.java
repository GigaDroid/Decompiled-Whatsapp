package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.GroupChatInfo.ExitGroupDialogFragment;

class awt implements OnClickListener {
    final ExitGroupDialogFragment a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }

    awt(ExitGroupDialogFragment exitGroupDialogFragment) {
        this.a = exitGroupDialogFragment;
    }
}
