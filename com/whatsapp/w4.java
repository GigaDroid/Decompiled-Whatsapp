package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.WebSessionsActivity.LogoutAllConfirmationDialogFragment;

class w4 implements OnClickListener {
    final LogoutAllConfirmationDialogFragment a;

    w4(LogoutAllConfirmationDialogFragment logoutAllConfirmationDialogFragment) {
        this.a = logoutAllConfirmationDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.d(true);
        wn.k();
        this.a.getActivity().finish();
    }
}
