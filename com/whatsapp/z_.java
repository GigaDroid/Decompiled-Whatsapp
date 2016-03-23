package com.whatsapp;

import android.view.View;
import com.whatsapp.VoipActivity.PermissionDialogFragment;
import com.whatsapp.util.ap;

class z_ extends ap {
    final PermissionDialogFragment b;

    public void a(View view) {
        PermissionDialogFragment.a(this.b);
        this.b.dismiss();
    }

    z_(PermissionDialogFragment permissionDialogFragment) {
        this.b = permissionDialogFragment;
    }
}
