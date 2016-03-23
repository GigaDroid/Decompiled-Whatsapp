package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class z3 extends ap {
    final RequestPermissionsDialogFragment b;

    public void a(View view) {
        this.b.dismiss();
    }

    z3(RequestPermissionsDialogFragment requestPermissionsDialogFragment) {
        this.b = requestPermissionsDialogFragment;
    }
}
