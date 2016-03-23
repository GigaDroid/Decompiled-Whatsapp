package com.whatsapp;

import android.view.View;
import com.whatsapp.VoipActivity.PermissionDialogFragment;
import com.whatsapp.util.ap;

class zv extends ap {
    final PermissionDialogFragment b;

    public void a(View view) {
        PermissionDialogFragment.a(this.b);
        this.b.dismiss();
        App.c(this.b.getActivity());
    }

    zv(PermissionDialogFragment permissionDialogFragment) {
        this.b = permissionDialogFragment;
    }
}
