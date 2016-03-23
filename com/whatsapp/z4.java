package com.whatsapp;

import android.view.View;
import com.whatsapp.VoipActivity.PermissionDialogFragment;
import com.whatsapp.util.ap;

class z4 extends ap {
    final PermissionDialogFragment b;

    public void a(View view) {
        this.b.dismiss();
        VoipActivity.b(this.b.getActivity());
    }

    z4(PermissionDialogFragment permissionDialogFragment) {
        this.b = permissionDialogFragment;
    }
}
