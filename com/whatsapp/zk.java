package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class zk extends ap {
    final RequestPermissionsDialogFragment b;
    final String[] c;

    public void a(View view) {
        this.b.dismiss();
        RequestPermissionActivity.a(this.b.getActivity(), this.c);
    }

    zk(RequestPermissionsDialogFragment requestPermissionsDialogFragment, String[] strArr) {
        this.b = requestPermissionsDialogFragment;
        this.c = strArr;
    }
}
