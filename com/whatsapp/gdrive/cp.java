package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.whatsapp.gdrive.SettingsGoogleDrive.AuthRequestDialogFragment;

class cp implements OnCancelListener {
    final AuthRequestDialogFragment a;

    public void onCancel(DialogInterface dialogInterface) {
        SettingsGoogleDrive.a((SettingsGoogleDrive) this.a.getActivity(), true);
    }

    cp(AuthRequestDialogFragment authRequestDialogFragment) {
        this.a = authRequestDialogFragment;
    }
}
