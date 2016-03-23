package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class zt extends ap {
    final RequestPermissionsDialogFragment b;

    zt(RequestPermissionsDialogFragment requestPermissionsDialogFragment) {
        this.b = requestPermissionsDialogFragment;
    }

    public void a(View view) {
        this.b.dismiss();
        App.c(this.b.getActivity());
    }
}
