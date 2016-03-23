package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.StarredMessagesActivity.UnstarAllDialogFragment;

class aza implements OnClickListener {
    final UnstarAllDialogFragment a;

    aza(UnstarAllDialogFragment unstarAllDialogFragment) {
        this.a = unstarAllDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        FragmentActivity activity = this.a.getActivity();
        if (activity instanceof StarredMessagesActivity) {
            StarredMessagesActivity.c((StarredMessagesActivity) activity);
        }
    }
}
