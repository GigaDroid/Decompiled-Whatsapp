package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class zw extends ap {
    final RequestPermissionActivity b;

    zw(RequestPermissionActivity requestPermissionActivity) {
        this.b = requestPermissionActivity;
    }

    public void a(View view) {
        this.b.finish();
    }
}
